package p149l;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class zrs0 extends e520.AbstractC16543b {

    /* JADX INFO: renamed from: a */
    public final ubs0 f204542a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Drawable f204543b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Uri f204544c;

    /* JADX INFO: renamed from: d */
    public final double f204545d;

    public zrs0(ubs0 ubs0Var) {
        Drawable drawable;
        double dZzb;
        this.f204542a = ubs0Var;
        Uri uriZze = null;
        try {
            uyl uylVarZzf = ubs0Var.zzf();
            drawable = uylVarZzf != null ? (Drawable) s050.m181847P2(uylVarZzf) : null;
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
        this.f204543b = drawable;
        try {
            uriZze = this.f204542a.zze();
        } catch (RemoteException e2) {
            x2t0.m206867e("", e2);
        }
        this.f204544c = uriZze;
        try {
            dZzb = this.f204542a.zzb();
        } catch (RemoteException e3) {
            x2t0.m206867e("", e3);
            dZzb = 1.0d;
        }
        this.f204545d = dZzb;
        try {
            this.f204542a.zzd();
        } catch (RemoteException e4) {
            x2t0.m206867e("", e4);
        }
        try {
            this.f204542a.zzc();
        } catch (RemoteException e5) {
            x2t0.m206867e("", e5);
        }
    }

    @Override // p149l.e520.AbstractC16543b
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Drawable mo114778a() {
        return this.f204543b;
    }
}
