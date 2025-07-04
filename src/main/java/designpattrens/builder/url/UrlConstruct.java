package designpattrens.builder.url;

public class UrlConstruct {

    public URL intiate(UrlBuilder urlbilder){
        urlbilder.setHostName("myapp");
        urlbilder.setProtocol("https");
        urlbilder.setPort("8080");
        urlbilder.setPathParam("name");
        urlbilder.setQueryParam("?name=hari");
        System.out.println(urlbilder);
        return  urlbilder.getUrl();
    }
}
