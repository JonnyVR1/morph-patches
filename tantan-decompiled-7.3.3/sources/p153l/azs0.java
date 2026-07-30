package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class azs0 extends q6s0 implements bzs0 {
    public azs0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            rxs0 rxs0VarM178617o8 = qxs0.m178617o8(parcel.readStrongBinder());
            r6s0.m180041c(parcel);
            mo107257v6(rxs0VarM178617o8);
        } else if (i == 2) {
            String string = parcel.readString();
            r6s0.m180041c(parcel);
            mo107255c(string);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
            r6s0.m180041c(parcel);
            mo107256f(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
