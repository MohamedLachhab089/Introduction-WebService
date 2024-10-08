package com.med.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 100, new Date());
    }

    @WebMethod
    public List<Compte> getComptes() {
        return List.of(
                new Compte(1, 7000, new Date()),
                new Compte(2, 8000, new Date()),
                new Compte(3, 9000, new Date())
        );
    }
}
