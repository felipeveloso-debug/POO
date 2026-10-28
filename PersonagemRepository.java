import java.sql.SQLException;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class PersonagemRepository {

    private Dao<Personagem, Integer> personagemDao;

    public PersonagemRepository(ConnectionSource connection)throws SQLException {
        personagemDao = DaoManager.createDao(connection, Personagem.class);
        TableUtils.createTableIfNotExists(connection, Personagem.class);
    }

    public void salvar(Personagem personagem) throws SQLException {
        if (personagem.getId() == 0) {
            personagemDao.create(personagem);

            Number idGerado = personagemDao.extractId(personagem);
            if (idGerado != null) {
                personagem.setId(idGerado.intValue());
            }
        } else {
            personagemDao.update(personagem);
        }
    }

    public List<Personagem> listarTodos() throws SQLException {
        return personagemDao.queryForAll();
    }

    public Personagem buscarPorId(int id) throws SQLException {
        return personagemDao.queryForId(id);
    }

    public void remover(int id) throws SQLException {
        personagemDao.deleteById(id);
    }
}