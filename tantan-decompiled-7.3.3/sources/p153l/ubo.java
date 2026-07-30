package p153l;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public class ubo {

    /* JADX INFO: renamed from: b */
    public LocationRequest f178317b;

    /* JADX INFO: renamed from: c */
    public FusedLocationProviderClient f178318c;

    /* JADX INFO: renamed from: d */
    public Looper f178319d;

    /* JADX INFO: renamed from: e */
    public LocationCallback f178320e;

    /* JADX INFO: renamed from: f */
    public Location f178321f;

    /* JADX INFO: renamed from: g */
    public LocationListener f178322g;

    /* JADX INFO: renamed from: a */
    public final String f178316a = "IntlLocationUpdateProvider";

    /* JADX INFO: renamed from: h */
    public C22507a<Location> f178323h = C22507a.m222758b();

    /* JADX INFO: renamed from: l.ubo$b */
    public class C20537b extends LocationCallback {
        public C20537b() {
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            android.location.Location lastLocation = locationResult.getLastLocation();
            Objects.toString(lastLocation);
            boolean zM82486a = NullChecker.m82486a(lastLocation);
            ubo uboVar = ubo.this;
            if (zM82486a) {
                uboVar.f178321f = new Location(lastLocation);
            } else {
                uboVar.f178321f = null;
            }
            if (NullChecker.m82486a(ubo.this.f178321f)) {
                ubo uboVar2 = ubo.this;
                uboVar2.m195254j(uboVar2.f178321f, false);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e */
    public void m195249e() {
        this.f178321f = null;
        this.f178318c.requestLocationUpdates(this.f178317b, this.f178320e, this.f178319d).addOnCompleteListener(new OnCompleteListener() { // from class: l.sbo
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f167166a.m195251g(task);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public boolean m195250f(Location location) {
        if (location == null) {
            return true;
        }
        if (location.m80014u() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && location.m80016x() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return true;
        }
        if (location.m80014u() == 1.0d && location.m80016x() == 1.0d) {
            return true;
        }
        if (location.m80014u() == 30.0d && location.m80016x() == 104.0d) {
            return true;
        }
        if (Math.abs(location.m80014u() + 0.003d) > 0.0010000000474974513d || Math.abs(location.m80016x() + 0.01d) > 0.009999999776482582d) {
            return Math.abs(location.m80014u() + 0.0027d) <= 9.999999747378752E-5d && Math.abs(location.m80016x() + 0.01d) <= 0.009999999776482582d;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m195251g(Task task) {
        try {
            Location location = this.f178321f;
            if (location != null) {
                fhw.m125605a("IntlLocationUpdateProvider", String.format("location update FusedLocationProviderClient requestLocationUpdates succeed provider: %s", location.m80017y()));
            }
            if (this.f178321f == null) {
                fhw.m125605a("IntlLocationUpdateProvider", "location update lastLocation == null,FusedLocationProviderClient requestLocationUpdates failed");
            }
        } catch (Throwable th) {
            fhw.m125605a("IntlLocationUpdateProvider", String.format("location update lastLocation == null,FusedLocationProviderClient requestLocationUpdates throw exception: %s", th.getMessage()));
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m195252h(Location location, boolean z) {
        Location locationM222761e = this.f178323h.m222761e();
        if (!m195250f(location) && (locationM222761e == null || locationM222761e.m80016x() != location.m80016x() || locationM222761e.m80014u() != location.m80014u() || locationM222761e.m80012s() != location.m80012s() || locationM222761e.m80015w() != location.m80015w())) {
            this.f178323h.onNext(location);
        }
        if (z) {
            m195258n();
        }
    }

    /* JADX INFO: renamed from: i */
    public C22421c<Location> m195253i() {
        return this.f178323h.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: j */
    public void m195254j(final Location location, final boolean z) {
        if (location == null) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.tbo
            @Override // java.lang.Runnable
            public final void run() {
                this.f172974a.m195252h(location, z);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m195255k() {
        if (j26.m143188a(App.f16088e, "android.permission.ACCESS_FINE_LOCATION") == 0 && j26.m143188a(App.f16088e, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            m195256l(true);
            m195249e();
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* JADX INFO: renamed from: l */
    public void m195256l(boolean z) {
        if (this.f178318c == null) {
            this.f178318c = LocationServices.getFusedLocationProviderClient(App.f16088e);
        }
        if (this.f178317b == null) {
            this.f178317b = LocationRequest.create().setInterval(2000L).setFastestInterval(1000L).setMaxWaitTime(1000L).setPriority(z ? 100 : 104);
        }
        if (this.f178319d == null) {
            HandlerThread handlerThread = new HandlerThread("GoogleLocationUpdateProvider");
            handlerThread.start();
            this.f178319d = handlerThread.getLooper();
        }
        if (this.f178320e == null) {
            this.f178320e = new C20537b();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m195257m() {
        Objects.toString(this.f178322g);
        if (this.f178322g != null) {
            return;
        }
        m195259o();
        m195260p();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: n */
    public void m195258n() {
        m195259o();
        if (NullChecker.m82486a(this.f178322g)) {
            ((LocationManager) App.f16088e.getSystemService("location")).removeUpdates(this.f178322g);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m195259o() {
        if (NullChecker.m82486a(this.f178318c) && NullChecker.m82486a(this.f178320e)) {
            this.f178318c.removeLocationUpdates(this.f178320e);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: p */
    public final void m195260p() {
        if (this.f178322g == null) {
            this.f178322g = new C20536a();
        }
        LocationManager locationManager = (LocationManager) App.f16088e.getSystemService("location");
        try {
            if (locationManager.getAllProviders().contains("gps")) {
                locationManager.requestLocationUpdates("gps", 0L, 0.0f, this.f178322g, this.f178319d);
            }
            if (locationManager.getAllProviders().contains("network")) {
                locationManager.requestLocationUpdates("network", 0L, 0.0f, this.f178322g, this.f178319d);
            }
        } catch (SecurityException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: l.ubo$a */
    public class C20536a implements LocationListener {
        public C20536a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location location) {
            Location location2 = NullChecker.m82486a(location) ? new Location(location) : null;
            if (NullChecker.m82486a(location2)) {
                i4g0.m138493B("e_location_provider", "", jyb.m147494Y("location_provider", location2.m80017y()));
                fhw.m125605a("IntlLocationUpdateProvider", String.format("android system location provider: %s", location2.m80017y()));
            }
            tu2.m192703a("[putong-common][location]", "onLocationChanged location = " + location2);
            ubo.this.f178321f = location2;
            ubo.this.m195254j(location2, false);
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
