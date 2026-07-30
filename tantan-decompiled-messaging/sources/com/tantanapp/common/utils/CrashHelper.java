package com.tantanapp.common.utils;

import com.tantanapp.common.utils.CrashHelper;
import p133rx.subjects.C22392a;
import p149l.a4g0;
import p149l.e30;
import p149l.edk0;
import p149l.g30;
import p149l.roj0;
import p149l.z3g0;
import p149l.zbc0;

/* JADX INFO: loaded from: classes13.dex */
public class CrashHelper {

    /* JADX INFO: renamed from: a */
    public static g30<Throwable, String, ReportLevel> f56063a;

    /* JADX INFO: renamed from: b */
    public static g30<Throwable, String, ReportLevel> f56064b;

    /* JADX INFO: renamed from: c */
    public static C22392a<roj0> f56065c = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public static z3g0<roj0> f56066d = a4g0.m94917a();

    public enum ReportLevel {
        p0,
        p1,
        p2,
        p3,
        p4,
        p5,
        p6,
        p7,
        p8,
        p9
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m81294a(Throwable th, roj0 roj0Var) {
        m81296c(th);
        if (f56066d.isUnsubscribed()) {
            return;
        }
        f56066d.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public static void m81295b(g30<Throwable, String, ReportLevel> g30Var, g30<Throwable, String, ReportLevel> g30Var2) {
        f56063a = g30Var;
        f56064b = g30Var2;
        f56065c.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: c */
    public static void m81296c(Throwable th) {
        g30<Throwable, String, ReportLevel> g30Var = f56063a;
        if (g30Var != null) {
            g30Var.mo36055a(th, null, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m81297d(Throwable th, int i) {
        if (edk0.f90613c) {
            m81296c(th);
        } else if (zbc0.m217835a(0, i) == 0) {
            m81296c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m81298e(Throwable th, String str, ReportLevel reportLevel) {
        g30<Throwable, String, ReportLevel> g30Var = f56063a;
        if (g30Var != null) {
            g30Var.mo36055a(th, str, reportLevel);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m81299f(Throwable th, String str, ReportLevel reportLevel, int i) {
        if (edk0.f90613c) {
            m81298e(th, str, reportLevel);
        } else if (zbc0.m217835a(0, i) == 0) {
            m81298e(th, str, reportLevel);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m81300g(final Throwable th) {
        if (f56065c.m221519i()) {
            m81296c(th);
        } else {
            f56066d.m217046b(f56065c.subscribe(new e30() { // from class: l.hsb
                @Override // p149l.e30
                public final void call(Object obj) {
                    CrashHelper.m81294a(th, (roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m81301h(Throwable th, String str, ReportLevel reportLevel) {
        g30<Throwable, String, ReportLevel> g30Var = f56064b;
        if (g30Var != null) {
            g30Var.mo36055a(th, str, reportLevel);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m81302i(Throwable th, String str, ReportLevel reportLevel, int i) {
        if (edk0.f90613c) {
            m81301h(th, str, reportLevel);
        } else if (zbc0.m217835a(0, i) == 0) {
            m81301h(th, str, reportLevel);
        }
    }
}
