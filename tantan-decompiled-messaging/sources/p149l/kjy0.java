package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kjy0 extends yzr0 implements ply0 {
    public kjy0() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // p149l.yzr0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) rws0.m181446a(parcel, LocationSettingsResult.CREATOR);
        rws0.m181447b(parcel);
        mo131406N0(locationSettingsResult);
        return true;
    }
}
