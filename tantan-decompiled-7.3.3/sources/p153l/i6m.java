package p153l;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* JADX INFO: loaded from: classes6.dex */
public interface i6m extends IInterface {
    /* JADX INFO: renamed from: P4 */
    void mo138828P4(p1m p1mVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: Q */
    p1m mo138829Q(p1m p1mVar, p1m p1mVar2, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: d */
    void mo138830d() throws RemoteException;

    /* JADX INFO: renamed from: f0 */
    void mo138831f0(zrs0 zrs0Var) throws RemoteException;

    /* JADX INFO: renamed from: l */
    void mo138832l(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: m */
    void mo138833m(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    /* JADX INFO: renamed from: w */
    void mo138834w() throws RemoteException;
}
