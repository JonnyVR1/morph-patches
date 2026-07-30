package p149l;

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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
public class u9o {

    /* JADX INFO: renamed from: b */
    public LocationRequest f175471b;

    /* JADX INFO: renamed from: c */
    public FusedLocationProviderClient f175472c;

    /* JADX INFO: renamed from: d */
    public Looper f175473d;

    /* JADX INFO: renamed from: e */
    public LocationCallback f175474e;

    /* JADX INFO: renamed from: f */
    public Location f175475f;

    /* JADX INFO: renamed from: g */
    public LocationListener f175476g;

    /* JADX INFO: renamed from: a */
    public final String f175470a = "IntlLocationUpdateProvider";

    /* JADX INFO: renamed from: h */
    public C22392a<Location> f175477h = C22392a.m221512b();

    /* JADX INFO: renamed from: l.u9o$b */
    public class C20392b extends LocationCallback {
        public C20392b() {
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            android.location.Location lastLocation = locationResult.getLastLocation();
            Objects.toString(lastLocation);
            boolean zM81303a = NullChecker.m81303a(lastLocation);
            u9o u9oVar = u9o.this;
            if (zM81303a) {
                u9oVar.f175475f = new Location(lastLocation);
            } else {
                u9oVar.f175475f = null;
            }
            if (NullChecker.m81303a(u9o.this.f175475f)) {
                u9o u9oVar2 = u9o.this;
                u9oVar2.m192586j(u9oVar2.f175475f, false);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e */
    public void m192581e() {
        this.f175475f = null;
        this.f175472c.requestLocationUpdates(this.f175471b, this.f175474e, this.f175473d).addOnCompleteListener(new OnCompleteListener() { // from class: l.s9o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f163203a.m192583g(task);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public boolean m192582f(Location location) {
        if (location == null) {
            return true;
        }
        if (location.m78831u() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && location.m78833x() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return true;
        }
        if (location.m78831u() == 1.0d && location.m78833x() == 1.0d) {
            return true;
        }
        if (location.m78831u() == 30.0d && location.m78833x() == 104.0d) {
            return true;
        }
        if (Math.abs(location.m78831u() + 0.003d) > 0.0010000000474974513d || Math.abs(location.m78833x() + 0.01d) > 0.009999999776482582d) {
            return Math.abs(location.m78831u() + 0.0027d) <= 9.999999747378752E-5d && Math.abs(location.m78833x() + 0.01d) <= 0.009999999776482582d;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m192583g(Task task) {
        try {
            Location location = this.f175475f;
            if (location != null) {
                hfw.m130790a("IntlLocationUpdateProvider", String.format("location update FusedLocationProviderClient requestLocationUpdates succeed provider: %s", location.m78834y()));
            }
            if (this.f175475f == null) {
                hfw.m130790a("IntlLocationUpdateProvider", "location update lastLocation == null,FusedLocationProviderClient requestLocationUpdates failed");
            }
        } catch (Throwable th) {
            hfw.m130790a("IntlLocationUpdateProvider", String.format("location update lastLocation == null,FusedLocationProviderClient requestLocationUpdates throw exception: %s", th.getMessage()));
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m192584h(Location location, boolean z) {
        Location locationM221515e = this.f175477h.m221515e();
        if (!m192582f(location) && (locationM221515e == null || locationM221515e.m78833x() != location.m78833x() || locationM221515e.m78831u() != location.m78831u() || locationM221515e.m78829s() != location.m78829s() || locationM221515e.m78832w() != location.m78832w())) {
            this.f175477h.onNext(location);
        }
        if (z) {
            m192590n();
        }
    }

    /* JADX INFO: renamed from: i */
    public C22306c<Location> m192585i() {
        return this.f175477h.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: j */
    public void m192586j(final Location location, final boolean z) {
        if (location == null) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.t9o
            @Override // java.lang.Runnable
            public final void run() {
                this.f169042a.m192584h(location, z);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m192587k() {
        if (e16.m114373a(App.f15369e, "android.permission.ACCESS_FINE_LOCATION") == 0 && e16.m114373a(App.f15369e, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            m192588l(true);
            m192581e();
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* JADX INFO: renamed from: l */
    public void m192588l(boolean z) {
        if (this.f175472c == null) {
            this.f175472c = LocationServices.getFusedLocationProviderClient(App.f15369e);
        }
        if (this.f175471b == null) {
            this.f175471b = LocationRequest.create().setInterval(2000L).setFastestInterval(1000L).setMaxWaitTime(1000L).setPriority(z ? 100 : 104);
        }
        if (this.f175473d == null) {
            HandlerThread handlerThread = new HandlerThread("GoogleLocationUpdateProvider");
            handlerThread.start();
            this.f175473d = handlerThread.getLooper();
        }
        if (this.f175474e == null) {
            this.f175474e = new C20392b();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m192589m() {
        Objects.toString(this.f175476g);
        if (this.f175476g != null) {
            return;
        }
        m192591o();
        m192592p();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: n */
    public void m192590n() {
        m192591o();
        if (NullChecker.m81303a(this.f175476g)) {
            ((LocationManager) App.f15369e.getSystemService("location")).removeUpdates(this.f175476g);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m192591o() {
        if (NullChecker.m81303a(this.f175472c) && NullChecker.m81303a(this.f175474e)) {
            this.f175472c.removeLocationUpdates(this.f175474e);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: p */
    public final void m192592p() {
        if (this.f175476g == null) {
            this.f175476g = new C20391a();
        }
        LocationManager locationManager = (LocationManager) App.f15369e.getSystemService("location");
        try {
            if (locationManager.getAllProviders().contains("gps")) {
                locationManager.requestLocationUpdates("gps", 0L, 0.0f, this.f175476g, this.f175473d);
            }
            if (locationManager.getAllProviders().contains("network")) {
                locationManager.requestLocationUpdates("network", 0L, 0.0f, this.f175476g, this.f175473d);
            }
        } catch (SecurityException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: l.u9o$a */
    public class C20391a implements LocationListener {
        public C20391a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location location) {
            Location location2 = NullChecker.m81303a(location) ? new Location(location) : null;
            if (NullChecker.m81303a(location2)) {
                zvf0.m220369B("e_location_provider", "", vwb.m200311Y("location_provider", location2.m78834y()));
                hfw.m130790a("IntlLocationUpdateProvider", String.format("android system location provider: %s", location2.m78834y()));
            }
            du2.m113670a("[putong-common][location]", "onLocationChanged location = " + location2);
            u9o.this.f175475f = location2;
            u9o.this.m192586j(location2, false);
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
