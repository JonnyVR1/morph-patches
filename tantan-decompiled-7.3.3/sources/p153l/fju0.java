package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fju0 extends p6s0 implements tlu0 {
    public fju0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // p153l.tlu0
    public final Bundle zze() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(5, m171038O());
        Bundle bundle = (Bundle) r6s0.m180039a(parcelM171039P2, Bundle.CREATOR);
        parcelM171039P2.recycle();
        return bundle;
    }

    @Override // p153l.tlu0
    public final zzu zzf() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(4, m171038O());
        zzu zzuVar = (zzu) r6s0.m180039a(parcelM171039P2, zzu.CREATOR);
        parcelM171039P2.recycle();
        return zzuVar;
    }

    @Override // p153l.tlu0
    public final String zzg() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(1, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.tlu0
    public final String zzh() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(6, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.tlu0
    public final String zzi() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.tlu0
    public final List zzj() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(3, m171038O());
        ArrayList arrayListCreateTypedArrayList = parcelM171039P2.createTypedArrayList(zzu.CREATOR);
        parcelM171039P2.recycle();
        return arrayListCreateTypedArrayList;
    }
}
