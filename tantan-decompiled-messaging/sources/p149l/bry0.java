package p149l;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public interface bry0 extends IInterface {
    /* JADX INFO: renamed from: D2 */
    void mo103604D2(Status status) throws RemoteException;

    /* JADX INFO: renamed from: n4 */
    void mo103605n4(Status status, String str) throws RemoteException;

    /* JADX INFO: renamed from: q5 */
    void mo103606q5(Status status, Credential credential) throws RemoteException;
}
