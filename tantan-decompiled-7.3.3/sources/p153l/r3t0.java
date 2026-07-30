package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes6.dex */
public final class r3t0 extends p6s0 implements t3t0 {
    public r3t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // p153l.t3t0
    /* JADX INFO: renamed from: L3 */
    public final void mo179705L3(zzbze zzbzeVar, n4t0 n4t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbzeVar);
        r6s0.m180044f(parcelM171038O, n4t0Var);
        m171041Y2(4, parcelM171038O);
    }

    @Override // p153l.t3t0
    /* JADX INFO: renamed from: c3 */
    public final void mo179706c3(zzbze zzbzeVar, n4t0 n4t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbzeVar);
        r6s0.m180044f(parcelM171038O, n4t0Var);
        m171041Y2(5, parcelM171038O);
    }

    @Override // p153l.t3t0
    /* JADX INFO: renamed from: q3 */
    public final void mo179707q3(zzbze zzbzeVar, n4t0 n4t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbzeVar);
        r6s0.m180044f(parcelM171038O, n4t0Var);
        m171041Y2(6, parcelM171038O);
    }

    @Override // p153l.t3t0
    /* JADX INFO: renamed from: r1 */
    public final void mo179708r1(String str, n4t0 n4t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, n4t0Var);
        m171041Y2(7, parcelM171038O);
    }
}
