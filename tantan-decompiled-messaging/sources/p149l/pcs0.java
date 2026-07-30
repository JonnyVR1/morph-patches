package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pcs0 extends kxr0 implements qcs0 {
    public pcs0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                uyl uylVarZzh = zzh();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzh);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(listZzo);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                ubs0 ubs0VarZzf = zzf();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ubs0VarZzf);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzb);
                return true;
            case 9:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                Bundle bundleZzc = zzc();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleZzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                fgu0 fgu0VarZzd = zzd();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fgu0VarZzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo159455K(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                boolean zMo159456v0 = mo159456v0(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zMo159456v0 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo159457w0(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                nbs0 nbs0VarZze = zze();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, nbs0VarZze);
                return true;
            case 18:
                uyl uylVarZzg = zzg();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzg);
                return true;
            case 19:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
