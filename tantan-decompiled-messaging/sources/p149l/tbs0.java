package p149l;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tbs0 extends kxr0 implements ubs0 {
    public tbs0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* JADX INFO: renamed from: o8 */
    public static ubs0 m187903o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof ubs0 ? (ubs0) iInterfaceQueryLocalInterface : new sbs0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            uyl uylVarZzf = zzf();
            parcel2.writeNoException();
            lxr0.m152089f(parcel2, uylVarZzf);
        } else if (i == 2) {
            Uri uriZze = zze();
            parcel2.writeNoException();
            lxr0.m152088e(parcel2, uriZze);
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
