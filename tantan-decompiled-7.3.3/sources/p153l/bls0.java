package p153l;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class bls0 extends od20 {

    /* JADX INFO: renamed from: a */
    public final als0 f77210a;

    /* JADX INFO: renamed from: b */
    public final Drawable f77211b;

    /* JADX INFO: renamed from: c */
    public final Uri f77212c;

    /* JADX INFO: renamed from: d */
    public final double f77213d;

    /* JADX INFO: renamed from: e */
    public final int f77214e;

    /* JADX INFO: renamed from: f */
    public final int f77215f;

    public bls0(als0 als0Var) {
        Drawable drawable;
        double dZzb;
        int iZzd;
        this.f77210a = als0Var;
        Uri uriZze = null;
        try {
            p1m p1mVarZzf = als0Var.zzf();
            drawable = p1mVarZzf != null ? (Drawable) h950.m134037P2(p1mVarZzf) : null;
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
        this.f77211b = drawable;
        try {
            uriZze = this.f77210a.zze();
        } catch (RemoteException e2) {
            dct0.m115296e("", e2);
        }
        this.f77212c = uriZze;
        try {
            dZzb = this.f77210a.zzb();
        } catch (RemoteException e3) {
            dct0.m115296e("", e3);
            dZzb = 1.0d;
        }
        this.f77213d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f77210a.zzd();
        } catch (RemoteException e4) {
            dct0.m115296e("", e4);
            iZzd = -1;
        }
        this.f77214e = iZzd;
        try {
            iZzc = this.f77210a.zzc();
        } catch (RemoteException e5) {
            dct0.m115296e("", e5);
        }
        this.f77215f = iZzc;
    }

    @Override // p153l.od20
    /* JADX INFO: renamed from: a */
    public final Drawable mo104928a() {
        return this.f77211b;
    }

    @Override // p153l.od20
    /* JADX INFO: renamed from: b */
    public final double mo104929b() {
        return this.f77213d;
    }

    @Override // p153l.od20
    /* JADX INFO: renamed from: c */
    public final Uri mo104930c() {
        return this.f77212c;
    }

    @Override // p153l.od20
    /* JADX INFO: renamed from: d */
    public final int mo104931d() {
        return this.f77215f;
    }

    @Override // p153l.od20
    /* JADX INFO: renamed from: e */
    public final int mo104932e() {
        return this.f77214e;
    }
}
