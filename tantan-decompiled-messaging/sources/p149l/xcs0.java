package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class xcs0 extends jxr0 implements zcs0 {
    public xcs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // p149l.zcs0
    /* JADX INFO: renamed from: O2 */
    public final void mo208132O2(qcs0 qcs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, qcs0Var);
        m143825Y2(1, parcelM143822O);
    }
}
