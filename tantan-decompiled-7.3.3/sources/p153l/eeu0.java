package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class eeu0 extends p6s0 implements tgu0 {
    public eeu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // p153l.tgu0
    /* JADX INFO: renamed from: X1 */
    public final void mo113639X1(String str, p1m p1mVar, p1m p1mVar2) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, p1mVar2);
        m171041Y2(1, parcelM171038O);
    }
}
