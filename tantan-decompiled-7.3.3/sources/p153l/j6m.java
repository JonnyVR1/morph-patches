package p153l;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface j6m extends IInterface {
    /* JADX INFO: renamed from: d */
    void mo107658d() throws RemoteException;

    /* JADX INFO: renamed from: f0 */
    void mo107659f0(zrs0 zrs0Var) throws RemoteException;

    p1m getView() throws RemoteException;

    /* JADX INFO: renamed from: l */
    void mo107660l(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: m */
    void mo107661m(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;
}
