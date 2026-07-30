package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzboq;

/* JADX INFO: loaded from: classes6.dex */
public final class ors0 extends p6s0 implements IInterface {
    public ors0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* JADX INFO: renamed from: m4 */
    public final void m168940m4(zzboq zzboqVar, nrs0 nrs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzboqVar);
        r6s0.m180044f(parcelM171038O, nrs0Var);
        m171040P3(2, parcelM171038O);
    }
}
