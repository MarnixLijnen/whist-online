package REST;

import javax.annotation.security.DeclareRoles;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


import static security.Constants.ADMIN;
import static security.Constants.USER;

@ApplicationPath("/api")
@DeclareRoles({ADMIN, USER})
public class RESTConfig extends Application {
}
