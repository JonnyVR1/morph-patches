package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class cls0 extends p6s0 implements els0 {
    public cls0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: B7 */
    public final void mo110698B7(String str, p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(1, parcelM171038O);
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: I6 */
    public final void mo110699I6(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(9, parcelM171038O);
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: R7 */
    public final void mo110700R7(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: b7 */
    public final void mo110701b7(p1m p1mVar, int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        parcelM171038O.writeInt(i);
        m171041Y2(5, parcelM171038O);
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: d1 */
    public final void mo110702d1(xks0 xks0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, xks0Var);
        m171041Y2(8, parcelM171038O);
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: i7 */
    public final void mo110703i7(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(6, parcelM171038O);
    }

    @Override // p153l.els0
    /* JADX INFO: renamed from: x */
    public final void mo110704x(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(7, parcelM171038O);
    }

    @Override // p153l.els0
    public final p1m zzb(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        Parcel parcelM171039P2 = m171039P2(2, parcelM171038O);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }
}
