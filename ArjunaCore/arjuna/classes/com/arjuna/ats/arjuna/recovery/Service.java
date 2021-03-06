/*
 * JBoss, Home of Professional Open Source
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors 
 * as indicated by the @author tags. 
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors. 
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 * 
 * (C) 2005-2006,
 * @author JBoss Inc.
 */
/*
 * Copyright (C) 1999-2001 by HP Bluestone Software, Inc. All rights Reserved.
 *
 * HP Arjuna Labs,
 * Newcastle upon Tyne,
 * Tyne and Wear,
 * UK.
 *
 * $Id: Service.java 2342 2006-03-30 13:06:17Z  $
 */
 
package com.arjuna.ats.arjuna.recovery ;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * a service is used to serve one or more requests from an input stream and post results on an output stream.
 * when the input sream is closed it is expected to close its output stream.
 * 
 * note that a single service instance may be requested to process incoming requests from multiple input
 * streams in parallel.
 *
 * note also that the service should be resilient to closure of the input and output streams during request
 * processing which can happen in resposne to asynchronous dispatch of a shutdown request to the object which
 * invoked the service.
 */
public interface Service
{
   public void doWork ( InputStream in, OutputStream out )
      throws IOException ;
}

