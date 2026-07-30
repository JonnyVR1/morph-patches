package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public abstract class puy0 extends s5t0 implements vwy0 {
    public puy0() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p153l.s5t0
    /* JADX INFO: renamed from: O */
    public final boolean mo99811O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                mo107973f3((GoogleSignInAccount) uxv0.m198543a(parcel, GoogleSignInAccount.CREATOR), (Status) uxv0.m198543a(parcel, Status.CREATOR));
                break;
            case 102:
                mo107971G2((Status) uxv0.m198543a(parcel, Status.CREATOR));
                break;
            case 103:
                mo107972S2((Status) uxv0.m198543a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
