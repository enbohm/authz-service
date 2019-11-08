package se.enbohms.auth;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.opentracing.Traced;

@Path("/")
@Traced
public class MyService {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello(@Context HttpHeaders httpHeaders) {
    return "Auth service";
  }
}