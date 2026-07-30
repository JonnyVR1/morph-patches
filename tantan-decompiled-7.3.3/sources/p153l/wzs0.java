package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class wzs0 extends o9r0 implements i6m {
    public wzs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    @Override // p153l.i6m
    /* JADX INFO: renamed from: P4 */
    public final void mo138828P4(p1m p1mVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        y5t0.m214321d(parcelM166806O, streetViewPanoramaOptions);
        y5t0.m214321d(parcelM166806O, bundle);
        m166808Y2(2, parcelM166806O);
    }

    @Override // p153l.i6m
    /* JADX INFO: renamed from: Q */
    public final p1m mo138829Q(p1m p1mVar, p1m p1mVar2, Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        y5t0.m214320c(parcelM166806O, p1mVar2);
        y5t0.m214321d(parcelM166806O, bundle);
        Parcel parcelM166807P2 = m166807P2(4, parcelM166806O);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM166807P2.readStrongBinder());
        parcelM166807P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.i6m
    /* JADX INFO: renamed from: d */
    public final void mo138830d() throws RemoteException {
        m166808Y2(14, m166806O());
    }

    @Override // p153l.i6m
    /* JADX INFO: renamed from: f0 */
    public final void mo138831f0(zrs0 zrs0Var) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, zrs0Var);
        m166808Y2(12, parcelM166806O);
    }

    @Override // p153l.i6m
    /* JADX INFO: renamed from: l */
    public final void mo138832l(Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214321d(parcelM166806O, bundle);
        m166808Y2(3, parcelM166806O);
    }

    @Override // p153l.i6m
    /* JADX INFO: renamed from: m */
    public final void mo138833m(Bundle bundle) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214321d(parcelM166806O, bundle);
        Parcel parcelM166807P2 = m166807P2(10, parcelM166806O);
        if (parcelM166807P2.readInt() != 0) {
            bundle.readFromParcel(parcelM166807P2);
        }
        parcelM166807P2.recycle();
    }

    @Override // p153l.i6m
    public final void onDestroy() throws RemoteException {
        m166808Y2(8, m166806O());
    }

    @Override // p153l.i6m
    public final void onLowMemory() throws RemoteException {
        m166808Y2(9, m166806O());
    }

    @Override // p153l.i6m
    public final void onPause() throws RemoteException {
        m166808Y2(6, m166806O());
    }

    @Override // p153l.i6m
    public final void onResume() throws RemoteException {
        m166808Y2(5, m166806O());
    }

    @Override // p153l.i6m
    public final void onStart() throws RemoteException {
        m166808Y2(13, m166806O());
    }

    @Override // p153l.i6m
    /* JADX INFO: renamed from: w */
    public final void mo138834w() throws RemoteException {
        m166808Y2(7, m166806O());
    }
}
