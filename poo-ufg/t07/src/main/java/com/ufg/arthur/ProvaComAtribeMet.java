package com.ufg.arthur;

public class ProvaComAtribeMet {
    private byte numQuestoes;

    public byte getNumQuestoes() {

        return numQuestoes;
        
    }
    public void setNumquestoes(byte n) {
        if (n > 0) {
            numQuestoes = n;
        }
    }
}