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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * REST Web Service
 *
 * @author Trigit Team
 */
@Path("giftask")
public class Giftask {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Giftask
     */
    public Giftask() {
    }

    /**
     * Retrieves representation of an instance of giftask.Giftask
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getInfo() {
        return "{ \"name\": \"Giftask RESTful Service\", "
                + "\"version\": \"0.0.0\", "
                + "\"description\": "
                + "\"Giftask Service\", "
                + "\"keywords\": [  \"giftask\",  \"gift\",  \"service\",  \"restful\",  \"social\" ], "
                + "\"author\": {  \"name\": \"Trigit Team\",  \"email\": \"\",  \"url\": \"\" }, "
                + "\"homepage\": \"\", "
                + "\"repository\": {  \"type\": \"git\",  \"url\": \"https://github.com/antorof/Giftask-service\" }"
                + "}";
    }
}
