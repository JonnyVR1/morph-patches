package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class dzs0 extends bys0 {

    /* JADX INFO: renamed from: a */
    public final String f88506a;

    /* JADX INFO: renamed from: b */
    public final int f88507b;

    public dzs0(String str, int i) {
        this.f88506a = str;
        this.f88507b = i;
    }

    @Override // p149l.cys0
    public final int zze() throws RemoteException {
        return this.f88507b;
    }

    @Override // p149l.cys0
    public final String zzf() throws RemoteException {
        return this.f88506a;
    }
}
