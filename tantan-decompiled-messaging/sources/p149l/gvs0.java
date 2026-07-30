package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class gvs0 extends jxr0 implements sys0 {
    public gvs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // p149l.sys0
    /* JADX INFO: renamed from: d0 */
    public final void mo128293d0(String str, String str2) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(str2);
        m143825Y2(1, parcelM143822O);
    }
}
