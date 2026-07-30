package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzff;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lnt0 extends q6s0 implements mot0 {
    public lnt0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        k5u0 r1u0Var;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                r6s0.m180041c(parcel);
                mo156008B3(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                r6s0.m180041c(parcel);
                mo156012R1(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zM180045g = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                mo156019u4(zM180045g);
                parcel2.writeNoException();
                return true;
            case 5:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                String string2 = parcel.readString();
                r6s0.m180041c(parcel);
                mo156011J2(p1mVarM170217O, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo156017j6(string3, p1mVarM170217O2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zMo156015b = mo156015b();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zMo156015b ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                r6s0.m180041c(parcel);
                mo156007A(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                uws0 uws0VarM193369o8 = tws0.m193369o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo156009C3(uws0VarM193369o8);
                parcel2.writeNoException();
                return true;
            case 12:
                lss0 lss0VarM151281o8 = kss0.m151281o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo156016b5(lss0VarM151281o8);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzff zzffVar = (zzff) r6s0.m180039a(parcel, zzff.CREATOR);
                r6s0.m180041c(parcel);
                mo156010G7(zzffVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    r1u0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    r1u0Var = iInterfaceQueryLocalInterface instanceof k5u0 ? (k5u0) iInterfaceQueryLocalInterface : new r1u0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo156014X4(r1u0Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zM180045g2 = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                mo156013X(zM180045g2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                r6s0.m180041c(parcel);
                mo156018p6(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
