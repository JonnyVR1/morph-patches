package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class sas0 extends q6s0 implements tas0 {
    public sas0() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        abs0 yas0Var;
        switch (i) {
            case 2:
                oys0 oys0VarZze = zze();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, oys0VarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof xas0) {
                    }
                }
                r6s0.m180041c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    yas0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    yas0Var = iInterfaceQueryLocalInterface2 instanceof abs0 ? (abs0) iInterfaceQueryLocalInterface2 : new yas0(strongBinder2);
                }
                r6s0.m180041c(parcel);
                mo174093n5(p1mVarM170217O, yas0Var);
                parcel2.writeNoException();
                return true;
            case 5:
                tlu0 tlu0VarZzf = zzf();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, tlu0VarZzf);
                return true;
            case 6:
                boolean zM180045g = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                mo174092m2(zM180045g);
                parcel2.writeNoException();
                return true;
            case 7:
                ycu0 ycu0VarM180764o8 = rbu0.m180764o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo174091k5(ycu0VarM180764o8);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
