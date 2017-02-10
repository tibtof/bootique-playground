package ro.tibtof.playground.bootique;

import com.google.inject.Module;
import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;

public class Application {

    public static void main(String[] args) {
        Module module = binder -> JerseyModule.contributeResources(binder)
                .addBinding().to(HelloResource.class);

        Bootique.app(args).module(module).autoLoadModules().run();
    }

}
