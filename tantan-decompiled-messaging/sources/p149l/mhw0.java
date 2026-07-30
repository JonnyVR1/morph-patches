package p149l;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class mhw0 extends i0r0 implements isu0 {
    public mhw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // p149l.isu0
    /* JADX INFO: renamed from: h7 */
    public final uyl mo138091h7(Bitmap bitmap) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186359d(parcelM133904O, bitmap);
        Parcel parcelM133905P2 = m133905P2(6, parcelM133904O);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM133905P2.readStrongBinder());
        parcelM133905P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.isu0
    public final uyl zza(int i) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        parcelM133904O.writeInt(i);
        Parcel parcelM133905P2 = m133905P2(1, parcelM133904O);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM133905P2.readStrongBinder());
        parcelM133905P2.recycle();
        return uylVarM196295O;
    }
}
