import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
@DatabaseTable(tableName = "personagens")
public class Personagem {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(canBeNull = false)
    private String nome;
    @DatabaseField
    private int nivel;
    @DatabaseField
    private int vida;
    public Personagem() {
    }
    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public int getNivel() {
        return nivel;
    }
    public int getVida() {
        return vida;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    @Override
    public String toString() {
        return "Personagem: " + nome + " | Nível: " + nivel + " | Vida: " + vida;
    }
}