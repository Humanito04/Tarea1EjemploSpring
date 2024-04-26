package ejemplo;

public class PlayTomic {

	public static void main(String[] args) {
		UsuarioPartidoPadel user1 = new UsuarioPartidoPadel(new UsuarioImplWPT());
		
		user1.getInsertandoUsuario();
		
		user1.getEliminandoUsuarioById(1);
	}
}
