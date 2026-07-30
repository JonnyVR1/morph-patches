package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public abstract class efs0 extends kxr0 implements fgs0 {
    public efs0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzl zzlVar = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
            lxr0.m152086c(parcel);
            mo101747l3(zzlVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            ClassLoader classLoader = lxr0.f130430a;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i != 5) {
                return false;
            }
            zzl zzlVar2 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
            int i3 = parcel.readInt();
            lxr0.m152086c(parcel);
            mo101748p2(zzlVar2, i3);
            parcel2.writeNoException();
        }
        return true;
    }
}
