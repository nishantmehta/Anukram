package com.nishant.anukram;

import com.nishant.anukram.configuration.AnukramConfiguration;
import com.nishant.anukram.resource.AnukramResource;
import com.nishant.anukram.supplier.LocalIdSupplier;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class AnukramApplication extends Application<AnukramConfiguration> {

    @Override
    public void run(AnukramConfiguration configuration, Environment environment) throws Exception {
        final AnukramResource anukramResource = new AnukramResource(new LocalIdSupplier());
        environment.jersey().register(anukramResource);
    }

    public static void main (String args[]) throws Exception {
        new AnukramApplication().run(args);
    }
}