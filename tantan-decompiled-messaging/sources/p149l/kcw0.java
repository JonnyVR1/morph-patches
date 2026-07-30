package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class kcw0 extends jxr0 implements mcw0 {
    public kcw0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // p149l.mcw0
    /* JADX INFO: renamed from: Y5 */
    public final void mo145608Y5(Bundle bundle, ocw0 ocw0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, bundle);
        lxr0.m152089f(parcelM143822O, ocw0Var);
        m143824P3(3, parcelM143822O);
    }

    @Override // p149l.mcw0
    /* JADX INFO: renamed from: d3 */
    public final void mo145609d3(String str, Bundle bundle, ocw0 ocw0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        lxr0.m152087d(parcelM143822O, bundle);
        lxr0.m152089f(parcelM143822O, ocw0Var);
        m143824P3(1, parcelM143822O);
    }

    @Override // p149l.mcw0
    /* JADX INFO: renamed from: z4 */
    public final void mo145610z4(Bundle bundle, ocw0 ocw0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, bundle);
        lxr0.m152089f(parcelM143822O, ocw0Var);
        m143824P3(2, parcelM143822O);
    }
}
