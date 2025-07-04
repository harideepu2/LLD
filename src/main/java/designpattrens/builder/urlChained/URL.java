package designpattrens.builder.urlChained;

public class URL {
    private String hostName; //required
    private String port;	//optional
    private String pathParam; //optional
    private String queryParam; //optional
    private String protocol; //required
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setPathParam(String pathParam) {
        this.pathParam = pathParam;
    }

    public void setQueryParam(String queryParam) {
        this.queryParam = queryParam;
    }

    public String getHostName() {
        return hostName;
    }

    public String getPort() {
        return port;
    }

    public String getPathParam() {
        return pathParam;
    }

    public String getQueryParam() {
        return queryParam;
    }

    public String getProtocol() {
        return protocol;
    }

    public URL getUrl(){
        return this;
    }
}
