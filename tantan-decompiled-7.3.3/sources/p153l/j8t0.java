package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class j8t0 extends h7t0 {

    /* JADX INFO: renamed from: a */
    public final String f118816a;

    /* JADX INFO: renamed from: b */
    public final int f118817b;

    public j8t0(String str, int i) {
        this.f118816a = str;
        this.f118817b = i;
    }

    @Override // p153l.i7t0
    public final int zze() throws RemoteException {
        return this.f118817b;
    }

    @Override // p153l.i7t0
    public final String zzf() throws RemoteException {
        return this.f118816a;
    }
}
