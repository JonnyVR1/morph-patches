package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcag;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d7t0 extends q6s0 implements e7t0 {
    public d7t0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static e7t0 m114759o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof e7t0 ? (e7t0) iInterfaceQueryLocalInterface : new c7t0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo108330Z3(p1mVarM170217O);
                break;
            case 2:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                r6s0.m180041c(parcel);
                mo119769D1(p1mVarM170217O2, i3);
                break;
            case 3:
                p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo108331c0(p1mVarM170217O3);
                break;
            case 4:
                p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo108327E(p1mVarM170217O4);
                break;
            case 5:
                p1m p1mVarM170217O5 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo108332i5(p1mVarM170217O5);
                break;
            case 6:
                p1m p1mVarM170217O6 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo108329Z(p1mVarM170217O6);
                break;
            case 7:
                p1m p1mVarM170217O7 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzcag zzcagVar = (zzcag) r6s0.m180039a(parcel, zzcag.CREATOR);
                r6s0.m180041c(parcel);
                mo108328U2(p1mVarM170217O7, zzcagVar);
                break;
            case 8:
                p1m p1mVarM170217O8 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                zze(p1mVarM170217O8);
                break;
            case 9:
                p1m p1mVarM170217O9 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                r6s0.m180041c(parcel);
                mo108333q0(p1mVarM170217O9, i4);
                break;
            case 10:
                p1m p1mVarM170217O10 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo119770W3(p1mVarM170217O10);
                break;
            case 11:
                p1m p1mVarM170217O11 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo108334y4(p1mVarM170217O11);
                break;
            case 12:
                r6s0.m180041c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
