package br.edu.ifg.sistemacomercial.bean;

import br.edu.ifg.sistemacomercial.entity.Cliente;
import br.edu.ifg.sistemacomercial.entity.Endereco;
import br.edu.ifg.sistemacomercial.logic.ClienteLogic;
import br.edu.ifg.sistemacomercial.logic.EnderecoLogic;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class EnderecoBean extends GenericCrud<Endereco, EnderecoLogic>{

    @Inject
    private ClienteLogic clienteLogic;
    
    @Inject
    private EnderecoLogic logic;
    
    public List<Cliente> getClientes(){
        try {
            return clienteLogic.buscar(null);
        } catch (Exception ex) {
            addMensagemErro(ex.getMessage());
            return null;
        }
    }

    @Override
    public EnderecoLogic getLogic() {
        return logic;
    }
    
}
