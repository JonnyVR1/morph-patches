package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class why0 extends f0r0 implements IInterface {
    public why0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* JADX INFO: renamed from: O */
    public final int m203259O(uyl uylVar, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166433e(parcelZza, uylVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    /* JADX INFO: renamed from: P2 */
    public final int m203260P2(uyl uylVar, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166433e(parcelZza, uylVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    /* JADX INFO: renamed from: P3 */
    public final uyl m203261P3(uyl uylVar, String str, int i, uyl uylVar2) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166433e(parcelZza, uylVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        ows0.m166433e(parcelZza, uylVar2);
        Parcel parcelZzB = zzB(8, parcelZza);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return uylVarM196295O;
    }

    /* JADX INFO: renamed from: Y2 */
    public final uyl m203262Y2(uyl uylVar, String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166433e(parcelZza, uylVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(2, parcelZza);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return uylVarM196295O;
    }

    /* JADX INFO: renamed from: m4 */
    public final uyl m203263m4(uyl uylVar, String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166433e(parcelZza, uylVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(4, parcelZza);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return uylVarM196295O;
    }

    /* JADX INFO: renamed from: m5 */
    public final uyl m203264m5(uyl uylVar, String str, boolean z, long j) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166433e(parcelZza, uylVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j);
        Parcel parcelZzB = zzB(7, parcelZza);
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return uylVarM196295O;
    }

    public final int zze() throws RemoteException {
        Parcel parcelZzB = zzB(6, zza());
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }
}
