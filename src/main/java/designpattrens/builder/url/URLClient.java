package designpattrens.builder.url;

public class URLClient {
    public static void main(String[] args) {
        UrlBuilder urlbuilder = new UrlBuilder();
        UrlConstruct urlconstructor = new UrlConstruct();
        URL url = urlconstructor.intiate(urlbuilder);
        System.out.println(url.getHostName());
        System.out.println(url.getPort());
    }
}
