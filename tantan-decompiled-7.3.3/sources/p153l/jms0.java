package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class jms0 extends p6s0 implements lms0 {
    public jms0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // p153l.lms0
    /* JADX INFO: renamed from: T7 */
    public final void mo146168T7(bms0 bms0Var, String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, bms0Var);
        parcelM171038O.writeString(str);
        m171041Y2(1, parcelM171038O);
    }
}
