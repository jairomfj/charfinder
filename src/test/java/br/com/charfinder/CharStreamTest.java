package br.com.charfinder;

import br.com.charfinder.model.CharStream;
import org.junit.Test;

public class CharStreamTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotReturnCorrectValueDueToNullParameter() {
        CharFinderUsecase charFinder = new CharFinderUsecase();
        charFinder.firstChar(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotReturnCorrectValueDueToEmptyParameter() {
        CharFinderUsecase charFinder = new CharFinderUsecase();
        charFinder.firstChar(new CharStream(""));
    }

    @Test
    public void shouldNotReturnCorrectValueDueToShortParameter() {
        CharFinderUsecase charFinder = new CharFinderUsecase();
        String response = charFinder.firstChar(new CharStream("ab"));
        assert "Could not find char that matches the requirement".equals(response);
    }

    @Test
    public void shouldNotReturnCorrectValueDueToParameterThatDoesNotMatch() {
        CharFinderUsecase charFinder = new CharFinderUsecase();
        String response = charFinder.firstChar(new CharStream("aba"));
        assert "Could not find char that matches the requirement".equals(response);
    }

    @Test
    public void shouldNotReturnCorrectValueDueToParameterThatDoesNotMatch2() {
        CharFinderUsecase charFinder = new CharFinderUsecase();
        String response = charFinder.firstChar(new CharStream("abfgr"));
        assert "Could not find char that matches the requirement".equals(response);
    }

    @Test
    public void shouldReturnCorrectValueE() {
        CharFinderUsecase charFinder = new CharFinderUsecase();
        String response = charFinder.firstChar(new CharStream("abe"));
        assert "e".equals(response);
    }

    @Test
    public void shouldReturnCorrectValueI() {
        CharFinderUsecase charFinder = new CharFinderUsecase();
        String response = charFinder.firstChar(new CharStream("abefegi"));
        assert "i".equals(response);
    }

    @Test
    public void shouldReturnCorrectValueA() {
        CharFinderUsecase charFinder = new CharFinderUsecase();
        String response = charFinder.firstChar(new CharStream("ubaefogi"));
        assert "a".equals(response);
    }

    @Test
    public void shouldReturnCorrectValueUpperCaseA() {
        CharFinderUsecase charFinder = new CharFinderUsecase();
        String response = charFinder.firstChar(new CharStream("ubAefogi"));
        assert "A".equals(response);
    }
}
