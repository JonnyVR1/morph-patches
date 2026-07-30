package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class j0u0 {

    /* JADX INFO: renamed from: a */
    public final String f117865a;

    /* JADX INFO: renamed from: b */
    public final czt0 f117866b;

    public j0u0(czt0 czt0Var) {
        String strZze;
        this.f117866b = czt0Var;
        try {
            strZze = czt0Var.zze();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            strZze = null;
        }
        this.f117865a = strZze;
    }

    public final String toString() {
        return this.f117865a;
    }
}
