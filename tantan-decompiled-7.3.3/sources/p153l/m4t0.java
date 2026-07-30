package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class m4t0 extends p6s0 implements y7t0 {
    public m4t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // p153l.y7t0
    /* JADX INFO: renamed from: d0 */
    public final void mo157062d0(String str, String str2) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        parcelM171038O.writeString(str2);
        m171041Y2(1, parcelM171038O);
    }
}
