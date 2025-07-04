package designpattrens.builder.urlChained;

public class UrlChainedBuilder implements UrlChainedInterface {
    URL url;

    public UrlChainedBuilder(){
        this.url = new URL();
    }

    @Override
    public UrlChainedBuilder hostName(String hostName) {
        url.setHostName(hostName);
        return this;
    }
    @Override
    public UrlChainedBuilder protocol(String protocol) {
        url.setProtocol(protocol);
        return this;
    }

    public UrlChainedBuilder pathParam(String pathParam) {
        url.setPathParam(pathParam);
        return this;
    }
    public UrlChainedBuilder queryParam(String queryParam) {
        url.setQueryParam(queryParam);
        return this;
    }

    public UrlChainedBuilder port(String port) {
        url.setPort(port);
        return this;
    }
    public UrlChainedBuilder build(UrlChainedBuilder urlchain){
        System.out.println(urlchain.url.getHostName());
        System.out.println(urlchain.url.getProtocol());
        System.out.println(urlchain.url.getPort());
        System.out.println(urlchain.url.getPathParam());
        System.out.println(urlchain.url.getQueryParam());
        return urlchain;
    }
}
