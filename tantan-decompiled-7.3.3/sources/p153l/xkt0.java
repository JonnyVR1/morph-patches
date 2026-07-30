package p153l;

import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class xkt0 {

    /* JADX INFO: renamed from: a */
    public final int f194814a;

    /* JADX INFO: renamed from: b */
    public final int f194815b;

    /* JADX INFO: renamed from: c */
    public final int f194816c;

    public xkt0(int i, int i2, int i3) {
        this.f194814a = i;
        this.f194816c = i2;
        this.f194815b = i3;
    }

    /* JADX INFO: renamed from: a */
    public static xkt0 m211415a() {
        return new xkt0(0, 0, 0);
    }

    /* JADX INFO: renamed from: b */
    public static xkt0 m211416b(int i, int i2) {
        return new xkt0(1, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static xkt0 m211417c(zzq zzqVar) {
        if (zzqVar.zzd) {
            return new xkt0(3, 0, 0);
        }
        if (zzqVar.zzi) {
            return new xkt0(2, 0, 0);
        }
        return zzqVar.zzh ? m211415a() : m211416b(zzqVar.zzf, zzqVar.zzc);
    }

    /* JADX INFO: renamed from: d */
    public static xkt0 m211418d() {
        return new xkt0(5, 0, 0);
    }

    /* JADX INFO: renamed from: e */
    public static xkt0 m211419e() {
        return new xkt0(4, 0, 0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m211420f() {
        return this.f194814a == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m211421g() {
        return this.f194814a == 2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m211422h() {
        return this.f194814a == 5;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m211423i() {
        return this.f194814a == 3;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m211424j() {
        return this.f194814a == 4;
    }
}
