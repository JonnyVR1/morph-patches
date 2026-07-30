package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vls0 extends q6s0 implements wls0 {
    public vls0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                p1m p1mVarZzh = zzh();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzh);
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
                als0 als0VarZzf = zzf();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, als0VarZzf);
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
                r6s0.m180043e(parcel2, bundleZzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                lpu0 lpu0VarZzd = zzd();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, lpu0VarZzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo192360K(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                boolean zMo192361v0 = mo192361v0(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zMo192361v0 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo192362w0(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                tks0 tks0VarZze = zze();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, tks0VarZze);
                return true;
            case 18:
                p1m p1mVarZzg = zzg();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzg);
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
