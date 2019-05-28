package br.edu.ifg.sistemacomercial.logic;

import br.edu.ifg.sistemacomercial.dao.EnderecoDAO;
import br.edu.ifg.sistemacomercial.entity.Endereco;
import java.util.List;
import javax.inject.Inject;

public class EnderecoLogic implements GenericLogic<Endereco, Integer> {

    @Inject
    private EnderecoDAO dao;
    
    @Override
    public Endereco salvar(Endereco entity) throws Exception {
        if("".equals(entity.getLogradouro().trim())){
            throw new Exception("Lougradouro é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getNumero().trim())){
            throw new Exception("Número é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getBairro().trim())){
            throw new Exception("Bairro é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getCidade().trim())){
            throw new Exception("Cidade é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getPais().trim())){
            throw new Exception("País é obrigatório. Insira um valor válido!");
        }
        if("".equals(entity.getCep().trim())){
            throw new Exception("CEP é obrigatório. Insira um valor válido!");
        }
        if(entity.getClienteId() == null){
            throw new Exception("ID do Cliente é obrigatório. Selecione uma opção válida!");
        }
        if(entity.getCobranca() == null){
            throw new Exception("Valor de cobrança é obrigatório. Insira um valor igual ou maior que zero!");
        }
        dao.salvar(entity);
        return null;
    }

    @Override
    public void deletar(Endereco entity) throws Exception {
        dao.deletar(entity);
    }

    @Override
    public Endereco buscarPorId(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Endereco> buscar(Endereco entity) throws Exception {
        return dao.listar();
    }
    
}
