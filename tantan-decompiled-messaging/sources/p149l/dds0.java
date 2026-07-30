package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class dds0 extends jxr0 implements fds0 {
    public dds0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // p149l.fds0
    /* JADX INFO: renamed from: T7 */
    public final void mo111059T7(vcs0 vcs0Var, String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, vcs0Var);
        parcelM143822O.writeString(str);
        m143825Y2(1, parcelM143822O);
    }
}
