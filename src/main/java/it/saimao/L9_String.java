package it.saimao;
/*
<html>
    <head>
        <title> Hello World <title>
    </head>
    <body>
        <h1> Hello, World </h1>
    </body>
</html>
 */
public class L9_String {
    public static void main(String[] args) {
        // Escaped character
        String name = "<html>\n" +
                "    <head>\n" +
                "        <title> Hello World <title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1> Hello, World </h1>\n" +
                "    </body>\n" +
                "</html>";
        name = """
                <html>
                    <head>
                        <title> Hello World <title>
                    </head>
                    <body>
                        <h1> Hello, Java </h1>
                    </body>
                </html>
                """;
        System.out.println(name);
    }
}
