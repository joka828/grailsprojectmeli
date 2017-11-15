package meligrailsproject

import grails.transaction.Transactional

@Transactional
class PersonaService {

    def serviceMethod(String usuario, String password) throws Exception {
		 String usuarioPrueba="prueba"
		String passwordPrueba="prueba"
		boolean bandera = false;
		if(usuarioPrueba == usuario &&  passwordPrueba == password){
		 	bandera=true;
		}		
		bandera
    }
}
