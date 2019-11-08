package se.enbohms.auth;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class AuthFilter implements ContainerRequestFilter {

  @Override
  public void filter(ContainerRequestContext ctx) {
    System.out.println("***** External Auth Service Headers *****");
    ctx.getHeaders().keySet().forEach(h -> System.out.println(h));
    ctx.abortWith(Response.ok().build());
  }
}
