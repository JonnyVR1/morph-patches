package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class nmj0 {

    /* JADX INFO: renamed from: d */
    public static nmj0 f142713d;

    /* JADX INFO: renamed from: a */
    public final Context f142714a;

    /* JADX INFO: renamed from: b */
    public final LocationManager f142715b;

    /* JADX INFO: renamed from: c */
    public final C18903a f142716c = new C18903a();

    /* JADX INFO: renamed from: l.nmj0$a */
    public static class C18903a {

        /* JADX INFO: renamed from: a */
        public boolean f142717a;

        /* JADX INFO: renamed from: b */
        public long f142718b;

        /* JADX INFO: renamed from: c */
        public long f142719c;

        /* JADX INFO: renamed from: d */
        public long f142720d;

        /* JADX INFO: renamed from: e */
        public long f142721e;

        /* JADX INFO: renamed from: f */
        public long f142722f;
    }

    @VisibleForTesting
    public nmj0(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f142714a = context;
        this.f142715b = locationManager;
    }

    /* JADX INFO: renamed from: a */
    public static nmj0 m163821a(@NonNull Context context) {
        if (f142713d == null) {
            Context applicationContext = context.getApplicationContext();
            f142713d = new nmj0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f142713d;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public final Location m163822b() {
        Location locationM163823c = sr60.m187592b(this.f142714a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m163823c("network") : null;
        Location locationM163823c2 = sr60.m187592b(this.f142714a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m163823c("gps") : null;
        if (locationM163823c2 == null || locationM163823c == null) {
            return locationM163823c2 != null ? locationM163823c2 : locationM163823c;
        }
        return locationM163823c2.getTime() > locationM163823c.getTime() ? locationM163823c2 : locationM163823c;
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: c */
    public final Location m163823c(String str) {
        try {
            if (this.f142715b.isProviderEnabled(str)) {
                return this.f142715b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m163824d() {
        C18903a c18903a = this.f142716c;
        if (m163825e()) {
            return c18903a.f142717a;
        }
        Location locationM163822b = m163822b();
        if (locationM163822b != null) {
            m163826f(locationM163822b);
            return c18903a.f142717a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m163825e() {
        return this.f142716c.f142722f > System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: f */
    public final void m163826f(@NonNull Location location) {
        long j;
        long j2;
        C18903a c18903a = this.f142716c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        mmj0 mmj0VarM159072b = mmj0.m159072b();
        mmj0VarM159072b.m159073a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = mmj0VarM159072b.f137600a;
        mmj0VarM159072b.m159073a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = mmj0VarM159072b.f137602c == 1;
        long j4 = mmj0VarM159072b.f137601b;
        long j5 = mmj0VarM159072b.f137600a;
        mmj0VarM159072b.m159073a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j6 = mmj0VarM159072b.f137601b;
        if (j4 == -1 || j5 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            if (jCurrentTimeMillis > j5) {
                j2 = j6;
            } else {
                j2 = jCurrentTimeMillis > j4 ? j5 : j4;
            }
            j = j2 + Constants.ONE_MIN_IN_MILLIS;
        }
        c18903a.f142717a = z;
        c18903a.f142718b = j3;
        c18903a.f142719c = j4;
        c18903a.f142720d = j5;
        c18903a.f142721e = j6;
        c18903a.f142722f = j;
    }
}
