package p153l;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface jyl extends IInterface {
    /* JADX INFO: renamed from: d */
    void mo147599d() throws RemoteException;

    /* JADX INFO: renamed from: e0 */
    void mo147600e0(dvr0 dvr0Var) throws RemoteException;

    p1m getView() throws RemoteException;

    /* JADX INFO: renamed from: l */
    void mo147601l(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: m */
    void mo147602m(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;
}
