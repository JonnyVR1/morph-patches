package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class jss0 extends jxr0 implements lss0 {
    public jss0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: C */
    public final void mo12261C(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(13, parcelM143822O);
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: T6 */
    public final void mo12264T6(int i, int i2, Intent intent) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        parcelM143822O.writeInt(i2);
        lxr0.m152087d(parcelM143822O, intent);
        m143825Y2(12, parcelM143822O);
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: a */
    public final void mo12265a() throws RemoteException {
        m143825Y2(2, m143822O());
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: b */
    public final void mo12266b() throws RemoteException {
        m143825Y2(14, m143822O());
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: g */
    public final void mo12268g() throws RemoteException {
        m143825Y2(9, m143822O());
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: g1 */
    public final void mo12269g1(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        parcelM143822O.writeStringArray(strArr);
        parcelM143822O.writeIntArray(iArr);
        m143825Y2(15, parcelM143822O);
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: o */
    public final boolean mo12270o() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(11, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: v0 */
    public final void mo12277v0(Bundle bundle) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, bundle);
        Parcel parcelM143823P2 = m143823P2(6, parcelM143822O);
        if (parcelM143823P2.readInt() != 0) {
            bundle.readFromParcel(parcelM143823P2);
        }
        parcelM143823P2.recycle();
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: z5 */
    public final void mo12280z5(Bundle bundle) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, bundle);
        m143825Y2(1, parcelM143822O);
    }

    @Override // p149l.lss0
    public final void zzi() throws RemoteException {
        m143825Y2(10, m143822O());
    }

    @Override // p149l.lss0
    public final void zzm() throws RemoteException {
        m143825Y2(8, m143822O());
    }

    @Override // p149l.lss0
    public final void zzo() throws RemoteException {
        m143825Y2(5, m143822O());
    }

    @Override // p149l.lss0
    public final void zzr() throws RemoteException {
        m143825Y2(4, m143822O());
    }

    @Override // p149l.lss0
    public final void zzt() throws RemoteException {
        m143825Y2(3, m143822O());
    }

    @Override // p149l.lss0
    public final void zzu() throws RemoteException {
        m143825Y2(7, m143822O());
    }
}
