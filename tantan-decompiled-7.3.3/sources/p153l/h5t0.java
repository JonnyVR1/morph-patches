package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcab;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h5t0 extends q6s0 implements i5t0 {
    public h5t0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzcab zzcabVar = (zzcab) r6s0.m180039a(parcel, zzcab.CREATOR);
            r6s0.m180041c(parcel);
            mo138763B6(zzcabVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            a7t0 j5t0Var = null;
            g5t0 g5t0Var = null;
            if (i == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    j5t0Var = iInterfaceQueryLocalInterface instanceof a7t0 ? (a7t0) iInterfaceQueryLocalInterface : new j5t0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo138768R5(j5t0Var);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        ClassLoader classLoader = r6s0.f161495a;
                        parcel2.writeInt(zZzs ? 1 : 0);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                        r6s0.m180041c(parcel);
                        mo138772c0(p1mVarM170217O);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                        r6s0.m180041c(parcel);
                        mo138764C(p1mVarM170217O2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                        r6s0.m180041c(parcel);
                        mo138769Z(p1mVarM170217O3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzd);
                        break;
                    case 13:
                        String string = parcel.readString();
                        r6s0.m180041c(parcel);
                        mo138767P(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        i3t0 i3t0VarM128660o8 = g2t0.m128660o8(parcel.readStrongBinder());
                        r6s0.m180041c(parcel);
                        mo138766J7(i3t0VarM128660o8);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzb = zzb();
                        parcel2.writeNoException();
                        r6s0.m180043e(parcel2, bundleZzb);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            g5t0Var = iInterfaceQueryLocalInterface2 instanceof g5t0 ? (g5t0) iInterfaceQueryLocalInterface2 : new g5t0(strongBinder2);
                        }
                        r6s0.m180041c(parcel);
                        mo138771a1(g5t0Var);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        r6s0.m180041c(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                        r6s0.m180041c(parcel);
                        mo138765H(p1mVarM170217O4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        r6s0.m180041c(parcel);
                        mo138774q1(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzt = zzt();
                        parcel2.writeNoException();
                        ClassLoader classLoader2 = r6s0.f161495a;
                        parcel2.writeInt(zZzt ? 1 : 0);
                        break;
                    case 21:
                        tlu0 tlu0VarZzc = zzc();
                        parcel2.writeNoException();
                        r6s0.m180044f(parcel2, tlu0VarZzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zM180045g = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                mo138773q(zM180045g);
                parcel2.writeNoException();
            }
        } else {
            mo138770a();
            parcel2.writeNoException();
        }
        return true;
    }
}
