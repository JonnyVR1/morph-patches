package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class mvv {

    /* JADX INFO: renamed from: c */
    private static mvv f135992c;

    /* JADX INFO: renamed from: a */
    private C18572b f135993a = new C18572b();

    /* JADX INFO: renamed from: b */
    private Context f135994b;

    /* JADX INFO: renamed from: l.mvv$b */
    public static class C18572b {

        /* JADX INFO: renamed from: a */
        public float f135999a;

        /* JADX INFO: renamed from: b */
        public float f136000b;
    }

    private mvv(Context context) {
        this.f135994b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public static mvv m156604b(Context context) {
        if (f135992c == null) {
            f135992c = new mvv(context);
        }
        return f135992c;
    }

    /* JADX INFO: renamed from: c */
    public C18572b m156605c() {
        C18572b c18572b = this.f135993a;
        if (c18572b.f135999a != 0.0f && c18572b.f136000b != 0.0f) {
            return c18572b;
        }
        if (e16.m114373a(this.f135994b, "android.permission.ACCESS_FINE_LOCATION") == 0 && e16.m114373a(this.f135994b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationManager locationManager = (LocationManager) this.f135994b.getSystemService("location");
            if (locationManager != null) {
                List<String> allProviders = locationManager.getAllProviders();
                if (allProviders == null) {
                    return this.f135993a;
                }
                String str = "network";
                if (!allProviders.contains("network")) {
                    str = "gps";
                    if (!allProviders.contains("gps")) {
                        Log.e("Preview_Location", "no provide is available");
                        return this.f135993a;
                    }
                }
                Location lastKnownLocation = locationManager.getLastKnownLocation(str);
                if (lastKnownLocation != null) {
                    this.f135993a.f136000b = (float) lastKnownLocation.getLongitude();
                    this.f135993a.f135999a = (float) lastKnownLocation.getLatitude();
                } else {
                    new Handler(Looper.getMainLooper()).post(new RunnableC18571a(locationManager, str));
                }
            } else {
                Log.e("Preview_Location", "getLocation: location service is not available");
            }
        }
        return this.f135993a;
    }

    /* JADX INFO: renamed from: l.mvv$a */
    public class RunnableC18571a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LocationManager f135995a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f135996b;

        public RunnableC18571a(LocationManager locationManager, String str) {
            this.f135995a = locationManager;
            this.f135996b = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            this.f135995a.requestLocationUpdates(this.f135996b, 1000L, 1.0f, new a());
        }

        /* JADX INFO: renamed from: l.mvv$a$a */
        public class a implements LocationListener {
            public a() {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                if (location != null) {
                    mvv.this.f135993a.f136000b = (float) location.getLongitude();
                    mvv.this.f135993a.f135999a = (float) location.getLatitude();
                    RunnableC18571a.this.f135995a.removeUpdates(this);
                }
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i, Bundle bundle) {
            }
        }
    }
}
