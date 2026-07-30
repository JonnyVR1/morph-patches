package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class saw0 extends jxr0 implements uaw0 {
    public saw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // p149l.uaw0
    /* JADX INFO: renamed from: B4 */
    public final void mo183111B4(uyl uylVar, String str, String str2) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(null);
        m143825Y2(8, parcelM143822O);
    }

    @Override // p149l.uaw0
    /* JADX INFO: renamed from: k0 */
    public final void mo183112k0(int[] iArr) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeIntArray(null);
        m143825Y2(4, parcelM143822O);
    }

    @Override // p149l.uaw0
    /* JADX INFO: renamed from: n */
    public final void mo183113n(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(6, parcelM143822O);
    }

    @Override // p149l.uaw0
    /* JADX INFO: renamed from: r0 */
    public final void mo183114r0(byte[] bArr) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeByteArray(bArr);
        m143825Y2(5, parcelM143822O);
    }

    @Override // p149l.uaw0
    public final void zzf() throws RemoteException {
        m143825Y2(3, m143822O());
    }

    @Override // p149l.uaw0
    public final void zzg(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(7, parcelM143822O);
    }
}
