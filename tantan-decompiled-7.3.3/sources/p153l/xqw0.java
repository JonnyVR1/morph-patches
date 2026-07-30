package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class xqw0 extends o9r0 implements sul {
    public xqw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // p153l.sul
    /* JADX INFO: renamed from: G4 */
    public final void mo188026G4(owy0 owy0Var) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, owy0Var);
        m166808Y2(96, parcelM166806O);
    }

    @Override // p153l.sul
    /* JADX INFO: renamed from: J3 */
    public final l7m mo188027J3() throws RemoteException {
        l7m e2t0Var;
        Parcel parcelM166807P2 = m166807P2(25, m166806O());
        IBinder strongBinder = parcelM166807P2.readStrongBinder();
        if (strongBinder == null) {
            e2t0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            e2t0Var = iInterfaceQueryLocalInterface instanceof l7m ? (l7m) iInterfaceQueryLocalInterface : new e2t0(strongBinder);
        }
        parcelM166807P2.recycle();
        return e2t0Var;
    }

    @Override // p153l.sul
    /* JADX INFO: renamed from: J5 */
    public final void mo188028J5(p1m p1mVar) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        m166808Y2(4, parcelM166806O);
    }

    @Override // p153l.sul
    /* JADX INFO: renamed from: R6 */
    public final void mo188029R6(tmr0 tmr0Var) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, tmr0Var);
        m166808Y2(28, parcelM166806O);
    }

    @Override // p153l.sul
    /* JADX INFO: renamed from: Y4 */
    public final CameraPosition mo188030Y4() throws RemoteException {
        Parcel parcelM166807P2 = m166807P2(1, m166806O());
        CameraPosition cameraPosition = (CameraPosition) y5t0.m214319b(parcelM166807P2, CameraPosition.CREATOR);
        parcelM166807P2.recycle();
        return cameraPosition;
    }

    @Override // p153l.sul
    /* JADX INFO: renamed from: Y6 */
    public final void mo188031Y6(p1m p1mVar) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        m166808Y2(5, parcelM166806O);
    }

    @Override // p153l.sul
    /* JADX INFO: renamed from: b8 */
    public final void mo188032b8(bhy0 bhy0Var) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, bhy0Var);
        m166808Y2(99, parcelM166806O);
    }

    @Override // p153l.sul
    public final void clear() throws RemoteException {
        m166808Y2(14, m166806O());
    }

    @Override // p153l.sul
    /* JADX INFO: renamed from: d2 */
    public final void mo188033d2(hxr0 hxr0Var) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, hxr0Var);
        m166808Y2(30, parcelM166806O);
    }

    @Override // p153l.sul
    /* JADX INFO: renamed from: r2 */
    public final axy0 mo188034r2(MarkerOptions markerOptions) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214321d(parcelM166806O, markerOptions);
        Parcel parcelM166807P2 = m166807P2(11, parcelM166806O);
        axy0 axy0VarM100972P2 = ayy0.m100972P2(parcelM166807P2.readStrongBinder());
        parcelM166807P2.recycle();
        return axy0VarM100972P2;
    }
}
