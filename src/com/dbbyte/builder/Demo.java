package com.dbbyte.builder;

public class Demo {

	public static void main(String[] args) {

		String hello = "hello world";
		System.out.println("<p>" + hello + "</p>");

		String[] words = { "hello", "world" };
		System.out.println("start concatenating things... not good.. so use a Bilder");

		StringBuilder sb = new StringBuilder();
		sb.append("<ul>\n");
		for (String word : words) {
			sb.append(String.format("	<li>%s</li>\n", word));
		}
		sb.append("</ul>");
		// this makes the final build result
		System.out.println(sb.toString());

	}

}
