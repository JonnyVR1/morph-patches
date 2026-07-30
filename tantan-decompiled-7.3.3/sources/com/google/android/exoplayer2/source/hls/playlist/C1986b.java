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
import p153l.akq;
import p153l.m5l;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1986b extends m5l {

    /* JADX INFO: renamed from: d */
    public final int f8621d;

    /* JADX INFO: renamed from: e */
    public final long f8622e;

    /* JADX INFO: renamed from: f */
    public final boolean f8623f;

    /* JADX INFO: renamed from: g */
    public final boolean f8624g;

    /* JADX INFO: renamed from: h */
    public final long f8625h;

    /* JADX INFO: renamed from: i */
    public final boolean f8626i;

    /* JADX INFO: renamed from: j */
    public final int f8627j;

    /* JADX INFO: renamed from: k */
    public final long f8628k;

    /* JADX INFO: renamed from: l */
    public final int f8629l;

    /* JADX INFO: renamed from: m */
    public final long f8630m;

    /* JADX INFO: renamed from: n */
    public final long f8631n;

    /* JADX INFO: renamed from: o */
    public final boolean f8632o;

    /* JADX INFO: renamed from: p */
    public final boolean f8633p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final DrmInitData f8634q;

    /* JADX INFO: renamed from: r */
    public final List<d> f8635r;

    /* JADX INFO: renamed from: s */
    public final List<b> f8636s;

    /* JADX INFO: renamed from: t */
    public final Map<Uri, c> f8637t;

    /* JADX INFO: renamed from: u */
    public final long f8638u;

    /* JADX INFO: renamed from: v */
    public final f f8639v;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$b */
    public static final class b extends e {

        /* JADX INFO: renamed from: l */
        public final boolean f8640l;

        /* JADX INFO: renamed from: m */
        public final boolean f8641m;

        public b(String str, @Nullable d dVar, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, dVar, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.f8640l = z2;
            this.f8641m = z3;
        }

        /* JADX INFO: renamed from: b */
        public b m11313b(long j, int i) {
            return new b(this.f8647a, this.f8648b, this.f8649c, i, j, this.f8652f, this.f8653g, this.f8654h, this.f8655i, this.f8656j, this.f8657k, this.f8640l, this.f8641m);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final Uri f8642a;

        /* JADX INFO: renamed from: b */
        public final long f8643b;

        /* JADX INFO: renamed from: c */
        public final int f8644c;

        public c(Uri uri, long j, int i) {
            this.f8642a = uri;
            this.f8643b = j;
            this.f8644c = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$e */
    public static class e implements Comparable<Long> {

        /* JADX INFO: renamed from: a */
        public final String f8647a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final d f8648b;

        /* JADX INFO: renamed from: c */
        public final long f8649c;

        /* JADX INFO: renamed from: d */
        public final int f8650d;

        /* JADX INFO: renamed from: e */
        public final long f8651e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final DrmInitData f8652f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public final String f8653g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public final String f8654h;

        /* JADX INFO: renamed from: i */
        public final long f8655i;

        /* JADX INFO: renamed from: j */
        public final long f8656j;

        /* JADX INFO: renamed from: k */
        public final boolean f8657k;

        public e(String str, @Nullable d dVar, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j3, long j4, boolean z) {
            this.f8647a = str;
            this.f8648b = dVar;
            this.f8649c = j;
            this.f8650d = i;
            this.f8651e = j2;
            this.f8652f = drmInitData;
            this.f8653g = str2;
            this.f8654h = str3;
            this.f8655i = j3;
            this.f8656j = j4;
            this.f8657k = z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l2) {
            if (this.f8651e > l2.longValue()) {
                return 1;
            }
            return this.f8651e < l2.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$f */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final long f8658a;

        /* JADX INFO: renamed from: b */
        public final boolean f8659b;

        /* JADX INFO: renamed from: c */
        public final long f8660c;

        /* JADX INFO: renamed from: d */
        public final long f8661d;

        /* JADX INFO: renamed from: e */
        public final boolean f8662e;

        public f(long j, boolean z, long j2, long j3, boolean z2) {
            this.f8658a = j;
            this.f8659b = z;
            this.f8660c = j2;
            this.f8661d = j3;
            this.f8662e = z2;
        }
    }

    public C1986b(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, @Nullable DrmInitData drmInitData, List<d> list2, List<b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z3);
        this.f8621d = i;
        this.f8625h = j2;
        this.f8624g = z;
        this.f8626i = z2;
        this.f8627j = i2;
        this.f8628k = j3;
        this.f8629l = i3;
        this.f8630m = j4;
        this.f8631n = j5;
        this.f8632o = z4;
        this.f8633p = z5;
        this.f8634q = drmInitData;
        this.f8635r = ImmutableList.copyOf((Collection) list2);
        this.f8636s = ImmutableList.copyOf((Collection) list3);
        this.f8637t = ImmutableMap.copyOf((Map) map);
        if (!list3.isEmpty()) {
            b bVar = (b) akq.m98599g(list3);
            this.f8638u = bVar.f8651e + bVar.f8649c;
        } else if (list2.isEmpty()) {
            this.f8638u = 0L;
        } else {
            d dVar = (d) akq.m98599g(list2);
            this.f8638u = dVar.f8651e + dVar.f8649c;
        }
        long jMin = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j6 = this.f8638u;
            jMin = j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j);
        }
        this.f8622e = jMin;
        this.f8623f = j >= 0;
        this.f8639v = fVar;
    }

    @Override // p153l.lni
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1986b mo11307a(List<StreamKey> list) {
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C1986b m11309c(long j, int i) {
        return new C1986b(this.f8621d, this.f134910a, this.f134911b, this.f8622e, this.f8624g, j, true, i, this.f8628k, this.f8629l, this.f8630m, this.f8631n, this.f134912c, this.f8632o, this.f8633p, this.f8634q, this.f8635r, this.f8636s, this.f8639v, this.f8637t);
    }

    /* JADX INFO: renamed from: d */
    public C1986b m11310d() {
        return this.f8632o ? this : new C1986b(this.f8621d, this.f134910a, this.f134911b, this.f8622e, this.f8624g, this.f8625h, this.f8626i, this.f8627j, this.f8628k, this.f8629l, this.f8630m, this.f8631n, this.f134912c, true, this.f8633p, this.f8634q, this.f8635r, this.f8636s, this.f8639v, this.f8637t);
    }

    /* JADX INFO: renamed from: e */
    public long m11311e() {
        return this.f8625h + this.f8638u;
    }

    /* JADX INFO: renamed from: f */
    public boolean m11312f(@Nullable C1986b c1986b) {
        if (c1986b != null) {
            long j = this.f8628k;
            long j2 = c1986b.f8628k;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.f8635r.size() - c1986b.f8635r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f8636s.size();
                int size3 = c1986b.f8636s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f8632o || c1986b.f8632o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$d */
    public static final class d extends e {

        /* JADX INFO: renamed from: l */
        public final String f8645l;

        /* JADX INFO: renamed from: m */
        public final List<b> f8646m;

        public d(String str, @Nullable d dVar, String str2, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j3, long j4, boolean z, List<b> list) {
            super(str, dVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.f8645l = str2;
            this.f8646m = ImmutableList.copyOf((Collection) list);
        }

        /* JADX INFO: renamed from: b */
        public d m11314b(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.f8646m.size(); i2++) {
                b bVar = this.f8646m.get(i2);
                arrayList.add(bVar.m11313b(j2, i));
                j2 += bVar.f8649c;
            }
            return new d(this.f8647a, this.f8648b, this.f8645l, this.f8649c, i, j, this.f8652f, this.f8653g, this.f8654h, this.f8655i, this.f8656j, this.f8657k, arrayList);
        }

        public d(String str, long j, long j2, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ImmutableList.m15739of());
        }
    }
}
