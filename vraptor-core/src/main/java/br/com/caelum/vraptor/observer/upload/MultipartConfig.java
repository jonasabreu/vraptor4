/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package br.com.caelum.vraptor.observer.upload;

import java.io.File;

/**
 * Basic multi part interceptor configuration.
 * 
 * @author guilherme silveira
 */
public interface MultipartConfig {

	int DEFAULT_SIZE_LIMIT = 2 * 1024 * 1024;

	/**
	 * The max size of uploaded files (in bytes).
	 * 
	 * @return
	 */
	long getSizeLimit();

	/**
	 * The max size of each uploaded file (in bytes).
	 * 
	 * @return
	 */
	long getFileSizeLimit();

	/**
	 * Gets the temporary directory.
	 * 
	 * @return
	 */
	File getDirectory();

}
