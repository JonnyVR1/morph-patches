package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ges0 extends kxr0 implements hes0 {
    public ges0() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ees0 des0Var;
        switch (i) {
            case 2:
                String strMo121066a = mo121066a();
                parcel2.writeNoException();
                parcel2.writeString(strMo121066a);
                return true;
            case 3:
                List listZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 4:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 5:
                ubs0 ubs0VarZzk = zzk();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ubs0VarZzk);
                return true;
            case 6:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 7:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 10:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 11:
                fgu0 fgu0VarZzh = zzh();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fgu0VarZzh);
                return true;
            case 12:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 13:
                mo121068g();
                parcel2.writeNoException();
                return true;
            case 14:
                nbs0 nbs0VarZzi = zzi();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, nbs0VarZzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo130697q2(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                boolean zMo130692Q5 = mo130692Q5(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zMo130692Q5 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo130695m3(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                uyl uylVarZzm = zzm();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzm);
                return true;
            case 19:
                uyl uylVarZzl = zzl();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzl);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleZzf);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    des0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    des0Var = iInterfaceQueryLocalInterface instanceof ees0 ? (ees0) iInterfaceQueryLocalInterface : new des0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo130700z3(des0Var);
                parcel2.writeNoException();
                return true;
            case 22:
                mo130694k();
                parcel2.writeNoException();
                return true;
            case 23:
                List listMo121067b = mo121067b();
                parcel2.writeNoException();
                parcel2.writeList(listMo121067b);
                return true;
            case 24:
                boolean zMo130696o = mo130696o();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zMo130696o ? 1 : 0);
                return true;
            case 25:
                wpt0 wpt0VarM142534o8 = jot0.m142534o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo130690O5(wpt0VarM142534o8);
                parcel2.writeNoException();
                return true;
            case 26:
                skt0 skt0VarM116900o8 = ejt0.m116900o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo130699t4(skt0VarM116900o8);
                parcel2.writeNoException();
                return true;
            case 27:
                mo130691O7();
                parcel2.writeNoException();
                return true;
            case 28:
                mo130698t();
                parcel2.writeNoException();
                return true;
            case 29:
                rbs0 rbs0VarZzj = zzj();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, rbs0VarZzj);
                return true;
            case 30:
                boolean zMo130689L = mo130689L();
                parcel2.writeNoException();
                ClassLoader classLoader2 = lxr0.f130430a;
                parcel2.writeInt(zMo130689L ? 1 : 0);
                return true;
            case 31:
                ncu0 ncu0VarZzg = zzg();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ncu0VarZzg);
                return true;
            case 32:
                s3u0 s3u0VarM148306o8 = l2u0.m148306o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo130693W4(s3u0VarM148306o8);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
