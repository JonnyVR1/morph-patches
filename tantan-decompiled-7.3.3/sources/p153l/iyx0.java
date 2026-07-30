package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class iyx0 extends o9r0 implements iyl {
    public iyx0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // p153l.iyl
    /* JADX INFO: renamed from: Q */
    public final p1m mo142694Q(p1m p1mVar, p1m p1mVar2, Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        y5t0.m214320c(parcelM166806O, p1mVar2);
        y5t0.m214321d(parcelM166806O, bundle);
        Parcel parcelM166807P2 = m166807P2(4, parcelM166806O);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM166807P2.readStrongBinder());
        parcelM166807P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.iyl
    /* JADX INFO: renamed from: W1 */
    public final void mo142695W1(p1m p1mVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        y5t0.m214321d(parcelM166806O, googleMapOptions);
        y5t0.m214321d(parcelM166806O, bundle);
        m166808Y2(2, parcelM166806O);
    }

    @Override // p153l.iyl
    /* JADX INFO: renamed from: d */
    public final void mo142696d() throws RemoteException {
        m166808Y2(16, m166806O());
    }

    @Override // p153l.iyl
    /* JADX INFO: renamed from: e0 */
    public final void mo142697e0(dvr0 dvr0Var) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, dvr0Var);
        m166808Y2(12, parcelM166806O);
    }

    @Override // p153l.iyl
    /* JADX INFO: renamed from: l */
    public final void mo142698l(Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214321d(parcelM166806O, bundle);
        m166808Y2(3, parcelM166806O);
    }

    @Override // p153l.iyl
    /* JADX INFO: renamed from: m */
    public final void mo142699m(Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214321d(parcelM166806O, bundle);
        Parcel parcelM166807P2 = m166807P2(10, parcelM166806O);
        if (parcelM166807P2.readInt() != 0) {
            bundle.readFromParcel(parcelM166807P2);
        }
        parcelM166807P2.recycle();
    }

    @Override // p153l.iyl
    public final void onDestroy() throws RemoteException {
        m166808Y2(8, m166806O());
    }

    @Override // p153l.iyl
    public final void onLowMemory() throws RemoteException {
        m166808Y2(9, m166806O());
    }

    @Override // p153l.iyl
    public final void onPause() throws RemoteException {
        m166808Y2(6, m166806O());
    }

    @Override // p153l.iyl
    public final void onResume() throws RemoteException {
        m166808Y2(5, m166806O());
    }

    @Override // p153l.iyl
    public final void onStart() throws RemoteException {
        m166808Y2(15, m166806O());
    }

    @Override // p153l.iyl
    /* JADX INFO: renamed from: w */
    public final void mo142700w() throws RemoteException {
        m166808Y2(7, m166806O());
    }
}
