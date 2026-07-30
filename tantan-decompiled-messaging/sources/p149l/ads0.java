package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ads0 extends jxr0 implements cds0 {
    public ads0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // p149l.cds0
    /* JADX INFO: renamed from: i4 */
    public final void mo95918i4(scs0 scs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, scs0Var);
        m143825Y2(1, parcelM143822O);
    }
}
