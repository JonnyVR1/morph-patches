package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rvs0 extends q6s0 implements zws0 {
    public rvs0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            r6s0.m180041c(parcel);
            boolean zZzf = zzf(p1mVarM170217O, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i == 2) {
            p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            r6s0.m180041c(parcel);
            zze(p1mVarM170217O2);
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            zza zzaVar = (zza) r6s0.m180039a(parcel, zza.CREATOR);
            r6s0.m180041c(parcel);
            boolean zZzg = zzg(p1mVarM170217O3, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }
}
