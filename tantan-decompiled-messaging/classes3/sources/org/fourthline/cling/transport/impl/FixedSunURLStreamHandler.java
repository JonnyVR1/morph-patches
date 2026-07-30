package org.fourthline.cling.transport.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.logging.Logger;
import l.aza0;
import org.eclipse.jetty.http.HttpMethods;
import sun.net.www.protocol.http.Handler;
import sun.net.www.protocol.http.HttpURLConnection;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FixedSunURLStreamHandler implements URLStreamHandlerFactory {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9578a = 0;
    private static final Logger log = Logger.getLogger(FixedSunURLStreamHandler.class.getName());

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        log.fine("Creating new URLStreamHandler for protocol: " + str);
        if ("http".equals(str)) {
            return new Handler() { // from class: org.fourthline.cling.transport.impl.FixedSunURLStreamHandler.1
                public URLConnection openConnection(URL url) throws IOException {
                    return openConnection(url, null);
                }

                public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
                    return new UpnpURLConnection(url, this);
                }
            };
        }
        return null;
    }

    public static class UpnpURLConnection extends HttpURLConnection {
        private static final String[] methods = {HttpMethods.GET, HttpMethods.POST, HttpMethods.HEAD, HttpMethods.OPTIONS, HttpMethods.PUT, HttpMethods.DELETE, "SUBSCRIBE", "UNSUBSCRIBE", "NOTIFY"};

        public UpnpURLConnection(URL url, Handler handler) throws IOException {
            super(url, handler);
        }

        public synchronized OutputStream getOutputStream() throws IOException {
            OutputStream outputStream;
            try {
                String str = this.method;
                if (this.method.equals(HttpMethods.PUT) || this.method.equals(HttpMethods.POST) || this.method.equals("NOTIFY")) {
                    this.method = HttpMethods.PUT;
                } else {
                    this.method = HttpMethods.GET;
                }
                outputStream = super.getOutputStream();
                this.method = str;
            } catch (Throwable th) {
                throw th;
            }
            return outputStream;
        }

        public void setRequestMethod(String str) throws ProtocolException {
            if (this.connected) {
                aza0.a("Cannot reset method once connected");
                return;
            }
            for (String str2 : methods) {
                if (str2.equals(str)) {
                    this.method = str;
                    return;
                }
            }
            throw new ProtocolException("Invalid UPnP HTTP method: " + str);
        }

        public UpnpURLConnection(URL url, String str, int i) throws IOException {
            super(url, str, i);
        }
    }
}
