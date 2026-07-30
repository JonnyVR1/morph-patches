package p153l;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class dcs0 {

    /* JADX INFO: renamed from: a */
    public final InputStream f87821a;

    /* JADX INFO: renamed from: b */
    public final boolean f87822b;

    /* JADX INFO: renamed from: c */
    public final boolean f87823c;

    /* JADX INFO: renamed from: d */
    public final long f87824d;

    /* JADX INFO: renamed from: e */
    public final boolean f87825e;

    public dcs0(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.f87821a = inputStream;
        this.f87822b = z;
        this.f87823c = z2;
        this.f87824d = j;
        this.f87825e = z3;
    }

    /* JADX INFO: renamed from: b */
    public static dcs0 m115283b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new dcs0(inputStream, z, z2, j, z3);
    }

    /* JADX INFO: renamed from: a */
    public final long m115284a() {
        return this.f87824d;
    }

    /* JADX INFO: renamed from: c */
    public final InputStream m115285c() {
        return this.f87821a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m115286d() {
        return this.f87822b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m115287e() {
        return this.f87825e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m115288f() {
        return this.f87823c;
    }
}
