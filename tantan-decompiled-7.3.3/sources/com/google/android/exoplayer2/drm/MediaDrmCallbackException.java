package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C2070a;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final C2070a dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public MediaDrmCallbackException(C2070a c2070a, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.dataSpec = c2070a;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j;
    }
}
