package p153l;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zks0 extends q6s0 implements als0 {
    public zks0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* JADX INFO: renamed from: o8 */
    public static als0 m220161o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof als0 ? (als0) iInterfaceQueryLocalInterface : new yks0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            p1m p1mVarZzf = zzf();
            parcel2.writeNoException();
            r6s0.m180044f(parcel2, p1mVarZzf);
        } else if (i == 2) {
            Uri uriZze = zze();
            parcel2.writeNoException();
            r6s0.m180043e(parcel2, uriZze);
        } else if (i == 3) {
            double dZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(dZzb);
        } else if (i == 4) {
            int iZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        } else {
            if (i != 5) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
