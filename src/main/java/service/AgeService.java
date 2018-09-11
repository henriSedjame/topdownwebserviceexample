package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "getAge")
public class AgeService implements generated.ageservice.AgeService {
  @Override
  @WebMethod
  public String getAge(Integer annee) {
    return "votre age est de " + (2018 - annee) + " ans";
  }
}
