package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class qlw0 extends p6s0 implements slw0 {
    public qlw0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // p153l.slw0
    /* JADX INFO: renamed from: Y5 */
    public final void mo177014Y5(Bundle bundle, ulw0 ulw0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, bundle);
        r6s0.m180044f(parcelM171038O, ulw0Var);
        m171040P3(3, parcelM171038O);
    }

    @Override // p153l.slw0
    /* JADX INFO: renamed from: d3 */
    public final void mo177015d3(String str, Bundle bundle, ulw0 ulw0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        r6s0.m180042d(parcelM171038O, bundle);
        r6s0.m180044f(parcelM171038O, ulw0Var);
        m171040P3(1, parcelM171038O);
    }

    @Override // p153l.slw0
    /* JADX INFO: renamed from: z4 */
    public final void mo177016z4(Bundle bundle, ulw0 ulw0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, bundle);
        r6s0.m180044f(parcelM171038O, ulw0Var);
        m171040P3(2, parcelM171038O);
    }
}
