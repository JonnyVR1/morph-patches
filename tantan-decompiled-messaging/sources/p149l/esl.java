package p149l;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: loaded from: classes6.dex */
public interface esl extends IInterface {
    /* JADX INFO: renamed from: G4 */
    void mo117940G4(iny0 iny0Var) throws RemoteException;

    /* JADX INFO: renamed from: J3 */
    v4m mo117941J3() throws RemoteException;

    /* JADX INFO: renamed from: J5 */
    void mo117942J5(uyl uylVar) throws RemoteException;

    /* JADX INFO: renamed from: R6 */
    void mo117943R6(ndr0 ndr0Var) throws RemoteException;

    /* JADX INFO: renamed from: Y4 */
    CameraPosition mo117944Y4() throws RemoteException;

    /* JADX INFO: renamed from: Y6 */
    void mo117945Y6(uyl uylVar) throws RemoteException;

    /* JADX INFO: renamed from: b8 */
    void mo117946b8(v7y0 v7y0Var) throws RemoteException;

    void clear() throws RemoteException;

    /* JADX INFO: renamed from: d2 */
    void mo117947d2(bor0 bor0Var) throws RemoteException;

    /* JADX INFO: renamed from: r2 */
    uny0 mo117948r2(MarkerOptions markerOptions) throws RemoteException;
}
