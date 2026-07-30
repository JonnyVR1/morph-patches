package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ajs0 extends jxr0 implements cjs0 {
    public ajs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // p149l.cjs0
    /* JADX INFO: renamed from: c */
    public final void mo97009c(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.cjs0
    public final void zzf() throws RemoteException {
        m143825Y2(2, m143822O());
    }
}
