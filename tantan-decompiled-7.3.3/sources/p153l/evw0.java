package p153l;

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
public abstract class evw0 extends b2t0 implements isw0 {
    public evw0() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p153l.b2t0
    /* JADX INFO: renamed from: O */
    public final boolean mo102250O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzbf zzbfVar = (zzbf) z0t0.m218152a(parcel, zzbf.CREATOR);
                zzo zzoVar = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112721r4(zzbfVar, zzoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzon zzonVar = (zzon) z0t0.m218152a(parcel, zzon.CREATOR);
                zzo zzoVar2 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112710Q4(zzonVar, zzoVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                zzo zzoVar3 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112722t6(zzoVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbf zzbfVar2 = (zzbf) z0t0.m218152a(parcel, zzbf.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                z0t0.m218157f(parcel);
                mo112724y5(zzbfVar2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo zzoVar4 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112718j8(zzoVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzo zzoVar5 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                boolean zM218159h = z0t0.m218159h(parcel);
                z0t0.m218157f(parcel);
                List<zzon> listMo141996Z1 = mo141996Z1(zzoVar5, zM218159h);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo141996Z1);
                return true;
            case 9:
                zzbf zzbfVar3 = (zzbf) z0t0.m218152a(parcel, zzbf.CREATOR);
                String string3 = parcel.readString();
                z0t0.m218157f(parcel);
                byte[] bArrMo112714V7 = mo112714V7(zzbfVar3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo112714V7);
                return true;
            case 10:
                long j = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                z0t0.m218157f(parcel);
                mo112717j1(j, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzo zzoVar6 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                String strMo112711U6 = mo112711U6(zzoVar6);
                parcel2.writeNoException();
                parcel2.writeString(strMo112711U6);
                return true;
            case 12:
                zzae zzaeVar = (zzae) z0t0.m218152a(parcel, zzae.CREATOR);
                zzo zzoVar7 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112716g3(zzaeVar, zzoVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzae zzaeVar2 = (zzae) z0t0.m218152a(parcel, zzae.CREATOR);
                z0t0.m218157f(parcel);
                mo112720n7(zzaeVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zM218159h2 = z0t0.m218159h(parcel);
                zzo zzoVar8 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                List<zzon> listMo112709M7 = mo112709M7(string7, string8, zM218159h2, zzoVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo112709M7);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zM218159h3 = z0t0.m218159h(parcel);
                z0t0.m218157f(parcel);
                List<zzon> listMo112704I0 = mo112704I0(string9, string10, string11, zM218159h3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo112704I0);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzo zzoVar9 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                List<zzae> listMo112725z0 = mo112725z0(string12, string13, zzoVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo112725z0);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                z0t0.m218157f(parcel);
                List<zzae> listMo112719m1 = mo112719m1(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo112719m1);
                return true;
            case 18:
                zzo zzoVar10 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112705J6(zzoVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                zzo zzoVar11 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112706K6(bundle, zzoVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzo zzoVar12 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112708L6(zzoVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzo zzoVar13 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                zzaj zzajVarMo112707L5 = mo112707L5(zzoVar13);
                parcel2.writeNoException();
                z0t0.m218158g(parcel2, zzajVarMo112707L5);
                return true;
            case 24:
                zzo zzoVar14 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                Bundle bundle2 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                z0t0.m218157f(parcel);
                List<zzno> listMo112713V1 = mo112713V1(zzoVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo112713V1);
                return true;
            case 25:
                zzo zzoVar15 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112723x7(zzoVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzo zzoVar16 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112712U7(zzoVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzo zzoVar17 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo112715e7(zzoVar17);
                parcel2.writeNoException();
                return true;
            case 28:
                Bundle bundle3 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                zzo zzoVar18 = (zzo) z0t0.m218152a(parcel, zzo.CREATOR);
                z0t0.m218157f(parcel);
                mo141997q6(bundle3, zzoVar18);
                parcel2.writeNoException();
                return true;
        }
    }
}
