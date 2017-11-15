package meligrailsproject

class Persona {
	
	Long id
	String usuario
	String password

    static constraints = {
		usuario size: 3..10
		password size: 6..8
    }
}
