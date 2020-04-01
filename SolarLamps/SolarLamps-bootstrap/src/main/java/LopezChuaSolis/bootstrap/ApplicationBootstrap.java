package LopezChuaSolis.bootstrap;

import javax.ejb.Local;

@Local
public interface ApplicationBootstrap {
  String NAME = "applicationBootstrap";
  String JNDI_NAME = "java:app/SolarLamps-bootstrap/ApplicationBootstrapBean";

  void init();
}