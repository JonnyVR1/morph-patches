package org.fourthline.cling.model.message;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p149l.fg3;

/* JADX INFO: loaded from: classes3.dex */
public class UpnpRequest extends UpnpOperation {
    private Method method;
    private URI uri;

    public enum Method {
        GET("GET"),
        POST("POST"),
        NOTIFY("NOTIFY"),
        MSEARCH("M-SEARCH"),
        SUBSCRIBE("SUBSCRIBE"),
        UNSUBSCRIBE("UNSUBSCRIBE"),
        UNKNOWN("UNKNOWN");

        private static Map<String, Method> byName = new HashMap<String, Method>() { // from class: org.fourthline.cling.model.message.UpnpRequest.Method.1
            {
                for (Method method : Method.values()) {
                    put(method.getHttpName(), method);
                }
            }
        };
        private String httpName;

        Method(String str) {
            this.httpName = str;
        }

        public static Method getByHttpName(String str) {
            if (str == null) {
                return UNKNOWN;
            }
            Method method = byName.get(str.toUpperCase(Locale.ROOT));
            return method != null ? method : UNKNOWN;
        }

        public String getHttpName() {
            return this.httpName;
        }
    }

    public UpnpRequest(Method method, URL url) {
        this.method = method;
        if (url != null) {
            try {
                this.uri = url.toURI();
            } catch (URISyntaxException e) {
                fg3.m121203a(e);
                throw null;
            }
        }
    }

    public String getHttpMethodName() {
        return this.method.getHttpName();
    }

    public Method getMethod() {
        return this.method;
    }

    public URI getURI() {
        return this.uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getHttpMethodName());
        if (getURI() != null) {
            str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + getURI();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public UpnpRequest(Method method, URI uri) {
        this.method = method;
        this.uri = uri;
    }

    public UpnpRequest(Method method) {
        this.method = method;
    }
}
