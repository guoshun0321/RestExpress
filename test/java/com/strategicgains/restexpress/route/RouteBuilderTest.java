package com.strategicgains.restexpress.route;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jboss.netty.handler.codec.http.HttpMethod;
import org.junit.Test;

import com.strategicgains.restexpress.Request;
import com.strategicgains.restexpress.Response;
import com.strategicgains.restexpress.RestExpress;
import com.strategicgains.restexpress.domain.metadata.RouteMetadata;

public class RouteBuilderTest
{
	@Test
	public void shouldGenerateDefaultMethods()
	{
		RestExpress server = new RestExpress();
		RouteBuilder rb1 = server.uri("/route/builder/test1", new NoopController());
		RouteMetadata md1 = rb1.asMetadata();
		assertEquals(4, md1.getMethods().size());
		assertTrue(md1.getMethods().contains("GET"));
		assertTrue(md1.getMethods().contains("PUT"));
		assertTrue(md1.getMethods().contains("POST"));
		assertTrue(md1.getMethods().contains("DELETE"));
	}
	@Test
	public void shouldGenerateSpecifiedMethods()
	{
		RestExpress server = new RestExpress();
		RouteBuilder rb1 = server.uri("/route/builder/test2", new NoopController())
			.method(HttpMethod.GET, HttpMethod.POST);
		RouteMetadata md1 = rb1.asMetadata();
		assertEquals(2, md1.getMethods().size());
		assertTrue(md1.getMethods().contains("GET"));
		assertTrue(md1.getMethods().contains("POST"));
	}

	@SuppressWarnings("unused")
	private class NoopController
	{
        public void create(Request request, Response response)
		{
		}

		public void read(Request request, Response response)
		{
		}
		
		public void update(Request request, Response response)
		{
		}
		
		public void delete(Request request, Response response)
		{
		}
	}
}
