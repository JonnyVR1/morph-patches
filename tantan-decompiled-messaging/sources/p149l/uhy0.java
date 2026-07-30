package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uhy0 extends mws0 implements ujy0 {
    public uhy0() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p149l.mws0
    /* JADX INFO: renamed from: O */
    public final boolean mo137608O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
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
