package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class l6v0 extends jot0 {

    /* JADX INFO: renamed from: a */
    public final String f126672a;

    /* JADX INFO: renamed from: b */
    public final String f126673b;

    public l6v0(String str, String str2) {
        this.f126672a = str;
        this.f126673b = str2;
    }

    @Override // p149l.wpt0
    public final String zze() throws RemoteException {
        return this.f126672a;
    }

    @Override // p149l.wpt0
    public final String zzf() throws RemoteException {
        return this.f126673b;
    }
}
