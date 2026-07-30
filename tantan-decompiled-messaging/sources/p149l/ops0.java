package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ops0 extends kxr0 implements pps0 {
    public ops0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            lxr0.m152086c(parcel);
            mo170865Y(uylVarM196295O);
        } else if (i == 2) {
            String string = parcel.readString();
            lxr0.m152086c(parcel);
            mo170866c(string);
        } else if (i == 3) {
            zze zzeVar = (zze) lxr0.m152084a(parcel, zze.CREATOR);
            lxr0.m152086c(parcel);
            mo160539f(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            gos0 gos0VarM122519o8 = fos0.m122519o8(parcel.readStrongBinder());
            lxr0.m152086c(parcel);
            mo170864T5(gos0VarM122519o8);
        }
        parcel2.writeNoException();
        return true;
    }
}
