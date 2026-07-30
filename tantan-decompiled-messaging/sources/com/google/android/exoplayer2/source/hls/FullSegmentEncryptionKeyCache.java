package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import p149l.p11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class FullSegmentEncryptionKeyCache {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<Uri, byte[]> f8484a;

    public FullSegmentEncryptionKeyCache(final int i) {
        this.f8484a = new LinkedHashMap<Uri, byte[]>(i + 1, 1.0f, false) { // from class: com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i;
            }
        };
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public byte[] m11148a(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f8484a.get(uri);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public byte[] m11149b(Uri uri, byte[] bArr) {
        return this.f8484a.put((Uri) p11.m167011e(uri), (byte[]) p11.m167011e(bArr));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public byte[] m11150c(Uri uri) {
        return this.f8484a.remove(p11.m167011e(uri));
    }
}
