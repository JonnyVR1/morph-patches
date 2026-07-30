package p149l;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* JADX INFO: loaded from: classes6.dex */
public interface nsu0 extends IInterface {
    /* JADX INFO: renamed from: R */
    qvl mo160795R(uyl uylVar) throws RemoteException;

    /* JADX INFO: renamed from: Y7 */
    s3m mo160796Y7(uyl uylVar, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException;

    /* JADX INFO: renamed from: d8 */
    void mo160797d8(uyl uylVar, int i) throws RemoteException;

    /* JADX INFO: renamed from: j7 */
    rvl mo160798j7(uyl uylVar, GoogleMapOptions googleMapOptions) throws RemoteException;

    /* JADX INFO: renamed from: x */
    r3m mo160799x(uyl uylVar) throws RemoteException;

    ynl zze() throws RemoteException;

    isu0 zzf() throws RemoteException;
}
