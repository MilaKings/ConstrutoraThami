package com.construtora.construtorathami;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.construtora.construtorathami.modelo.Empreendimento;

import java.util.List;

public class EmpreendimentoAdapter extends RecyclerView.Adapter<EmpreendimentoAdapter.ViewHolder> {

    private final List<Empreendimento> list;
    private final Context mContext;
    public static final String CHAVE = "empree_uid_key";

    public EmpreendimentoAdapter(Context context, List<Empreendimento> list) {
        this.list = list;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.empreendimento_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Empreendimento empreendimento = list.get(i);
        viewHolder.nomeView.setText(empreendimento.nome);
        viewHolder.background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetalhesEmpreendimentosActivity.class);
                intent.putExtra(CHAVE, empreendimento.id);
                mContext.startActivity(intent);
            }
        });
        ;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nomeView;
        public View background;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeView = itemView.findViewById(R.id.nome);
            background = itemView.findViewById(R.id.background);
        }
    }
}
