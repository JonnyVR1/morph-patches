package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class n2t0 extends p6s0 implements p2t0 {
    public n2t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // p153l.p2t0
    /* JADX INFO: renamed from: c */
    public final void mo161254c(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.p2t0
    /* JADX INFO: renamed from: h0 */
    public final void mo161255h0(List list) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeTypedList(list);
        m171041Y2(1, parcelM171038O);
    }
}
