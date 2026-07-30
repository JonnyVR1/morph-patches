package p149l;

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
public class jdj0 {

    /* JADX INFO: renamed from: d */
    public static jdj0 f117390d;

    /* JADX INFO: renamed from: a */
    public final Context f117391a;

    /* JADX INFO: renamed from: b */
    public final LocationManager f117392b;

    /* JADX INFO: renamed from: c */
    public final C17750a f117393c = new C17750a();

    /* JADX INFO: renamed from: l.jdj0$a */
    public static class C17750a {

        /* JADX INFO: renamed from: a */
        public boolean f117394a;

        /* JADX INFO: renamed from: b */
        public long f117395b;

        /* JADX INFO: renamed from: c */
        public long f117396c;

        /* JADX INFO: renamed from: d */
        public long f117397d;

        /* JADX INFO: renamed from: e */
        public long f117398e;

        /* JADX INFO: renamed from: f */
        public long f117399f;
    }

    @VisibleForTesting
    public jdj0(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f117391a = context;
        this.f117392b = locationManager;
    }

    /* JADX INFO: renamed from: a */
    public static jdj0 m141030a(@NonNull Context context) {
        if (f117390d == null) {
            Context applicationContext = context.getApplicationContext();
            f117390d = new jdj0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f117390d;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public final Location m141031b() {
        Location locationM141032c = nj60.m159646b(this.f117391a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m141032c("network") : null;
        Location locationM141032c2 = nj60.m159646b(this.f117391a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m141032c("gps") : null;
        if (locationM141032c2 == null || locationM141032c == null) {
            return locationM141032c2 != null ? locationM141032c2 : locationM141032c;
        }
        return locationM141032c2.getTime() > locationM141032c.getTime() ? locationM141032c2 : locationM141032c;
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: c */
    public final Location m141032c(String str) {
        try {
            if (this.f117392b.isProviderEnabled(str)) {
                return this.f117392b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m141033d() {
        C17750a c17750a = this.f117393c;
        if (m141034e()) {
            return c17750a.f117394a;
        }
        Location locationM141031b = m141031b();
        if (locationM141031b != null) {
            m141035f(locationM141031b);
            return c17750a.f117394a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m141034e() {
        return this.f117393c.f117399f > System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: f */
    public final void m141035f(@NonNull Location location) {
        long j;
        long j2;
        C17750a c17750a = this.f117393c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        idj0 idj0VarM135461b = idj0.m135461b();
        idj0VarM135461b.m135462a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = idj0VarM135461b.f112564a;
        idj0VarM135461b.m135462a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = idj0VarM135461b.f112566c == 1;
        long j4 = idj0VarM135461b.f112565b;
        long j5 = idj0VarM135461b.f112564a;
        idj0VarM135461b.m135462a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j6 = idj0VarM135461b.f112565b;
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
        c17750a.f117394a = z;
        c17750a.f117395b = j3;
        c17750a.f117396c = j4;
        c17750a.f117397d = j5;
        c17750a.f117398e = j6;
        c17750a.f117399f = j;
    }
}
