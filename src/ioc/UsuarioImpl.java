package ioc;

public class UsuarioImpl implements IUsuario {

	@Override
	public void insertarUsuario() {
		System.out.println("Insertando usuario en PostgreSQL");
	}

	@Override
	public void eliminarUsuarioById(int id) {
		System.out.println("Eliminando usuario con PostgreSQL:\t" + id);
	}

}
