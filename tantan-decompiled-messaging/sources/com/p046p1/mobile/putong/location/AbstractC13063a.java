package com.p046p1.mobile.putong.location;

import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.bqd0;
import p149l.e16;
import p149l.e51;
import p149l.hpd0;
import p149l.jo0;
import p149l.kpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.location.a */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC13063a {

    /* JADX INFO: renamed from: l */
    public static ArrayList<a> f53962l;

    /* JADX INFO: renamed from: m */
    public static byte[] f53963m;

    /* JADX INFO: renamed from: a */
    public hpd0 f53964a;

    /* JADX INFO: renamed from: b */
    public kpd0 f53965b;

    /* JADX INFO: renamed from: c */
    public kpd0 f53966c;

    /* JADX INFO: renamed from: d */
    public long f53967d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: e */
    public final int f53968e = 300000;

    /* JADX INFO: renamed from: f */
    public final int f53969f = 360000;

    /* JADX INFO: renamed from: g */
    public final int f53970g = ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;

    /* JADX INFO: renamed from: i */
    public long f53972i = 0;

    /* JADX INFO: renamed from: j */
    public C22392a<Location> f53973j = C22392a.m221512b();

    /* JADX INFO: renamed from: k */
    public boolean f53974k = false;

    /* JADX INFO: renamed from: h */
    public b f53971h = new b("TantanLocationProvider.latestLocation_" + mo78798j(), mo78798j(), null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Location f53975a;

        /* JADX INFO: renamed from: b */
        public final float f53976b;

        public a(float f, float f2, float f3) {
            Location location = new Location("");
            this.f53975a = location;
            location.m78825K(f);
            location.m78827M(f2);
            this.f53976b = f3;
        }
    }

    static {
        ArrayList<a> arrayList = new ArrayList<>();
        f53962l = arrayList;
        arrayList.add(new a(35.77231f, 115.03418f, 15000.0f));
        f53962l.add(new a(43.860813f, 125.29292f, 18000.0f));
        f53962l.add(new a(39.654327f, 118.165855f, 10000.0f));
        f53962l.add(new a(29.562088f, 106.55142f, 17000.0f));
        f53962l.add(new a(32.026978f, 118.795395f, 25000.0f));
        f53962l.add(new a(26.553848f, 106.70825f, 20000.0f));
        f53963m = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    /* JADX INFO: renamed from: e */
    public static String m78855e(String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 0);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f53963m);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArrDecode));
    }

    /* JADX INFO: renamed from: f */
    public static double m78856f(double d, double d2, double d3, double d4, double d5, double d6) {
        double radians = Math.toRadians(d2 - d);
        double d7 = radians / 2.0d;
        double radians2 = Math.toRadians(d4 - d3) / 2.0d;
        double dSin = (Math.sin(d7) * Math.sin(d7)) + (Math.cos(Math.toRadians(d)) * Math.cos(Math.toRadians(d2)) * Math.sin(radians2) * Math.sin(radians2));
        return Math.sqrt(Math.pow(Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d * 6371.0d * 1000.0d, 2.0d) + Math.pow(d5 - d6, 2.0d));
    }

    /* JADX INFO: renamed from: h */
    public static String m78857h(String str, String str2) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f53963m);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
    }

    /* JADX INFO: renamed from: A */
    public void mo78793A(boolean z) {
        this.f53967d = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo78794B();

    /* JADX INFO: renamed from: g */
    public abstract void mo78797g();

    /* JADX INFO: renamed from: i */
    public final Location m78858i(LocationManager locationManager, String str) {
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        final Location location = NullChecker.m81303a(lastKnownLocation) ? new Location(lastKnownLocation) : null;
        if (NullChecker.m81303a(location) && !m78859k(location)) {
            e51.m114742G(new Runnable() { // from class: l.f6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96128a.m78860l(location);
                }
            });
        }
        return location;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo78798j();

    /* JADX INFO: renamed from: k */
    public boolean m78859k(Location location) {
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

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m78860l(Location location) {
        if (NullChecker.m81303a(this.f53973j.m221515e())) {
            m78867s(location, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m78861m(LocationManager locationManager) {
        if (m78858i(locationManager, "network") == null && m78858i(locationManager, "gps") == null) {
            m78858i(locationManager, "passive");
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m78862n(Location location, boolean z) {
        Location locationM221515e = this.f53973j.m221515e();
        if (!m78859k(location) && (locationM221515e == null || locationM221515e.m78833x() != location.m78833x() || locationM221515e.m78831u() != location.m78831u() || locationM221515e.m78829s() != location.m78829s() || locationM221515e.m78832w() != location.m78832w())) {
            this.f53973j.onNext(location);
            this.f53971h.put(location);
            for (a aVar : f53962l) {
                if (aVar.f53975a.m78828r(location) < aVar.f53976b) {
                    this.f53974k = true;
                }
            }
            this.f53972i = System.currentTimeMillis();
        }
        if (z) {
            mo78794B();
        }
    }

    /* JADX INFO: renamed from: p */
    public C22306c<Location> m78864p() {
        return this.f53973j.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: q */
    public Location m78865q() {
        return this.f53973j.m221515e();
    }

    /* JADX INFO: renamed from: r */
    public void m78866r() {
        Location location;
        final LocationManager locationManager;
        if (this.f53973j.m221515e() == null) {
            location = this.f53971h.get();
            if (NullChecker.m81303a(location)) {
                m78867s(location, false);
            }
        } else {
            location = null;
        }
        if (m78859k(location) && this.f53973j.m221515e() == null && (locationManager = (LocationManager) App.f15369e.getSystemService("location")) != null) {
            e51.m114774y(new Runnable() { // from class: l.e6i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89584a.m78861m(locationManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public void m78867s(final Location location, final boolean z) {
        if (location == null) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.g6i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101266a.m78862n(location, z);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m78868t() {
        m78871w(false);
    }

    /* JADX INFO: renamed from: u */
    public void m78869u(long j) {
        m78870v(j, false);
    }

    /* JADX INFO: renamed from: v */
    public void m78870v(long j, boolean z) {
        if (this.f53972i + j < System.currentTimeMillis()) {
            m78871w(z);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m78871w(final boolean z) {
        e51.m114774y(new Runnable() { // from class: l.d6i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f84626a.m78863o(z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public void m78872x() {
        Location locationM221515e = this.f53973j.m221515e();
        if (locationM221515e == null || locationM221515e.m78829s() > 200.0f || System.currentTimeMillis() - locationM221515e.m78835z() > 3600000) {
            m78868t();
        }
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m78863o(boolean z) {
        if (e16.m114373a(App.f15369e, "android.permission.ACCESS_FINE_LOCATION") == 0 && e16.m114373a(App.f15369e, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            mo78793A(z);
            this.f53972i = System.currentTimeMillis();
            mo78797g();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m78874z() {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.a$b */
    public static class b extends bqd0<Location> {

        /* JADX INFO: renamed from: a */
        public String f53977a;

        /* JADX INFO: renamed from: b */
        public String f53978b;

        public b(String str, Location location) {
            super(str, location);
            this.f53977a = "tantanlt";
            this.f53978b = "tantan";
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull Location location, Location location2) {
            return location.m78831u() == location2.m78831u() && location.m78833x() == location2.m78833x();
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Location copyed(Location location, @NonNull Location location2) {
            if (location == null) {
                location = new Location(this.f53978b);
            }
            location.m78825K(location2.m78831u());
            location.m78827M(location2.m78833x());
            location.m78824J(location2.m78829s());
            location.m78826L(location2.m78832w());
            return location;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Location retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            if (string == null) {
                return (Location) this.defaultValue;
            }
            if (!string.contains(Constants.SEPARATOR_COMMA)) {
                try {
                    string = AbstractC13063a.m78855e(string, this.f53977a);
                } catch (Exception unused) {
                }
            }
            String[] strArrSplit = string.split(Constants.SEPARATOR_COMMA);
            if (strArrSplit.length != 3) {
                return (Location) this.defaultValue;
            }
            try {
                double d = Double.parseDouble(strArrSplit[0]);
                double d2 = Double.parseDouble(strArrSplit[1]);
                float f = Float.parseFloat(strArrSplit[2]);
                Location location = new Location(this.f53978b);
                location.m78825K(d);
                location.m78827M(d2);
                location.m78824J(f);
                location.m78826L(0);
                location.toString();
                return location;
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
                return (Location) this.defaultValue;
            }
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Location location) {
            String strM78857h;
            try {
                strM78857h = AbstractC13063a.m78857h(location.m78831u() + Constants.SEPARATOR_COMMA + location.m78833x() + Constants.SEPARATOR_COMMA + location.m78829s(), this.f53977a);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                strM78857h = location.m78831u() + Constants.SEPARATOR_COMMA + location.m78833x() + Constants.SEPARATOR_COMMA + location.m78829s();
            }
            return pref().edit().putString(this.f98687id, strM78857h);
        }

        public b(String str, String str2, Location location) {
            super(str, location);
            this.f53977a = "tantanlt";
            this.f53978b = str2;
        }
    }
}
