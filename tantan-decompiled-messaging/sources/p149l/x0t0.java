package p149l;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzccx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x0t0 extends kxr0 implements y0t0 {
    public x0t0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* JADX INFO: renamed from: o8 */
    public static y0t0 m206648o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof y0t0 ? (y0t0) iInterfaceQueryLocalInterface : new w0t0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        v0t0 t0t0Var = null;
        switch (i) {
            case 1:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzccx zzccxVar = (zzccx) lxr0.m152084a(parcel, zzccx.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    t0t0Var = iInterfaceQueryLocalInterface instanceof v0t0 ? (v0t0) iInterfaceQueryLocalInterface : new t0t0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo157500W6(uylVarM196295O, zzccxVar, t0t0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo157489C(uylVarM196295O2);
                parcel2.writeNoException();
                return true;
            case 3:
                uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, null);
                return true;
            case 4:
                uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                jts0 jts0VarM138250o8 = its0.m138250o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo157506n2(arrayListCreateTypedArrayList, uylVarM196295O3, jts0VarM138250o8);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                jts0 jts0VarM138250o9 = its0.m138250o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo157498U1(arrayListCreateTypedArrayList2, uylVarM196295O4, jts0VarM138250o9);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxr zzbxrVar = (zzbxr) lxr0.m152084a(parcel, zzbxr.CREATOR);
                lxr0.m152086c(parcel);
                mo157508p1(zzbxrVar);
                parcel2.writeNoException();
                return true;
            case 8:
                uyl uylVarM196295O5 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo157490E(uylVarM196295O5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                uyl uylVarM196295O6 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                jts0 jts0VarM138250o10 = its0.m138250o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo157507o3(arrayListCreateTypedArrayList3, uylVarM196295O6, jts0VarM138250o10);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                uyl uylVarM196295O7 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                jts0 jts0VarM138250o11 = its0.m138250o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo157502Z2(arrayListCreateTypedArrayList4, uylVarM196295O7, jts0VarM138250o11);
                parcel2.writeNoException();
                return true;
            case 11:
                uyl uylVarM196295O8 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                uyl uylVarM196295O9 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                String string = parcel.readString();
                uyl uylVarM196295O10 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                uyl uylVarMo157511t5 = mo157511t5(uylVarM196295O8, uylVarM196295O9, string, uylVarM196295O10);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarMo157511t5);
                return true;
            default:
                return false;
        }
    }
}
