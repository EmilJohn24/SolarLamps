package LopezChuaSolis.weblogic.security;

import javax.ejb.Local;

@Local
public interface AuthenticatorService {
	String NAME = "authenticator";
	String JNDI_NAME = "java:app/SolarLamps-ejb/AuthenticatorServiceBean";

	boolean authenticate();
}
