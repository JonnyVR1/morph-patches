package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ucs0 extends kxr0 implements vcs0 {
    public ucs0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* JADX INFO: renamed from: o8 */
    public static vcs0 m193104o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof vcs0 ? (vcs0) iInterfaceQueryLocalInterface : new tcs0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String string = parcel.readString();
                lxr0.m152086c(parcel);
                String strMo184273d4 = mo184273d4(string);
                parcel2.writeNoException();
                parcel2.writeString(strMo184273d4);
                return true;
            case 2:
                String string2 = parcel.readString();
                lxr0.m152086c(parcel);
                ubs0 ubs0VarMo184269B = mo184269B(string2);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ubs0VarMo184269B);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 5:
                String string3 = parcel.readString();
                lxr0.m152086c(parcel);
                mo184276v(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                fgu0 fgu0VarZze = zze();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fgu0VarZze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                uyl uylVarZzh = zzh();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzh);
                return true;
            case 10:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                boolean zMo184274o0 = mo184274o0(uylVarM196295O);
                parcel2.writeNoException();
                parcel2.writeInt(zMo184274o0 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, null);
                return true;
            case 12:
                boolean zMo184271a = mo184271a();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zMo184271a ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                ClassLoader classLoader2 = lxr0.f130430a;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo184272c5(uylVarM196295O2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                rbs0 rbs0VarZzf = zzf();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, rbs0VarZzf);
                return true;
            case 17:
                uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                boolean zMo184270H = mo184270H(uylVarM196295O3);
                parcel2.writeNoException();
                parcel2.writeInt(zMo184270H ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
