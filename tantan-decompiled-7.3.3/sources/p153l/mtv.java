package p153l;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C2070a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mtv {

    /* JADX INFO: renamed from: h */
    public static final AtomicLong f138688h = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final long f138689a;

    /* JADX INFO: renamed from: b */
    public final C2070a f138690b;

    /* JADX INFO: renamed from: c */
    public final Uri f138691c;

    /* JADX INFO: renamed from: d */
    public final Map<String, List<String>> f138692d;

    /* JADX INFO: renamed from: e */
    public final long f138693e;

    /* JADX INFO: renamed from: f */
    public final long f138694f;

    /* JADX INFO: renamed from: g */
    public final long f138695g;

    public mtv(long j, C2070a c2070a, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f138689a = j;
        this.f138690b = c2070a;
        this.f138691c = uri;
        this.f138692d = map;
        this.f138693e = j2;
        this.f138694f = j3;
        this.f138695g = j4;
    }

    /* JADX INFO: renamed from: a */
    public static long m160053a() {
        return f138688h.getAndIncrement();
    }

    public mtv(long j, C2070a c2070a, long j2) {
        this(j, c2070a, c2070a.f9529a, Collections.EMPTY_MAP, j2, 0L, 0L);
    }
}
