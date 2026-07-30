package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rbu0 extends q6s0 implements ycu0 {
    public rbu0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static ycu0 m180764o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof ycu0 ? (ycu0) iInterfaceQueryLocalInterface : new lau0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzs zzsVar = (zzs) r6s0.m180039a(parcel, zzs.CREATOR);
            r6s0.m180041c(parcel);
            mo153539F3(zzsVar);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            ClassLoader classLoader = r6s0.f161495a;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
