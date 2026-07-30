package p153l;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public interface vwy0 extends IInterface {
    /* JADX INFO: renamed from: G2 */
    void mo107971G2(Status status) throws RemoteException;

    /* JADX INFO: renamed from: S2 */
    void mo107972S2(Status status) throws RemoteException;

    /* JADX INFO: renamed from: f3 */
    void mo107973f3(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;
}
