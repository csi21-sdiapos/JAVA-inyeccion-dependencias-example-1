package ioc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioFactory usuarioFactory = new UsuarioFactory(new UsuarioImpl()); // esto es la inyección de dependencias
		
		usuarioFactory.getInsertarUsuario();
		usuarioFactory.getEliminarUsuarioById(1);
	}

}
