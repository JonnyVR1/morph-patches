package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ylw0 extends vss0 implements cjw0 {
    public ylw0() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p149l.vss0
    /* JADX INFO: renamed from: O */
    public final boolean mo110648O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzbf zzbfVar = (zzbf) trs0.m190428a(parcel, zzbf.CREATOR);
                zzo zzoVar = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107278r4(zzbfVar, zzoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzon zzonVar = (zzon) trs0.m190428a(parcel, zzon.CREATOR);
                zzo zzoVar2 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107265Q4(zzonVar, zzoVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                zzo zzoVar3 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107279t6(zzoVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbf zzbfVar2 = (zzbf) trs0.m190428a(parcel, zzbf.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                trs0.m190433f(parcel);
                mo107281y5(zzbfVar2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo zzoVar4 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107274j8(zzoVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzo zzoVar5 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                boolean zM190435h = trs0.m190435h(parcel);
                trs0.m190433f(parcel);
                List<zzon> listMo107270Z1 = mo107270Z1(zzoVar5, zM190435h);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo107270Z1);
                return true;
            case 9:
                zzbf zzbfVar3 = (zzbf) trs0.m190428a(parcel, zzbf.CREATOR);
                String string3 = parcel.readString();
                trs0.m190433f(parcel);
                byte[] bArrMo107269V7 = mo107269V7(zzbfVar3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo107269V7);
                return true;
            case 10:
                long j = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                trs0.m190433f(parcel);
                mo107273j1(j, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzo zzoVar6 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                String strMo107266U6 = mo107266U6(zzoVar6);
                parcel2.writeNoException();
                parcel2.writeString(strMo107266U6);
                return true;
            case 12:
                zzae zzaeVar = (zzae) trs0.m190428a(parcel, zzae.CREATOR);
                zzo zzoVar7 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107272g3(zzaeVar, zzoVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzae zzaeVar2 = (zzae) trs0.m190428a(parcel, zzae.CREATOR);
                trs0.m190433f(parcel);
                mo107276n7(zzaeVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zM190435h2 = trs0.m190435h(parcel);
                zzo zzoVar8 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                List<zzon> listMo107264M7 = mo107264M7(string7, string8, zM190435h2, zzoVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo107264M7);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zM190435h3 = trs0.m190435h(parcel);
                trs0.m190433f(parcel);
                List<zzon> listMo107259I0 = mo107259I0(string9, string10, string11, zM190435h3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo107259I0);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzo zzoVar9 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                List<zzae> listMo107282z0 = mo107282z0(string12, string13, zzoVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo107282z0);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                trs0.m190433f(parcel);
                List<zzae> listMo107275m1 = mo107275m1(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo107275m1);
                return true;
            case 18:
                zzo zzoVar10 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107260J6(zzoVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                zzo zzoVar11 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107261K6(bundle, zzoVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzo zzoVar12 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107263L6(zzoVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzo zzoVar13 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                zzaj zzajVarMo107262L5 = mo107262L5(zzoVar13);
                parcel2.writeNoException();
                trs0.m190434g(parcel2, zzajVarMo107262L5);
                return true;
            case 24:
                zzo zzoVar14 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                Bundle bundle2 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                trs0.m190433f(parcel);
                List<zzno> listMo107268V1 = mo107268V1(zzoVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo107268V1);
                return true;
            case 25:
                zzo zzoVar15 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107280x7(zzoVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzo zzoVar16 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107267U7(zzoVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzo zzoVar17 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107271e7(zzoVar17);
                parcel2.writeNoException();
                return true;
            case 28:
                Bundle bundle3 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                zzo zzoVar18 = (zzo) trs0.m190428a(parcel, zzo.CREATOR);
                trs0.m190433f(parcel);
                mo107277q6(bundle3, zzoVar18);
                parcel2.writeNoException();
                return true;
        }
    }
}
