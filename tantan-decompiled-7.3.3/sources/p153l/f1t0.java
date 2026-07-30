package p153l;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class f1t0 extends md20.AbstractC18590b {

    /* JADX INFO: renamed from: a */
    public final als0 f96826a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Drawable f96827b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Uri f96828c;

    /* JADX INFO: renamed from: d */
    public final double f96829d;

    public f1t0(als0 als0Var) {
        Drawable drawable;
        double dZzb;
        this.f96826a = als0Var;
        Uri uriZze = null;
        try {
            p1m p1mVarZzf = als0Var.zzf();
            drawable = p1mVarZzf != null ? (Drawable) h950.m134037P2(p1mVarZzf) : null;
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
        this.f96827b = drawable;
        try {
            uriZze = this.f96826a.zze();
        } catch (RemoteException e2) {
            dct0.m115296e("", e2);
        }
        this.f96828c = uriZze;
        try {
            dZzb = this.f96826a.zzb();
        } catch (RemoteException e3) {
            dct0.m115296e("", e3);
            dZzb = 1.0d;
        }
        this.f96829d = dZzb;
        try {
            this.f96826a.zzd();
        } catch (RemoteException e4) {
            dct0.m115296e("", e4);
        }
        try {
            this.f96826a.zzc();
        } catch (RemoteException e5) {
            dct0.m115296e("", e5);
        }
    }

    @Override // p153l.md20.AbstractC18590b
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Drawable mo123591a() {
        return this.f96827b;
    }
}
