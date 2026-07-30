package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ipy0 extends mws0 implements bry0 {
    public ipy0() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // p149l.mws0
    /* JADX INFO: renamed from: O */
    public final boolean mo137608O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo103606q5((Status) oov0.m165283a(parcel, Status.CREATOR), (Credential) oov0.m165283a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            mo103604D2((Status) oov0.m165283a(parcel, Status.CREATOR));
        } else {
            if (i != 3) {
                return false;
            }
            mo103605n4((Status) oov0.m165283a(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
