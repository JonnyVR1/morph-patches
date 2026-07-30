package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class gss0 extends p6s0 implements iss0 {
    public gss0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // p153l.iss0
    /* JADX INFO: renamed from: c */
    public final void mo132149c(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.iss0
    public final void zzf() throws RemoteException {
        m171041Y2(2, m171038O());
    }
}
