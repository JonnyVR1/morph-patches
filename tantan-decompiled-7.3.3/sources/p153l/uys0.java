package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uys0 extends q6s0 implements vys0 {
    public uys0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            r6s0.m180041c(parcel);
            mo120567Y(p1mVarM170217O);
        } else if (i == 2) {
            String string = parcel.readString();
            r6s0.m180041c(parcel);
            mo120568c(string);
        } else if (i == 3) {
            zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
            r6s0.m180041c(parcel);
            mo120569f(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            mxs0 mxs0VarM156238o8 = lxs0.m156238o8(parcel.readStrongBinder());
            r6s0.m180041c(parcel);
            mo120566T5(mxs0VarM156238o8);
        }
        parcel2.writeNoException();
        return true;
    }
}
