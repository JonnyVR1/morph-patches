package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class qqs0 extends i0r0 implements r3m {
    public qqs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    @Override // p149l.r3m
    /* JADX INFO: renamed from: P4 */
    public final void mo175963P4(uyl uylVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        sws0.m186359d(parcelM133904O, streetViewPanoramaOptions);
        sws0.m186359d(parcelM133904O, bundle);
        m133906Y2(2, parcelM133904O);
    }

    @Override // p149l.r3m
    /* JADX INFO: renamed from: Q */
    public final uyl mo175964Q(uyl uylVar, uyl uylVar2, Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, uylVar);
        sws0.m186358c(parcelM133904O, uylVar2);
        sws0.m186359d(parcelM133904O, bundle);
        Parcel parcelM133905P2 = m133905P2(4, parcelM133904O);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM133905P2.readStrongBinder());
        parcelM133905P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.r3m
    /* JADX INFO: renamed from: d */
    public final void mo175965d() throws RemoteException {
        m133906Y2(14, m133904O());
    }

    @Override // p149l.r3m
    /* JADX INFO: renamed from: f0 */
    public final void mo175966f0(tis0 tis0Var) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186358c(parcelM133904O, tis0Var);
        m133906Y2(12, parcelM133904O);
    }

    @Override // p149l.r3m
    /* JADX INFO: renamed from: l */
    public final void mo175967l(Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186359d(parcelM133904O, bundle);
        m133906Y2(3, parcelM133904O);
    }

    @Override // p149l.r3m
    /* JADX INFO: renamed from: m */
    public final void mo175968m(Bundle bundle) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186359d(parcelM133904O, bundle);
        Parcel parcelM133905P2 = m133905P2(10, parcelM133904O);
        if (parcelM133905P2.readInt() != 0) {
            bundle.readFromParcel(parcelM133905P2);
        }
        parcelM133905P2.recycle();
    }

    @Override // p149l.r3m
    public final void onDestroy() throws RemoteException {
        m133906Y2(8, m133904O());
    }

    @Override // p149l.r3m
    public final void onLowMemory() throws RemoteException {
        m133906Y2(9, m133904O());
    }

    @Override // p149l.r3m
    public final void onPause() throws RemoteException {
        m133906Y2(6, m133904O());
    }

    @Override // p149l.r3m
    public final void onResume() throws RemoteException {
        m133906Y2(5, m133904O());
    }

    @Override // p149l.r3m
    public final void onStart() throws RemoteException {
        m133906Y2(13, m133904O());
    }

    @Override // p149l.r3m
    /* JADX INFO: renamed from: w */
    public final void mo175969w() throws RemoteException {
        m133906Y2(7, m133904O());
    }
}
