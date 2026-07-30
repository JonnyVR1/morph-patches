package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class i8s0 extends jxr0 implements s8s0 {
    public i8s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // p149l.s8s0
    /* JADX INFO: renamed from: I2 */
    public final void mo134984I2(h8s0 h8s0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, h8s0Var);
        m143825Y2(1, parcelM143822O);
    }
}
