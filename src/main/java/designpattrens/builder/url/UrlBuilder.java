package designpattrens.builder.url;

public class UrlBuilder implements UrlInterface{
    public URL url;

    public  UrlBuilder(){
        this.url = new URL();
    }
    @Override
    public void setHostName(String hostName) {
        url.setHostName(hostName);
    }
    @Override
    public void setProtocol(String protocol) {
        url.setProtocol(protocol);
    }
    public void setPort(String port) {
        url.setPort(port);
    }

    public void setPathParam(String pathParam) {
        url.setPathParam(pathParam);
    }

    public void setQueryParam(String queryParam) {
        url.setQueryParam(queryParam);
    }

    public URL getUrl(){
        return url;
    }
}
