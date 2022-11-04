package ioc;

public class UsuarioFactory {
	
	IUsuario usuario;
	
	public UsuarioFactory(IUsuario usuario) {
		this.usuario = usuario;
	}

	public void getInsertarUsuario() {
		usuario.insertarUsuario();
	}
	
	public void getEliminarUsuarioById(int id) {
		usuario.eliminarUsuarioById(id);
	}
}
