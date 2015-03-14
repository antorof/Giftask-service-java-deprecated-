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

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * Clase que contiene metodos GET, PUT, POST y DELETE para comprobar la 
 * funcionalidad de las llamadas.
 *
 * @author Antonio Toro
 */
@Path("tester")
public class TesterResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TesterResource
     */
    public TesterResource() {
    }

    /**
     * Llamada de test para el m&ecuate;todo GET
     * @param req petici&oacute;n http
     * @return texto de ejemmplo
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getText(@Context HttpServletRequest req) {
        String mensaje = "Llamada a metodo GET";
        String resp = "{ \"metodo\":\"" + mensaje + "\"";
        try {
            Enumeration e = req.getParameterNames();

            while(e.hasMoreElements()) {
                Object key = e.nextElement();
                resp += ", \"" + key + "\" : \"" + req.getParameter(key.toString()) + "\"";
            }

        } catch (Exception e) { e.printStackTrace(); }
        resp += " }";
        return resp;
    }

    /**
     * Llamada de test para el m&ecuate;todo POST
     * @param req petici&oacute;n http
     * @return texto de ejemmplo
     */
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public String postText(@Context HttpServletRequest req, @FormParam("param1") String param1 ) {
        String mensaje = "Llamada a metodo POST";
        String resp = "{ \"metodo\":\"" + mensaje + "\"";
        try {
            Enumeration e = req.getParameterNames();

            while(e.hasMoreElements()) {
                Object key = e.nextElement();
                resp += ", \"" + key + "\" : \"" + req.getParameter(key.toString()) + "\"";
            }
            if (param1 != null) {
                resp += ", \"" + "param1" + "\" : \"" + param1 + "\"";
            }

        } catch (Exception e) { e.printStackTrace(); }
        resp += " }";
        return resp;
    }

    /**
     * Llamada de test para el m&ecuate;todo POST cuando los parametros van por URL y
     * no hay ninguno que vaya de la forma tradicional de POST.
     * @param req petici&oacute;n http
     * @return texto de ejemmplo
     */
//    @POST   
//    @Produces(MediaType.APPLICATION_JSON)
//    public String postTextUrl(@Context HttpServletRequest req ) {
//        String mensaje = "Llamada a metodo POST URL";
//        String resp = "{ \"metodo\":\"" + mensaje + "\"";
//        try {
//            Enumeration e = req.getParameterNames();
//
//            while(e.hasMoreElements()) {
//                Object key = e.nextElement();
//                resp += ", \"" + key + "\" : \"" + req.getParameter(key.toString()) + "\"";
//            }
//
//        } catch (Exception e) { e.printStackTrace(); }
//        resp += " }";
//        return resp;
//    }

    /**
     * Llamada de test para el m&ecuate;todo DELETE
     * @param req petici&oacute;n http
     * @return texto de ejemmplo
     */
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteText(@Context HttpServletRequest req) {
        String mensaje = "Llamada a metodo DELETE";
        String resp = "{ \"metodo\":\"" + mensaje + "\"";
        try {
            Enumeration e = req.getParameterNames();

            while(e.hasMoreElements()) {
                Object key = e.nextElement();
                resp += ", \"" + key + "\" : \"" + req.getParameter(key.toString()) + "\"";
            }

        } catch (Exception e) { e.printStackTrace(); }
        resp += " }";
        return resp;
    }

    /**
     * Llamada de test para el m&ecuate;todo PUT
     * @param req petici&oacute;n http
     * @return texto de ejemmplo
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public String putText(@Context HttpServletRequest req) {
        String mensaje = "Llamada a metodo PUT";
        String resp = "{ \"metodo\":\"" + mensaje + "\"";
        try {
            Enumeration e = req.getParameterNames();

            while(e.hasMoreElements()) {
                Object key = e.nextElement();
                resp += ", \"" + key + "\" : \"" + req.getParameter(key.toString()) + "\"";
            }

        } catch (Exception e) { e.printStackTrace(); }
        resp += " }";
        return resp;
    }
}
