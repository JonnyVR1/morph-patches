package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kos0 extends q6s0 implements lps0 {
    public kos0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzl zzlVar = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
            r6s0.m180041c(parcel);
            mo136584l3(zzlVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            ClassLoader classLoader = r6s0.f161495a;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i != 5) {
                return false;
            }
            zzl zzlVar2 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
            int i3 = parcel.readInt();
            r6s0.m180041c(parcel);
            mo136585p2(zzlVar2, i3);
            parcel2.writeNoException();
        }
        return true;
    }
}
