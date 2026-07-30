package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s3t0 extends q6s0 implements t3t0 {
    public s3t0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        n4t0 b4t0Var = null;
        if (i == 1) {
            r6s0.m180041c(parcel);
            parcel2.writeNoException();
            r6s0.m180043e(parcel2, null);
        } else if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof u3t0) {
                }
            }
            r6s0.m180041c(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbze zzbzeVar = (zzbze) r6s0.m180039a(parcel, zzbze.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                b4t0Var = iInterfaceQueryLocalInterface2 instanceof n4t0 ? (n4t0) iInterfaceQueryLocalInterface2 : new b4t0(strongBinder2);
            }
            r6s0.m180041c(parcel);
            mo179705L3(zzbzeVar, b4t0Var);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbze zzbzeVar2 = (zzbze) r6s0.m180039a(parcel, zzbze.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                b4t0Var = iInterfaceQueryLocalInterface3 instanceof n4t0 ? (n4t0) iInterfaceQueryLocalInterface3 : new b4t0(strongBinder3);
            }
            r6s0.m180041c(parcel);
            mo179706c3(zzbzeVar2, b4t0Var);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbze zzbzeVar3 = (zzbze) r6s0.m180039a(parcel, zzbze.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                b4t0Var = iInterfaceQueryLocalInterface4 instanceof n4t0 ? (n4t0) iInterfaceQueryLocalInterface4 : new b4t0(strongBinder4);
            }
            r6s0.m180041c(parcel);
            mo179707q3(zzbzeVar3, b4t0Var);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                b4t0Var = iInterfaceQueryLocalInterface5 instanceof n4t0 ? (n4t0) iInterfaceQueryLocalInterface5 : new b4t0(strongBinder5);
            }
            r6s0.m180041c(parcel);
            mo179708r1(string, b4t0Var);
            parcel2.writeNoException();
        }
        return true;
    }
}
