package com.google.common.math;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.sf80;
import p149l.t5e;

/* JADX INFO: renamed from: com.google.common.math.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3012a {

    /* JADX INFO: renamed from: com.google.common.math.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final double f11267a;

        /* JADX INFO: renamed from: b */
        public final double f11268b;

        public b(double d, double d2) {
            this.f11267a = d;
            this.f11268b = d2;
        }

        /* JADX INFO: renamed from: a */
        public AbstractC3012a m16378a(double d) {
            sf80.m183882d(!Double.isNaN(d));
            return t5e.m187295c(d) ? new d(d, this.f11268b - (this.f11267a * d)) : new e(this.f11267a);
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.a$c */
    public static final class c extends AbstractC3012a {
        static final c INSTANCE = new c();

        public String toString() {
            return "NaN";
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.a$d */
    public static final class d extends AbstractC3012a {

        /* JADX INFO: renamed from: a */
        public final double f11269a;

        /* JADX INFO: renamed from: b */
        public final double f11270b;

        /* JADX INFO: renamed from: c */
        public AbstractC3012a f11271c = null;

        public d(double d, double d2) {
            this.f11269a = d;
            this.f11270b = d2;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f11269a), Double.valueOf(this.f11270b));
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.a$e */
    public static final class e extends AbstractC3012a {

        /* JADX INFO: renamed from: a */
        public final double f11272a;

        /* JADX INFO: renamed from: b */
        public AbstractC3012a f11273b = null;

        public e(double d) {
            this.f11272a = d;
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f11272a));
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC3012a m16374a() {
        return c.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC3012a m16375b(double d2) {
        sf80.m183882d(t5e.m187295c(d2));
        return new d(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d2);
    }

    /* JADX INFO: renamed from: c */
    public static b m16376c(double d2, double d3) {
        sf80.m183882d(t5e.m187295c(d2) && t5e.m187295c(d3));
        return new b(d2, d3);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC3012a m16377d(double d2) {
        sf80.m183882d(t5e.m187295c(d2));
        return new e(d2);
    }
}
