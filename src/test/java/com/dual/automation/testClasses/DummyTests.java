package com.dual.automation.testClasses;

import com.dual.automation.common.basepackage.Base;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DummyTests extends Base {

    // Test pentru a verifica dacă URL-ul YouTube este corect
    @Test
    public void dummyTest() {
        // Obținem URL-ul YouTube din Context
        String youtubeUrl = (String) instance.getData("youtubeURL");

        // Afișăm URL-ul în consola de test
        System.out.println("YouTube URL from Context: " + youtubeUrl);

        // Verificăm dacă URL-ul este corect
        assertEquals("https://www.youtube.com/", youtubeUrl);
    }
}
