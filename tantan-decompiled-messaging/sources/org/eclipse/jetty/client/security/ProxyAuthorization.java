package org.eclipse.jetty.client.security;

import java.io.IOException;
import org.eclipse.jetty.client.HttpExchange;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.ByteArrayBuffer;
import org.eclipse.jetty.util.B64Code;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyAuthorization implements Authentication {
    private Buffer _authorization;

    public ProxyAuthorization(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder("Basic ");
        sb.append(B64Code.encode(str + ":" + str2, "ISO-8859-1"));
        this._authorization = new ByteArrayBuffer(sb.toString());
    }

    @Override // org.eclipse.jetty.client.security.Authentication
    public void setCredentials(HttpExchange httpExchange) throws IOException {
        httpExchange.setRequestHeader(HttpHeaders.PROXY_AUTHORIZATION_BUFFER, this._authorization);
    }
}
