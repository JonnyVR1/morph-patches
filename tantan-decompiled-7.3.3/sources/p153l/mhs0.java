package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mhs0 extends q6s0 implements nhs0 {
    public mhs0() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
        } else if (i == 2) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else if (i == 3) {
            p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            r6s0.m180041c(parcel);
            mo154244x(p1mVarM170217O);
            parcel2.writeNoException();
        } else if (i == 4) {
            zze();
            parcel2.writeNoException();
        } else {
            if (i != 5) {
                return false;
            }
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }
}
