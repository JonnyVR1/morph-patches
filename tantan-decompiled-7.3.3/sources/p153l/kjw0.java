package p153l;

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
public final class kjw0 extends p6s0 implements IInterface {
    public kjw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* JADX INFO: renamed from: M6 */
    public final void m150074M6(zzfrw zzfrwVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzfrwVar);
        m171041Y2(2, parcelM171038O);
    }

    /* JADX INFO: renamed from: m4 */
    public final zzfsb m150075m4(zzfrz zzfrzVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzfrzVar);
        Parcel parcelM171039P2 = m171039P2(1, parcelM171038O);
        zzfsb zzfsbVar = (zzfsb) r6s0.m180039a(parcelM171039P2, zzfsb.CREATOR);
        parcelM171039P2.recycle();
        return zzfsbVar;
    }

    /* JADX INFO: renamed from: m5 */
    public final zzfsk m150076m5(zzfsi zzfsiVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzfsiVar);
        Parcel parcelM171039P2 = m171039P2(3, parcelM171038O);
        zzfsk zzfskVar = (zzfsk) r6s0.m180039a(parcelM171039P2, zzfsk.CREATOR);
        parcelM171039P2.recycle();
        return zzfskVar;
    }
}
