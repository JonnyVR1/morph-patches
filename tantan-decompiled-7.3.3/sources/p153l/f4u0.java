package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class f4u0 extends g9r0 implements sxv0 {
    public f4u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p153l.sxv0
    public final String zzc() throws RemoteException {
        Parcel parcelM129603P2 = m129603P2(1, m129602O());
        String string = parcelM129603P2.readString();
        parcelM129603P2.recycle();
        return string;
    }

    @Override // p153l.sxv0
    public final boolean zzd() throws RemoteException {
        Parcel parcelM129603P2 = m129603P2(6, m129602O());
        boolean zM175519b = q5t0.m175519b(parcelM129603P2);
        parcelM129603P2.recycle();
        return zM175519b;
    }

    @Override // p153l.sxv0
    public final boolean zze(boolean z) throws RemoteException {
        Parcel parcelM129602O = m129602O();
        q5t0.m175518a(parcelM129602O, true);
        Parcel parcelM129603P2 = m129603P2(2, parcelM129602O);
        boolean zM175519b = q5t0.m175519b(parcelM129603P2);
        parcelM129603P2.recycle();
        return zM175519b;
    }
}
