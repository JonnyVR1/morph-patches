package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wks0 extends q6s0 implements xks0 {
    public wks0() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        pms0 pms0Var;
        switch (i) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo206858E(p1mVarM170217O);
                parcel2.writeNoException();
                return true;
            case 4:
                p1m p1mVarZzi = zzi();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                lpu0 lpu0VarZzh = zzh();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, lpu0VarZzh);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    pms0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    pms0Var = iInterfaceQueryLocalInterface instanceof pms0 ? (pms0) iInterfaceQueryLocalInterface : new pms0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo206859s2(pms0Var);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                ClassLoader classLoader2 = r6s0.f161495a;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
