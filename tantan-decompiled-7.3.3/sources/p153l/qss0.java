package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qss0 extends q6s0 implements rss0 {
    public qss0() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        uss0 sss0Var;
        if (i == 3) {
            lpu0 lpu0VarZzb = zzb();
            parcel2.writeNoException();
            r6s0.m180044f(parcel2, lpu0VarZzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                sss0Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                sss0Var = iInterfaceQueryLocalInterface instanceof uss0 ? (uss0) iInterfaceQueryLocalInterface : new sss0(strongBinder);
            }
            r6s0.m180041c(parcel);
            mo182675U3(p1mVarM170217O, sss0Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            r6s0.m180041c(parcel);
            zze(p1mVarM170217O2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        xks0 xks0VarZzc = zzc();
        parcel2.writeNoException();
        r6s0.m180044f(parcel2, xks0VarZzc);
        return true;
    }
}
