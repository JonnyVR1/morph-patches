package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class j7t0 extends p6s0 implements l7t0 {
    public j7t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: M5 */
    public final void mo133742M5(zzl zzlVar, s7t0 s7t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzlVar);
        r6s0.m180044f(parcelM171038O, s7t0Var);
        m171041Y2(14, parcelM171038O);
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: R0 */
    public final void mo133744R0(o7t0 o7t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, o7t0Var);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: g0 */
    public final void mo133746g0(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(5, parcelM171038O);
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: s5 */
    public final void mo133748s5(zzl zzlVar, s7t0 s7t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzlVar);
        r6s0.m180044f(parcelM171038O, s7t0Var);
        m171041Y2(1, parcelM171038O);
    }

    @Override // p153l.l7t0
    public final tlu0 zzc() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(12, m171038O());
        tlu0 tlu0VarM158822o8 = mku0.m158822o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return tlu0VarM158822o8;
    }
}
