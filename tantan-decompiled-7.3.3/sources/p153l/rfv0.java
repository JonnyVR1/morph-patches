package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class rfv0 extends pxt0 {

    /* JADX INFO: renamed from: a */
    public final String f162878a;

    /* JADX INFO: renamed from: b */
    public final String f162879b;

    public rfv0(String str, String str2) {
        this.f162878a = str;
        this.f162879b = str2;
    }

    @Override // p153l.czt0
    public final String zze() throws RemoteException {
        return this.f162878a;
    }

    @Override // p153l.czt0
    public final String zzf() throws RemoteException {
        return this.f162879b;
    }
}
