

 /*
 * .Main 
 *
 *------------------------------------------------------------------------------
 *  Copyright (C) 2006-2008 University of Dundee. All rights reserved.
 *
 *
 * 	This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *------------------------------------------------------------------------------
 */

//Java imports

//Third-party libraries

//Application-internal dependencies

import util.ExceptionHandler;
import xmlMVC.XMLModel;

/** 
 * This class is the entry point to the application
 *
 * @author  William Moore &nbsp;&nbsp;&nbsp;&nbsp;
 * <a href="mailto:will@lifesci.dundee.ac.uk">will@lifesci.dundee.ac.uk</a>
 * @version 3.0
 * <small>
 * (<b>Internal version:</b> $Revision: $Date: $)
 * </small>
 * @since OME3.0
 */
public class Main {
	
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		
		try {
			
			new XMLModel(true);

		// catch any uncaught exceptions	
		} catch (Throwable se) {
			
			se.printStackTrace();
			// give users chance to submit bug.
			ExceptionHandler.showErrorDialog("Unknown Error", 
					"Abnormal termination due to an uncaught exception.", se);
		} 
	}

}
