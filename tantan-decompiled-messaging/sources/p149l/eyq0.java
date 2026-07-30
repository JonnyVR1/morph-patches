package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eyq0 extends rxq0 implements jyq0 {
    public eyq0() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p149l.rxq0
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                xxq0.m211534b(parcel);
                break;
            case 4:
                xxq0.m211534b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                xxq0.m211534b(parcel);
                break;
            case 7:
                xxq0.m211534b(parcel);
                break;
            case 8:
                zak zakVar = (zak) xxq0.m211533a(parcel, zak.CREATOR);
                xxq0.m211534b(parcel);
                zab(zakVar);
                break;
            case 9:
                xxq0.m211534b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
