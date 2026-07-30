package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzs;

/* JADX INFO: loaded from: classes6.dex */
public final class lau0 extends p6s0 implements ycu0 {
    public lau0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // p153l.ycu0
    /* JADX INFO: renamed from: F3 */
    public final void mo153539F3(zzs zzsVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzsVar);
        m171041Y2(1, parcelM171038O);
    }

    @Override // p153l.ycu0
    public final boolean zzf() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }
}
