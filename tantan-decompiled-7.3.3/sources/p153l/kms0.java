package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kms0 extends q6s0 implements lms0 {
    public kms0() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static lms0 m150489o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof lms0 ? (lms0) iInterfaceQueryLocalInterface : new jms0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        bms0 zls0Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zls0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zls0Var = iInterfaceQueryLocalInterface instanceof bms0 ? (bms0) iInterfaceQueryLocalInterface : new zls0(strongBinder);
        }
        String string = parcel.readString();
        r6s0.m180041c(parcel);
        mo146168T7(zls0Var, string);
        parcel2.writeNoException();
        return true;
    }
}
