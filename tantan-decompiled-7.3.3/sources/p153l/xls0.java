package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xls0 extends q6s0 implements yls0 {
    public xls0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                p1m p1mVarZzg = zzg();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzg);
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
                als0 als0VarZze = zze();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, als0VarZze);
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
                r6s0.m180043e(parcel2, bundleZzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                lpu0 lpu0VarZzc = zzc();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, lpu0VarZzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo202458U4(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                boolean zMo202457K = mo202457K(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zMo202457K ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo202456F(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                tks0 tks0VarZzd = zzd();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, tks0VarZzd);
                return true;
            case 16:
                p1m p1mVarZzf = zzf();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzf);
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
