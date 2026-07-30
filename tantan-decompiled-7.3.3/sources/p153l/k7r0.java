package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k7r0 extends x6r0 implements p7r0 {
    public k7r0() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p153l.x6r0
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                d7r0.m114756b(parcel);
                break;
            case 4:
                d7r0.m114756b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                d7r0.m114756b(parcel);
                break;
            case 7:
                d7r0.m114756b(parcel);
                break;
            case 8:
                zak zakVar = (zak) d7r0.m114755a(parcel, zak.CREATOR);
                d7r0.m114756b(parcel);
                zab(zakVar);
                break;
            case 9:
                d7r0.m114756b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
