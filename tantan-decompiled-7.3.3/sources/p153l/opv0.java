package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class opv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final int f148510a;

    /* JADX INFO: renamed from: b */
    public final boolean f148511b;

    /* JADX INFO: renamed from: c */
    public final boolean f148512c;

    /* JADX INFO: renamed from: d */
    public final int f148513d;

    /* JADX INFO: renamed from: e */
    public final int f148514e;

    /* JADX INFO: renamed from: f */
    public final int f148515f;

    /* JADX INFO: renamed from: g */
    public final int f148516g;

    /* JADX INFO: renamed from: h */
    public final int f148517h;

    /* JADX INFO: renamed from: i */
    public final float f148518i;

    /* JADX INFO: renamed from: j */
    public final boolean f148519j;

    public opv0(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, float f, boolean z3) {
        this.f148510a = i;
        this.f148511b = z;
        this.f148512c = z2;
        this.f148513d = i2;
        this.f148514e = i3;
        this.f148515f = i4;
        this.f148516g = i5;
        this.f148517h = i6;
        this.f148518i = f;
        this.f148519j = z3;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f148510a);
        bundle.putBoolean("ma", this.f148511b);
        bundle.putBoolean("sp", this.f148512c);
        bundle.putInt("muv", this.f148513d);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168508va)).booleanValue()) {
            bundle.putInt("muv_min", this.f148514e);
            bundle.putInt("muv_max", this.f148515f);
        }
        bundle.putInt("rm", this.f148516g);
        bundle.putInt("riv", this.f148517h);
        bundle.putFloat("android_app_volume", this.f148518i);
        bundle.putBoolean("android_app_muted", this.f148519j);
    }
}
