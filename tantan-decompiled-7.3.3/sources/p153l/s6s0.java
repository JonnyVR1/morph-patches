package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class s6s0 extends p6s0 implements u6s0 {
    public s6s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // p153l.u6s0
    /* JADX INFO: renamed from: A4 */
    public final void mo184922A4(p1m p1mVar, String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        parcelM171038O.writeString("GMA_SDK");
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.u6s0
    /* JADX INFO: renamed from: k0 */
    public final void mo184923k0(int[] iArr) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeIntArray(null);
        m171041Y2(4, parcelM171038O);
    }

    @Override // p153l.u6s0
    /* JADX INFO: renamed from: n */
    public final void mo184924n(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(0);
        m171041Y2(6, parcelM171038O);
    }

    @Override // p153l.u6s0
    /* JADX INFO: renamed from: r0 */
    public final void mo184925r0(byte[] bArr) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeByteArray(bArr);
        m171041Y2(5, parcelM171038O);
    }

    @Override // p153l.u6s0
    public final void zzf() throws RemoteException {
        m171041Y2(3, m171038O());
    }

    @Override // p153l.u6s0
    public final void zzg(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        m171041Y2(7, parcelM171038O);
    }
}
