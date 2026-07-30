package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class sbt0 extends kxr0 implements tbt0 {
    public sbt0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo112677F(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                Bundle bundleMo112683k3 = mo112683k3(bundle2);
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleMo112683k3);
                return true;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle3 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo112678F7(string, string2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo112682h1(string3, string4, uylVarM196295O);
                parcel2.writeNoException();
                return true;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean zM152090g = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                Map mapMo112680f4 = mo112680f4(string5, string6, zM152090g);
                parcel2.writeNoException();
                parcel2.writeMap(mapMo112680f4);
                return true;
            case 6:
                String string7 = parcel.readString();
                lxr0.m152086c(parcel);
                int iZzb = zzb(string7);
                parcel2.writeNoException();
                parcel2.writeInt(iZzb);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo112679K(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle5 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo112681f8(string8, string9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                lxr0.m152086c(parcel);
                List listMo112676C1 = mo112676C1(string10, string11);
                parcel2.writeNoException();
                parcel2.writeList(listMo112676C1);
                return true;
            case 10:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 11:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 12:
                long jZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(jZzc);
                return true;
            case 13:
                String string12 = parcel.readString();
                lxr0.m152086c(parcel);
                mo112685u(string12);
                parcel2.writeNoException();
                return true;
            case 14:
                String string13 = parcel.readString();
                lxr0.m152086c(parcel);
                mo112686v(string13);
                parcel2.writeNoException();
                return true;
            case 15:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                lxr0.m152086c(parcel);
                mo112684l2(uylVarM196295O2, string14, string15);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 17:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 18:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo112687w0(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
