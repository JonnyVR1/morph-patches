package p149l;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public interface pny0 extends IInterface {
    /* JADX INFO: renamed from: G2 */
    void mo166146G2(Status status) throws RemoteException;

    /* JADX INFO: renamed from: S2 */
    void mo170474S2(Status status) throws RemoteException;

    /* JADX INFO: renamed from: f3 */
    void mo170475f3(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;
}
