package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;

/* JADX INFO: loaded from: classes6.dex */
public final class v3t0 extends p6s0 implements x3t0 {
    public v3t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // p153l.x3t0
    /* JADX INFO: renamed from: k2 */
    public final void mo119833k2(zzbym zzbymVar, a4t0 a4t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbymVar);
        r6s0.m180044f(parcelM171038O, a4t0Var);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.x3t0
    /* JADX INFO: renamed from: p5 */
    public final void mo119835p5(zzbyi zzbyiVar, a4t0 a4t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbyiVar);
        r6s0.m180044f(parcelM171038O, a4t0Var);
        m171041Y2(1, parcelM171038O);
    }
}
