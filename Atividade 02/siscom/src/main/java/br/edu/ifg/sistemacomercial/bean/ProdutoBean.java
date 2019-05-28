package br.edu.ifg.sistemacomercial.bean;

import br.edu.ifg.sistemacomercial.entity.Categoria;
import br.edu.ifg.sistemacomercial.entity.Produto;
import br.edu.ifg.sistemacomercial.logic.CategoriaLogic;
import br.edu.ifg.sistemacomercial.logic.ProdutoLogic;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class ProdutoBean extends GenericCrud<Produto, ProdutoLogic>{
        
    @Inject
    private CategoriaLogic categoriaLogic;
    @Inject
    private ProdutoLogic logic;
    
    public List<Categoria> getCategorias(){
        try {
            return categoriaLogic.buscar(null);
        } catch (Exception ex) {
            addMensagemErro(ex.getMessage());
            return null;
        }
    }

    @Override
    public ProdutoLogic getLogic() {
        return logic;
    }
}
