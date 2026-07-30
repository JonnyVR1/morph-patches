package p149l;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* JADX INFO: loaded from: classes6.dex */
public interface r3m extends IInterface {
    /* JADX INFO: renamed from: P4 */
    void mo175963P4(uyl uylVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: Q */
    uyl mo175964Q(uyl uylVar, uyl uylVar2, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: d */
    void mo175965d() throws RemoteException;

    /* JADX INFO: renamed from: f0 */
    void mo175966f0(tis0 tis0Var) throws RemoteException;

    /* JADX INFO: renamed from: l */
    void mo175967l(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: m */
    void mo175968m(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    /* JADX INFO: renamed from: w */
    void mo175969w() throws RemoteException;
}
