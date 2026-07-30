package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ams0 extends q6s0 implements bms0 {
    public ams0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* JADX INFO: renamed from: o8 */
    public static bms0 m98856o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof bms0 ? (bms0) iInterfaceQueryLocalInterface : new zls0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String string = parcel.readString();
                r6s0.m180041c(parcel);
                String strMo105259d4 = mo105259d4(string);
                parcel2.writeNoException();
                parcel2.writeString(strMo105259d4);
                return true;
            case 2:
                String string2 = parcel.readString();
                r6s0.m180041c(parcel);
                als0 als0VarMo105255B = mo105255B(string2);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, als0VarMo105255B);
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
                r6s0.m180041c(parcel);
                mo105261v(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                lpu0 lpu0VarZze = zze();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, lpu0VarZze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                p1m p1mVarZzh = zzh();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzh);
                return true;
            case 10:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                boolean zMo105260o0 = mo105260o0(p1mVarM170217O);
                parcel2.writeNoException();
                parcel2.writeInt(zMo105260o0 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, null);
                return true;
            case 12:
                boolean zMo105257a = mo105257a();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zMo105257a ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                ClassLoader classLoader2 = r6s0.f161495a;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo105258c5(p1mVarM170217O2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                xks0 xks0VarZzf = zzf();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, xks0VarZzf);
                return true;
            case 17:
                p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                boolean zMo105256H = mo105256H(p1mVarM170217O3);
                parcel2.writeNoException();
                parcel2.writeInt(zMo105256H ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
