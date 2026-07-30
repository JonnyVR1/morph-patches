package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class mms0 extends p6s0 implements oms0 {
    public mms0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // p153l.oms0
    /* JADX INFO: renamed from: A3 */
    public final void mo159098A3(bms0 bms0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, bms0Var);
        m171041Y2(1, parcelM171038O);
    }
}
