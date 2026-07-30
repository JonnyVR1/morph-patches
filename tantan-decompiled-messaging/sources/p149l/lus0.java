package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes6.dex */
public final class lus0 extends jxr0 implements nus0 {
    public lus0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // p149l.nus0
    /* JADX INFO: renamed from: L3 */
    public final void mo151818L3(zzbze zzbzeVar, hvs0 hvs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbzeVar);
        lxr0.m152089f(parcelM143822O, hvs0Var);
        m143825Y2(4, parcelM143822O);
    }

    @Override // p149l.nus0
    /* JADX INFO: renamed from: c3 */
    public final void mo151819c3(zzbze zzbzeVar, hvs0 hvs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbzeVar);
        lxr0.m152089f(parcelM143822O, hvs0Var);
        m143825Y2(5, parcelM143822O);
    }

    @Override // p149l.nus0
    /* JADX INFO: renamed from: q3 */
    public final void mo151820q3(zzbze zzbzeVar, hvs0 hvs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbzeVar);
        lxr0.m152089f(parcelM143822O, hvs0Var);
        m143825Y2(6, parcelM143822O);
    }

    @Override // p149l.nus0
    /* JADX INFO: renamed from: r1 */
    public final void mo151821r1(String str, hvs0 hvs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, hvs0Var);
        m143825Y2(7, parcelM143822O);
    }
}
