package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class pds0 extends jxr0 implements fgs0 {
    public pds0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // p149l.fgs0
    /* JADX INFO: renamed from: l3 */
    public final void mo101747l3(zzl zzlVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzlVar);
        m143825Y2(1, parcelM143822O);
    }
}
