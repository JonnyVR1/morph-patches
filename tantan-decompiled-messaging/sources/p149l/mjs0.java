package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class mjs0 extends jxr0 implements ojs0 {
    public mjs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // p149l.ojs0
    public final void zze(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(2, parcelM143822O);
    }

    @Override // p149l.ojs0
    public final void zzf() throws RemoteException {
        m143825Y2(1, m143822O());
    }
}
