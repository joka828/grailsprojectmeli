package meligrailsproject

class PersonaController {
	PersonaService personaService;
	static allowedMethods = [validarLogin:'POST']
		
    def validarLogin = {
			
		personaService = new PersonaService();
		if(personaService.serviceMethod(params.usuario,params.password)){
			println("Ok")
		}else{
				println("false")
	
				}
			if(params.usuario== "mario" && params.password =="pass"){
				println "ASD";
				[error:""]
			}else{
				render (view: "login", model: [error:"eror login"])
			}
	
	}   
	
    def login = {
    }
	
	
	
}
