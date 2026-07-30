package p149l;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface rvl extends IInterface {
    /* JADX INFO: renamed from: d */
    void mo123222d() throws RemoteException;

    /* JADX INFO: renamed from: e0 */
    void mo123223e0(xlr0 xlr0Var) throws RemoteException;

    uyl getView() throws RemoteException;

    /* JADX INFO: renamed from: l */
    void mo123224l(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: m */
    void mo123225m(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;
}
