package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jzs0 extends q6s0 implements kzs0 {
    public jzs0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            r6s0.m180041c(parcel);
            mo152226c(string);
        } else if (i == 2) {
            String string2 = parcel.readString();
            r6s0.m180041c(parcel);
            mo152227i(string2);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
            r6s0.m180041c(parcel);
            mo152225C4(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
