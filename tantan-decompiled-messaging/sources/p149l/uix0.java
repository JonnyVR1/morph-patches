package p149l;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class uix0 {

    /* JADX INFO: renamed from: a */
    public final String f176699a;

    /* JADX INFO: renamed from: b */
    public final Uri f176700b;

    /* JADX INFO: renamed from: c */
    public final String f176701c;

    /* JADX INFO: renamed from: d */
    public final String f176702d;

    /* JADX INFO: renamed from: e */
    public final boolean f176703e;

    /* JADX INFO: renamed from: f */
    public final boolean f176704f;

    /* JADX INFO: renamed from: g */
    public final boolean f176705g;

    /* JADX INFO: renamed from: h */
    public final boolean f176706h;

    /* JADX INFO: renamed from: i */
    public final gaj<Context, Boolean> f176707i;

    public uix0(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, gaj<Context, Boolean> gajVar) {
        this.f176699a = str;
        this.f176700b = uri;
        this.f176701c = str2;
        this.f176702d = str3;
        this.f176703e = z;
        this.f176704f = z2;
        this.f176705g = z3;
        this.f176706h = z4;
        this.f176707i = gajVar;
    }

    /* JADX INFO: renamed from: a */
    public final mhx0<Double> m193964a(String str, double d) {
        return mhx0.m154645g(this, str, Double.valueOf(-3.0d), true);
    }

    /* JADX INFO: renamed from: b */
    public final mhx0<Long> m193965b(String str, long j) {
        return mhx0.m154646h(this, str, Long.valueOf(j), true);
    }

    /* JADX INFO: renamed from: c */
    public final mhx0<String> m193966c(String str, String str2) {
        return mhx0.m154647i(this, str, str2, true);
    }

    /* JADX INFO: renamed from: d */
    public final mhx0<Boolean> m193967d(String str, boolean z) {
        return mhx0.m154644f(this, str, Boolean.valueOf(z), true);
    }

    /* JADX INFO: renamed from: e */
    public final uix0 m193968e() {
        return new uix0(this.f176699a, this.f176700b, this.f176701c, this.f176702d, this.f176703e, this.f176704f, true, this.f176706h, this.f176707i);
    }

    /* JADX INFO: renamed from: f */
    public final uix0 m193969f() {
        if (!this.f176701c.isEmpty()) {
            qkq0.m175383a("Cannot set GServices prefix and skip GServices");
            return null;
        }
        gaj<Context, Boolean> gajVar = this.f176707i;
        if (gajVar == null) {
            return new uix0(this.f176699a, this.f176700b, this.f176701c, this.f176702d, true, this.f176704f, this.f176705g, this.f176706h, gajVar);
        }
        qkq0.m175383a("Cannot skip gservices both always and conditionally");
        return null;
    }

    public uix0(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
