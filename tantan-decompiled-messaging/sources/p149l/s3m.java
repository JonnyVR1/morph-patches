package p149l;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface s3m extends IInterface {
    /* JADX INFO: renamed from: d */
    void mo182196d() throws RemoteException;

    /* JADX INFO: renamed from: f0 */
    void mo182197f0(tis0 tis0Var) throws RemoteException;

    uyl getView() throws RemoteException;

    /* JADX INFO: renamed from: l */
    void mo182198l(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: m */
    void mo182199m(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;
}
