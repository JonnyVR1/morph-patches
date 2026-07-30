package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;

/* JADX INFO: loaded from: classes6.dex */
public final class n2s0 extends jxr0 implements IInterface {
    public n2s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* JADX INFO: renamed from: M6 */
    public final zzbay m157679M6(zzbbb zzbbbVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbbbVar);
        Parcel parcelM143823P2 = m143823P2(2, parcelM143822O);
        zzbay zzbayVar = (zzbay) lxr0.m152084a(parcelM143823P2, zzbay.CREATOR);
        parcelM143823P2.recycle();
        return zzbayVar;
    }

    /* JADX INFO: renamed from: m4 */
    public final long m157680m4(zzbbb zzbbbVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbbbVar);
        Parcel parcelM143823P2 = m143823P2(3, parcelM143822O);
        long j = parcelM143823P2.readLong();
        parcelM143823P2.recycle();
        return j;
    }

    /* JADX INFO: renamed from: m5 */
    public final zzbay m157681m5(zzbbb zzbbbVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbbbVar);
        Parcel parcelM143823P2 = m143823P2(1, parcelM143822O);
        zzbay zzbayVar = (zzbay) lxr0.m152084a(parcelM143823P2, zzbay.CREATOR);
        parcelM143823P2.recycle();
        return zzbayVar;
    }
}
