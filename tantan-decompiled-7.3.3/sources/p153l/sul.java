package p153l;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: loaded from: classes6.dex */
public interface sul extends IInterface {
    /* JADX INFO: renamed from: G4 */
    void mo188026G4(owy0 owy0Var) throws RemoteException;

    /* JADX INFO: renamed from: J3 */
    l7m mo188027J3() throws RemoteException;

    /* JADX INFO: renamed from: J5 */
    void mo188028J5(p1m p1mVar) throws RemoteException;

    /* JADX INFO: renamed from: R6 */
    void mo188029R6(tmr0 tmr0Var) throws RemoteException;

    /* JADX INFO: renamed from: Y4 */
    CameraPosition mo188030Y4() throws RemoteException;

    /* JADX INFO: renamed from: Y6 */
    void mo188031Y6(p1m p1mVar) throws RemoteException;

    /* JADX INFO: renamed from: b8 */
    void mo188032b8(bhy0 bhy0Var) throws RemoteException;

    void clear() throws RemoteException;

    /* JADX INFO: renamed from: d2 */
    void mo188033d2(hxr0 hxr0Var) throws RemoteException;

    /* JADX INFO: renamed from: r2 */
    axy0 mo188034r2(MarkerOptions markerOptions) throws RemoteException;
}
