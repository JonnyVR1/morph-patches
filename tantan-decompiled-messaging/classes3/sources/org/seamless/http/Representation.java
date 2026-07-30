package org.seamless.http;

import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Representation<E> implements Serializable {
    private CacheControl cacheControl;
    private Integer contentLength;
    private String contentType;
    private E entity;
    private String entityTag;
    private Long lastModified;
    private URL url;

    public Representation(URLConnection uRLConnection, E e) {
        this(uRLConnection.getURL(), CacheControl.valueOf(uRLConnection.getHeaderField(HttpHeaders.CACHE_CONTROL)), Integer.valueOf(uRLConnection.getContentLength()), uRLConnection.getContentType(), Long.valueOf(uRLConnection.getLastModified()), uRLConnection.getHeaderField("Etag"), e);
    }

    public CacheControl getCacheControl() {
        return this.cacheControl;
    }

    public Integer getContentLength() {
        Integer num = this.contentLength;
        if (num == null || num.intValue() == -1) {
            return null;
        }
        return this.contentLength;
    }

    public String getContentType() {
        return this.contentType;
    }

    public E getEntity() {
        return this.entity;
    }

    public String getEntityTag() {
        return this.entityTag;
    }

    public Long getLastModified() {
        if (this.lastModified.longValue() == 0) {
            return null;
        }
        return this.lastModified;
    }

    public Long getMaxAgeOrNull() {
        if (getCacheControl() == null || getCacheControl().getMaxAge() == -1 || getCacheControl().getMaxAge() == 0) {
            return null;
        }
        return Long.valueOf(getCacheControl().getMaxAge());
    }

    public URL getUrl() {
        return this.url;
    }

    public boolean hasBeenModified(long j) {
        return getLastModified() == null || getLastModified().longValue() < j;
    }

    public boolean hasEntityTagChanged(String str) {
        return (getEntityTag() == null || getEntityTag().equals(str)) ? false : true;
    }

    public boolean isExpired(long j) {
        return getMaxAgeOrNull() == null || isExpired(j, getMaxAgeOrNull().longValue());
    }

    public boolean isNoCache() {
        return getCacheControl() != null && getCacheControl().isNoCache();
    }

    public boolean isNoStore() {
        return getCacheControl() != null && getCacheControl().isNoStore();
    }

    public boolean mustRevalidate() {
        return getCacheControl() != null && getCacheControl().isProxyRevalidate();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") CT: " + getContentType();
    }

    public boolean isExpired(long j, long j2) {
        return j + (j2 * 1000) < new Date().getTime();
    }

    public Representation(URL url, CacheControl cacheControl, Integer num, String str, Long l2, String str2, E e) {
        this.url = url;
        this.cacheControl = cacheControl;
        this.contentLength = num;
        this.contentType = str;
        this.lastModified = l2;
        this.entityTag = str2;
        this.entity = e;
    }

    public Representation(CacheControl cacheControl, Integer num, String str, Long l2, String str2, E e) {
        this(null, cacheControl, num, str, l2, str2, e);
    }
}
