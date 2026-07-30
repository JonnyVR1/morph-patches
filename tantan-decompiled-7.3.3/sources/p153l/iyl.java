package p153l;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes6.dex */
public interface iyl extends IInterface {
    /* JADX INFO: renamed from: Q */
    p1m mo142694Q(p1m p1mVar, p1m p1mVar2, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: W1 */
    void mo142695W1(p1m p1mVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: d */
    void mo142696d() throws RemoteException;

    /* JADX INFO: renamed from: e0 */
    void mo142697e0(dvr0 dvr0Var) throws RemoteException;

    /* JADX INFO: renamed from: l */
    void mo142698l(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: m */
    void mo142699m(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    /* JADX INFO: renamed from: w */
    void mo142700w() throws RemoteException;
}
