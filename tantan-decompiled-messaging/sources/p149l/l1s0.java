package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class l1s0 extends jxr0 implements n1s0 {
    public l1s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // p149l.n1s0
    /* JADX INFO: renamed from: n5 */
    public final void mo142392n5(uyl uylVar, u1s0 u1s0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, u1s0Var);
        m143825Y2(4, parcelM143822O);
    }

    @Override // p149l.n1s0
    public final ncu0 zzf() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(5, m143822O());
        ncu0 ncu0VarM125330o8 = gbu0.m125330o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return ncu0VarM125330o8;
    }
}
