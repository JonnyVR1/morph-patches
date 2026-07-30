package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qsy0 extends e9s0 implements vuy0 {
    public qsy0() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // p153l.e9s0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) x5t0.m209430a(parcel, LocationSettingsResult.CREATOR);
        x5t0.m209431b(parcel);
        mo126981N0(locationSettingsResult);
        return true;
    }
}
