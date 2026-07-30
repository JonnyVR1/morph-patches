package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class djs0 extends jxr0 implements fjs0 {
    public djs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // p149l.fjs0
    /* JADX INFO: renamed from: m0 */
    public final void mo112111m0(List list) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeTypedList(list);
        m143825Y2(1, parcelM143822O);
    }
}
