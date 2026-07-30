package com.p000p1.mobile.putong.location;

import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l.bqd0;
import l.e16;
import l.e51;
import l.fpd0;
import l.hpd0;
import l.jo0;
import l.kpd0;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.location.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class AbstractC0465a {

    /* JADX INFO: renamed from: l */
    public static ArrayList<a> f7568l;

    /* JADX INFO: renamed from: m */
    public static byte[] f7569m;

    /* JADX INFO: renamed from: a */
    public hpd0 f7570a;

    /* JADX INFO: renamed from: b */
    public kpd0 f7571b;

    /* JADX INFO: renamed from: c */
    public kpd0 f7572c;

    /* JADX INFO: renamed from: d */
    public long f7573d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: e */
    public final int f7574e = 300000;

    /* JADX INFO: renamed from: f */
    public final int f7575f = 360000;

    /* JADX INFO: renamed from: g */
    public final int f7576g = 20000;

    /* JADX INFO: renamed from: i */
    public long f7578i = 0;

    /* JADX INFO: renamed from: j */
    public rx.subjects.a<Location> f7579j = rx.subjects.a.b();

    /* JADX INFO: renamed from: k */
    public boolean f7580k = false;

    /* JADX INFO: renamed from: h */
    public b f7577h = new b("TantanLocationProvider.latestLocation_" + mo9093j(), mo9093j(), null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Location f7581a;

        /* JADX INFO: renamed from: b */
        public final float f7582b;

        public a(float f, float f2, float f3) {
            Location location = new Location("");
            this.f7581a = location;
            location.m9120K(f);
            location.m9122M(f2);
            this.f7582b = f3;
        }
    }

    static {
        ArrayList<a> arrayList = new ArrayList<>();
        f7568l = arrayList;
        arrayList.add(new a(35.77231f, 115.03418f, 15000.0f));
        f7568l.add(new a(43.860813f, 125.29292f, 18000.0f));
        f7568l.add(new a(39.654327f, 118.165855f, 10000.0f));
        f7568l.add(new a(29.562088f, 106.55142f, 17000.0f));
        f7568l.add(new a(32.026978f, 118.795395f, 25000.0f));
        f7568l.add(new a(26.553848f, 106.70825f, 20000.0f));
        f7569m = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    /* JADX INFO: renamed from: e */
    public static String m9150e(String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 0);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f7569m);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArrDecode));
    }

    /* JADX INFO: renamed from: f */
    public static double m9151f(double d, double d2, double d3, double d4, double d5, double d6) {
        double radians = Math.toRadians(d2 - d);
        double d7 = radians / 2.0d;
        double radians2 = Math.toRadians(d4 - d3) / 2.0d;
        double dSin = (Math.sin(d7) * Math.sin(d7)) + (Math.cos(Math.toRadians(d)) * Math.cos(Math.toRadians(d2)) * Math.sin(radians2) * Math.sin(radians2));
        return Math.sqrt(Math.pow(Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d * 6371.0d * 1000.0d, 2.0d) + Math.pow(d5 - d6, 2.0d));
    }

    /* JADX INFO: renamed from: h */
    public static String m9152h(String str, String str2) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f7569m);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
    }

    /* JADX INFO: renamed from: A */
    public void mo9088A(boolean z) {
        this.f7573d = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo9089B();

    /* JADX INFO: renamed from: g */
    public abstract void mo9092g();

    /* JADX INFO: renamed from: i */
    public final Location m9153i(LocationManager locationManager, String str) {
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        final Location location = NullChecker.a(lastKnownLocation) ? new Location(lastKnownLocation) : null;
        if (NullChecker.a(location) && !m9154k(location)) {
            e51.G(new Runnable() { // from class: l.f6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12837a.m9155l(location);
                }
            });
        }
        return location;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo9093j();

    /* JADX INFO: renamed from: k */
    public boolean m9154k(Location location) {
        if (location == null) {
            return true;
        }
        if (location.m9126u() == 0.0d && location.m9128x() == 0.0d) {
            return true;
        }
        if (location.m9126u() == 1.0d && location.m9128x() == 1.0d) {
            return true;
        }
        if (location.m9126u() == 30.0d && location.m9128x() == 104.0d) {
            return true;
        }
        if (Math.abs(location.m9126u() + 0.003d) > 0.0010000000474974513d || Math.abs(location.m9128x() + 0.01d) > 0.009999999776482582d) {
            return Math.abs(location.m9126u() + 0.0027d) <= 9.999999747378752E-5d && Math.abs(location.m9128x() + 0.01d) <= 0.009999999776482582d;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9155l(Location location) {
        if (NullChecker.a(this.f7579j.e())) {
            m9162s(location, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m9156m(LocationManager locationManager) {
        if (m9153i(locationManager, "network") == null && m9153i(locationManager, "gps") == null) {
            m9153i(locationManager, "passive");
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m9157n(Location location, boolean z) {
        Location location2 = (Location) this.f7579j.e();
        if (!m9154k(location) && (location2 == null || location2.m9128x() != location.m9128x() || location2.m9126u() != location.m9126u() || location2.m9124s() != location.m9124s() || location2.m9127w() != location.m9127w())) {
            this.f7579j.onNext(location);
            this.f7577h.put(location);
            for (a aVar : f7568l) {
                if (aVar.f7581a.m9123r(location) < aVar.f7582b) {
                    this.f7580k = true;
                }
            }
            this.f7578i = System.currentTimeMillis();
        }
        if (z) {
            mo9089B();
        }
    }

    /* JADX INFO: renamed from: p */
    public c<Location> m9159p() {
        return this.f7579j.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: q */
    public Location m9160q() {
        return (Location) this.f7579j.e();
    }

    /* JADX INFO: renamed from: r */
    public void m9161r() {
        Location location;
        final LocationManager locationManager;
        if (this.f7579j.e() == null) {
            location = (Location) this.f7577h.get();
            if (NullChecker.a(location)) {
                m9162s(location, false);
            }
        } else {
            location = null;
        }
        if (m9154k(location) && this.f7579j.e() == null && (locationManager = (LocationManager) App.e.getSystemService("location")) != null) {
            e51.y(new Runnable() { // from class: l.e6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12390a.m9156m(locationManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public void m9162s(final Location location, final boolean z) {
        if (location == null) {
            return;
        }
        e51.M(new Runnable() { // from class: l.g6i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13325a.m9157n(location, z);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m9163t() {
        m9166w(false);
    }

    /* JADX INFO: renamed from: u */
    public void m9164u(long j) {
        m9165v(j, false);
    }

    /* JADX INFO: renamed from: v */
    public void m9165v(long j, boolean z) {
        if (this.f7578i + j < System.currentTimeMillis()) {
            m9166w(z);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m9166w(final boolean z) {
        e51.y(new Runnable() { // from class: l.d6i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11649a.m9158o(z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public void m9167x() {
        Location location = (Location) this.f7579j.e();
        if (location == null || location.m9124s() > 200.0f || System.currentTimeMillis() - location.m9130z() > 3600000) {
            m9163t();
        }
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m9158o(boolean z) {
        if (e16.a(App.e, "android.permission.ACCESS_FINE_LOCATION") == 0 && e16.a(App.e, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            mo9088A(z);
            this.f7578i = System.currentTimeMillis();
            mo9092g();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m9169z() {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.a$b */
    public static class b extends bqd0<Location> {

        /* JADX INFO: renamed from: a */
        public String f7583a;

        /* JADX INFO: renamed from: b */
        public String f7584b;

        public b(String str, Location location) {
            super(str, location);
            this.f7583a = "tantanlt";
            this.f7584b = "tantan";
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull Location location, Location location2) {
            return location.m9126u() == location2.m9126u() && location.m9128x() == location2.m9128x();
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Location copyed(Location location, @NonNull Location location2) {
            if (location == null) {
                location = new Location(this.f7584b);
            }
            location.m9120K(location2.m9126u());
            location.m9122M(location2.m9128x());
            location.m9119J(location2.m9124s());
            location.m9121L(location2.m9127w());
            return location;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Location retrieveValue() {
            String string = pref().getString(((fpd0) this).id, null);
            if (string == null) {
                return (Location) ((fpd0) this).defaultValue;
            }
            if (!string.contains(",")) {
                try {
                    string = AbstractC0465a.m9150e(string, this.f7583a);
                } catch (Exception unused) {
                }
            }
            String[] strArrSplit = string.split(",");
            if (strArrSplit.length != 3) {
                return (Location) ((fpd0) this).defaultValue;
            }
            try {
                double d = Double.parseDouble(strArrSplit[0]);
                double d2 = Double.parseDouble(strArrSplit[1]);
                float f = Float.parseFloat(strArrSplit[2]);
                Location location = new Location(this.f7584b);
                location.m9120K(d);
                location.m9122M(d2);
                location.m9119J(f);
                location.m9121L(0);
                location.toString();
                return location;
            } catch (Throwable th) {
                CrashHelper.c(th);
                return (Location) ((fpd0) this).defaultValue;
            }
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Location location) {
            String strM9152h;
            try {
                strM9152h = AbstractC0465a.m9152h(location.m9126u() + "," + location.m9128x() + "," + location.m9124s(), this.f7583a);
            } catch (Exception e) {
                CrashHelper.c(e);
                strM9152h = location.m9126u() + "," + location.m9128x() + "," + location.m9124s();
            }
            return pref().edit().putString(((fpd0) this).id, strM9152h);
        }

        public b(String str, String str2, Location location) {
            super(str, location);
            this.f7583a = "tantanlt";
            this.f7584b = str2;
        }
    }
}
