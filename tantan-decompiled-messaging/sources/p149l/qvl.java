package p149l;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes6.dex */
public interface qvl extends IInterface {
    /* JADX INFO: renamed from: Q */
    uyl mo108200Q(uyl uylVar, uyl uylVar2, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: W1 */
    void mo108201W1(uyl uylVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: d */
    void mo108202d() throws RemoteException;

    /* JADX INFO: renamed from: e0 */
    void mo108203e0(xlr0 xlr0Var) throws RemoteException;

    /* JADX INFO: renamed from: l */
    void mo108204l(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: m */
    void mo108205m(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    /* JADX INFO: renamed from: w */
    void mo108206w() throws RemoteException;
}
