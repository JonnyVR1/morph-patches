package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class igv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final int f113177a;

    /* JADX INFO: renamed from: b */
    public final boolean f113178b;

    /* JADX INFO: renamed from: c */
    public final boolean f113179c;

    /* JADX INFO: renamed from: d */
    public final int f113180d;

    /* JADX INFO: renamed from: e */
    public final int f113181e;

    /* JADX INFO: renamed from: f */
    public final int f113182f;

    /* JADX INFO: renamed from: g */
    public final int f113183g;

    /* JADX INFO: renamed from: h */
    public final int f113184h;

    /* JADX INFO: renamed from: i */
    public final float f113185i;

    /* JADX INFO: renamed from: j */
    public final boolean f113186j;

    public igv0(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, float f, boolean z3) {
        this.f113177a = i;
        this.f113178b = z;
        this.f113179c = z2;
        this.f113180d = i2;
        this.f113181e = i3;
        this.f113182f = i4;
        this.f113183g = i5;
        this.f113184h = i6;
        this.f113185i = f;
        this.f113186j = z3;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f113177a);
        bundle.putBoolean("ma", this.f113178b);
        bundle.putBoolean("sp", this.f113179c);
        bundle.putInt("muv", this.f113180d);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132437va)).booleanValue()) {
            bundle.putInt("muv_min", this.f113181e);
            bundle.putInt("muv_max", this.f113182f);
        }
        bundle.putInt("rm", this.f113183g);
        bundle.putInt("riv", this.f113184h);
        bundle.putFloat("android_app_volume", this.f113185i);
        bundle.putBoolean("android_app_muted", this.f113186j);
    }
}
