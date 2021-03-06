/*
	---------------------------------------------------------------------------
	Copyright © 2015-2016 ADP, LLC.   
	
	Licensed under the Apache License, Version 2.0 (the “License”); 
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software 
	distributed under the License is distributed on an “AS IS” BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
	implied.  See the License for the specific language governing 
	permissions and limitations under the License.
	---------------------------------------------------------------------------
*/
package com.adp.marketplace.core.connection.ADPConnection;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.adp.marketplace.connection.utils.ConnectionUtilsTest;
import com.adp.marketplace.connection.utils.ConnectionValidatorUtilsTest;
import com.adp.marketplace.connection.utils.SSLUtils;
import com.adp.marketplace.core.connection.core.ADPAPIConnectionFactoryTest;
import com.adp.marketplace.core.connection.core.AuthorizationCodeConnectionTest;
import com.adp.marketplace.core.connection.core.ClientCredentialsConnectionTest;


/**
 * @author tallaprs
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ ADPAPIConnectionFactoryTest.class,
	AuthorizationCodeConnectionTest.class, ClientCredentialsConnectionTest.class, 
	SSLUtils.class, ConnectionUtilsTest.class, ConnectionValidatorUtilsTest.class})
public class AllTests {

} 