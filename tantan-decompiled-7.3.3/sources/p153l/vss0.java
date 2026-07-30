package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class vss0 extends p6s0 implements xss0 {
    public vss0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // p153l.xss0
    /* JADX INFO: renamed from: S3 */
    public final void mo202663S3(rss0 rss0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, rss0Var);
        m171041Y2(1, parcelM171038O);
    }

    @Override // p153l.xss0
    /* JADX INFO: renamed from: f */
    public final void mo202664f(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.xss0
    public final void zze(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        m171041Y2(2, parcelM171038O);
    }
}
