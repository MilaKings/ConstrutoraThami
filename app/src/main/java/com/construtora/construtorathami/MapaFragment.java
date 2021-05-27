package com.construtora.construtorathami;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.net.IpSecManager;
import android.os.Bundle;

import com.construtora.construtorathami.modelo.DadosEmpreendimentos;
import com.construtora.construtorathami.modelo.Empreendimento;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapaFragment extends SupportMapFragment implements OnMapReadyCallback {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng posicaoEmpreendimento = pegarCoordenadaEndereco("Rua Luiz Gonzaga Valente, 322");

        if (posicaoEmpreendimento != null){
            CameraUpdate update = CameraUpdateFactory.newLatLngZoom(posicaoEmpreendimento, 17);
            googleMap.moveCamera(update);
        }

        DadosEmpreendimentos de = new DadosEmpreendimentos();
        LatLng coordenada;

        for(int i = 1; i <= 5; i++){
            coordenada = pegarCoordenadaEndereco(de.getEmpre(i).endereco);

            if (coordenada != null) {
                MarkerOptions marcador = new MarkerOptions();
                marcador.position(coordenada);
                marcador.title(de.getEmpre(i).nome);
                googleMap.addMarker(marcador);
            }
        }

    }

    private  LatLng pegarCoordenadaEndereco(String endereco){
        try {
            Geocoder geo = new Geocoder(getContext());


            List<Address> resultados =
                    geo.getFromLocationName(endereco, 1);
            if (!resultados.isEmpty()){
                LatLng posicao = new LatLng(resultados.get(0).getLatitude(), resultados.get(0).getLongitude());

                return posicao;
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
