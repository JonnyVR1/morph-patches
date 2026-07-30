package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qxs0 extends q6s0 implements rxs0 {
    public qxs0() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* JADX INFO: renamed from: o8 */
    public static rxs0 m178617o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof rxs0 ? (rxs0) iInterfaceQueryLocalInterface : new pxs0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listMo174241b = mo174241b();
                parcel2.writeNoException();
                parcel2.writeList(listMo174241b);
                return true;
            case 4:
                String strMo174240a = mo174240a();
                parcel2.writeNoException();
                parcel2.writeString(strMo174240a);
                return true;
            case 5:
                als0 als0VarZzl = zzl();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, als0VarZzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                lpu0 lpu0VarZzj = zzj();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, lpu0VarZzj);
                return true;
            case 12:
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, null);
                return true;
            case 13:
                p1m p1mVarZzm = zzm();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzm);
                return true;
            case 14:
                p1m p1mVarZzn = zzn();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzn);
                return true;
            case 15:
                p1m p1mVarZzo = zzo();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zMo174239J = mo174239J();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zMo174239J ? 1 : 0);
                return true;
            case 18:
                boolean zMo174245t = mo174245t();
                parcel2.writeNoException();
                ClassLoader classLoader2 = r6s0.f161495a;
                parcel2.writeInt(zMo174245t ? 1 : 0);
                return true;
            case 19:
                mo174242g();
                parcel2.writeNoException();
                return true;
            case 20:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo174243k7(p1mVarM170217O);
                parcel2.writeNoException();
                return true;
            case 21:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo174244o1(p1mVarM170217O2, p1mVarM170217O3, p1mVarM170217O4);
                parcel2.writeNoException();
                return true;
            case 22:
                p1m p1mVarM170217O5 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo174246y7(p1mVarM170217O5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
