package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class sss0 extends p6s0 implements uss0 {
    public sss0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // p153l.uss0
    public final void zze(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.uss0
    public final void zzf() throws RemoteException {
        m171041Y2(1, m171038O());
    }
}
