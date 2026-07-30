package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class wbs0 extends jxr0 implements ybs0 {
    public wbs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: B7 */
    public final void mo145683B7(String str, uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(1, parcelM143822O);
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: I6 */
    public final void mo145684I6(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(9, parcelM143822O);
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: R7 */
    public final void mo145685R7(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: b7 */
    public final void mo145686b7(uyl uylVar, int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        parcelM143822O.writeInt(i);
        m143825Y2(5, parcelM143822O);
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: d1 */
    public final void mo145687d1(rbs0 rbs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, rbs0Var);
        m143825Y2(8, parcelM143822O);
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: i7 */
    public final void mo145688i7(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(6, parcelM143822O);
    }

    @Override // p149l.ybs0
    /* JADX INFO: renamed from: x */
    public final void mo145691x(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(7, parcelM143822O);
    }

    @Override // p149l.ybs0
    public final uyl zzb(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        Parcel parcelM143823P2 = m143823P2(2, parcelM143822O);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }
}
