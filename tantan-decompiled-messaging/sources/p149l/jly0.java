package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jly0 extends mws0 implements pny0 {
    public jly0() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p149l.mws0
    /* JADX INFO: renamed from: O */
    public final boolean mo137608O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                mo170475f3((GoogleSignInAccount) oov0.m165283a(parcel, GoogleSignInAccount.CREATOR), (Status) oov0.m165283a(parcel, Status.CREATOR));
                break;
            case 102:
                mo166146G2((Status) oov0.m165283a(parcel, Status.CREATOR));
                break;
            case 103:
                mo170474S2((Status) oov0.m165283a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
