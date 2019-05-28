package br.edu.ifg.sistemacomercial.logic;

import br.edu.ifg.sistemacomercial.dao.ClienteDAO;
import br.edu.ifg.sistemacomercial.entity.Cliente;
import java.util.List;
import javax.inject.Inject;

public class ClienteLogic implements GenericLogic<Cliente, Integer> {

    @Inject
    private ClienteDAO dao;
    
    @Override
    public Cliente salvar(Cliente entity) throws Exception {
        if("".equals(entity.getNome().trim())){
            throw new Exception("Nome é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getCpf().trim())){
            throw new Exception("CPF é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getRg().trim())){
            throw new Exception("RG é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getTelefone1().trim())){
            throw new Exception("Telefone é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getEmail().trim())){
            throw new Exception("Email é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getObservacao().trim())){
            throw new Exception("Observação é obrigatório. Insira um valor válido!");
        }
        
        dao.salvar(entity);
        return null;
    }

    @Override
    public void deletar(Cliente entity) throws Exception {
        dao.deletar(entity);
    }

    @Override
    public Cliente buscarPorId(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Cliente> buscar(Cliente entity) throws Exception {
        return dao.listar();
    }
    
}
