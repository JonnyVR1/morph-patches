package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class uqr0 extends anr0 implements etr0 {
    public uqr0(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.etr0
    /* JADX INFO: renamed from: G1 */
    public final void mo118130G1(String str, String str2, svr0 svr0Var) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        int i = spr0.f165877a;
        parcelM97809O.writeStrongBinder(svr0Var);
        m97811P3(1, parcelM97809O);
    }
}
