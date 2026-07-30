package p149l;

import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class rbt0 {

    /* JADX INFO: renamed from: a */
    public final int f158681a;

    /* JADX INFO: renamed from: b */
    public final int f158682b;

    /* JADX INFO: renamed from: c */
    public final int f158683c;

    public rbt0(int i, int i2, int i3) {
        this.f158681a = i;
        this.f158683c = i2;
        this.f158682b = i3;
    }

    /* JADX INFO: renamed from: a */
    public static rbt0 m178692a() {
        return new rbt0(0, 0, 0);
    }

    /* JADX INFO: renamed from: b */
    public static rbt0 m178693b(int i, int i2) {
        return new rbt0(1, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static rbt0 m178694c(zzq zzqVar) {
        if (zzqVar.zzd) {
            return new rbt0(3, 0, 0);
        }
        if (zzqVar.zzi) {
            return new rbt0(2, 0, 0);
        }
        return zzqVar.zzh ? m178692a() : m178693b(zzqVar.zzf, zzqVar.zzc);
    }

    /* JADX INFO: renamed from: d */
    public static rbt0 m178695d() {
        return new rbt0(5, 0, 0);
    }

    /* JADX INFO: renamed from: e */
    public static rbt0 m178696e() {
        return new rbt0(4, 0, 0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m178697f() {
        return this.f158681a == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m178698g() {
        return this.f158681a == 2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m178699h() {
        return this.f158681a == 5;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m178700i() {
        return this.f158681a == 3;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m178701j() {
        return this.f158681a == 4;
    }
}
