package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pgs0 extends q6s0 implements xhs0 {
    public pgs0() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzd();
                break;
            case 2:
                int i3 = parcel.readInt();
                r6s0.m180041c(parcel);
                zze(i3);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
                r6s0.m180041c(parcel);
                mo127000f(zzeVar);
                break;
            case 9:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
