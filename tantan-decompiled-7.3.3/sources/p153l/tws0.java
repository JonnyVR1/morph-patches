package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tws0 extends q6s0 implements uws0 {
    public tws0() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX INFO: renamed from: o8 */
    public static uws0 m193369o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof uws0 ? (uws0) iInterfaceQueryLocalInterface : new sws0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            r6s0.m180041c(parcel);
            xws0 xws0VarZzb = zzb(string);
            parcel2.writeNoException();
            r6s0.m180044f(parcel2, xws0VarZzb);
        } else if (i == 2) {
            String string2 = parcel.readString();
            r6s0.m180041c(parcel);
            boolean zMo178536c = mo178536c(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zMo178536c ? 1 : 0);
        } else if (i == 3) {
            String string3 = parcel.readString();
            r6s0.m180041c(parcel);
            hzs0 hzs0VarZzc = zzc(string3);
            parcel2.writeNoException();
            r6s0.m180044f(parcel2, hzs0VarZzc);
        } else {
            if (i != 4) {
                return false;
            }
            String string4 = parcel.readString();
            r6s0.m180041c(parcel);
            boolean zMo178537z = mo178537z(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zMo178537z ? 1 : 0);
        }
        return true;
    }
}
