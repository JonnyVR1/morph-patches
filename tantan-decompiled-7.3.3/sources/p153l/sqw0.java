package p153l;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class sqw0 extends o9r0 implements o1v0 {
    public sqw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // p153l.o1v0
    /* JADX INFO: renamed from: h7 */
    public final p1m mo165684h7(Bitmap bitmap) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214321d(parcelM166806O, bitmap);
        Parcel parcelM166807P2 = m166807P2(6, parcelM166806O);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM166807P2.readStrongBinder());
        parcelM166807P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.o1v0
    public final p1m zza(int i) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        parcelM166806O.writeInt(i);
        Parcel parcelM166807P2 = m166807P2(1, parcelM166806O);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM166807P2.readStrongBinder());
        parcelM166807P2.recycle();
        return p1mVarM170217O;
    }
}
