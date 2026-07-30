package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class wjy0 extends f0r0 implements IInterface {
    public wjy0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* JADX INFO: renamed from: O */
    public final uyl m203581O(uyl uylVar, String str, int i, uyl uylVar2) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166433e(parcelZza, uylVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        ows0.m166433e(parcelZza, uylVar2);
        Parcel parcelZzB = zzB(2, parcelZza);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return uylVarM196295O;
    }

    /* JADX INFO: renamed from: P2 */
    public final uyl m203582P2(uyl uylVar, String str, int i, uyl uylVar2) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166433e(parcelZza, uylVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        ows0.m166433e(parcelZza, uylVar2);
        Parcel parcelZzB = zzB(3, parcelZza);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return uylVarM196295O;
    }
}
