package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dls0 extends q6s0 implements els0 {
    public dls0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* JADX INFO: renamed from: o8 */
    public static els0 m116863o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof els0 ? (els0) iInterfaceQueryLocalInterface : new cls0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        xks0 vks0Var;
        switch (i) {
            case 1:
                String string = parcel.readString();
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo110698B7(string, p1mVarM170217O);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                r6s0.m180041c(parcel);
                p1m p1mVarZzb = zzb(string2);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzb);
                return true;
            case 3:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo110700R7(p1mVarM170217O2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                parcel.readInt();
                r6s0.m180041c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo110703i7(p1mVarM170217O3);
                parcel2.writeNoException();
                return true;
            case 7:
                p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo110704x(p1mVarM170217O4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    vks0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    vks0Var = iInterfaceQueryLocalInterface instanceof xks0 ? (xks0) iInterfaceQueryLocalInterface : new vks0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo110702d1(vks0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                p1m p1mVarM170217O5 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo110699I6(p1mVarM170217O5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
