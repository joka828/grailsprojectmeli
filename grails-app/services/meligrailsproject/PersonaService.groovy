package meligrailsproject

import grails.transaction.Transactional

@Transactional
class PersonaService {

    def validarLogin(String usuario, String password) {
		 String usuarioPrueba="mario"
		String passwordPrueba="pass"
		boolean bandera = false;
		if(usuarioPrueba == usuario &&  passwordPrueba == password){
		 	bandera=true;
		}		
		return bandera
    }
}
