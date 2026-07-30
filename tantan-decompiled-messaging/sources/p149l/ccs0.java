package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ccs0 extends kxr0 implements dcs0 {
    public ccs0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            lxr0.m152086c(parcel);
            mo110874R(uylVarM196295O);
        } else if (i == 2) {
            zzd();
        } else {
            if (i != 3) {
                return false;
            }
            uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            lxr0.m152086c(parcel);
            mo110875j2(uylVarM196295O2);
        }
        parcel2.writeNoException();
        return true;
    }
}
