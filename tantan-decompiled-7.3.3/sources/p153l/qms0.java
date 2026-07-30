package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class qms0 extends p6s0 implements sms0 {
    public qms0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // p153l.sms0
    /* JADX INFO: renamed from: F4 */
    public final void mo177143F4(oys0 oys0Var, p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, oys0Var);
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(1, parcelM171038O);
    }
}
