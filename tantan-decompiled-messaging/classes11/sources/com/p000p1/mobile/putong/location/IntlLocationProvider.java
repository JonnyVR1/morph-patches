package com.p000p1.mobile.putong.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.du2;
import l.hfw;
import l.j760;
import l.vwb;
import l.zvf0;
import p009l.w85;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlLocationProvider extends AbstractC0465a {

    /* JADX INFO: renamed from: t */
    public static a<GoogleLocationDialogStatus> f7552t = a.b();

    /* JADX INFO: renamed from: n */
    public LocationRequest f7553n;

    /* JADX INFO: renamed from: o */
    public FusedLocationProviderClient f7554o;

    /* JADX INFO: renamed from: p */
    public Looper f7555p;

    /* JADX INFO: renamed from: q */
    public LocationCallback f7556q;

    /* JADX INFO: renamed from: r */
    public Location f7557r;

    /* JADX INFO: renamed from: s */
    public LocationListener f7558s;

    public enum GoogleLocationDialogStatus {
        SHOWING,
        HIDDEN
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.IntlLocationProvider$a */
    public class C0460a implements LocationListener {
        public C0460a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            Location location2;
            if (NullChecker.a(location)) {
                w85.INSTANCE.m24003q(location);
                location2 = new Location(location);
            } else {
                location2 = null;
            }
            if (NullChecker.a(location2)) {
                zvf0.B("e_location_provider", "", new j760[]{vwb.Y("location_provider", location2.m9129y())});
                hfw.a("LocationProvider", String.format("android system location provider: %s", location2.m9129y()));
            }
            du2.a("[putong-common][location]", "onLocationChanged location = " + location2);
            IntlLocationProvider.this.f7557r = location2;
            IntlLocationProvider.this.m9162s(location2, true);
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.IntlLocationProvider$b */
    public class C0461b extends LocationCallback {
        public C0461b() {
        }

        public void onLocationResult(LocationResult locationResult) {
            Location lastLocation = locationResult.getLastLocation();
            if (NullChecker.a(lastLocation)) {
                w85.INSTANCE.m24003q(lastLocation);
                IntlLocationProvider.this.f7557r = new Location(lastLocation);
            } else {
                IntlLocationProvider.this.f7557r = null;
            }
            if (NullChecker.a(IntlLocationProvider.this.f7557r)) {
                IntlLocationProvider intlLocationProvider = IntlLocationProvider.this;
                intlLocationProvider.m9162s(intlLocationProvider.f7557r, true);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.location.AbstractC0465a
    /* JADX INFO: renamed from: A */
    public void mo9088A(boolean z) {
        super.mo9088A(z);
        if (this.f7554o == null) {
            this.f7554o = LocationServices.getFusedLocationProviderClient(App.e);
        }
        if (this.f7553n == null) {
            this.f7553n = LocationRequest.create().setInterval(300000L).setFastestInterval(5000L).setMaxWaitTime(5000L).setPriority(z ? 100 : 104);
        }
        if (this.f7555p == null) {
            HandlerThread handlerThread = new HandlerThread("GoogleLocationProvider");
            handlerThread.start();
            this.f7555p = handlerThread.getLooper();
        }
        if (this.f7556q == null) {
            this.f7556q = new C0461b();
        }
        m9161r();
    }

    @Override // com.p000p1.mobile.putong.location.AbstractC0465a
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: B */
    public void mo9089B() {
        if (NullChecker.a(this.f7554o) && NullChecker.a(this.f7556q)) {
            this.f7554o.removeLocationUpdates(this.f7556q);
        }
        if (NullChecker.a(this.f7558s)) {
            ((LocationManager) App.e.getSystemService("location")).removeUpdates(this.f7558s);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m9090F(Task task) {
        try {
            Location location = this.f7557r;
            if (location != null) {
                hfw.a("LocationProvider", String.format("FusedLocationProviderClient requestLocationUpdates succeed provider: %s", location.m9129y()));
            }
            if (this.f7557r == null) {
                hfw.a("LocationProvider", String.format("lastLocation == null,FusedLocationProviderClient requestLocationUpdates failed", new Object[0]));
                m9091G();
            }
        } catch (Throwable th) {
            hfw.a("LocationProvider", String.format("lastLocation == null,FusedLocationProviderClient requestLocationUpdates throw exception: %s", th.getMessage()));
            CrashHelper.c(th);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: G */
    public final void m9091G() {
        if (this.f7558s == null) {
            this.f7558s = new C0460a();
        }
        LocationManager locationManager = (LocationManager) App.e.getSystemService("location");
        try {
            if (locationManager.getAllProviders().contains("gps")) {
                locationManager.requestLocationUpdates("gps", 5000L, 10.0f, this.f7558s, this.f7555p);
            }
            if (locationManager.getAllProviders().contains("network")) {
                locationManager.requestLocationUpdates("network", 5000L, 10.0f, this.f7558s, this.f7555p);
            }
        } catch (SecurityException e) {
            CrashHelper.c(e);
        }
    }

    @Override // com.p000p1.mobile.putong.location.AbstractC0465a
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: g */
    public void mo9092g() {
        this.f7557r = null;
        this.f7554o.requestLocationUpdates(this.f7553n, this.f7556q, this.f7555p).addOnCompleteListener(new OnCompleteListener() { // from class: l.r9o
            public final void onComplete(Task task) {
                this.f19700a.m9090F(task);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.location.AbstractC0465a
    /* JADX INFO: renamed from: j */
    public String mo9093j() {
        return "intl";
    }
}
