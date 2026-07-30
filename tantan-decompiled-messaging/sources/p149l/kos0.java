package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kos0 extends kxr0 implements los0 {
    public kos0() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* JADX INFO: renamed from: o8 */
    public static los0 m146756o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof los0 ? (los0) iInterfaceQueryLocalInterface : new jos0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listMo142528b = mo142528b();
                parcel2.writeNoException();
                parcel2.writeList(listMo142528b);
                return true;
            case 4:
                String strMo142527a = mo142527a();
                parcel2.writeNoException();
                parcel2.writeString(strMo142527a);
                return true;
            case 5:
                ubs0 ubs0VarZzl = zzl();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ubs0VarZzl);
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
                fgu0 fgu0VarZzj = zzj();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fgu0VarZzj);
                return true;
            case 12:
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, null);
                return true;
            case 13:
                uyl uylVarZzm = zzm();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzm);
                return true;
            case 14:
                uyl uylVarZzn = zzn();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzn);
                return true;
            case 15:
                uyl uylVarZzo = zzo();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zMo142526J = mo142526J();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zMo142526J ? 1 : 0);
                return true;
            case 18:
                boolean zMo142532t = mo142532t();
                parcel2.writeNoException();
                ClassLoader classLoader2 = lxr0.f130430a;
                parcel2.writeInt(zMo142532t ? 1 : 0);
                return true;
            case 19:
                mo142529g();
                parcel2.writeNoException();
                return true;
            case 20:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo142530k7(uylVarM196295O);
                parcel2.writeNoException();
                return true;
            case 21:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo142531o1(uylVarM196295O2, uylVarM196295O3, uylVarM196295O4);
                parcel2.writeNoException();
                return true;
            case 22:
                uyl uylVarM196295O5 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo142533y7(uylVarM196295O5);
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
