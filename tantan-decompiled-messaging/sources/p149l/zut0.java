package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class zut0 extends a0r0 implements mov0 {
    public zut0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p149l.mov0
    public final String zzc() throws RemoteException {
        Parcel parcelM94466P2 = m94466P2(1, m94465O());
        String string = parcelM94466P2.readString();
        parcelM94466P2.recycle();
        return string;
    }

    @Override // p149l.mov0
    public final boolean zzd() throws RemoteException {
        Parcel parcelM94466P2 = m94466P2(6, m94465O());
        boolean zM147636b = kws0.m147636b(parcelM94466P2);
        parcelM94466P2.recycle();
        return zM147636b;
    }

    @Override // p149l.mov0
    public final boolean zze(boolean z) throws RemoteException {
        Parcel parcelM94465O = m94465O();
        kws0.m147635a(parcelM94465O, true);
        Parcel parcelM94466P2 = m94466P2(2, parcelM94465O);
        boolean zM147636b = kws0.m147636b(parcelM94466P2);
        parcelM94466P2.recycle();
        return zM147636b;
    }
}
