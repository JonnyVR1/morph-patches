package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ary0 extends s5t0 implements aty0 {
    public ary0() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p153l.s5t0
    /* JADX INFO: renamed from: O */
    public final boolean mo99811O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzm();
        } else {
            if (i != 2) {
                return false;
            }
            zzn();
        }
        return true;
    }
}
