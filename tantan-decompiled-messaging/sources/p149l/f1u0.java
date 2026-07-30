package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzs;

/* JADX INFO: loaded from: classes6.dex */
public final class f1u0 extends jxr0 implements s3u0 {
    public f1u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // p149l.s3u0
    /* JADX INFO: renamed from: F3 */
    public final void mo119144F3(zzs zzsVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzsVar);
        m143825Y2(1, parcelM143822O);
    }

    @Override // p149l.s3u0
    public final boolean zzf() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }
}
