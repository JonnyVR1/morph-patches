package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class drt0 {

    /* JADX INFO: renamed from: a */
    public final String f87673a;

    /* JADX INFO: renamed from: b */
    public final wpt0 f87674b;

    public drt0(wpt0 wpt0Var) {
        String strZze;
        this.f87674b = wpt0Var;
        try {
            strZze = wpt0Var.zze();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            strZze = null;
        }
        this.f87673a = strZze;
    }

    public final String toString() {
        return this.f87673a;
    }
}
