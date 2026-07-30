package p153l;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzccx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dat0 extends q6s0 implements eat0 {
    public dat0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* JADX INFO: renamed from: o8 */
    public static eat0 m115136o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof eat0 ? (eat0) iInterfaceQueryLocalInterface : new cat0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        bat0 z9t0Var = null;
        switch (i) {
            case 1:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzccx zzccxVar = (zzccx) r6s0.m180039a(parcel, zzccx.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    z9t0Var = iInterfaceQueryLocalInterface instanceof bat0 ? (bat0) iInterfaceQueryLocalInterface : new z9t0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo108508W6(p1mVarM170217O, zzccxVar, z9t0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo120139C(p1mVarM170217O2);
                parcel2.writeNoException();
                return true;
            case 3:
                p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, null);
                return true;
            case 4:
                p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p2t0 p2t0VarM165767o8 = o2t0.m165767o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo120143n2(arrayListCreateTypedArrayList, p1mVarM170217O3, p2t0VarM165767o8);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p2t0 p2t0VarM165767o9 = o2t0.m165767o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo120141U1(arrayListCreateTypedArrayList2, p1mVarM170217O4, p2t0VarM165767o9);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxr zzbxrVar = (zzbxr) r6s0.m180039a(parcel, zzbxr.CREATOR);
                r6s0.m180041c(parcel);
                mo120145p1(zzbxrVar);
                parcel2.writeNoException();
                return true;
            case 8:
                p1m p1mVarM170217O5 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo120140E(p1mVarM170217O5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                p1m p1mVarM170217O6 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p2t0 p2t0VarM165767o10 = o2t0.m165767o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo120144o3(arrayListCreateTypedArrayList3, p1mVarM170217O6, p2t0VarM165767o10);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                p1m p1mVarM170217O7 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p2t0 p2t0VarM165767o11 = o2t0.m165767o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo120142Z2(arrayListCreateTypedArrayList4, p1mVarM170217O7, p2t0VarM165767o11);
                parcel2.writeNoException();
                return true;
            case 11:
                p1m p1mVarM170217O8 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p1m p1mVarM170217O9 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                String string = parcel.readString();
                p1m p1mVarM170217O10 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                p1m p1mVarMo120146t5 = mo120146t5(p1mVarM170217O8, p1mVarM170217O9, string, p1mVarM170217O10);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarMo120146t5);
                return true;
            default:
                return false;
        }
    }
}
