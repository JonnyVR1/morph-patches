package org.fourthline.cling.model.profile;

import java.net.InetAddress;
import org.fourthline.cling.model.message.Connection;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.message.header.UserAgentHeader;
import org.seamless.http.RequestInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RemoteClientInfo extends ClientInfo {
    protected final Connection connection;
    protected final UpnpHeaders extraResponseHeaders;

    public RemoteClientInfo(StreamRequestMessage streamRequestMessage) {
        this(streamRequestMessage != null ? streamRequestMessage.getConnection() : null, streamRequestMessage != null ? streamRequestMessage.getHeaders() : new UpnpHeaders());
    }

    public Connection getConnection() {
        return this.connection;
    }

    public UpnpHeaders getExtraResponseHeaders() {
        return this.extraResponseHeaders;
    }

    public InetAddress getLocalAddress() {
        return getConnection().getLocalAddress();
    }

    public InetAddress getRemoteAddress() {
        return getConnection().getRemoteAddress();
    }

    public boolean isPS3Request() {
        return RequestInfo.isPS3Request(getRequestUserAgent(), getRequestHeaders().getFirstHeaderString(UpnpHeader.Type.EXT_AV_CLIENT_INFO));
    }

    public boolean isRequestCancelled() {
        return !getConnection().isOpen();
    }

    public boolean isWMPRequest() {
        return RequestInfo.isWMPRequest(getRequestUserAgent());
    }

    public boolean isXbox360Request() {
        return RequestInfo.isXbox360Request(getRequestUserAgent(), getRequestHeaders().getFirstHeaderString(UpnpHeader.Type.SERVER));
    }

    public void setResponseUserAgent(UserAgentHeader userAgentHeader) {
        getExtraResponseHeaders().add(UpnpHeader.Type.USER_AGENT, userAgentHeader);
    }

    public void throwIfRequestCancelled() throws InterruptedException {
        if (isRequestCancelled()) {
            throw new InterruptedException("Client's request cancelled");
        }
    }

    @Override // org.fourthline.cling.model.profile.ClientInfo
    public String toString() {
        return "(" + getClass().getSimpleName() + ") Remote Address: " + getRemoteAddress();
    }

    public void setResponseUserAgent(String str) {
        setResponseUserAgent(new UserAgentHeader(str));
    }

    public RemoteClientInfo() {
        this(null);
    }

    public RemoteClientInfo(Connection connection, UpnpHeaders upnpHeaders) {
        super(upnpHeaders);
        this.extraResponseHeaders = new UpnpHeaders();
        this.connection = connection;
    }
}
