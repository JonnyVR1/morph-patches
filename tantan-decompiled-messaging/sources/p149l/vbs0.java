package p149l;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class vbs0 extends g520 {

    /* JADX INFO: renamed from: a */
    public final ubs0 f180875a;

    /* JADX INFO: renamed from: b */
    public final Drawable f180876b;

    /* JADX INFO: renamed from: c */
    public final Uri f180877c;

    /* JADX INFO: renamed from: d */
    public final double f180878d;

    /* JADX INFO: renamed from: e */
    public final int f180879e;

    /* JADX INFO: renamed from: f */
    public final int f180880f;

    public vbs0(ubs0 ubs0Var) {
        Drawable drawable;
        double dZzb;
        int iZzd;
        this.f180875a = ubs0Var;
        Uri uriZze = null;
        try {
            uyl uylVarZzf = ubs0Var.zzf();
            drawable = uylVarZzf != null ? (Drawable) s050.m181847P2(uylVarZzf) : null;
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
        this.f180876b = drawable;
        try {
            uriZze = this.f180875a.zze();
        } catch (RemoteException e2) {
            x2t0.m206867e("", e2);
        }
        this.f180877c = uriZze;
        try {
            dZzb = this.f180875a.zzb();
        } catch (RemoteException e3) {
            x2t0.m206867e("", e3);
            dZzb = 1.0d;
        }
        this.f180878d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f180875a.zzd();
        } catch (RemoteException e4) {
            x2t0.m206867e("", e4);
            iZzd = -1;
        }
        this.f180879e = iZzd;
        try {
            iZzc = this.f180875a.zzc();
        } catch (RemoteException e5) {
            x2t0.m206867e("", e5);
        }
        this.f180880f = iZzc;
    }

    @Override // p149l.g520
    /* JADX INFO: renamed from: a */
    public final Drawable mo124434a() {
        return this.f180876b;
    }

    @Override // p149l.g520
    /* JADX INFO: renamed from: b */
    public final double mo124435b() {
        return this.f180878d;
    }

    @Override // p149l.g520
    /* JADX INFO: renamed from: c */
    public final Uri mo124436c() {
        return this.f180877c;
    }

    @Override // p149l.g520
    /* JADX INFO: renamed from: d */
    public final int mo124437d() {
        return this.f180880f;
    }

    @Override // p149l.g520
    /* JADX INFO: renamed from: e */
    public final int mo124438e() {
        return this.f180879e;
    }
}
