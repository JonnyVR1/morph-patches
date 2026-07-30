package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzfrw;
import com.google.android.gms.internal.ads.zzfrz;
import com.google.android.gms.internal.ads.zzfsb;
import com.google.android.gms.internal.ads.zzfsi;
import com.google.android.gms.internal.ads.zzfsk;

/* JADX INFO: loaded from: classes6.dex */
public final class eaw0 extends jxr0 implements IInterface {
    public eaw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* JADX INFO: renamed from: M6 */
    public final void m115437M6(zzfrw zzfrwVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzfrwVar);
        m143825Y2(2, parcelM143822O);
    }

    /* JADX INFO: renamed from: m4 */
    public final zzfsb m115438m4(zzfrz zzfrzVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzfrzVar);
        Parcel parcelM143823P2 = m143823P2(1, parcelM143822O);
        zzfsb zzfsbVar = (zzfsb) lxr0.m152084a(parcelM143823P2, zzfsb.CREATOR);
        parcelM143823P2.recycle();
        return zzfsbVar;
    }

    /* JADX INFO: renamed from: m5 */
    public final zzfsk m115439m5(zzfsi zzfsiVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzfsiVar);
        Parcel parcelM143823P2 = m143823P2(3, parcelM143822O);
        zzfsk zzfskVar = (zzfsk) lxr0.m152084a(parcelM143823P2, zzfsk.CREATOR);
        parcelM143823P2.recycle();
        return zzfskVar;
    }
}
