package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m1s0 extends kxr0 implements n1s0 {
    public m1s0() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        u1s0 s1s0Var;
        switch (i) {
            case 2:
                ips0 ips0VarZze = zze();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ips0VarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof r1s0) {
                    }
                }
                lxr0.m152086c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    s1s0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    s1s0Var = iInterfaceQueryLocalInterface2 instanceof u1s0 ? (u1s0) iInterfaceQueryLocalInterface2 : new s1s0(strongBinder2);
                }
                lxr0.m152086c(parcel);
                mo142392n5(uylVarM196295O, s1s0Var);
                parcel2.writeNoException();
                return true;
            case 5:
                ncu0 ncu0VarZzf = zzf();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ncu0VarZzf);
                return true;
            case 6:
                boolean zM152090g = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                mo142391m2(zM152090g);
                parcel2.writeNoException();
                return true;
            case 7:
                s3u0 s3u0VarM148306o8 = l2u0.m148306o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo142390k5(s3u0VarM148306o8);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
