package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class g7t0 extends p6s0 implements i7t0 {
    public g7t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // p153l.i7t0
    public final int zze() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        int i = parcelM171039P2.readInt();
        parcelM171039P2.recycle();
        return i;
    }

    @Override // p153l.i7t0
    public final String zzf() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(1, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }
}
