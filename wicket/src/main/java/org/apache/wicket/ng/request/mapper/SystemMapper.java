/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.ng.request.mapper;


/**
 * Mapper that encapsulates mappers that are necessary for Wicket to function.
 * 
 * @author igor.vaynberg
 * 
 */
public class SystemMapper extends ThreadsafeCompoundRequestMapper
{
	/**
	 * Constructor
	 */
	public SystemMapper()
	{
		register(new HomePageMapper());
		register(new PageInstanceMapper());
		register(new BookmarkableMapper());
		register(new ResourceReferenceMapper());
		register(new BufferedResponseMapper());
	}
}