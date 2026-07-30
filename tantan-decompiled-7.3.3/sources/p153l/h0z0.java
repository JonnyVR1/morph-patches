package p153l;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public interface h0z0 extends IInterface {
    /* JADX INFO: renamed from: D2 */
    void mo96615D2(Status status) throws RemoteException;

    /* JADX INFO: renamed from: n4 */
    void mo116006n4(Status status, String str) throws RemoteException;

    /* JADX INFO: renamed from: q5 */
    void mo96616q5(Status status, Credential credential) throws RemoteException;
}
