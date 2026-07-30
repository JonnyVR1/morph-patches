package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eds0 extends kxr0 implements fds0 {
    public eds0() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static fds0 m115832o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof fds0 ? (fds0) iInterfaceQueryLocalInterface : new dds0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        vcs0 tcs0Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            tcs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            tcs0Var = iInterfaceQueryLocalInterface instanceof vcs0 ? (vcs0) iInterfaceQueryLocalInterface : new tcs0(strongBinder);
        }
        String string = parcel.readString();
        lxr0.m152086c(parcel);
        mo111059T7(tcs0Var, string);
        parcel2.writeNoException();
        return true;
    }
}
