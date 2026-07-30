package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lbs0 extends jxr0 implements nbs0 {
    public lbs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // p149l.nbs0
    public final String zzg() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.nbs0
    public final List zzh() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(3, m143822O());
        ArrayList arrayListM152085b = lxr0.m152085b(parcelM143823P2);
        parcelM143823P2.recycle();
        return arrayListM152085b;
    }
}
