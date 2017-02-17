
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Estado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
public class TestePersistirEstado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // emf representa a conexão com o banco de dados
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW-2017-1-5M1-ModelPU");
        EntityManager em = emf.createEntityManager();
        Estado e = new Estado();       
        e.setNome("Rio Grande do Sul");
        e.setUf("RS");
        em.getTransaction().begin();// inicia uma transação
        em.persist(e); // persiste o objeto e (Estado) no banco de dados
        em.getTransaction().commit();// finaliza e efetiava a transação no banco de dados
    }

}
