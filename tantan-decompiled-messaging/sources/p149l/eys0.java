package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcbb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eys0 extends kxr0 implements fys0 {
    public eys0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* JADX INFO: renamed from: o8 */
    public static fys0 m118787o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof fys0 ? (fys0) iInterfaceQueryLocalInterface : new dys0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        mys0 kys0Var = null;
        mys0 kys0Var2 = null;
        nys0 nys0Var = null;
        iys0 gys0Var = null;
        switch (i) {
            case 1:
                zzl zzlVar = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    kys0Var = iInterfaceQueryLocalInterface instanceof mys0 ? (mys0) iInterfaceQueryLocalInterface : new kys0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo104381s5(zzlVar, kys0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    gys0Var = iInterfaceQueryLocalInterface2 instanceof iys0 ? (iys0) iInterfaceQueryLocalInterface2 : new gys0(strongBinder2);
                }
                lxr0.m152086c(parcel);
                mo104377R0(gys0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo104379g0(uylVarM196295O);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    nys0Var = iInterfaceQueryLocalInterface3 instanceof nys0 ? (nys0) iInterfaceQueryLocalInterface3 : new nys0(strongBinder3);
                }
                lxr0.m152086c(parcel);
                mo104378R2(nys0Var);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcbb zzcbbVar = (zzcbb) lxr0.m152084a(parcel, zzcbb.CREATOR);
                lxr0.m152086c(parcel);
                mo104380i2(zzcbbVar);
                parcel2.writeNoException();
                return true;
            case 8:
                yzt0 yzt0VarM186728o8 = syt0.m186728o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo104374J4(yzt0VarM186728o8);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleZzb);
                return true;
            case 10:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                boolean zM152090g = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                mo104373B0(uylVarM196295O2, zM152090g);
                parcel2.writeNoException();
                return true;
            case 11:
                cys0 cys0VarZzd = zzd();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, cys0VarZzd);
                return true;
            case 12:
                ncu0 ncu0VarZzc = zzc();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ncu0VarZzc);
                return true;
            case 13:
                s3u0 s3u0VarM148306o8 = l2u0.m148306o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo104376N5(s3u0VarM148306o8);
                parcel2.writeNoException();
                return true;
            case 14:
                zzl zzlVar2 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    kys0Var2 = iInterfaceQueryLocalInterface4 instanceof mys0 ? (mys0) iInterfaceQueryLocalInterface4 : new kys0(strongBinder4);
                }
                lxr0.m152086c(parcel);
                mo104375M5(zzlVar2, kys0Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zM152090g2 = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                mo104383x1(zM152090g2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
