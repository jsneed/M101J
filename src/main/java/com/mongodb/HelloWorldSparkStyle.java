package com.mongodb;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class HelloWorldSparkStyle 
{
	public static void main(String[] args) 
	{
		//Route route = new Route("/");
		Spark.get(new Route("/") 
		{
			@Override
			public Object handle(final Request request, final Response response)
			{
				return "Hello World From Spark\n";
			}
		});
	}
}