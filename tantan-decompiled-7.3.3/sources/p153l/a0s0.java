package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class a0s0 extends gwr0 implements k2s0 {
    public a0s0(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.k2s0
    /* JADX INFO: renamed from: G1 */
    public final void mo95419G1(String str, String str2, y4s0 y4s0Var) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        int i = yyr0.f202126a;
        parcelM132697O.writeStrongBinder(y4s0Var);
        m132699P3(1, parcelM132697O);
    }
}
