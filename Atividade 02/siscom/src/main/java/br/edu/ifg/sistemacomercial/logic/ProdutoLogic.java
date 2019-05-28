package br.edu.ifg.sistemacomercial.logic;

import br.edu.ifg.sistemacomercial.dao.ProdutoDAO;
import br.edu.ifg.sistemacomercial.entity.Produto;
import java.util.List;
import javax.inject.Inject;

public class ProdutoLogic implements GenericLogic<Produto, Integer> {

    @Inject
    private ProdutoDAO dao;
    
    @Override
    public Produto salvar(Produto entity) throws Exception {
        if("".equals(entity.getNome().trim())){
            throw new Exception("Nome do Produto é obrigatório.");
        }
        if(entity.getCategoria() == null){
            throw new Exception("Categoria do Produto é obrigatório.");
        }
        if("".equals(entity.getUnidadeMedida().trim())){
            throw new Exception("Unidade de Medida do Produto é obrigatório.");
        }
        dao.salvar(entity);
        return null;
    }

    @Override
    public void deletar(Produto entity) throws Exception {
        dao.deletar(entity);
    }

    @Override
    public Produto buscarPorId(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Produto> buscar(Produto entity) throws Exception {
        return dao.listar();
    }
    
}
