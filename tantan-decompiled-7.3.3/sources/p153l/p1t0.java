package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class p1t0 extends p6s0 implements r1t0 {
    public p1t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: C */
    public final void mo12315C(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(13, parcelM171038O);
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: T6 */
    public final void mo12318T6(int i, int i2, Intent intent) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        parcelM171038O.writeInt(i2);
        r6s0.m180042d(parcelM171038O, intent);
        m171041Y2(12, parcelM171038O);
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: a */
    public final void mo12319a() throws RemoteException {
        m171041Y2(2, m171038O());
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: b */
    public final void mo12320b() throws RemoteException {
        m171041Y2(14, m171038O());
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: g */
    public final void mo12322g() throws RemoteException {
        m171041Y2(9, m171038O());
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: g1 */
    public final void mo12323g1(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        parcelM171038O.writeStringArray(strArr);
        parcelM171038O.writeIntArray(iArr);
        m171041Y2(15, parcelM171038O);
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: o */
    public final boolean mo12324o() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(11, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: v0 */
    public final void mo12331v0(Bundle bundle) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, bundle);
        Parcel parcelM171039P2 = m171039P2(6, parcelM171038O);
        if (parcelM171039P2.readInt() != 0) {
            bundle.readFromParcel(parcelM171039P2);
        }
        parcelM171039P2.recycle();
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: z5 */
    public final void mo12334z5(Bundle bundle) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, bundle);
        m171041Y2(1, parcelM171038O);
    }

    @Override // p153l.r1t0
    public final void zzi() throws RemoteException {
        m171041Y2(10, m171038O());
    }

    @Override // p153l.r1t0
    public final void zzm() throws RemoteException {
        m171041Y2(8, m171038O());
    }

    @Override // p153l.r1t0
    public final void zzo() throws RemoteException {
        m171041Y2(5, m171038O());
    }

    @Override // p153l.r1t0
    public final void zzr() throws RemoteException {
        m171041Y2(4, m171038O());
    }

    @Override // p153l.r1t0
    public final void zzt() throws RemoteException {
        m171041Y2(3, m171038O());
    }

    @Override // p153l.r1t0
    public final void zzu() throws RemoteException {
        m171041Y2(7, m171038O());
    }
}
