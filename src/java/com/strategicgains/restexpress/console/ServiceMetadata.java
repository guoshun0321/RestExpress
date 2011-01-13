/*
    Copyright 2011, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package com.strategicgains.restexpress.console;

import java.util.ArrayList;
import java.util.List;

/**
 * @author toddf
 * @since Jan 12, 2011
 */
public class ServiceMetadata
{
	private List<String> formats = new ArrayList<String>();
	private String defaultFormat;
	private List<RouteMetadata> routes = new ArrayList<RouteMetadata>();

	public String getDefaultFormat()
	{
		return defaultFormat;
	}
	
	public void setDefaultFormat(String format)
	{
		this.defaultFormat = format;
	}

	public List<String> getFormats()
	{
		return formats;
	}

	public void setFormats(List<String> formats)
	{
		this.formats = formats;
	}
	
	public void addRoute(RouteMetadata metadata)
	{
		routes.add(metadata);
	}

	public List<RouteMetadata> getRoutes()
	{
		return routes;
	}

	public void setRoutes(List<RouteMetadata> routes)
	{
		this.routes = routes;
	}
}
