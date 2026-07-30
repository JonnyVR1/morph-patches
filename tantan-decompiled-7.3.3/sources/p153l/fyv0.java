package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class fyv0 extends o9r0 implements t1v0 {
    public fyv0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // p153l.t1v0
    /* JADX INFO: renamed from: R */
    public final iyl mo128136R(p1m p1mVar) throws RemoteException {
        iyl iyx0Var;
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        Parcel parcelM166807P2 = m166807P2(2, parcelM166806O);
        IBinder strongBinder = parcelM166807P2.readStrongBinder();
        if (strongBinder == null) {
            iyx0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            iyx0Var = iInterfaceQueryLocalInterface instanceof iyl ? (iyl) iInterfaceQueryLocalInterface : new iyx0(strongBinder);
        }
        parcelM166807P2.recycle();
        return iyx0Var;
    }

    @Override // p153l.t1v0
    /* JADX INFO: renamed from: Y7 */
    public final j6m mo128137Y7(p1m p1mVar, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException {
        j6m c1t0Var;
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        y5t0.m214321d(parcelM166806O, streetViewPanoramaOptions);
        Parcel parcelM166807P2 = m166807P2(7, parcelM166806O);
        IBinder strongBinder = parcelM166807P2.readStrongBinder();
        if (strongBinder == null) {
            c1t0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            c1t0Var = iInterfaceQueryLocalInterface instanceof j6m ? (j6m) iInterfaceQueryLocalInterface : new c1t0(strongBinder);
        }
        parcelM166807P2.recycle();
        return c1t0Var;
    }

    @Override // p153l.t1v0
    /* JADX INFO: renamed from: d8 */
    public final void mo128138d8(p1m p1mVar, int i) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        parcelM166806O.writeInt(i);
        m166808Y2(6, parcelM166806O);
    }

    @Override // p153l.t1v0
    /* JADX INFO: renamed from: j7 */
    public final jyl mo128139j7(p1m p1mVar, GoogleMapOptions googleMapOptions) throws RemoteException {
        jyl l3y0Var;
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        y5t0.m214321d(parcelM166806O, googleMapOptions);
        Parcel parcelM166807P2 = m166807P2(3, parcelM166806O);
        IBinder strongBinder = parcelM166807P2.readStrongBinder();
        if (strongBinder == null) {
            l3y0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            l3y0Var = iInterfaceQueryLocalInterface instanceof jyl ? (jyl) iInterfaceQueryLocalInterface : new l3y0(strongBinder);
        }
        parcelM166807P2.recycle();
        return l3y0Var;
    }

    @Override // p153l.t1v0
    /* JADX INFO: renamed from: x */
    public final i6m mo128140x(p1m p1mVar) throws RemoteException {
        i6m wzs0Var;
        Parcel parcelM166806O = m166806O();
        y5t0.m214320c(parcelM166806O, p1mVar);
        Parcel parcelM166807P2 = m166807P2(8, parcelM166806O);
        IBinder strongBinder = parcelM166807P2.readStrongBinder();
        if (strongBinder == null) {
            wzs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            wzs0Var = iInterfaceQueryLocalInterface instanceof i6m ? (i6m) iInterfaceQueryLocalInterface : new wzs0(strongBinder);
        }
        parcelM166807P2.recycle();
        return wzs0Var;
    }

    @Override // p153l.t1v0
    public final jql zze() throws RemoteException {
        jql m9s0Var;
        Parcel parcelM166807P2 = m166807P2(4, m166806O());
        IBinder strongBinder = parcelM166807P2.readStrongBinder();
        if (strongBinder == null) {
            m9s0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            m9s0Var = iInterfaceQueryLocalInterface instanceof jql ? (jql) iInterfaceQueryLocalInterface : new m9s0(strongBinder);
        }
        parcelM166807P2.recycle();
        return m9s0Var;
    }

    @Override // p153l.t1v0
    public final o1v0 zzf() throws RemoteException {
        Parcel parcelM166807P2 = m166807P2(5, m166806O());
        o1v0 o1v0VarM222087P2 = zxv0.m222087P2(parcelM166807P2.readStrongBinder());
        parcelM166807P2.recycle();
        return o1v0VarM222087P2;
    }
}
