package p153l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class hmv0 {

    /* JADX INFO: renamed from: a */
    public final mmv0 f110675a;

    /* JADX INFO: renamed from: b */
    public final String f110676b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public tlu0 f110677c;

    public hmv0(mmv0 mmv0Var, String str) {
        this.f110675a = mmv0Var;
        this.f110676b = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final synchronized String m136003a() {
        tlu0 tlu0Var;
        try {
            tlu0Var = this.f110677c;
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            return null;
        }
        return tlu0Var != null ? tlu0Var.zzg() : null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final synchronized String m136004b() {
        tlu0 tlu0Var;
        try {
            tlu0Var = this.f110677c;
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
            return null;
        }
        return tlu0Var != null ? tlu0Var.zzg() : null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m136005d(zzl zzlVar, int i) throws RemoteException {
        this.f110677c = null;
        nmv0 nmv0Var = new nmv0(i);
        gmv0 gmv0Var = new gmv0(this);
        this.f110675a.mo95567a(zzlVar, this.f110676b, nmv0Var, gmv0Var);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m136006e() throws RemoteException {
        return this.f110675a.zza();
    }
}
