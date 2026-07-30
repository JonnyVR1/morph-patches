package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcag;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ixs0 extends q6s0 implements jxs0 {
    public ixs0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static jxs0 m142591o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface : new yws0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i3 = parcel.readInt();
                r6s0.m180041c(parcel);
                zzg(i3);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                r6s0.m180041c(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                r6s0.m180041c(parcel);
                mo118715L7(string, string2);
                break;
            case 10:
                ams0.m98856o8(parcel.readStrongBinder());
                parcel.readString();
                r6s0.m180041c(parcel);
                break;
            case 11:
                mo104529b();
                break;
            case 12:
                parcel.readString();
                r6s0.m180041c(parcel);
                break;
            case 13:
                mo104530r();
                break;
            case 14:
                zzcag zzcagVar = (zzcag) r6s0.m180039a(parcel, zzcag.CREATOR);
                r6s0.m180041c(parcel);
                mo104528L2(zzcagVar);
                break;
            case 15:
                mo118720k();
                break;
            case 16:
                i7t0 i7t0VarM133837o8 = h7t0.m133837o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo104531v2(i7t0VarM133837o8);
                break;
            case 17:
                int i4 = parcel.readInt();
                r6s0.m180041c(parcel);
                mo118716N1(i4);
                break;
            case 18:
                zzu();
                break;
            case 19:
                r6s0.m180041c(parcel);
                break;
            case 20:
                mo118718g();
                break;
            case 21:
                String string3 = parcel.readString();
                r6s0.m180041c(parcel);
                mo118721u(string3);
                break;
            case 22:
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                r6s0.m180041c(parcel);
                mo118714G0(i5, string4);
                break;
            case 23:
                zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
                r6s0.m180041c(parcel);
                mo118717N4(zzeVar);
                break;
            case 24:
                zze zzeVar2 = (zze) r6s0.m180039a(parcel, zze.CREATOR);
                r6s0.m180041c(parcel);
                mo118722u5(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
