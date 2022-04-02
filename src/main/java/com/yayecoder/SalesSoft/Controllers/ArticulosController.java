package com.yayecoder.SalesSoft.Controllers;


import com.yayecoder.SalesSoft.DAO.ArticulosDao;
import com.yayecoder.SalesSoft.Models.Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticulosController {

    @Autowired
    ArticulosDao articulosDao;

    @RequestMapping(value = "api/articulos")
    public List<Articulos> getArticulos(){
        return articulosDao.getArticulos();

    }

    @RequestMapping(value = "api/articulos", method = RequestMethod.POST)
    public void insertArticulo(@RequestBody Articulos art){

        articulosDao.insert(art);
    }

    @RequestMapping(value = "api/articulos/{id}", method = RequestMethod.DELETE)
    public void deleteArticulo(@PathVariable Long id){

        articulosDao.delete(id);
    }


}
