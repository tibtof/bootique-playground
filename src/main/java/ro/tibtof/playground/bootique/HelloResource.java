package ro.tibtof.playground.bootique;

import com.google.inject.Inject;
import io.bootique.annotation.Args;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

@Path("/")
public class HelloResource {

    @Inject
    @Args
    private String[] args;

    @GET
    public String hello() {
        String allArgs = Arrays.stream(args).collect(joining(" "));
        return "Hello, world! The app was started with the following arguments: " + allArgs;
    }

}
