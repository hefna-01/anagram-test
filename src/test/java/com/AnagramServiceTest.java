package com;

import org.junit.Assert;
import org.junit.Test;

public class AnagramServiceTest {


    private AnagramService anagramService = new AnagramService();

    @Test
    public void doInit(){
       Assert.assertNotNull(anagramService);
    }

    @Test
    public void anagramControlTestNoEquals(){
        Assert.assertEquals(false, anagramService.anagramControl("toto", "tota"));
    }

    @Test
    public void anagramControlTestNoEqualsWithBlankParam(){
        Assert.assertEquals(false, anagramService.anagramControl("", "tota"));
    }

    @Test
    public void anagramControlTestEquals(){
        Assert.assertEquals(true, anagramService.anagramControl("azerty", "aezrty"));
        Assert.assertEquals(true, anagramService.anagramControl("azerty ", " aezrty"));
        Assert.assertEquals(true, anagramService.anagramControl("az ert y ", " aez rty"));
    }

    @Test
    public void anagramControlTestSizeNoEquals(){
        Assert.assertEquals(false, anagramService.anagramControl("azerty", "aezrtyy"));
    }

    @Test
    public void anagramControlTestNoEqualsParams(){
        Assert.assertEquals(false, anagramService.anagramControl("abb", "aab"));
    }

    @Test
    public void anagramControlTestEqualsWithBlank(){
        Assert.assertEquals(true, anagramService.anagramControl("a b b a 1", " aa b b 1   "));
        Assert.assertEquals(false, anagramService.anagramControl("rtpeya", "azerty"));
        Assert.assertEquals(false, anagramService.anagramControl("rtp eya", "az erty"));
        Assert.assertEquals(false, anagramService.anagramControl(" rtpeya", " azerty"));
    }
}
