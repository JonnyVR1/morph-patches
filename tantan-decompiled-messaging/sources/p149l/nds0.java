package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class nds0 extends jxr0 implements zds0 {
    public nds0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // p149l.zds0
    /* JADX INFO: renamed from: w3 */
    public final void mo103723w3(hes0 hes0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, hes0Var);
        m143825Y2(1, parcelM143822O);
    }
}
