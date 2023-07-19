package com.ufg.poo;

import java.util.ArrayList;

public class Uniao {
    private ArrayList filhos;
    private PessoaCAtrib[] parceiros;

    public void novoFilho(PessoaCAtrib p) {
        filhos.add(p);
    }

    public Uniao(PessoaCAtrib a, PessoaCAtrib b) {
        parceiros[0] = a;
        parceiros[1] = b;
    }
}