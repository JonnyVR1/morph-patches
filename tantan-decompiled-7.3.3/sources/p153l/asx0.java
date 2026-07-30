package p153l;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class asx0 {

    /* JADX INFO: renamed from: a */
    public final String f73189a;

    /* JADX INFO: renamed from: b */
    public final Uri f73190b;

    /* JADX INFO: renamed from: c */
    public final String f73191c;

    /* JADX INFO: renamed from: d */
    public final String f73192d;

    /* JADX INFO: renamed from: e */
    public final boolean f73193e;

    /* JADX INFO: renamed from: f */
    public final boolean f73194f;

    /* JADX INFO: renamed from: g */
    public final boolean f73195g;

    /* JADX INFO: renamed from: h */
    public final boolean f73196h;

    /* JADX INFO: renamed from: i */
    public final adj<Context, Boolean> f73197i;

    public asx0(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, adj<Context, Boolean> adjVar) {
        this.f73189a = str;
        this.f73190b = uri;
        this.f73191c = str2;
        this.f73192d = str3;
        this.f73193e = z;
        this.f73194f = z2;
        this.f73195g = z3;
        this.f73196h = z4;
        this.f73197i = adjVar;
    }

    /* JADX INFO: renamed from: a */
    public final sqx0<Double> m100001a(String str, double d) {
        return sqx0.m187565g(this, str, Double.valueOf(-3.0d), true);
    }

    /* JADX INFO: renamed from: b */
    public final sqx0<Long> m100002b(String str, long j) {
        return sqx0.m187566h(this, str, Long.valueOf(j), true);
    }

    /* JADX INFO: renamed from: c */
    public final sqx0<String> m100003c(String str, String str2) {
        return sqx0.m187567i(this, str, str2, true);
    }

    /* JADX INFO: renamed from: d */
    public final sqx0<Boolean> m100004d(String str, boolean z) {
        return sqx0.m187564f(this, str, Boolean.valueOf(z), true);
    }

    /* JADX INFO: renamed from: e */
    public final asx0 m100005e() {
        return new asx0(this.f73189a, this.f73190b, this.f73191c, this.f73192d, this.f73193e, this.f73194f, true, this.f73196h, this.f73197i);
    }

    /* JADX INFO: renamed from: f */
    public final asx0 m100006f() {
        if (!this.f73191c.isEmpty()) {
            wtq0.m207906a("Cannot set GServices prefix and skip GServices");
            return null;
        }
        adj<Context, Boolean> adjVar = this.f73197i;
        if (adjVar == null) {
            return new asx0(this.f73189a, this.f73190b, this.f73191c, this.f73192d, true, this.f73194f, this.f73195g, this.f73196h, adjVar);
        }
        wtq0.m207906a("Cannot skip gservices both always and conditionally");
        return null;
    }

    public asx0(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
