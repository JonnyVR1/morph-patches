package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mku0 extends q6s0 implements tlu0 {
    public mku0() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* JADX INFO: renamed from: o8 */
    public static tlu0 m158822o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof tlu0 ? (tlu0) iInterfaceQueryLocalInterface : new fju0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 2:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 3:
                List listZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzj);
                return true;
            case 4:
                zzu zzuVarZzf = zzf();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, zzuVarZzf);
                return true;
            case 5:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundleZze);
                return true;
            case 6:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            default:
                return false;
        }
    }
}
