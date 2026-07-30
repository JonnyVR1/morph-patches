package org.fourthline.cling.model.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import l.aag0;
import l.ig3;
import org.fourthline.cling.model.ExpirationDetails;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Resource<M> {
    private M model;
    private URI pathQuery;

    public Resource(URI uri, M m) {
        try {
            this.pathQuery = new URI(null, null, uri.getPath(), uri.getQuery(), null);
            this.model = m;
            if (m != null) {
                return;
            }
            ig3.a("Model instance must not be null");
            throw null;
        } catch (URISyntaxException e) {
            aag0.a(e);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getPathQuery().equals(((Resource) obj).getPathQuery());
    }

    public M getModel() {
        return this.model;
    }

    public URI getPathQuery() {
        return this.pathQuery;
    }

    public int hashCode() {
        return getPathQuery().hashCode();
    }

    public void maintain(List<Runnable> list, ExpirationDetails expirationDetails) {
    }

    public boolean matches(URI uri) {
        return uri.equals(getPathQuery());
    }

    public void shutdown() {
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") URI: " + getPathQuery();
    }
}
