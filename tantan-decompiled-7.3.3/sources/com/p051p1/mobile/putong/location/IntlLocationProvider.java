package com.p051p1.mobile.putong.location;

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
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p137rx.subjects.C22507a;
import p153l.fhw;
import p153l.i4g0;
import p153l.jyb;
import p153l.tu2;
import p153l.x95;

/* JADX INFO: loaded from: classes10.dex */
public class IntlLocationProvider extends AbstractC13226a {

    /* JADX INFO: renamed from: t */
    public static C22507a<GoogleLocationDialogStatus> f54794t = C22507a.m222758b();

    /* JADX INFO: renamed from: n */
    public LocationRequest f54795n;

    /* JADX INFO: renamed from: o */
    public FusedLocationProviderClient f54796o;

    /* JADX INFO: renamed from: p */
    public Looper f54797p;

    /* JADX INFO: renamed from: q */
    public LocationCallback f54798q;

    /* JADX INFO: renamed from: r */
    public Location f54799r;

    /* JADX INFO: renamed from: s */
    public LocationListener f54800s;

    public enum GoogleLocationDialogStatus {
        SHOWING,
        HIDDEN
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.IntlLocationProvider$a */
    public class C13221a implements LocationListener {
        public C13221a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            Location location2;
            if (NullChecker.m82486a(location)) {
                x95.INSTANCE.m209796q(location);
                location2 = new Location(location);
            } else {
                location2 = null;
            }
            if (NullChecker.m82486a(location2)) {
                i4g0.m138493B("e_location_provider", "", jyb.m147494Y("location_provider", location2.m80017y()));
                fhw.m125605a("LocationProvider", String.format("android system location provider: %s", location2.m80017y()));
            }
            tu2.m192703a("[putong-common][location]", "onLocationChanged location = " + location2);
            IntlLocationProvider.this.f54799r = location2;
            IntlLocationProvider.this.m80050s(location2, true);
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
    public class C13222b extends LocationCallback {
        public C13222b() {
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            Location lastLocation = locationResult.getLastLocation();
            if (NullChecker.m82486a(lastLocation)) {
                x95.INSTANCE.m209796q(lastLocation);
                IntlLocationProvider.this.f54799r = new Location(lastLocation);
            } else {
                IntlLocationProvider.this.f54799r = null;
            }
            if (NullChecker.m82486a(IntlLocationProvider.this.f54799r)) {
                IntlLocationProvider intlLocationProvider = IntlLocationProvider.this;
                intlLocationProvider.m80050s(intlLocationProvider.f54799r, true);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.location.AbstractC13226a
    /* JADX INFO: renamed from: A */
    public void mo79976A(boolean z) {
        super.mo79976A(z);
        if (this.f54796o == null) {
            this.f54796o = LocationServices.getFusedLocationProviderClient(App.f16088e);
        }
        if (this.f54795n == null) {
            this.f54795n = LocationRequest.create().setInterval(Constants.INBOX_V2_THROTTLE_WINDOW_MS).setFastestInterval(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).setMaxWaitTime(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).setPriority(z ? 100 : 104);
        }
        if (this.f54797p == null) {
            HandlerThread handlerThread = new HandlerThread("GoogleLocationProvider");
            handlerThread.start();
            this.f54797p = handlerThread.getLooper();
        }
        if (this.f54798q == null) {
            this.f54798q = new C13222b();
        }
        m80049r();
    }

    @Override // com.p051p1.mobile.putong.location.AbstractC13226a
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: B */
    public void mo79977B() {
        if (NullChecker.m82486a(this.f54796o) && NullChecker.m82486a(this.f54798q)) {
            this.f54796o.removeLocationUpdates(this.f54798q);
        }
        if (NullChecker.m82486a(this.f54800s)) {
            ((LocationManager) App.f16088e.getSystemService("location")).removeUpdates(this.f54800s);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m79978F(Task task) {
        try {
            Location location = this.f54799r;
            if (location != null) {
                fhw.m125605a("LocationProvider", String.format("FusedLocationProviderClient requestLocationUpdates succeed provider: %s", location.m80017y()));
            }
            if (this.f54799r == null) {
                fhw.m125605a("LocationProvider", String.format("lastLocation == null,FusedLocationProviderClient requestLocationUpdates failed", new Object[0]));
                m79979G();
            }
        } catch (Throwable th) {
            fhw.m125605a("LocationProvider", String.format("lastLocation == null,FusedLocationProviderClient requestLocationUpdates throw exception: %s", th.getMessage()));
            CrashHelper.m82479c(th);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: G */
    public final void m79979G() {
        if (this.f54800s == null) {
            this.f54800s = new C13221a();
        }
        LocationManager locationManager = (LocationManager) App.f16088e.getSystemService("location");
        try {
            if (locationManager.getAllProviders().contains("gps")) {
                locationManager.requestLocationUpdates("gps", Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, 10.0f, this.f54800s, this.f54797p);
            }
            if (locationManager.getAllProviders().contains("network")) {
                locationManager.requestLocationUpdates("network", Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, 10.0f, this.f54800s, this.f54797p);
            }
        } catch (SecurityException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // com.p051p1.mobile.putong.location.AbstractC13226a
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: g */
    public void mo79980g() {
        this.f54799r = null;
        this.f54796o.requestLocationUpdates(this.f54795n, this.f54798q, this.f54797p).addOnCompleteListener(new OnCompleteListener() { // from class: l.rbo
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f162033a.m79978F(task);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.location.AbstractC13226a
    /* JADX INFO: renamed from: j */
    public String mo79981j() {
        return "intl";
    }
}
