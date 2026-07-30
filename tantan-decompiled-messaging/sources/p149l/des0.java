package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class des0 extends jxr0 implements ees0 {
    public des0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // p149l.ees0
    /* JADX INFO: renamed from: i */
    public final void mo111392i(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        m143825Y2(1, parcelM143822O);
    }

    @Override // p149l.ees0
    public final void zze() throws RemoteException {
        m143825Y2(2, m143822O());
    }
}
