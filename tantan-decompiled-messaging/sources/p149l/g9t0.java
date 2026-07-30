package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzen;

/* JADX INFO: loaded from: classes6.dex */
public final class g9t0 extends jxr0 implements qbt0 {
    public g9t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // p149l.qbt0
    public final ons0 getAdapterCreator() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        ons0 ons0VarM160368o8 = nns0.m160368o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return ons0VarM160368o8;
    }

    @Override // p149l.qbt0
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(1, m143822O());
        zzen zzenVar = (zzen) lxr0.m152084a(parcelM143823P2, zzen.CREATOR);
        parcelM143823P2.recycle();
        return zzenVar;
    }
}
