package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j1v0 extends z8s0 implements txv0 {
    public j1v0() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // p153l.z8s0
    /* JADX INFO: renamed from: O */
    public final boolean mo143154O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo116910v1((Status) r5t0.m179956a(parcel, Status.CREATOR), (zzc) r5t0.m179956a(parcel, zzc.CREATOR));
        return true;
    }
}
