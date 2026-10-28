import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Database database = new Database("rpg.db");

        try {
            PersonagemRepository repository = new PersonagemRepository(database.getConnection());

            System.out.println("Personagens salvos no banco:");

            for (Personagem p : repository.listarTodos()) {
                System.out.println("ID: " + p.getId() + " | " + p);
            }

        } catch (SQLException e) {
            System.err.println("Erro no banco: " + e.getMessage());
        } finally {
            database.close();
        }
    }
}