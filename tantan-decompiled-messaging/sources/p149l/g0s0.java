package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
public final class g0s0 extends i0r0 implements ynl {
    public g0s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // p149l.ynl
    /* JADX INFO: renamed from: g6 */
    public final uyl mo124001g6(LatLng latLng, float f) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186359d(parcelM133904O, latLng);
        parcelM133904O.writeFloat(f);
        Parcel parcelM133905P2 = m133905P2(9, parcelM133904O);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM133905P2.readStrongBinder());
        parcelM133905P2.recycle();
        return uylVarM196295O;
    }
}
