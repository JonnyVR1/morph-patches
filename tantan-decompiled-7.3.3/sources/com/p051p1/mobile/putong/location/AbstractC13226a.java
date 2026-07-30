package com.p051p1.mobile.putong.location;

import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.dyd0;
import p153l.fo0;
import p153l.j26;
import p153l.jxd0;
import p153l.l51;
import p153l.mxd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.location.a */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC13226a {

    /* JADX INFO: renamed from: l */
    public static ArrayList<a> f54810l;

    /* JADX INFO: renamed from: m */
    public static byte[] f54811m;

    /* JADX INFO: renamed from: a */
    public jxd0 f54812a;

    /* JADX INFO: renamed from: b */
    public mxd0 f54813b;

    /* JADX INFO: renamed from: c */
    public mxd0 f54814c;

    /* JADX INFO: renamed from: d */
    public long f54815d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: e */
    public final int f54816e = 300000;

    /* JADX INFO: renamed from: f */
    public final int f54817f = 360000;

    /* JADX INFO: renamed from: g */
    public final int f54818g = ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;

    /* JADX INFO: renamed from: i */
    public long f54820i = 0;

    /* JADX INFO: renamed from: j */
    public C22507a<Location> f54821j = C22507a.m222758b();

    /* JADX INFO: renamed from: k */
    public boolean f54822k = false;

    /* JADX INFO: renamed from: h */
    public b f54819h = new b("TantanLocationProvider.latestLocation_" + mo79981j(), mo79981j(), null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Location f54823a;

        /* JADX INFO: renamed from: b */
        public final float f54824b;

        public a(float f, float f2, float f3) {
            Location location = new Location("");
            this.f54823a = location;
            location.m80008K(f);
            location.m80010M(f2);
            this.f54824b = f3;
        }
    }

    static {
        ArrayList<a> arrayList = new ArrayList<>();
        f54810l = arrayList;
        arrayList.add(new a(35.77231f, 115.03418f, 15000.0f));
        f54810l.add(new a(43.860813f, 125.29292f, 18000.0f));
        f54810l.add(new a(39.654327f, 118.165855f, 10000.0f));
        f54810l.add(new a(29.562088f, 106.55142f, 17000.0f));
        f54810l.add(new a(32.026978f, 118.795395f, 25000.0f));
        f54810l.add(new a(26.553848f, 106.70825f, 20000.0f));
        f54811m = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    /* JADX INFO: renamed from: e */
    public static String m80038e(String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 0);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f54811m);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArrDecode));
    }

    /* JADX INFO: renamed from: f */
    public static double m80039f(double d, double d2, double d3, double d4, double d5, double d6) {
        double radians = Math.toRadians(d2 - d);
        double d7 = radians / 2.0d;
        double radians2 = Math.toRadians(d4 - d3) / 2.0d;
        double dSin = (Math.sin(d7) * Math.sin(d7)) + (Math.cos(Math.toRadians(d)) * Math.cos(Math.toRadians(d2)) * Math.sin(radians2) * Math.sin(radians2));
        return Math.sqrt(Math.pow(Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d * 6371.0d * 1000.0d, 2.0d) + Math.pow(d5 - d6, 2.0d));
    }

    /* JADX INFO: renamed from: h */
    public static String m80040h(String str, String str2) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f54811m);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
    }

    /* JADX INFO: renamed from: A */
    public void mo79976A(boolean z) {
        this.f54815d = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo79977B();

    /* JADX INFO: renamed from: g */
    public abstract void mo79980g();

    /* JADX INFO: renamed from: i */
    public final Location m80041i(LocationManager locationManager, String str) {
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        final Location location = NullChecker.m82486a(lastKnownLocation) ? new Location(lastKnownLocation) : null;
        if (NullChecker.m82486a(location) && !m80042k(location)) {
            l51.m152887G(new Runnable() { // from class: l.qei0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157181a.m80043l(location);
                }
            });
        }
        return location;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo79981j();

    /* JADX INFO: renamed from: k */
    public boolean m80042k(Location location) {
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

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m80043l(Location location) {
        if (NullChecker.m82486a(this.f54821j.m222761e())) {
            m80050s(location, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m80044m(LocationManager locationManager) {
        if (m80041i(locationManager, "network") == null && m80041i(locationManager, "gps") == null) {
            m80041i(locationManager, "passive");
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m80045n(Location location, boolean z) {
        Location locationM222761e = this.f54821j.m222761e();
        if (!m80042k(location) && (locationM222761e == null || locationM222761e.m80016x() != location.m80016x() || locationM222761e.m80014u() != location.m80014u() || locationM222761e.m80012s() != location.m80012s() || locationM222761e.m80015w() != location.m80015w())) {
            this.f54821j.onNext(location);
            this.f54819h.put(location);
            for (a aVar : f54810l) {
                if (aVar.f54823a.m80011r(location) < aVar.f54824b) {
                    this.f54822k = true;
                }
            }
            this.f54820i = System.currentTimeMillis();
        }
        if (z) {
            mo79977B();
        }
    }

    /* JADX INFO: renamed from: p */
    public C22421c<Location> m80047p() {
        return this.f54821j.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: q */
    public Location m80048q() {
        return this.f54821j.m222761e();
    }

    /* JADX INFO: renamed from: r */
    public void m80049r() {
        Location location;
        final LocationManager locationManager;
        if (this.f54821j.m222761e() == null) {
            location = this.f54819h.get();
            if (NullChecker.m82486a(location)) {
                m80050s(location, false);
            }
        } else {
            location = null;
        }
        if (m80042k(location) && this.f54821j.m222761e() == null && (locationManager = (LocationManager) App.f16088e.getSystemService("location")) != null) {
            l51.m152919y(new Runnable() { // from class: l.pei0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152087a.m80044m(locationManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public void m80050s(final Location location, final boolean z) {
        if (location == null) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.rei0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162653a.m80045n(location, z);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m80051t() {
        m80054w(false);
    }

    /* JADX INFO: renamed from: u */
    public void m80052u(long j) {
        m80053v(j, false);
    }

    /* JADX INFO: renamed from: v */
    public void m80053v(long j, boolean z) {
        if (this.f54820i + j < System.currentTimeMillis()) {
            m80054w(z);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m80054w(final boolean z) {
        l51.m152919y(new Runnable() { // from class: l.oei0
            @Override // java.lang.Runnable
            public final void run() {
                this.f146994a.m80046o(z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public void m80055x() {
        Location locationM222761e = this.f54821j.m222761e();
        if (locationM222761e == null || locationM222761e.m80012s() > 200.0f || System.currentTimeMillis() - locationM222761e.m80018z() > 3600000) {
            m80051t();
        }
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m80046o(boolean z) {
        if (j26.m143188a(App.f16088e, "android.permission.ACCESS_FINE_LOCATION") == 0 && j26.m143188a(App.f16088e, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            mo79976A(z);
            this.f54820i = System.currentTimeMillis();
            mo79980g();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m80057z() {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.a$b */
    public static class b extends dyd0<Location> {

        /* JADX INFO: renamed from: a */
        public String f54825a;

        /* JADX INFO: renamed from: b */
        public String f54826b;

        public b(String str, Location location) {
            super(str, location);
            this.f54825a = "tantanlt";
            this.f54826b = "tantan";
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull Location location, Location location2) {
            return location.m80014u() == location2.m80014u() && location.m80016x() == location2.m80016x();
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Location copyed(Location location, @NonNull Location location2) {
            if (location == null) {
                location = new Location(this.f54826b);
            }
            location.m80008K(location2.m80014u());
            location.m80010M(location2.m80016x());
            location.m80007J(location2.m80012s());
            location.m80009L(location2.m80015w());
            return location;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Location retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            if (string == null) {
                return (Location) this.defaultValue;
            }
            if (!string.contains(Constants.SEPARATOR_COMMA)) {
                try {
                    string = AbstractC13226a.m80038e(string, this.f54825a);
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
                Location location = new Location(this.f54826b);
                location.m80008K(d);
                location.m80010M(d2);
                location.m80007J(f);
                location.m80009L(0);
                location.toString();
                return location;
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
                return (Location) this.defaultValue;
            }
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Location location) {
            String strM80040h;
            try {
                strM80040h = AbstractC13226a.m80040h(location.m80014u() + Constants.SEPARATOR_COMMA + location.m80016x() + Constants.SEPARATOR_COMMA + location.m80012s(), this.f54825a);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                strM80040h = location.m80014u() + Constants.SEPARATOR_COMMA + location.m80016x() + Constants.SEPARATOR_COMMA + location.m80012s();
            }
            return pref().edit().putString(this.f111993id, strM80040h);
        }

        public b(String str, String str2, Location location) {
            super(str, location);
            this.f54825a = "tantanlt";
            this.f54826b = str2;
        }
    }
}
