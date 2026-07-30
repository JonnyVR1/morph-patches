package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcab;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bws0 extends kxr0 implements cws0 {
    public bws0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzcab zzcabVar = (zzcab) lxr0.m152084a(parcel, zzcab.CREATOR);
            lxr0.m152086c(parcel);
            mo109053B6(zzcabVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            uxs0 dws0Var = null;
            aws0 aws0Var = null;
            if (i == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    dws0Var = iInterfaceQueryLocalInterface instanceof uxs0 ? (uxs0) iInterfaceQueryLocalInterface : new dws0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo109058R5(dws0Var);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        ClassLoader classLoader = lxr0.f130430a;
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
                        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                        lxr0.m152086c(parcel);
                        mo109062c0(uylVarM196295O);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                        lxr0.m152086c(parcel);
                        mo109054C(uylVarM196295O2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                        lxr0.m152086c(parcel);
                        mo109059Z(uylVarM196295O3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzd);
                        break;
                    case 13:
                        String string = parcel.readString();
                        lxr0.m152086c(parcel);
                        mo109057P(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        cus0 cus0VarM98878o8 = ats0.m98878o8(parcel.readStrongBinder());
                        lxr0.m152086c(parcel);
                        mo109056J7(cus0VarM98878o8);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzb = zzb();
                        parcel2.writeNoException();
                        lxr0.m152088e(parcel2, bundleZzb);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            aws0Var = iInterfaceQueryLocalInterface2 instanceof aws0 ? (aws0) iInterfaceQueryLocalInterface2 : new aws0(strongBinder2);
                        }
                        lxr0.m152086c(parcel);
                        mo109061a1(aws0Var);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        lxr0.m152086c(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                        lxr0.m152086c(parcel);
                        mo109055H(uylVarM196295O4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        lxr0.m152086c(parcel);
                        mo109064q1(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzt = zzt();
                        parcel2.writeNoException();
                        ClassLoader classLoader2 = lxr0.f130430a;
                        parcel2.writeInt(zZzt ? 1 : 0);
                        break;
                    case 21:
                        ncu0 ncu0VarZzc = zzc();
                        parcel2.writeNoException();
                        lxr0.m152089f(parcel2, ncu0VarZzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zM152090g = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                mo109063q(zM152090g);
                parcel2.writeNoException();
            }
        } else {
            mo109060a();
            parcel2.writeNoException();
        }
        return true;
    }
}
