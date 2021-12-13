package com.example.tugasrumah8_restapi_kel12.Models;

import java.util.List;

public class Meanings {
    String partsOfSpeech = "";
    List<Definitions> definitions = null;

    public String getPartOfSpeech() {
        return partsOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partsOfSpeech = partOfSpeech;
    }

    public List<Definitions> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<Definitions> definitions) {
        this.definitions = definitions;
    }
}
