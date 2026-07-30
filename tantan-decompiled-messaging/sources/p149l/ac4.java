package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
public final class ac4 {

    /* JADX INFO: renamed from: a */
    public static ynl f68774a;

    /* JADX INFO: renamed from: a */
    public static zb4 m95713a(LatLng latLng, float f) {
        try {
            return new zb4(m95715c().mo124001g6(latLng, f));
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m95714b(ynl ynlVar) {
        f68774a = (ynl) Preconditions.checkNotNull(ynlVar);
    }

    /* JADX INFO: renamed from: c */
    public static ynl m95715c() {
        return (ynl) Preconditions.checkNotNull(f68774a, "CameraUpdateFactory is not initialized");
    }
}
