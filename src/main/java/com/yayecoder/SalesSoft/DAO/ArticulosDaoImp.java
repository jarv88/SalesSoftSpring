package com.yayecoder.SalesSoft.DAO;

import com.yayecoder.SalesSoft.Models.Articulos;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ArticulosDaoImp implements ArticulosDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Articulos> getArticulos(){
        String query ="FROM Articulos";
        return entityManager.createQuery(query).getResultList();

    }

    public void insert(Articulos articulo){
        entityManager.merge(articulo); //probar persist para nuevos insert y merge para updates

    }

    public void delete (Long id){
        Articulos art = entityManager.find(Articulos.class, id);
        entityManager.remove(art);
    }

    public void update (Articulos articulo){
        //Articulos art = entityManager.find(Articulos.class, articulo.getId());
        entityManager.merge(articulo);
    }

}
