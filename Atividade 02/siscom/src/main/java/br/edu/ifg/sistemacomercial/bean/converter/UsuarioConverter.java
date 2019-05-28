package br.edu.ifg.sistemacomercial.bean.converter;

import br.edu.ifg.sistemacomercial.entity.Usuario;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Usuario.class)
public class UsuarioConverter implements Converter<Usuario>{

    @Override
    public Usuario getAsObject(FacesContext fc, UIComponent uic, String id) {
        if(id != null && !"".equals(id)){
            Usuario usuario = 
                    (Usuario)uic.getAttributes().get("usuario_"+id);
            return usuario;
            
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Usuario t) {
        if(t != null && t.getId() != null){
            uic.getAttributes().put("usuario_"+t.getId(), t);
            return t.getId().toString();
        }
        return "";
    }
    
}
