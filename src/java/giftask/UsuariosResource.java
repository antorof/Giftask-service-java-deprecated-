/*
 * The MIT License
 *
 * Copyright 2015 Trigit Team.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package giftask;

import java.util.Date;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Trigit Team
 */
@Path("usuarios")
public class UsuariosResource {

    @Context
    private UriInfo context;

    int idUsuario;
    String imagen;
    String usuario,
            nombre,
            correo,
            sexo;
    Date timeline;
    String cumpleanos;
    
    /**
     * Creates a new instance of UsuariosResource
     */
    public UsuariosResource() {
    }

    @GET
    @Path("{usuario}")
    @Produces("application/json")
    public String getUsuario(@PathParam("usuario") String usuario) {
        String usr = "{"
                + "\"nombre\": \"pepito\","
                + "\"correo\": \"pepito@email.com\","
                + "\"sexo\":   \"m\""
                + "}";
        
        return usr;
    }
    
    /**
     * Retrieves representation of an instance of giftask.UsuariosResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getGeneral() {
        String usr = "{"
                + "\"error\": 0,"
                + "\"mensaje\": \"\","
                + "\"resultado\": \"Me cago en panete\""
                + "}";
        
        return usr;
    }
    
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String getCount() {
        return "1";
    }

    /**
     * PUT method for updating or creating an instance of UsuariosResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
