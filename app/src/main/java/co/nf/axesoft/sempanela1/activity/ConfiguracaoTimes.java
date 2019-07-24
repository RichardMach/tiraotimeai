package co.nf.axesoft.sempanela1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import co.nf.axesoft.sempanela1.R;
import co.nf.axesoft.sempanela1.adapter.JogadorAdapter;

public class ConfiguracaoTimes extends AppCompatActivity {
    private Toolbar toolbar;
    private ListView listView;
    private ArrayAdapter <String> adapter;
    private ArrayList<String> nomesJogadores;
    private SharedPreferences preferences;

    //Views para a entrada de nomes na lista de jogadores
    private Button btnAddLista;
    private EditText eTxtJogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao_times);


        toolbar = findViewById(R.id.toolbarSettingsTeam);
        toolbar.setTitle("Tira o time aí");
        setSupportActionBar(toolbar);


        btnAddLista = findViewById(R.id.btnAddJogadores);
        eTxtJogador = findViewById(R.id.eTxtAddNome);


        listView = findViewById(R.id.listViewJogadoresAdd);

        //Monta o adapter
        nomesJogadores = new ArrayList<>();
        //nomesJogadores.add("Melhor Jogador do mundo");
        adapter =  new JogadorAdapter(getApplicationContext(),nomesJogadores);
        listView.setAdapter(adapter);


        btnAddLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomesJogadores.add(eTxtJogador.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.timesAction:
                //openTeamList();
                return true;

            case R.id.limpardadosAction:
                //openDataClear();
                return true;

            case R.id.sobreAction :
                //openAbout();
                return true;

            case R.id.fecharAction :
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    private ArrayList<String> addNomesListJogadores(){



        ArrayList<String> listJogadores = new ArrayList<>();

        listJogadores.add("Ronaldinho");
        listJogadores.add("Romero");
        listJogadores.add("Ronaldo Fenomeno");
        listJogadores.add("Cristiano Ronaldo");
        listJogadores.add("Neymar");
        listJogadores.add("Camisa 10");
        listJogadores.add("Perna de Pau");
        listJogadores.add("Joga muito");
        listJogadores.add("Capitão");
        listJogadores.add("Mala");
        listJogadores.add("Completa time");
        listJogadores.add("Joga fácil");
        listJogadores.add("Sem mundial");
        listJogadores.add("Chorão");
        listJogadores.add("só reclama");

        return listJogadores;


    }

}
