package org.seamless.xhtml;

import java.net.URI;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Href {
    private URI uri;

    public Href(URI uri) {
        this.uri = uri;
    }

    public static Href fromString(String str) {
        if (str == null) {
            return null;
        }
        return new Href(URI.create(str.replaceAll(" ", "%20")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.uri.equals(((Href) obj).uri);
    }

    public URI getURI() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    public String toString() {
        return getURI().toString();
    }
}
