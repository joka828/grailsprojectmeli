package meligrailsproject

import grails.transaction.Transactional

@Transactional
class PersonaService {

	def validarLogin(String usuario, String password) {

		boolean bandera = false;
		if(usuario) {
			def personaAux = Persona.findByUsuario(usuario)
			if(personaAux){
				if(personaAux.password == password) {
					bandera = true;
				}
			}
		}
		bandera
	}
}
