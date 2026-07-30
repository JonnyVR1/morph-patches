package p149l;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import java.util.Iterator;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public class bwv {
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static Location m104253a() {
        if (e16.m114373a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 119, 126, 47, 35, 111, 42, 126, 116, HttpTokens.SPACE, 50, 121, 41, 127})) != 0 && e16.m114373a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 114, 120, HttpTokens.SPACE, 52, 99, 35, 110, 123, 46, 37, 113, 50, 120, 120, 47})) != 0) {
            return null;
        }
        try {
            LocationManager locationManager = (LocationManager) ygw.m214775a().getSystemService(sgw.m184137a(new byte[]{92, 9, 82, 86, 21, 15, 95, 8}));
            Iterator<String> it = locationManager.getProviders(true).iterator();
            Location location = null;
            while (it.hasNext()) {
                Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
                if (lastKnownLocation != null && (location == null || lastKnownLocation.getAccuracy() < location.getAccuracy())) {
                    location = lastKnownLocation;
                }
            }
            return location;
        } catch (Exception unused) {
            return null;
        }
    }
}
