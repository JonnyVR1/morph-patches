package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class gds0 extends jxr0 implements ids0 {
    public gds0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // p149l.ids0
    /* JADX INFO: renamed from: A3 */
    public final void mo125591A3(vcs0 vcs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, vcs0Var);
        m143825Y2(1, parcelM143822O);
    }
}
