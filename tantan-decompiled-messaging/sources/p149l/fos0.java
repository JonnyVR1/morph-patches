package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fos0 extends kxr0 implements gos0 {
    public fos0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    /* JADX INFO: renamed from: o8 */
    public static gos0 m122519o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof gos0 ? (gos0) iInterfaceQueryLocalInterface : new eos0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            uyl uylVarZze = zze();
            parcel2.writeNoException();
            lxr0.m152089f(parcel2, uylVarZze);
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
