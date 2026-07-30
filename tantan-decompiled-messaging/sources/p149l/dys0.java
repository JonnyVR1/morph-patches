package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class dys0 extends jxr0 implements fys0 {
    public dys0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: M5 */
    public final void mo104375M5(zzl zzlVar, mys0 mys0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzlVar);
        lxr0.m152089f(parcelM143822O, mys0Var);
        m143825Y2(14, parcelM143822O);
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: R0 */
    public final void mo104377R0(iys0 iys0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, iys0Var);
        m143825Y2(2, parcelM143822O);
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: g0 */
    public final void mo104379g0(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(5, parcelM143822O);
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: s5 */
    public final void mo104381s5(zzl zzlVar, mys0 mys0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzlVar);
        lxr0.m152089f(parcelM143822O, mys0Var);
        m143825Y2(1, parcelM143822O);
    }

    @Override // p149l.fys0
    public final ncu0 zzc() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(12, m143822O());
        ncu0 ncu0VarM125330o8 = gbu0.m125330o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return ncu0VarM125330o8;
    }
}
