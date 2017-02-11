package br.com.charfinder;

import br.com.charfinder.model.CharFinder;
import br.com.charfinder.model.Stream;

public class CharFinderUsecase {

    public String firstChar(Stream stream) {
        String response;
        try {
            char charCandidate = CharFinder.firstChar(stream);
            response = String.valueOf(charCandidate);
        } catch (IllegalStateException e) {
            response = "Could not find char that matches the requirement";
        }

        return response;
    }
}
