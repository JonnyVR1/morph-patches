package p149l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class bdv0 {

    /* JADX INFO: renamed from: a */
    public final gdv0 f75077a;

    /* JADX INFO: renamed from: b */
    public final String f75078b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ncu0 f75079c;

    public bdv0(gdv0 gdv0Var, String str) {
        this.f75077a = gdv0Var;
        this.f75078b = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final synchronized String m101294a() {
        ncu0 ncu0Var;
        try {
            ncu0Var = this.f75079c;
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            return null;
        }
        return ncu0Var != null ? ncu0Var.zzg() : null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final synchronized String m101295b() {
        ncu0 ncu0Var;
        try {
            ncu0Var = this.f75079c;
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
            return null;
        }
        return ncu0Var != null ? ncu0Var.zzg() : null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m101296d(zzl zzlVar, int i) throws RemoteException {
        this.f75079c = null;
        hdv0 hdv0Var = new hdv0(i);
        adv0 adv0Var = new adv0(this);
        this.f75077a.mo113608a(zzlVar, this.f75078b, hdv0Var, adv0Var);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m101297e() throws RemoteException {
        return this.f75077a.zza();
    }
}
