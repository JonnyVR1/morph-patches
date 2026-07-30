package p153l;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public abstract class boy0 extends e9s0 implements rqy0 {
    public boy0() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // p153l.e9s0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) x5t0.m209430a(parcel, Status.CREATOR);
        Location location = (Location) x5t0.m209430a(parcel, Location.CREATOR);
        x5t0.m209431b(parcel);
        mo98857K4(status, location);
        return true;
    }
}
