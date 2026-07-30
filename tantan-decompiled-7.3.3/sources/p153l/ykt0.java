package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ykt0 extends q6s0 implements zkt0 {
    public ykt0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo147215F(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                Bundle bundleMo147221k3 = mo147221k3(bundle2);
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundleMo147221k3);
                return true;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle3 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo147216F7(string, string2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo147220h1(string3, string4, p1mVarM170217O);
                parcel2.writeNoException();
                return true;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean zM180045g = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                Map mapMo147218f4 = mo147218f4(string5, string6, zM180045g);
                parcel2.writeNoException();
                parcel2.writeMap(mapMo147218f4);
                return true;
            case 6:
                String string7 = parcel.readString();
                r6s0.m180041c(parcel);
                int iZzb = zzb(string7);
                parcel2.writeNoException();
                parcel2.writeInt(iZzb);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo147217K(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle5 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo147219f8(string8, string9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                r6s0.m180041c(parcel);
                List listMo147214C1 = mo147214C1(string10, string11);
                parcel2.writeNoException();
                parcel2.writeList(listMo147214C1);
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
                r6s0.m180041c(parcel);
                mo147223u(string12);
                parcel2.writeNoException();
                return true;
            case 14:
                String string13 = parcel.readString();
                r6s0.m180041c(parcel);
                mo147224v(string13);
                parcel2.writeNoException();
                return true;
            case 15:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                r6s0.m180041c(parcel);
                mo147222l2(p1mVarM170217O2, string14, string15);
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
                Bundle bundle6 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo147225w0(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
