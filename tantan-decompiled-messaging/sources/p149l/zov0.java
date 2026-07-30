package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class zov0 extends i0r0 implements nsu0 {
    public zov0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // p149l.nsu0
    /* JADX INFO: renamed from: R */
    public final qvl mo160795R(uyl uylVar) throws RemoteException {
        qvl cpx0Var;
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        Parcel parcelM133905P2 = m133905P2(2, parcelM133904O);
        IBinder strongBinder = parcelM133905P2.readStrongBinder();
        if (strongBinder == null) {
            cpx0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            cpx0Var = iInterfaceQueryLocalInterface instanceof qvl ? (qvl) iInterfaceQueryLocalInterface : new cpx0(strongBinder);
        }
        parcelM133905P2.recycle();
        return cpx0Var;
    }

    @Override // p149l.nsu0
    /* JADX INFO: renamed from: Y7 */
    public final s3m mo160796Y7(uyl uylVar, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException {
        s3m wrs0Var;
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        sws0.m186359d(parcelM133904O, streetViewPanoramaOptions);
        Parcel parcelM133905P2 = m133905P2(7, parcelM133904O);
        IBinder strongBinder = parcelM133905P2.readStrongBinder();
        if (strongBinder == null) {
            wrs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            wrs0Var = iInterfaceQueryLocalInterface instanceof s3m ? (s3m) iInterfaceQueryLocalInterface : new wrs0(strongBinder);
        }
        parcelM133905P2.recycle();
        return wrs0Var;
    }

    @Override // p149l.nsu0
    /* JADX INFO: renamed from: d8 */
    public final void mo160797d8(uyl uylVar, int i) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        parcelM133904O.writeInt(i);
        m133906Y2(6, parcelM133904O);
    }

    @Override // p149l.nsu0
    /* JADX INFO: renamed from: j7 */
    public final rvl mo160798j7(uyl uylVar, GoogleMapOptions googleMapOptions) throws RemoteException {
        rvl fux0Var;
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        sws0.m186359d(parcelM133904O, googleMapOptions);
        Parcel parcelM133905P2 = m133905P2(3, parcelM133904O);
        IBinder strongBinder = parcelM133905P2.readStrongBinder();
        if (strongBinder == null) {
            fux0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            fux0Var = iInterfaceQueryLocalInterface instanceof rvl ? (rvl) iInterfaceQueryLocalInterface : new fux0(strongBinder);
        }
        parcelM133905P2.recycle();
        return fux0Var;
    }

    @Override // p149l.nsu0
    /* JADX INFO: renamed from: x */
    public final r3m mo160799x(uyl uylVar) throws RemoteException {
        r3m qqs0Var;
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        Parcel parcelM133905P2 = m133905P2(8, parcelM133904O);
        IBinder strongBinder = parcelM133905P2.readStrongBinder();
        if (strongBinder == null) {
            qqs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            qqs0Var = iInterfaceQueryLocalInterface instanceof r3m ? (r3m) iInterfaceQueryLocalInterface : new qqs0(strongBinder);
        }
        parcelM133905P2.recycle();
        return qqs0Var;
    }

    @Override // p149l.nsu0
    public final ynl zze() throws RemoteException {
        ynl g0s0Var;
        Parcel parcelM133905P2 = m133905P2(4, m133904O());
        IBinder strongBinder = parcelM133905P2.readStrongBinder();
        if (strongBinder == null) {
            g0s0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            g0s0Var = iInterfaceQueryLocalInterface instanceof ynl ? (ynl) iInterfaceQueryLocalInterface : new g0s0(strongBinder);
        }
        parcelM133905P2.recycle();
        return g0s0Var;
    }

    @Override // p149l.nsu0
    public final isu0 zzf() throws RemoteException {
        Parcel parcelM133905P2 = m133905P2(5, m133904O());
        isu0 isu0VarM189934P2 = tov0.m189934P2(parcelM133905P2.readStrongBinder());
        parcelM133905P2.recycle();
        return isu0VarM189934P2;
    }
}
