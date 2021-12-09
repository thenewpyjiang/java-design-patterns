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
 * Class representing business session under Session Facade.
 */
public class BusinessSession implements SessionFacade {

    /**
     * Logger to simulate performing actual actions.
     */
    private Logger logger;

    /**
     * A constructor for Business Session that contains a logger
     * @param logger The logger to be used for this Business Session
     */
    public BusinessSession(final Logger logger) {
        this.logger = logger;
    }

    /**
     * Implementation of performAction in Business Session
     */
    @Override
    public void performAction() {
        logger.info("Business Session perform action");
        displayData();
    }

    /**
     * Representing data display from Business Object
     */
    private void displayData() {
        logger.info("Display data from Business Object");
    }

}
