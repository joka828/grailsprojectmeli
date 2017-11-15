<!DOCTYPE html>
<html>
	<body>
       <div>
		<g:form action="validarLogin">
			Nombre <input type="text" name="usuario"> 
			Password  <input type="password" name="password">
			${error}
			<button type="sub" />Ingresar</button>
		</g:form>
	</div>	
	</body>
</html>