package co.nf.axesoft.sempanela1.helper;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class PreferenciasNomeJogadores {
    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;//interface para a manipulação do arquivo

    private ArrayList<String> listNomesJogadores;


    private String NOMES_JOGADORES = "nomejogadores.preferencias";
    private int MODE = 0;//Quando o MODE é 0 só o seu app pode acessar o arquivo
    private String CHAVE = "nomesjogadores";

    private JSONArray jsonArray = new JSONArray();
    private JSONObject jsonObject;

     /*construtor que salva os nomes adicionados previamente para inicializar
       sem que o usuario tem que adicionar novos nomes de inicio  */
    public PreferenciasNomeJogadores(Context c){

        //transformando a lista em um array Json
        listNomesJogadores = addNomesListJogadores();
        for(String nomes :listNomesJogadores ){
            jsonObject = new JSONObject();
            try {
                jsonObject.put("nomejogador", nomes);
            }catch (JSONException e){
                e.getMessage();

            }
            jsonArray.put(jsonObject);

        }

        //transformado a o Array Json em um Array de String para poder salvar no dispositivo;
        String nomesJogadores = jsonArray.toString();

        //salvando no shared
        context=c;
        preferences = context.getSharedPreferences(NOMES_JOGADORES,MODE);
        editor = preferences.edit();
        editor.putString(CHAVE,nomesJogadores).commit();

    }

    public void salvarNomesJogadores(ArrayList<String> lstJogadores){

        for(String nomes :lstJogadores ){
            jsonObject = new JSONObject();
            try {
                jsonObject.put(CHAVE, nomes);
            }catch (JSONException e){
                e.getMessage();

            }
            jsonArray.put(jsonObject);
        }

        //transformado a o Array Json em um Array de String para poder salvar no dispositivo;
        String nomesJogadores = jsonArray.toString();
        editor.putString(CHAVE,nomesJogadores);
        editor.commit();


    }

    public List<String> getListNomesJogadores(){

        List<String> list = new ArrayList<>();

        try {
            jsonArray = new JSONArray(preferences.getString(CHAVE,null));

            for (int i=0;i<jsonArray.length();i++){
                jsonObject = jsonArray.getJSONObject(i);
                String nomeJogador = jsonObject.getString(CHAVE);
                list.add(nomeJogador);
            }
        }catch (JSONException e){
            e.getMessage();

        }

        return  list;


    }

    //método para inicializar um arraylist de strings e adicionar nomes jpá definidos
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
