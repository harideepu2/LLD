package designpattrens.builder.urlChained;

public class UrlClient {

    public static void main(String[] args) {
        UrlChainedBuilder builder = new UrlChainedBuilder();
        builder = builder.hostName("myapp").protocol("https").port("8080").pathParam("myname").queryParam("?name=hari");
        builder.build(builder);
    }
}
