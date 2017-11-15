package meligrailsproject

class PersonaController {

	static allowedMethods = [validarLogin:'POST']
		
    def validarLogin = {
		
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
