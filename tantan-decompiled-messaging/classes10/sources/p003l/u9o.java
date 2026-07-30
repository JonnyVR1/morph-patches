package p003l;

import android.annotation.SuppressLint;
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
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.du2;
import l.e16;
import l.e51;
import l.hfw;
import l.j760;
import l.jo0;
import l.vwb;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u9o {

    /* JADX INFO: renamed from: b */
    public LocationRequest f7717b;

    /* JADX INFO: renamed from: c */
    public FusedLocationProviderClient f7718c;

    /* JADX INFO: renamed from: d */
    public Looper f7719d;

    /* JADX INFO: renamed from: e */
    public LocationCallback f7720e;

    /* JADX INFO: renamed from: f */
    public Location f7721f;

    /* JADX INFO: renamed from: g */
    public LocationListener f7722g;

    /* JADX INFO: renamed from: a */
    public final String f7716a = "IntlLocationUpdateProvider";

    /* JADX INFO: renamed from: h */
    public a<Location> f7723h = a.b();

    /* JADX INFO: renamed from: l.u9o$b */
    public class C3441b extends LocationCallback {
        public C3441b() {
        }

        public void onLocationResult(LocationResult locationResult) {
            android.location.Location lastLocation = locationResult.getLastLocation();
            Objects.toString(lastLocation);
            boolean zA = NullChecker.a(lastLocation);
            u9o u9oVar = u9o.this;
            if (zA) {
                u9oVar.f7721f = new Location(lastLocation);
            } else {
                u9oVar.f7721f = null;
            }
            if (NullChecker.a(u9o.this.f7721f)) {
                u9o u9oVar2 = u9o.this;
                u9oVar2.m9703j(u9oVar2.f7721f, false);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e */
    public void m9698e() {
        this.f7721f = null;
        this.f7718c.requestLocationUpdates(this.f7717b, this.f7720e, this.f7719d).addOnCompleteListener(new OnCompleteListener() { // from class: l.s9o
            public final void onComplete(Task task) {
                this.f7317a.m9700g(task);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public boolean m9699f(Location location) {
        if (location == null) {
            return true;
        }
        if (location.u() == 0.0d && location.x() == 0.0d) {
            return true;
        }
        if (location.u() == 1.0d && location.x() == 1.0d) {
            return true;
        }
        if (location.u() == 30.0d && location.x() == 104.0d) {
            return true;
        }
        if (Math.abs(location.u() + 0.003d) > 0.0010000000474974513d || Math.abs(location.x() + 0.01d) > 0.009999999776482582d) {
            return Math.abs(location.u() + 0.0027d) <= 9.999999747378752E-5d && Math.abs(location.x() + 0.01d) <= 0.009999999776482582d;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m9700g(Task task) {
        try {
            Location location = this.f7721f;
            if (location != null) {
                hfw.a("IntlLocationUpdateProvider", String.format("location update FusedLocationProviderClient requestLocationUpdates succeed provider: %s", location.y()));
            }
            if (this.f7721f == null) {
                hfw.a("IntlLocationUpdateProvider", "location update lastLocation == null,FusedLocationProviderClient requestLocationUpdates failed");
            }
        } catch (Throwable th) {
            hfw.a("IntlLocationUpdateProvider", String.format("location update lastLocation == null,FusedLocationProviderClient requestLocationUpdates throw exception: %s", th.getMessage()));
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m9701h(Location location, boolean z) {
        Location location2 = (Location) this.f7723h.e();
        if (!m9699f(location) && (location2 == null || location2.x() != location.x() || location2.u() != location.u() || location2.s() != location.s() || location2.w() != location.w())) {
            this.f7723h.onNext(location);
        }
        if (z) {
            m9707n();
        }
    }

    /* JADX INFO: renamed from: i */
    public c<Location> m9702i() {
        return this.f7723h.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: j */
    public void m9703j(final Location location, final boolean z) {
        if (location == null) {
            return;
        }
        e51.M(new Runnable() { // from class: l.t9o
            @Override // java.lang.Runnable
            public final void run() {
                this.f7545a.m9701h(location, z);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m9704k() {
        if (e16.a(App.e, "android.permission.ACCESS_FINE_LOCATION") == 0 && e16.a(App.e, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            m9705l(true);
            m9698e();
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* JADX INFO: renamed from: l */
    public void m9705l(boolean z) {
        if (this.f7718c == null) {
            this.f7718c = LocationServices.getFusedLocationProviderClient(App.e);
        }
        if (this.f7717b == null) {
            this.f7717b = LocationRequest.create().setInterval(2000L).setFastestInterval(1000L).setMaxWaitTime(1000L).setPriority(z ? 100 : 104);
        }
        if (this.f7719d == null) {
            HandlerThread handlerThread = new HandlerThread("GoogleLocationUpdateProvider");
            handlerThread.start();
            this.f7719d = handlerThread.getLooper();
        }
        if (this.f7720e == null) {
            this.f7720e = new C3441b();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m9706m() {
        Objects.toString(this.f7722g);
        if (this.f7722g != null) {
            return;
        }
        m9708o();
        m9709p();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: n */
    public void m9707n() {
        m9708o();
        if (NullChecker.a(this.f7722g)) {
            ((LocationManager) App.e.getSystemService(MessageType.location)).removeUpdates(this.f7722g);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m9708o() {
        if (NullChecker.a(this.f7718c) && NullChecker.a(this.f7720e)) {
            this.f7718c.removeLocationUpdates(this.f7720e);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: p */
    public final void m9709p() {
        if (this.f7722g == null) {
            this.f7722g = new C3440a();
        }
        LocationManager locationManager = (LocationManager) App.e.getSystemService(MessageType.location);
        try {
            if (locationManager.getAllProviders().contains("gps")) {
                locationManager.requestLocationUpdates("gps", 0L, 0.0f, this.f7722g, this.f7719d);
            }
            if (locationManager.getAllProviders().contains("network")) {
                locationManager.requestLocationUpdates("network", 0L, 0.0f, this.f7722g, this.f7719d);
            }
        } catch (SecurityException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: l.u9o$a */
    public class C3440a implements LocationListener {
        public C3440a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location location) {
            Location location2 = NullChecker.a(location) ? new Location(location) : null;
            if (NullChecker.a(location2)) {
                zvf0.B("e_location_provider", "", new j760[]{vwb.Y("location_provider", location2.y())});
                hfw.a("IntlLocationUpdateProvider", String.format("android system location provider: %s", location2.y()));
            }
            du2.a("[putong-common][location]", "onLocationChanged location = " + location2);
            u9o.this.f7721f = location2;
            u9o.this.m9703j(location2, false);
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
