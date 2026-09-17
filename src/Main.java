public class Main {
    public static void main(String[] args) {
        
        conectaDAO conexao = new conectaDAO();
        conexao.connectDB();
        
        cadastroVIEW telaPrincipal = new cadastroVIEW();
        telaPrincipal.setVisible(true);
        
    }
}
