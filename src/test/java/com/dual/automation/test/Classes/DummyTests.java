package com.dual.automation.test.Classes;

import com.dual.automation.coommon.basepackage.BaseTest;
import org.junit.jupiter.api.Test;

public class DummyTests extends BaseTest {

    @Test
    public void dummyTest() {
        // Retrieve youtubeURL from the Context instance inherited from Base
        String youtubeURL = (String) instance.getValue("youtubeURL");

        // Print the youtubeURL to the console
        System.out.println("YouTube URL: " + youtubeURL);
    }
}