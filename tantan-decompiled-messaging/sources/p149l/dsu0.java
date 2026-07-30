package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dsu0 extends tzr0 implements nov0 {
    public dsu0() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // p149l.tzr0
    /* JADX INFO: renamed from: O */
    public final boolean mo113496O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo160427v1((Status) lws0.m152003a(parcel, Status.CREATOR), (zzc) lws0.m152003a(parcel, zzc.CREATOR));
        return true;
    }
}
