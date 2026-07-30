package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcbb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k7t0 extends q6s0 implements l7t0 {
    public k7t0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* JADX INFO: renamed from: o8 */
    public static l7t0 m148644o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof l7t0 ? (l7t0) iInterfaceQueryLocalInterface : new j7t0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        s7t0 q7t0Var = null;
        s7t0 q7t0Var2 = null;
        t7t0 t7t0Var = null;
        o7t0 m7t0Var = null;
        switch (i) {
            case 1:
                zzl zzlVar = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    q7t0Var = iInterfaceQueryLocalInterface instanceof s7t0 ? (s7t0) iInterfaceQueryLocalInterface : new q7t0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo133748s5(zzlVar, q7t0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    m7t0Var = iInterfaceQueryLocalInterface2 instanceof o7t0 ? (o7t0) iInterfaceQueryLocalInterface2 : new m7t0(strongBinder2);
                }
                r6s0.m180041c(parcel);
                mo133744R0(m7t0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo133746g0(p1mVarM170217O);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    t7t0Var = iInterfaceQueryLocalInterface3 instanceof t7t0 ? (t7t0) iInterfaceQueryLocalInterface3 : new t7t0(strongBinder3);
                }
                r6s0.m180041c(parcel);
                mo133745R2(t7t0Var);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcbb zzcbbVar = (zzcbb) r6s0.m180039a(parcel, zzcbb.CREATOR);
                r6s0.m180041c(parcel);
                mo133747i2(zzcbbVar);
                parcel2.writeNoException();
                return true;
            case 8:
                e9u0 e9u0VarM214606o8 = y7u0.m214606o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo133741J4(e9u0VarM214606o8);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundleZzb);
                return true;
            case 10:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                boolean zM180045g = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                mo133740B0(p1mVarM170217O2, zM180045g);
                parcel2.writeNoException();
                return true;
            case 11:
                i7t0 i7t0VarZzd = zzd();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, i7t0VarZzd);
                return true;
            case 12:
                tlu0 tlu0VarZzc = zzc();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, tlu0VarZzc);
                return true;
            case 13:
                ycu0 ycu0VarM180764o8 = rbu0.m180764o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo133743N5(ycu0VarM180764o8);
                parcel2.writeNoException();
                return true;
            case 14:
                zzl zzlVar2 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    q7t0Var2 = iInterfaceQueryLocalInterface4 instanceof s7t0 ? (s7t0) iInterfaceQueryLocalInterface4 : new q7t0(strongBinder4);
                }
                r6s0.m180041c(parcel);
                mo133742M5(zzlVar2, q7t0Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zM180045g2 = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                mo133750x1(zM180045g2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
