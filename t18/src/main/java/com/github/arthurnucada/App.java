package com.github.arthurnucada;

import com.github.arthurnucada.Partida;
import com.github.arthurnucada.PartidasFactory;

public class App {
    public static void main( String[] args ) {
        Partida partida = new Partida();
        partida = PartidasFactory.partidaImortal();
        System.out.println(partida.toString());
    }
}