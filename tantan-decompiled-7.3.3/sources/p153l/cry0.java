package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class cry0 extends l9r0 implements IInterface {
    public cry0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* JADX INFO: renamed from: O */
    public final int m112103O(p1m p1mVar, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194625e(parcelZza, p1mVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    /* JADX INFO: renamed from: P2 */
    public final int m112104P2(p1m p1mVar, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194625e(parcelZza, p1mVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    /* JADX INFO: renamed from: P3 */
    public final p1m m112105P3(p1m p1mVar, String str, int i, p1m p1mVar2) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194625e(parcelZza, p1mVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        u5t0.m194625e(parcelZza, p1mVar2);
        Parcel parcelZzB = zzB(8, parcelZza);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return p1mVarM170217O;
    }

    /* JADX INFO: renamed from: Y2 */
    public final p1m m112106Y2(p1m p1mVar, String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194625e(parcelZza, p1mVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(2, parcelZza);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return p1mVarM170217O;
    }

    /* JADX INFO: renamed from: m4 */
    public final p1m m112107m4(p1m p1mVar, String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194625e(parcelZza, p1mVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(4, parcelZza);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return p1mVarM170217O;
    }

    /* JADX INFO: renamed from: m5 */
    public final p1m m112108m5(p1m p1mVar, String str, boolean z, long j) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194625e(parcelZza, p1mVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j);
        Parcel parcelZzB = zzB(7, parcelZza);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return p1mVarM170217O;
    }

    public final int zze() throws RemoteException {
        Parcel parcelZzB = zzB(6, zza());
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }
}
