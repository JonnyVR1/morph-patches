package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class cty0 extends l9r0 implements IInterface {
    public cty0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* JADX INFO: renamed from: O */
    public final p1m m112563O(p1m p1mVar, String str, int i, p1m p1mVar2) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194625e(parcelZza, p1mVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        u5t0.m194625e(parcelZza, p1mVar2);
        Parcel parcelZzB = zzB(2, parcelZza);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return p1mVarM170217O;
    }

    /* JADX INFO: renamed from: P2 */
    public final p1m m112564P2(p1m p1mVar, String str, int i, p1m p1mVar2) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194625e(parcelZza, p1mVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        u5t0.m194625e(parcelZza, p1mVar2);
        Parcel parcelZzB = zzB(3, parcelZza);
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return p1mVarM170217O;
    }
}
