package p153l;

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
public class nxv {

    /* JADX INFO: renamed from: c */
    private static nxv f144249c;

    /* JADX INFO: renamed from: a */
    private C18991b f144250a = new C18991b();

    /* JADX INFO: renamed from: b */
    private Context f144251b;

    /* JADX INFO: renamed from: l.nxv$b */
    public static class C18991b {

        /* JADX INFO: renamed from: a */
        public float f144256a;

        /* JADX INFO: renamed from: b */
        public float f144257b;
    }

    private nxv(Context context) {
        this.f144251b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public static nxv m165284b(Context context) {
        if (f144249c == null) {
            f144249c = new nxv(context);
        }
        return f144249c;
    }

    /* JADX INFO: renamed from: c */
    public C18991b m165285c() {
        C18991b c18991b = this.f144250a;
        if (c18991b.f144256a != 0.0f && c18991b.f144257b != 0.0f) {
            return c18991b;
        }
        if (j26.m143188a(this.f144251b, "android.permission.ACCESS_FINE_LOCATION") == 0 && j26.m143188a(this.f144251b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationManager locationManager = (LocationManager) this.f144251b.getSystemService("location");
            if (locationManager != null) {
                List<String> allProviders = locationManager.getAllProviders();
                if (allProviders == null) {
                    return this.f144250a;
                }
                String str = "network";
                if (!allProviders.contains("network")) {
                    str = "gps";
                    if (!allProviders.contains("gps")) {
                        Log.e("Preview_Location", "no provide is available");
                        return this.f144250a;
                    }
                }
                Location lastKnownLocation = locationManager.getLastKnownLocation(str);
                if (lastKnownLocation != null) {
                    this.f144250a.f144257b = (float) lastKnownLocation.getLongitude();
                    this.f144250a.f144256a = (float) lastKnownLocation.getLatitude();
                } else {
                    new Handler(Looper.getMainLooper()).post(new RunnableC18990a(locationManager, str));
                }
            } else {
                Log.e("Preview_Location", "getLocation: location service is not available");
            }
        }
        return this.f144250a;
    }

    /* JADX INFO: renamed from: l.nxv$a */
    public class RunnableC18990a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LocationManager f144252a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f144253b;

        public RunnableC18990a(LocationManager locationManager, String str) {
            this.f144252a = locationManager;
            this.f144253b = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            this.f144252a.requestLocationUpdates(this.f144253b, 1000L, 1.0f, new a());
        }

        /* JADX INFO: renamed from: l.nxv$a$a */
        public class a implements LocationListener {
            public a() {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                if (location != null) {
                    nxv.this.f144250a.f144257b = (float) location.getLongitude();
                    nxv.this.f144250a.f144256a = (float) location.getLatitude();
                    RunnableC18990a.this.f144252a.removeUpdates(this);
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
