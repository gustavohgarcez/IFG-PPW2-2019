package br.edu.ifg.sistemacomercial.bean;

import br.edu.ifg.sistemacomercial.entity.Cliente;
import br.edu.ifg.sistemacomercial.entity.Pedido;
import br.edu.ifg.sistemacomercial.entity.Usuario;
import br.edu.ifg.sistemacomercial.logic.ClienteLogic;
import br.edu.ifg.sistemacomercial.logic.PedidoLogic;
import br.edu.ifg.sistemacomercial.logic.UsuarioLogic;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class PedidoBean extends GenericCrud<Pedido, PedidoLogic>{
    
    @Inject
    private ClienteLogic clienteLogic;
    @Inject
    private UsuarioLogic usuarioLogic;
    @Inject
    private PedidoLogic logic;
    
    public List<Cliente> getClientes(){
        try {
            return clienteLogic.buscar(null);
        } catch (Exception ex) {
            addMensagemErro(ex.getMessage());
            return null;
        }
    }
    public List<Usuario> getUsuarios(){
        try {
            return usuarioLogic.buscar(null);
        } catch (Exception ex) {
            addMensagemErro(ex.getMessage());
            return null;
        }
    }

    @Override
    public PedidoLogic getLogic() {
        return logic;
    }
}
