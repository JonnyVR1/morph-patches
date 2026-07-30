package com.p000p1.mobile.putong.location;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class Location implements Parcelable {

    @Deprecated
    public static final String EXTRA_NO_GPS_LOCATION = "noGPSLocation";
    public static final int FORMAT_DEGREES = 0;
    public static final int FORMAT_MINUTES = 1;
    public static final int FORMAT_SECONDS = 2;
    private static final int HAS_ALTITUDE_MASK = 1;
    private static final int HAS_BEARING_ACCURACY_MASK = 128;
    private static final int HAS_BEARING_MASK = 4;
    private static final int HAS_ELAPSED_REALTIME_UNCERTAINTY_MASK = 256;
    private static final int HAS_HORIZONTAL_ACCURACY_MASK = 8;
    private static final int HAS_MOCK_PROVIDER_MASK = 16;
    private static final int HAS_SPEED_ACCURACY_MASK = 64;
    private static final int HAS_SPEED_MASK = 2;
    private static final int HAS_VERTICAL_ACCURACY_MASK = 32;
    public static final int LOC_TYPE_CACHE = 4;
    public static final int LOC_TYPE_CELL = 6;
    public static final int LOC_TYPE_GPS = 10;
    public static final int LOC_TYPE_INVALID = -1;
    public static final int LOC_TYPE_OFFLINE = 2;
    public static final int LOC_TYPE_UNKNOWN = 0;
    public static final int LOC_TYPE_WIFI = 8;
    private String mProvider;
    private static ThreadLocal<C0464c> sBearingDistanceCache = new C0462a();
    public static final Parcelable.Creator<Location> CREATOR = new C0463b();
    private long mTime = 0;
    private long mElapsedRealtimeNanos = 0;
    private double mElapsedRealtimeUncertaintyNanos = 0.0d;
    private double mLatitude = 0.0d;
    private double mLongitude = 0.0d;
    private double mAltitude = 0.0d;
    private float mSpeed = 0.0f;
    private float mBearing = 0.0f;
    private float mHorizontalAccuracyMeters = 0.0f;
    private float mVerticalAccuracyMeters = 0.0f;
    private float mSpeedAccuracyMetersPerSecond = 0.0f;
    private float mBearingAccuracyDegrees = 0.0f;
    private Bundle mExtras = null;
    private int mFieldsMask = 0;
    private int mLocType = 0;
    private int mErrorCode = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.Location$a */
    public class C0462a extends ThreadLocal<C0464c> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0464c initialValue() {
            return new C0464c();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.Location$b */
    public class C0463b implements Parcelable.Creator<Location> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Location createFromParcel(Parcel parcel) {
            Location location = new Location(parcel.readString());
            location.mTime = parcel.readLong();
            location.mElapsedRealtimeNanos = parcel.readLong();
            location.mElapsedRealtimeUncertaintyNanos = parcel.readDouble();
            location.mFieldsMask = parcel.readInt();
            location.mLatitude = parcel.readDouble();
            location.mLongitude = parcel.readDouble();
            location.mAltitude = parcel.readDouble();
            location.mSpeed = parcel.readFloat();
            location.mBearing = parcel.readFloat();
            location.mVerticalAccuracyMeters = parcel.readFloat();
            location.mSpeedAccuracyMetersPerSecond = parcel.readFloat();
            location.mBearingAccuracyDegrees = parcel.readFloat();
            location.mLocType = parcel.readInt();
            location.mErrorCode = parcel.readInt();
            location.mExtras = parcel.readBundle();
            return location;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Location[] newArray(int i) {
            return new Location[i];
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.location.Location$c */
    public static class C0464c {

        /* JADX INFO: renamed from: a */
        public double f7561a;

        /* JADX INFO: renamed from: b */
        public double f7562b;

        /* JADX INFO: renamed from: c */
        public double f7563c;

        /* JADX INFO: renamed from: d */
        public double f7564d;

        /* JADX INFO: renamed from: e */
        public float f7565e;

        /* JADX INFO: renamed from: f */
        public float f7566f;

        /* JADX INFO: renamed from: g */
        public float f7567g;

        public C0464c() {
            this.f7561a = 0.0d;
            this.f7562b = 0.0d;
            this.f7563c = 0.0d;
            this.f7564d = 0.0d;
            this.f7565e = 0.0f;
            this.f7566f = 0.0f;
            this.f7567g = 0.0f;
        }
    }

    public Location(android.location.Location location) {
        m9118I(location);
    }

    /* JADX INFO: renamed from: q */
    public static void m9109q(double d, double d2, double d3, double d4, C0464c c0464c) {
        double d5;
        double d6 = d * 0.017453292519943295d;
        double d7 = d3 * 0.017453292519943295d;
        double d8 = d2 * 0.017453292519943295d;
        double d9 = 0.017453292519943295d * d4;
        double d10 = d9 - d8;
        double dAtan = Math.atan(Math.tan(d6) * 0.996647189328169d);
        double dAtan2 = Math.atan(0.996647189328169d * Math.tan(d7));
        double dCos = Math.cos(dAtan);
        double dCos2 = Math.cos(dAtan2);
        double dSin = Math.sin(dAtan);
        double dSin2 = Math.sin(dAtan2);
        double d11 = dCos * dCos2;
        double d12 = dSin * dSin2;
        double dAtan3 = 0.0d;
        double d13 = 0.0d;
        double dCos3 = 0.0d;
        double d14 = 0.0d;
        double dSin3 = 0.0d;
        int i = 0;
        double d15 = d10;
        while (i < 20) {
            dCos3 = Math.cos(d15);
            dSin3 = Math.sin(d15);
            double d16 = dCos2 * dSin3;
            double d17 = (dCos * dSin2) - ((dSin * dCos2) * dCos3);
            int i2 = i;
            double dSqrt = Math.sqrt((d16 * d16) + (d17 * d17));
            d5 = dSin2;
            double d18 = d12 + (d11 * dCos3);
            dAtan3 = Math.atan2(dSqrt, d18);
            double d19 = dSqrt == 0.0d ? 0.0d : (d11 * dSin3) / dSqrt;
            double d20 = 1.0d - (d19 * d19);
            double d21 = d20 == 0.0d ? 0.0d : d18 - ((d12 * 2.0d) / d20);
            double d22 = 0.006739496756586903d * d20;
            double d23 = ((d22 / 16384.0d) * (((((320.0d - (175.0d * d22)) * d22) - 768.0d) * d22) + 4096.0d)) + 1.0d;
            double d24 = (d22 / 1024.0d) * ((d22 * (((74.0d - (47.0d * d22)) * d22) - 128.0d)) + 256.0d);
            double d25 = 2.0955066698943685E-4d * d20 * (((4.0d - (d20 * 3.0d)) * 0.0033528106718309896d) + 4.0d);
            double d26 = d21 * d21;
            double d27 = d24 * dSqrt * (d21 + ((d24 / 4.0d) * ((((d26 * 2.0d) - 1.0d) * d18) - ((((d24 / 6.0d) * d21) * (((dSqrt * 4.0d) * dSqrt) - 3.0d)) * ((d26 * 4.0d) - 3.0d)))));
            double d28 = d10 + ((1.0d - d25) * 0.0033528106718309896d * d19 * (dAtan3 + (dSqrt * d25 * (d21 + (d25 * d18 * (((2.0d * d21) * d21) - 1.0d))))));
            if (Math.abs((d28 - d15) / d28) < 1.0E-12d) {
                d13 = d27;
                d14 = d23;
                c0464c.f7565e = (float) (6356752.3142d * d14 * (dAtan3 - d13));
                double d29 = dCos * d5;
                c0464c.f7566f = (float) (((double) ((float) Math.atan2(dCos2 * dSin3, d29 - ((dSin * dCos2) * dCos3)))) * 57.29577951308232d);
                c0464c.f7567g = (float) (((double) ((float) Math.atan2(dCos * dSin3, ((-dSin) * dCos2) + (d29 * dCos3)))) * 57.29577951308232d);
                c0464c.f7561a = d6;
                c0464c.f7563c = d7;
                c0464c.f7562b = d8;
                c0464c.f7564d = d9;
            }
            d15 = d28;
            i = i2 + 1;
            d13 = d27;
            d14 = d23;
            dSin2 = d5;
        }
        d5 = dSin2;
        c0464c.f7565e = (float) (6356752.3142d * d14 * (dAtan3 - d13));
        double d210 = dCos * d5;
        c0464c.f7566f = (float) (((double) ((float) Math.atan2(dCos2 * dSin3, d210 - ((dSin * dCos2) * dCos3)))) * 57.29577951308232d);
        c0464c.f7567g = (float) (((double) ((float) Math.atan2(dCos * dSin3, ((-dSin) * dCos2) + (d210 * dCos3)))) * 57.29577951308232d);
        c0464c.f7561a = d6;
        c0464c.f7563c = d7;
        c0464c.f7562b = d8;
        c0464c.f7564d = d9;
    }

    /* JADX INFO: renamed from: A */
    public boolean m9110A() {
        return (this.mFieldsMask & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public boolean m9111B() {
        return (this.mFieldsMask & 4) != 0;
    }

    /* JADX INFO: renamed from: C */
    public boolean m9112C() {
        return (this.mFieldsMask & HAS_BEARING_ACCURACY_MASK) != 0;
    }

    /* JADX INFO: renamed from: D */
    public boolean m9113D() {
        return (this.mFieldsMask & HAS_ELAPSED_REALTIME_UNCERTAINTY_MASK) != 0;
    }

    /* JADX INFO: renamed from: E */
    public boolean m9114E() {
        return (this.mFieldsMask & 2) != 0;
    }

    /* JADX INFO: renamed from: F */
    public boolean m9115F() {
        return (this.mFieldsMask & HAS_SPEED_ACCURACY_MASK) != 0;
    }

    /* JADX INFO: renamed from: G */
    public boolean m9116G() {
        return (this.mFieldsMask & HAS_VERTICAL_ACCURACY_MASK) != 0;
    }

    /* JADX INFO: renamed from: H */
    public boolean m9117H() {
        return (this.mFieldsMask & 16) != 0;
    }

    /* JADX INFO: renamed from: I */
    public void m9118I(android.location.Location location) {
        this.mProvider = location.getProvider();
        this.mTime = location.getTime();
        this.mElapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.mElapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
        }
        this.mLatitude = location.getLatitude();
        this.mLongitude = location.getLongitude();
        this.mAltitude = location.getAltitude();
        this.mSpeed = location.getSpeed();
        this.mBearing = location.getBearing();
        this.mHorizontalAccuracyMeters = location.getAccuracy();
        if (i >= 26) {
            this.mVerticalAccuracyMeters = location.getVerticalAccuracyMeters();
            this.mSpeedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
            this.mBearingAccuracyDegrees = location.getBearingAccuracyDegrees();
        }
        this.mLocType = 0;
        this.mErrorCode = -1;
        this.mExtras = location.getExtras() == null ? null : new Bundle(location.getExtras());
    }

    /* JADX INFO: renamed from: J */
    public void m9119J(float f) {
        this.mHorizontalAccuracyMeters = f;
        this.mFieldsMask |= 8;
    }

    /* JADX INFO: renamed from: K */
    public void m9120K(double d) {
        this.mLatitude = d;
    }

    /* JADX INFO: renamed from: L */
    public void m9121L(int i) {
        this.mLocType = i;
    }

    /* JADX INFO: renamed from: M */
    public void m9122M(double d) {
        this.mLongitude = d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public float m9123r(Location location) {
        C0464c c0464c = sBearingDistanceCache.get();
        if (this.mLatitude != c0464c.f7561a || this.mLongitude != c0464c.f7562b || location.mLatitude != c0464c.f7563c || location.mLongitude != c0464c.f7564d) {
            m9109q(this.mLatitude, this.mLongitude, location.mLatitude, location.mLongitude, c0464c);
        }
        return c0464c.f7565e;
    }

    /* JADX INFO: renamed from: s */
    public float m9124s() {
        return this.mHorizontalAccuracyMeters;
    }

    /* JADX INFO: renamed from: t */
    public double m9125t() {
        return this.mAltitude;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Location[");
        sb.append(this.mProvider);
        sb.append(String.format(" %.6f,%.6f", Double.valueOf(this.mLatitude), Double.valueOf(this.mLongitude)));
        sb.append(" Accuracy=" + this.mHorizontalAccuracyMeters);
        sb.append(" LocType=" + this.mLocType);
        sb.append(" hAcc=???");
        if (this.mTime == 0) {
            sb.append(" t=?!?");
        }
        if (this.mElapsedRealtimeNanos == 0) {
            sb.append(" et=?!?");
        }
        m9113D();
        if (m9110A()) {
            sb.append(" alt=");
            sb.append(this.mAltitude);
        }
        if (m9114E()) {
            sb.append(" vel=");
            sb.append(this.mSpeed);
        }
        if (m9111B()) {
            sb.append(" bear=");
            sb.append(this.mBearing);
        }
        if (m9116G()) {
            sb.append(String.format(" vAcc=%.0f", Float.valueOf(this.mVerticalAccuracyMeters)));
        } else {
            sb.append(" vAcc=???");
        }
        if (m9115F()) {
            sb.append(String.format(" sAcc=%.0f", Float.valueOf(this.mSpeedAccuracyMetersPerSecond)));
        } else {
            sb.append(" sAcc=???");
        }
        if (m9112C()) {
            sb.append(String.format(" bAcc=%.0f", Float.valueOf(this.mBearingAccuracyDegrees)));
        } else {
            sb.append(" bAcc=???");
        }
        if (m9117H()) {
            sb.append(" mock");
        }
        if (this.mExtras != null) {
            sb.append(" {");
            sb.append(this.mExtras);
            sb.append('}');
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public double m9126u() {
        return this.mLatitude;
    }

    /* JADX INFO: renamed from: w */
    public int m9127w() {
        return this.mLocType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mProvider);
        parcel.writeLong(this.mTime);
        parcel.writeLong(this.mElapsedRealtimeNanos);
        parcel.writeDouble(this.mElapsedRealtimeUncertaintyNanos);
        parcel.writeInt(this.mFieldsMask);
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeDouble(this.mAltitude);
        parcel.writeFloat(this.mSpeed);
        parcel.writeFloat(this.mBearing);
        parcel.writeFloat(this.mVerticalAccuracyMeters);
        parcel.writeFloat(this.mSpeedAccuracyMetersPerSecond);
        parcel.writeFloat(this.mBearingAccuracyDegrees);
        parcel.writeInt(this.mLocType);
        parcel.writeInt(this.mErrorCode);
        parcel.writeBundle(this.mExtras);
    }

    /* JADX INFO: renamed from: x */
    public double m9128x() {
        return this.mLongitude;
    }

    /* JADX INFO: renamed from: y */
    public String m9129y() {
        return this.mProvider;
    }

    /* JADX INFO: renamed from: z */
    public long m9130z() {
        return this.mTime;
    }

    public Location(String str) {
        this.mProvider = str;
    }
}
