package com.yayecoder.SalesSoft.DAO;

import com.yayecoder.SalesSoft.Models.Articulos;

import java.util.List;

public interface ArticulosDao {

    List<Articulos> getArticulos();
    void insert(Articulos articulo);
    void delete(Long id);


}