package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l2u0 extends kxr0 implements s3u0 {
    public l2u0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static s3u0 m148306o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof s3u0 ? (s3u0) iInterfaceQueryLocalInterface : new f1u0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzs zzsVar = (zzs) lxr0.m152084a(parcel, zzs.CREATOR);
            lxr0.m152086c(parcel);
            mo119144F3(zzsVar);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            ClassLoader classLoader = lxr0.f130430a;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
