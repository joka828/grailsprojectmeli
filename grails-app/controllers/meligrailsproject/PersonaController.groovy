package meligrailsproject

class PersonaController {
	PersonaService personaService= new PersonaService();
	static allowedMethods = [validarLogin:'POST']

	def validarLogin = {


		println(params.usuario+" "+params.password )
		String usuario = params.usuario
		String password= params.password
		boolean metodo = personaService.validarLogin(params.usuario,params.password)
		println (metodo)
		if(metodo){
			println("Ok")
		}else{
			render (view: "login", model: [error:"eror login"])
		}
	}

	def login = {
	}
}
