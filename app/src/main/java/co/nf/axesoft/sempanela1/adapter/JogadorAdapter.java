package co.nf.axesoft.sempanela1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import co.nf.axesoft.sempanela1.R;
import co.nf.axesoft.sempanela1.model.Jogador;

public class JogadorAdapter extends ArrayAdapter<String> {


        private Context context;
        private ArrayList<String> lstJogador;

        public JogadorAdapter(Context c, ArrayList<String> object) {
            super(c, 0, object);

            this.context = c;
            lstJogador =object;

        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = null;

            if(lstJogador!=null){

                //inicializa o objeto de montagem da view passando serviço do sistema
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

                //Recuperar mensagem
                String jogador = lstJogador.get(position);

                    view = inflater.inflate(R.layout.item_lista_jogador,parent,false);



                //Recuperar o elemento de exibição
                TextView txtMensagem  = view.findViewById(R.id.nomeJogadorItem);
                txtMensagem.setText(jogador);

            }


            return view;
        }
    }

