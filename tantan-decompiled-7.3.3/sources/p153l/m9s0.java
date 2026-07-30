package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
public final class m9s0 extends o9r0 implements jql {
    public m9s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // p153l.jql
    /* JADX INFO: renamed from: g6 */
    public final p1m mo146593g6(LatLng latLng, float f) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214321d(parcelM166806O, latLng);
        parcelM166806O.writeFloat(f);
        Parcel parcelM166807P2 = m166807P2(9, parcelM166806O);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM166807P2.readStrongBinder());
        parcelM166807P2.recycle();
        return p1mVarM170217O;
    }
}
