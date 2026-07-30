package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class z9u0 extends jxr0 implements ncu0 {
    public z9u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // p149l.ncu0
    public final Bundle zze() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(5, m143822O());
        Bundle bundle = (Bundle) lxr0.m152084a(parcelM143823P2, Bundle.CREATOR);
        parcelM143823P2.recycle();
        return bundle;
    }

    @Override // p149l.ncu0
    public final zzu zzf() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(4, m143822O());
        zzu zzuVar = (zzu) lxr0.m152084a(parcelM143823P2, zzu.CREATOR);
        parcelM143823P2.recycle();
        return zzuVar;
    }

    @Override // p149l.ncu0
    public final String zzg() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(1, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.ncu0
    public final String zzh() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(6, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.ncu0
    public final String zzi() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.ncu0
    public final List zzj() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(3, m143822O());
        ArrayList arrayListCreateTypedArrayList = parcelM143823P2.createTypedArrayList(zzu.CREATOR);
        parcelM143823P2.recycle();
        return arrayListCreateTypedArrayList;
    }
}
