package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class kds0 extends jxr0 implements mds0 {
    public kds0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // p149l.mds0
    /* JADX INFO: renamed from: F4 */
    public final void mo145680F4(ips0 ips0Var, uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, ips0Var);
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(1, parcelM143822O);
    }
}
