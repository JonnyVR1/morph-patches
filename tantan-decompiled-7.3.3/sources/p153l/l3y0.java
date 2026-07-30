package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class l3y0 extends o9r0 implements jyl {
    public l3y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // p153l.jyl
    /* JADX INFO: renamed from: d */
    public final void mo147599d() throws RemoteException {
        m166808Y2(13, m166806O());
    }

    @Override // p153l.jyl
    /* JADX INFO: renamed from: e0 */
    public final void mo147600e0(dvr0 dvr0Var) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, dvr0Var);
        m166808Y2(9, parcelM166806O);
    }

    @Override // p153l.jyl
    public final p1m getView() throws RemoteException {
        Parcel parcelM166807P2 = m166807P2(8, m166806O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM166807P2.readStrongBinder());
        parcelM166807P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.jyl
    /* JADX INFO: renamed from: l */
    public final void mo147601l(Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214321d(parcelM166806O, bundle);
        m166808Y2(2, parcelM166806O);
    }

    @Override // p153l.jyl
    /* JADX INFO: renamed from: m */
    public final void mo147602m(Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214321d(parcelM166806O, bundle);
        Parcel parcelM166807P2 = m166807P2(7, parcelM166806O);
        if (parcelM166807P2.readInt() != 0) {
            bundle.readFromParcel(parcelM166807P2);
        }
        parcelM166807P2.recycle();
    }

    @Override // p153l.jyl
    public final void onDestroy() throws RemoteException {
        m166808Y2(5, m166806O());
    }

    @Override // p153l.jyl
    public final void onLowMemory() throws RemoteException {
        m166808Y2(6, m166806O());
    }

    @Override // p153l.jyl
    public final void onPause() throws RemoteException {
        m166808Y2(4, m166806O());
    }

    @Override // p153l.jyl
    public final void onResume() throws RemoteException {
        m166808Y2(3, m166806O());
    }

    @Override // p153l.jyl
    public final void onStart() throws RemoteException {
        m166808Y2(12, m166806O());
    }
}
