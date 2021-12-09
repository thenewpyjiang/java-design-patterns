/*
 * The MIT License
 * Copyright © 2014-2021 Ilkka Seppälä
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

package com.iluwatar.sessionfacade;

import java.util.logging.Logger;

/**
 * Class representing business object
 */
public class BusinessObject implements SessionFacade {

    /**
     * Data object of business object
     */
    private Object dataObject;

    /**
     * Logger to simulate performing actual actions.
     */
    private Logger logger;

    /**
     * Constructor for business object with no arguments
     */
    public BusinessObject() {
        this.dataObject = new Object();
    }

    /**
     * Constructor for BusinessObject that accepts a logger as argument
     * @param logger The logger to log data
     */
    public BusinessObject(final Logger logger) {
        this.logger = logger;
    }

    /**
     * Constructor for business object with argument
     * @param dataObject data object as argument for initialization
     * @param logger Logger to log data
     */
    public BusinessObject(final Object dataObject, final Logger logger) {
        this.dataObject = dataObject;
        this.logger = logger;
    }

    /**
     * Implementation of generic perform action for the class BusinessObject
     */
    @Override
    public void performAction() {
       logger.info("Business Object perform action");
    }

    /**
     * Getter for Data Object
     * @return the data object
     */
    public Object getDataObject() {
        return dataObject;
    }

    /**
     * Setter for data object
     * @param dataObject data object value to set the one in this class
     */
    public void setDataObject(final Object dataObject) {
        this.dataObject = dataObject;
    }

}
