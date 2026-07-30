package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzff;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fet0 extends kxr0 implements gft0 {
    public fet0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ewt0 lst0Var;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                lxr0.m152086c(parcel);
                mo122259B3(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                lxr0.m152086c(parcel);
                mo122263R1(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zM152090g = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                mo122270u4(zM152090g);
                parcel2.writeNoException();
                return true;
            case 5:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                String string2 = parcel.readString();
                lxr0.m152086c(parcel);
                mo122262J2(uylVarM196295O, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo122268j6(string3, uylVarM196295O2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zMo122266b = mo122266b();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zMo122266b ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                lxr0.m152086c(parcel);
                mo122258A(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                ons0 ons0VarM160368o8 = nns0.m160368o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo122260C3(ons0VarM160368o8);
                parcel2.writeNoException();
                return true;
            case 12:
                fjs0 fjs0VarM116899o8 = ejs0.m116899o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo122267b5(fjs0VarM116899o8);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzff zzffVar = (zzff) lxr0.m152084a(parcel, zzff.CREATOR);
                lxr0.m152086c(parcel);
                mo122261G7(zzffVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    lst0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    lst0Var = iInterfaceQueryLocalInterface instanceof ewt0 ? (ewt0) iInterfaceQueryLocalInterface : new lst0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo122265X4(lst0Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zM152090g2 = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                mo122264X(zM152090g2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                lxr0.m152086c(parcel);
                mo122269p6(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
