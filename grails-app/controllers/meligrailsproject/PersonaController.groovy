package meligrailsproject

class PersonaController {
	PersonaService personaService= new PersonaService();
	static allowedMethods = [validarLogin:'POST']

	def validarLogin = {
		String usuario = params.usuario
		String password= params.password
		boolean metodo = personaService.validarLogin(params.usuario,params.password)
		if(metodo){
			println("Ok")
		}else{
			render (view: "login", model: [error:"eror login"])
		}
	}

	def login = {
	}
}
