package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mns0 extends q6s0 implements nns0 {
    public mns0() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        kns0 jns0Var;
        switch (i) {
            case 2:
                String strMo99774a = mo99774a();
                parcel2.writeNoException();
                parcel2.writeString(strMo99774a);
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
                als0 als0VarZzk = zzk();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, als0VarZzk);
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
                lpu0 lpu0VarZzh = zzh();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, lpu0VarZzh);
                return true;
            case 12:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 13:
                mo99776g();
                parcel2.writeNoException();
                return true;
            case 14:
                tks0 tks0VarZzi = zzi();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, tks0VarZzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo99780q2(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                boolean zMo99772Q5 = mo99772Q5(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zMo99772Q5 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo99778m3(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                p1m p1mVarZzm = zzm();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzm);
                return true;
            case 19:
                p1m p1mVarZzl = zzl();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzl);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundleZzf);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    jns0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    jns0Var = iInterfaceQueryLocalInterface instanceof kns0 ? (kns0) iInterfaceQueryLocalInterface : new jns0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo99783z3(jns0Var);
                parcel2.writeNoException();
                return true;
            case 22:
                mo99777k();
                parcel2.writeNoException();
                return true;
            case 23:
                List listMo99775b = mo99775b();
                parcel2.writeNoException();
                parcel2.writeList(listMo99775b);
                return true;
            case 24:
                boolean zMo99779o = mo99779o();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zMo99779o ? 1 : 0);
                return true;
            case 25:
                czt0 czt0VarM174247o8 = pxt0.m174247o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo99770O5(czt0VarM174247o8);
                parcel2.writeNoException();
                return true;
            case 26:
                ytt0 ytt0VarM151282o8 = kst0.m151282o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo99782t4(ytt0VarM151282o8);
                parcel2.writeNoException();
                return true;
            case 27:
                mo99771O7();
                parcel2.writeNoException();
                return true;
            case 28:
                mo99781t();
                parcel2.writeNoException();
                return true;
            case 29:
                xks0 xks0VarZzj = zzj();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, xks0VarZzj);
                return true;
            case 30:
                boolean zMo99769L = mo99769L();
                parcel2.writeNoException();
                ClassLoader classLoader2 = r6s0.f161495a;
                parcel2.writeInt(zMo99769L ? 1 : 0);
                return true;
            case 31:
                tlu0 tlu0VarZzg = zzg();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, tlu0VarZzg);
                return true;
            case 32:
                ycu0 ycu0VarM180764o8 = rbu0.m180764o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo99773W4(ycu0VarM180764o8);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
