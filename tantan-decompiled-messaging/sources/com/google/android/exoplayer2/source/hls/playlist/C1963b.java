package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p149l.aiq;
import p149l.w2l;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1963b extends w2l {

    /* JADX INFO: renamed from: d */
    public final int f8584d;

    /* JADX INFO: renamed from: e */
    public final long f8585e;

    /* JADX INFO: renamed from: f */
    public final boolean f8586f;

    /* JADX INFO: renamed from: g */
    public final boolean f8587g;

    /* JADX INFO: renamed from: h */
    public final long f8588h;

    /* JADX INFO: renamed from: i */
    public final boolean f8589i;

    /* JADX INFO: renamed from: j */
    public final int f8590j;

    /* JADX INFO: renamed from: k */
    public final long f8591k;

    /* JADX INFO: renamed from: l */
    public final int f8592l;

    /* JADX INFO: renamed from: m */
    public final long f8593m;

    /* JADX INFO: renamed from: n */
    public final long f8594n;

    /* JADX INFO: renamed from: o */
    public final boolean f8595o;

    /* JADX INFO: renamed from: p */
    public final boolean f8596p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final DrmInitData f8597q;

    /* JADX INFO: renamed from: r */
    public final List<d> f8598r;

    /* JADX INFO: renamed from: s */
    public final List<b> f8599s;

    /* JADX INFO: renamed from: t */
    public final Map<Uri, c> f8600t;

    /* JADX INFO: renamed from: u */
    public final long f8601u;

    /* JADX INFO: renamed from: v */
    public final f f8602v;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$b */
    public static final class b extends e {

        /* JADX INFO: renamed from: l */
        public final boolean f8603l;

        /* JADX INFO: renamed from: m */
        public final boolean f8604m;

        public b(String str, @Nullable d dVar, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, dVar, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.f8603l = z2;
            this.f8604m = z3;
        }

        /* JADX INFO: renamed from: b */
        public b m11259b(long j, int i) {
            return new b(this.f8610a, this.f8611b, this.f8612c, i, j, this.f8615f, this.f8616g, this.f8617h, this.f8618i, this.f8619j, this.f8620k, this.f8603l, this.f8604m);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final Uri f8605a;

        /* JADX INFO: renamed from: b */
        public final long f8606b;

        /* JADX INFO: renamed from: c */
        public final int f8607c;

        public c(Uri uri, long j, int i) {
            this.f8605a = uri;
            this.f8606b = j;
            this.f8607c = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$e */
    public static class e implements Comparable<Long> {

        /* JADX INFO: renamed from: a */
        public final String f8610a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final d f8611b;

        /* JADX INFO: renamed from: c */
        public final long f8612c;

        /* JADX INFO: renamed from: d */
        public final int f8613d;

        /* JADX INFO: renamed from: e */
        public final long f8614e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final DrmInitData f8615f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public final String f8616g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public final String f8617h;

        /* JADX INFO: renamed from: i */
        public final long f8618i;

        /* JADX INFO: renamed from: j */
        public final long f8619j;

        /* JADX INFO: renamed from: k */
        public final boolean f8620k;

        public e(String str, @Nullable d dVar, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j3, long j4, boolean z) {
            this.f8610a = str;
            this.f8611b = dVar;
            this.f8612c = j;
            this.f8613d = i;
            this.f8614e = j2;
            this.f8615f = drmInitData;
            this.f8616g = str2;
            this.f8617h = str3;
            this.f8618i = j3;
            this.f8619j = j4;
            this.f8620k = z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l2) {
            if (this.f8614e > l2.longValue()) {
                return 1;
            }
            return this.f8614e < l2.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$f */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final long f8621a;

        /* JADX INFO: renamed from: b */
        public final boolean f8622b;

        /* JADX INFO: renamed from: c */
        public final long f8623c;

        /* JADX INFO: renamed from: d */
        public final long f8624d;

        /* JADX INFO: renamed from: e */
        public final boolean f8625e;

        public f(long j, boolean z, long j2, long j3, boolean z2) {
            this.f8621a = j;
            this.f8622b = z;
            this.f8623c = j2;
            this.f8624d = j3;
            this.f8625e = z2;
        }
    }

    public C1963b(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, @Nullable DrmInitData drmInitData, List<d> list2, List<b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z3);
        this.f8584d = i;
        this.f8588h = j2;
        this.f8587g = z;
        this.f8589i = z2;
        this.f8590j = i2;
        this.f8591k = j3;
        this.f8592l = i3;
        this.f8593m = j4;
        this.f8594n = j5;
        this.f8595o = z4;
        this.f8596p = z5;
        this.f8597q = drmInitData;
        this.f8598r = ImmutableList.copyOf((Collection) list2);
        this.f8599s = ImmutableList.copyOf((Collection) list3);
        this.f8600t = ImmutableMap.copyOf((Map) map);
        if (!list3.isEmpty()) {
            b bVar = (b) aiq.m96881g(list3);
            this.f8601u = bVar.f8614e + bVar.f8612c;
        } else if (list2.isEmpty()) {
            this.f8601u = 0L;
        } else {
            d dVar = (d) aiq.m96881g(list2);
            this.f8601u = dVar.f8614e + dVar.f8612c;
        }
        long jMin = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j6 = this.f8601u;
            jMin = j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j);
        }
        this.f8585e = jMin;
        this.f8586f = j >= 0;
        this.f8602v = fVar;
    }

    @Override // p149l.pki
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1963b mo11253a(List<StreamKey> list) {
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C1963b m11255c(long j, int i) {
        return new C1963b(this.f8584d, this.f184248a, this.f184249b, this.f8585e, this.f8587g, j, true, i, this.f8591k, this.f8592l, this.f8593m, this.f8594n, this.f184250c, this.f8595o, this.f8596p, this.f8597q, this.f8598r, this.f8599s, this.f8602v, this.f8600t);
    }

    /* JADX INFO: renamed from: d */
    public C1963b m11256d() {
        return this.f8595o ? this : new C1963b(this.f8584d, this.f184248a, this.f184249b, this.f8585e, this.f8587g, this.f8588h, this.f8589i, this.f8590j, this.f8591k, this.f8592l, this.f8593m, this.f8594n, this.f184250c, true, this.f8596p, this.f8597q, this.f8598r, this.f8599s, this.f8602v, this.f8600t);
    }

    /* JADX INFO: renamed from: e */
    public long m11257e() {
        return this.f8588h + this.f8601u;
    }

    /* JADX INFO: renamed from: f */
    public boolean m11258f(@Nullable C1963b c1963b) {
        if (c1963b != null) {
            long j = this.f8591k;
            long j2 = c1963b.f8591k;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.f8598r.size() - c1963b.f8598r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f8599s.size();
                int size3 = c1963b.f8599s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f8595o || c1963b.f8595o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$d */
    public static final class d extends e {

        /* JADX INFO: renamed from: l */
        public final String f8608l;

        /* JADX INFO: renamed from: m */
        public final List<b> f8609m;

        public d(String str, @Nullable d dVar, String str2, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j3, long j4, boolean z, List<b> list) {
            super(str, dVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.f8608l = str2;
            this.f8609m = ImmutableList.copyOf((Collection) list);
        }

        /* JADX INFO: renamed from: b */
        public d m11260b(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.f8609m.size(); i2++) {
                b bVar = this.f8609m.get(i2);
                arrayList.add(bVar.m11259b(j2, i));
                j2 += bVar.f8612c;
            }
            return new d(this.f8610a, this.f8611b, this.f8608l, this.f8612c, i, j, this.f8615f, this.f8616g, this.f8617h, this.f8618i, this.f8619j, this.f8620k, arrayList);
        }

        public d(String str, long j, long j2, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ImmutableList.m15685of());
        }
    }
}
