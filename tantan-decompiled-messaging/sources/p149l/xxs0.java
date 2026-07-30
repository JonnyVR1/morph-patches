package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcag;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xxs0 extends kxr0 implements yxs0 {
    public xxs0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static yxs0 m211540o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof yxs0 ? (yxs0) iInterfaceQueryLocalInterface : new wxs0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145122Z3(uylVarM196295O);
                break;
            case 2:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                lxr0.m152086c(parcel);
                mo145117D1(uylVarM196295O2, i3);
                break;
            case 3:
                uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145123c0(uylVarM196295O3);
                break;
            case 4:
                uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145118E(uylVarM196295O4);
                break;
            case 5:
                uyl uylVarM196295O5 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145124i5(uylVarM196295O5);
                break;
            case 6:
                uyl uylVarM196295O6 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145121Z(uylVarM196295O6);
                break;
            case 7:
                uyl uylVarM196295O7 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzcag zzcagVar = (zzcag) lxr0.m152084a(parcel, zzcag.CREATOR);
                lxr0.m152086c(parcel);
                mo145119U2(uylVarM196295O7, zzcagVar);
                break;
            case 8:
                uyl uylVarM196295O8 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                zze(uylVarM196295O8);
                break;
            case 9:
                uyl uylVarM196295O9 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                lxr0.m152086c(parcel);
                mo145125q0(uylVarM196295O9, i4);
                break;
            case 10:
                uyl uylVarM196295O10 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145120W3(uylVarM196295O10);
                break;
            case 11:
                uyl uylVarM196295O11 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145126y4(uylVarM196295O11);
                break;
            case 12:
                lxr0.m152086c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
