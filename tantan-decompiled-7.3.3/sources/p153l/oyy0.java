package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public abstract class oyy0 extends s5t0 implements h0z0 {
    public oyy0() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // p153l.s5t0
    /* JADX INFO: renamed from: O */
    public final boolean mo99811O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo96616q5((Status) uxv0.m198543a(parcel, Status.CREATOR), (Credential) uxv0.m198543a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            mo96615D2((Status) uxv0.m198543a(parcel, Status.CREATOR));
        } else {
            if (i != 3) {
                return false;
            }
            mo116006n4((Status) uxv0.m198543a(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
