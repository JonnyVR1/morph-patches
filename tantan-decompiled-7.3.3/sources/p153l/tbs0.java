package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;

/* JADX INFO: loaded from: classes6.dex */
public final class tbs0 extends p6s0 implements IInterface {
    public tbs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* JADX INFO: renamed from: M6 */
    public final zzbay m190090M6(zzbbb zzbbbVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbbbVar);
        Parcel parcelM171039P2 = m171039P2(2, parcelM171038O);
        zzbay zzbayVar = (zzbay) r6s0.m180039a(parcelM171039P2, zzbay.CREATOR);
        parcelM171039P2.recycle();
        return zzbayVar;
    }

    /* JADX INFO: renamed from: m4 */
    public final long m190091m4(zzbbb zzbbbVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbbbVar);
        Parcel parcelM171039P2 = m171039P2(3, parcelM171038O);
        long j = parcelM171039P2.readLong();
        parcelM171039P2.recycle();
        return j;
    }

    /* JADX INFO: renamed from: m5 */
    public final zzbay m190092m5(zzbbb zzbbbVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbbbVar);
        Parcel parcelM171039P2 = m171039P2(1, parcelM171038O);
        zzbay zzbayVar = (zzbay) r6s0.m180039a(parcelM171039P2, zzbay.CREATOR);
        parcelM171039P2.recycle();
        return zzbayVar;
    }
}
