package br.edu.ifg.sistemacomercial.logic;

import br.edu.ifg.sistemacomercial.dao.PedidoDAO;
import br.edu.ifg.sistemacomercial.entity.Pedido;
import java.util.List;
import javax.inject.Inject;

public class PedidoLogic implements GenericLogic<Pedido, Integer> {

    @Inject
    private PedidoDAO dao;
    
    @Override
    public Pedido salvar(Pedido entity) throws Exception {
        dao.salvar(entity);
        return null;
    }

    @Override
    public void deletar(Pedido entity) throws Exception {
        dao.deletar(entity);
    }

    @Override
    public Pedido buscarPorId(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pedido> buscar(Pedido entity) throws Exception {
        return dao.listar();
    }
    
}
