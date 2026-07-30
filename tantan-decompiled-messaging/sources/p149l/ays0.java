package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ays0 extends jxr0 implements cys0 {
    public ays0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // p149l.cys0
    public final int zze() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        int i = parcelM143823P2.readInt();
        parcelM143823P2.recycle();
        return i;
    }

    @Override // p149l.cys0
    public final String zzf() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(1, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }
}
