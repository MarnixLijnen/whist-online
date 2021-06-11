package REST;

import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;
import javax.annotation.security.DeclareRoles;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
@BasicAuthenticationMechanismDefinition(realmName = "userRealm")
@ApplicationScoped
@DeclareRoles({"ADMIN", "USER"})
public class RESTFul_API extends Application {
}
