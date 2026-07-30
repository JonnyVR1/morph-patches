package p149l;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vey0 extends yzr0 implements lhy0 {
    public vey0() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // p149l.yzr0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) rws0.m181446a(parcel, Status.CREATOR);
        Location location = (Location) rws0.m181446a(parcel, Location.CREATOR);
        rws0.m181447b(parcel);
        mo149876K4(status, location);
        return true;
    }
}
