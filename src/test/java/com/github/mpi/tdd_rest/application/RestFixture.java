package com.github.mpi.tdd_rest.application;

import org.concordion.api.extension.Extension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import pl.pragmatists.concordion.rest.RestExtension;

@RunWith(ConcordionRunner.class)
public abstract class RestFixture{

    @Extension
public RestExtension rest = new RestExtension().host("https://nab.com.au");
    
}
