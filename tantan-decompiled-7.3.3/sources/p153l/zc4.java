package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
public final class zc4 {

    /* JADX INFO: renamed from: a */
    public static jql f203731a;

    /* JADX INFO: renamed from: a */
    public static yc4 m219230a(LatLng latLng, float f) {
        try {
            return new yc4(m219232c().mo146593g6(latLng, f));
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m219231b(jql jqlVar) {
        f203731a = (jql) Preconditions.checkNotNull(jqlVar);
    }

    /* JADX INFO: renamed from: c */
    public static jql m219232c() {
        return (jql) Preconditions.checkNotNull(f203731a, "CameraUpdateFactory is not initialized");
    }
}
