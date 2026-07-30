package com.p046p1.mobile.putong.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p133rx.subjects.C22392a;
import p149l.du2;
import p149l.hfw;
import p149l.vwb;
import p149l.w85;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlLocationProvider extends AbstractC13063a {

    /* JADX INFO: renamed from: t */
    public static C22392a<GoogleLocationDialogStatus> f53946t = C22392a.m221512b();

    /* JADX INFO: renamed from: n */
    public LocationRequest f53947n;

    /* JADX INFO: renamed from: o */
    public FusedLocationProviderClient f53948o;

    /* JADX INFO: renamed from: p */
    public Looper f53949p;

    /* JADX INFO: renamed from: q */
    public LocationCallback f53950q;

    /* JADX INFO: renamed from: r */
    public Location f53951r;

    /* JADX INFO: renamed from: s */
    public LocationListener f53952s;

    public enum GoogleLocationDialogStatus {
        SHOWING,
        HIDDEN
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.IntlLocationProvider$a */
    public class C13058a implements LocationListener {
        public C13058a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            Location location2;
            if (NullChecker.m81303a(location)) {
                w85.INSTANCE.m202148q(location);
                location2 = new Location(location);
            } else {
                location2 = null;
            }
            if (NullChecker.m81303a(location2)) {
                zvf0.m220369B("e_location_provider", "", vwb.m200311Y("location_provider", location2.m78834y()));
                hfw.m130790a("LocationProvider", String.format("android system location provider: %s", location2.m78834y()));
            }
            du2.m113670a("[putong-common][location]", "onLocationChanged location = " + location2);
            IntlLocationProvider.this.f53951r = location2;
            IntlLocationProvider.this.m78867s(location2, true);
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
    public class C13059b extends LocationCallback {
        public C13059b() {
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            Location lastLocation = locationResult.getLastLocation();
            if (NullChecker.m81303a(lastLocation)) {
                w85.INSTANCE.m202148q(lastLocation);
                IntlLocationProvider.this.f53951r = new Location(lastLocation);
            } else {
                IntlLocationProvider.this.f53951r = null;
            }
            if (NullChecker.m81303a(IntlLocationProvider.this.f53951r)) {
                IntlLocationProvider intlLocationProvider = IntlLocationProvider.this;
                intlLocationProvider.m78867s(intlLocationProvider.f53951r, true);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.location.AbstractC13063a
    /* JADX INFO: renamed from: A */
    public void mo78793A(boolean z) {
        super.mo78793A(z);
        if (this.f53948o == null) {
            this.f53948o = LocationServices.getFusedLocationProviderClient(App.f15369e);
        }
        if (this.f53947n == null) {
            this.f53947n = LocationRequest.create().setInterval(Constants.INBOX_V2_THROTTLE_WINDOW_MS).setFastestInterval(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).setMaxWaitTime(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).setPriority(z ? 100 : 104);
        }
        if (this.f53949p == null) {
            HandlerThread handlerThread = new HandlerThread("GoogleLocationProvider");
            handlerThread.start();
            this.f53949p = handlerThread.getLooper();
        }
        if (this.f53950q == null) {
            this.f53950q = new C13059b();
        }
        m78866r();
    }

    @Override // com.p046p1.mobile.putong.location.AbstractC13063a
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: B */
    public void mo78794B() {
        if (NullChecker.m81303a(this.f53948o) && NullChecker.m81303a(this.f53950q)) {
            this.f53948o.removeLocationUpdates(this.f53950q);
        }
        if (NullChecker.m81303a(this.f53952s)) {
            ((LocationManager) App.f15369e.getSystemService("location")).removeUpdates(this.f53952s);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m78795F(Task task) {
        try {
            Location location = this.f53951r;
            if (location != null) {
                hfw.m130790a("LocationProvider", String.format("FusedLocationProviderClient requestLocationUpdates succeed provider: %s", location.m78834y()));
            }
            if (this.f53951r == null) {
                hfw.m130790a("LocationProvider", String.format("lastLocation == null,FusedLocationProviderClient requestLocationUpdates failed", new Object[0]));
                m78796G();
            }
        } catch (Throwable th) {
            hfw.m130790a("LocationProvider", String.format("lastLocation == null,FusedLocationProviderClient requestLocationUpdates throw exception: %s", th.getMessage()));
            CrashHelper.m81296c(th);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: G */
    public final void m78796G() {
        if (this.f53952s == null) {
            this.f53952s = new C13058a();
        }
        LocationManager locationManager = (LocationManager) App.f15369e.getSystemService("location");
        try {
            if (locationManager.getAllProviders().contains("gps")) {
                locationManager.requestLocationUpdates("gps", Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, 10.0f, this.f53952s, this.f53949p);
            }
            if (locationManager.getAllProviders().contains("network")) {
                locationManager.requestLocationUpdates("network", Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, 10.0f, this.f53952s, this.f53949p);
            }
        } catch (SecurityException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // com.p046p1.mobile.putong.location.AbstractC13063a
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: g */
    public void mo78797g() {
        this.f53951r = null;
        this.f53948o.requestLocationUpdates(this.f53947n, this.f53950q, this.f53949p).addOnCompleteListener(new OnCompleteListener() { // from class: l.r9o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f158422a.m78795F(task);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.location.AbstractC13063a
    /* JADX INFO: renamed from: j */
    public String mo78798j() {
        return "intl";
    }
}
