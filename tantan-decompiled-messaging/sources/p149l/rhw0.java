package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class rhw0 extends i0r0 implements esl {
    public rhw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // p149l.esl
    /* JADX INFO: renamed from: G4 */
    public final void mo117940G4(iny0 iny0Var) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, iny0Var);
        m133906Y2(96, parcelM133904O);
    }

    @Override // p149l.esl
    /* JADX INFO: renamed from: J3 */
    public final v4m mo117941J3() throws RemoteException {
        v4m yss0Var;
        Parcel parcelM133905P2 = m133905P2(25, m133904O());
        IBinder strongBinder = parcelM133905P2.readStrongBinder();
        if (strongBinder == null) {
            yss0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            yss0Var = iInterfaceQueryLocalInterface instanceof v4m ? (v4m) iInterfaceQueryLocalInterface : new yss0(strongBinder);
        }
        parcelM133905P2.recycle();
        return yss0Var;
    }

    @Override // p149l.esl
    /* JADX INFO: renamed from: J5 */
    public final void mo117942J5(uyl uylVar) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        m133906Y2(4, parcelM133904O);
    }

    @Override // p149l.esl
    /* JADX INFO: renamed from: R6 */
    public final void mo117943R6(ndr0 ndr0Var) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, ndr0Var);
        m133906Y2(28, parcelM133904O);
    }

    @Override // p149l.esl
    /* JADX INFO: renamed from: Y4 */
    public final CameraPosition mo117944Y4() throws RemoteException {
        Parcel parcelM133905P2 = m133905P2(1, m133904O());
        CameraPosition cameraPosition = (CameraPosition) sws0.m186357b(parcelM133905P2, CameraPosition.CREATOR);
        parcelM133905P2.recycle();
        return cameraPosition;
    }

    @Override // p149l.esl
    /* JADX INFO: renamed from: Y6 */
    public final void mo117945Y6(uyl uylVar) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        m133906Y2(5, parcelM133904O);
    }

    @Override // p149l.esl
    /* JADX INFO: renamed from: b8 */
    public final void mo117946b8(v7y0 v7y0Var) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, v7y0Var);
        m133906Y2(99, parcelM133904O);
    }

    @Override // p149l.esl
    public final void clear() throws RemoteException {
        m133906Y2(14, m133904O());
    }

    @Override // p149l.esl
    /* JADX INFO: renamed from: d2 */
    public final void mo117947d2(bor0 bor0Var) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, bor0Var);
        m133906Y2(30, parcelM133904O);
    }

    @Override // p149l.esl
    /* JADX INFO: renamed from: r2 */
    public final uny0 mo117948r2(MarkerOptions markerOptions) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186359d(parcelM133904O, markerOptions);
        Parcel parcelM133905P2 = m133905P2(11, parcelM133904O);
        uny0 uny0VarM194581P2 = uoy0.m194581P2(parcelM133905P2.readStrongBinder());
        parcelM133905P2.recycle();
        return uny0VarM194581P2;
    }
}
