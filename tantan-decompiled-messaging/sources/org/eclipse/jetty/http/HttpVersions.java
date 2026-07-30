package org.eclipse.jetty.http;

import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.BufferCache;

/* JADX INFO: loaded from: classes3.dex */
public class HttpVersions {
    public static final BufferCache CACHE;
    public static final String HTTP_0_9 = "";
    public static final Buffer HTTP_0_9_BUFFER;
    public static final int HTTP_0_9_ORDINAL = 9;
    public static final String HTTP_1_0 = "HTTP/1.0";
    public static final Buffer HTTP_1_0_BUFFER;
    public static final int HTTP_1_0_ORDINAL = 10;
    public static final String HTTP_1_1 = "HTTP/1.1";
    public static final Buffer HTTP_1_1_BUFFER;
    public static final int HTTP_1_1_ORDINAL = 11;

    static {
        BufferCache bufferCache = new BufferCache();
        CACHE = bufferCache;
        HTTP_0_9_BUFFER = bufferCache.add("", 9);
        HTTP_1_0_BUFFER = bufferCache.add(HTTP_1_0, 10);
        HTTP_1_1_BUFFER = bufferCache.add(HTTP_1_1, 11);
    }
}
