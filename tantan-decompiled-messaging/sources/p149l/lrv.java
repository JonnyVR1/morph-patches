package p149l;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C2047a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lrv {

    /* JADX INFO: renamed from: h */
    public static final AtomicLong f129777h = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final long f129778a;

    /* JADX INFO: renamed from: b */
    public final C2047a f129779b;

    /* JADX INFO: renamed from: c */
    public final Uri f129780c;

    /* JADX INFO: renamed from: d */
    public final Map<String, List<String>> f129781d;

    /* JADX INFO: renamed from: e */
    public final long f129782e;

    /* JADX INFO: renamed from: f */
    public final long f129783f;

    /* JADX INFO: renamed from: g */
    public final long f129784g;

    public lrv(long j, C2047a c2047a, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f129778a = j;
        this.f129779b = c2047a;
        this.f129780c = uri;
        this.f129781d = map;
        this.f129782e = j2;
        this.f129783f = j3;
        this.f129784g = j4;
    }

    /* JADX INFO: renamed from: a */
    public static long m151512a() {
        return f129777h.getAndIncrement();
    }

    public lrv(long j, C2047a c2047a, long j2) {
        this(j, c2047a, c2047a.f9492a, Collections.EMPTY_MAP, j2, 0L, 0L);
    }
}
