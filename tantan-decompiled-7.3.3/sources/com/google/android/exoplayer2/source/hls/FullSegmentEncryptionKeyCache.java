package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class FullSegmentEncryptionKeyCache {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<Uri, byte[]> f8521a;

    public FullSegmentEncryptionKeyCache(final int i) {
        this.f8521a = new LinkedHashMap<Uri, byte[]>(i + 1, 1.0f, false) { // from class: com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i;
            }
        };
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public byte[] m11202a(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f8521a.get(uri);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public byte[] m11203b(Uri uri, byte[] bArr) {
        return this.f8521a.put((Uri) w11.m204369e(uri), (byte[]) w11.m204369e(bArr));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public byte[] m11204c(Uri uri) {
        return this.f8521a.remove(w11.m204369e(uri));
    }
}
