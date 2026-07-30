package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hts0 extends jxr0 implements jts0 {
    public hts0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // p149l.jts0
    /* JADX INFO: renamed from: c */
    public final void mo132940c(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        m143825Y2(2, parcelM143822O);
    }

    @Override // p149l.jts0
    /* JADX INFO: renamed from: h0 */
    public final void mo132941h0(List list) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeTypedList(list);
        m143825Y2(1, parcelM143822O);
    }
}
