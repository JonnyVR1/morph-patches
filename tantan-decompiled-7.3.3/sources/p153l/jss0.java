package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jss0 extends p6s0 implements lss0 {
    public jss0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // p153l.lss0
    /* JADX INFO: renamed from: m0 */
    public final void mo115302m0(List list) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeTypedList(list);
        m171041Y2(1, parcelM171038O);
    }
}
