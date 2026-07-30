package com.google.common.math;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.i7e;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.math.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3035a {

    /* JADX INFO: renamed from: com.google.common.math.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final double f11304a;

        /* JADX INFO: renamed from: b */
        public final double f11305b;

        public b(double d, double d2) {
            this.f11304a = d;
            this.f11305b = d2;
        }

        /* JADX INFO: renamed from: a */
        public AbstractC3035a m16433a(double d) {
            xn80.m212099d(!Double.isNaN(d));
            return i7e.m138931c(d) ? new d(d, this.f11305b - (this.f11304a * d)) : new e(this.f11304a);
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.a$c */
    public static final class c extends AbstractC3035a {
        static final c INSTANCE = new c();

        public String toString() {
            return "NaN";
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.a$d */
    public static final class d extends AbstractC3035a {

        /* JADX INFO: renamed from: a */
        public final double f11306a;

        /* JADX INFO: renamed from: b */
        public final double f11307b;

        /* JADX INFO: renamed from: c */
        public AbstractC3035a f11308c = null;

        public d(double d, double d2) {
            this.f11306a = d;
            this.f11307b = d2;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f11306a), Double.valueOf(this.f11307b));
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.a$e */
    public static final class e extends AbstractC3035a {

        /* JADX INFO: renamed from: a */
        public final double f11309a;

        /* JADX INFO: renamed from: b */
        public AbstractC3035a f11310b = null;

        public e(double d) {
            this.f11309a = d;
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f11309a));
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC3035a m16429a() {
        return c.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC3035a m16430b(double d2) {
        xn80.m212099d(i7e.m138931c(d2));
        return new d(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d2);
    }

    /* JADX INFO: renamed from: c */
    public static b m16431c(double d2, double d3) {
        xn80.m212099d(i7e.m138931c(d2) && i7e.m138931c(d3));
        return new b(d2, d3);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC3035a m16432d(double d2) {
        xn80.m212099d(i7e.m138931c(d2));
        return new e(d2);
    }
}
