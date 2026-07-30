package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcag;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cos0 extends kxr0 implements dos0 {
    public cos0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static dos0 m108031o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface : new sns0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i3 = parcel.readInt();
                lxr0.m152086c(parcel);
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
                lxr0.m152086c(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                lxr0.m152086c(parcel);
                mo105940L7(string, string2);
                break;
            case 10:
                ucs0.m193104o8(parcel.readStrongBinder());
                parcel.readString();
                lxr0.m152086c(parcel);
                break;
            case 11:
                mo105943b();
                break;
            case 12:
                parcel.readString();
                lxr0.m152086c(parcel);
                break;
            case 13:
                mo105947r();
                break;
            case 14:
                zzcag zzcagVar = (zzcag) lxr0.m152084a(parcel, zzcag.CREATOR);
                lxr0.m152086c(parcel);
                mo105939L2(zzcagVar);
                break;
            case 15:
                mo105946k();
                break;
            case 16:
                cys0 cys0VarM104510o8 = bys0.m104510o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo105950v2(cys0VarM104510o8);
                break;
            case 17:
                int i4 = parcel.readInt();
                lxr0.m152086c(parcel);
                mo105941N1(i4);
                break;
            case 18:
                zzu();
                break;
            case 19:
                lxr0.m152086c(parcel);
                break;
            case 20:
                mo105944g();
                break;
            case 21:
                String string3 = parcel.readString();
                lxr0.m152086c(parcel);
                mo105948u(string3);
                break;
            case 22:
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                lxr0.m152086c(parcel);
                mo105938G0(i5, string4);
                break;
            case 23:
                zze zzeVar = (zze) lxr0.m152084a(parcel, zze.CREATOR);
                lxr0.m152086c(parcel);
                mo105942N4(zzeVar);
                break;
            case 24:
                zze zzeVar2 = (zze) lxr0.m152084a(parcel, zze.CREATOR);
                lxr0.m152086c(parcel);
                mo105949u5(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
