package co.nf.axesoft.sempanela1.Model;

import android.media.Image;

public class Jogador {

    private int id;
    private String nome;
    private Image fotoJogador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Image getFotoJogador() {
        return fotoJogador;
    }

    public void setFotoJogador(Image fotoJogador) {
        this.fotoJogador = fotoJogador;
    }
}
