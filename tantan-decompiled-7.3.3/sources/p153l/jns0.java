package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class jns0 extends p6s0 implements kns0 {
    public jns0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // p153l.kns0
    /* JADX INFO: renamed from: i */
    public final void mo146286i(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        m171041Y2(1, parcelM171038O);
    }

    @Override // p153l.kns0
    public final void zze() throws RemoteException {
        m171041Y2(2, m171038O());
    }
}
