package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rcs0 extends kxr0 implements scs0 {
    public rcs0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                uyl uylVarZzg = zzg();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzg);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(listZzm);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                ubs0 ubs0VarZze = zze();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ubs0VarZze);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleZzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                fgu0 fgu0VarZzc = zzc();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fgu0VarZzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo169152U4(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                boolean zMo169151K = mo169151K(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zMo169151K ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo169150F(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                nbs0 nbs0VarZzd = zzd();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, nbs0VarZzd);
                return true;
            case 16:
                uyl uylVarZzf = zzf();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzf);
                return true;
            case 17:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
