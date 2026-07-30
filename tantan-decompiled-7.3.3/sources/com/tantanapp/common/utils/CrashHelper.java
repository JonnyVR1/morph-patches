package com.tantanapp.common.utils;

import com.tantanapp.common.utils.CrashHelper;
import p137rx.subjects.C22507a;
import p153l.a30;
import p153l.gcg0;
import p153l.gkc0;
import p153l.icg0;
import p153l.kmk0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CrashHelper {

    /* JADX INFO: renamed from: a */
    public static a30<Throwable, String, ReportLevel> f56911a;

    /* JADX INFO: renamed from: b */
    public static a30<Throwable, String, ReportLevel> f56912b;

    /* JADX INFO: renamed from: c */
    public static C22507a<uxj0> f56913c = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public static gcg0<uxj0> f56914d = icg0.m139434a();

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
    public static /* synthetic */ void m82477a(Throwable th, uxj0 uxj0Var) {
        m82479c(th);
        if (f56914d.isUnsubscribed()) {
            return;
        }
        f56914d.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public static void m82478b(a30<Throwable, String, ReportLevel> a30Var, a30<Throwable, String, ReportLevel> a30Var2) {
        f56911a = a30Var;
        f56912b = a30Var2;
        f56913c.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: c */
    public static void m82479c(Throwable th) {
        a30<Throwable, String, ReportLevel> a30Var = f56911a;
        if (a30Var != null) {
            a30Var.mo37058a(th, null, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m82480d(Throwable th, int i) {
        if (kmk0.f127510c) {
            m82479c(th);
        } else if (gkc0.m130573a(0, i) == 0) {
            m82479c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m82481e(Throwable th, String str, ReportLevel reportLevel) {
        a30<Throwable, String, ReportLevel> a30Var = f56911a;
        if (a30Var != null) {
            a30Var.mo37058a(th, str, reportLevel);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m82482f(Throwable th, String str, ReportLevel reportLevel, int i) {
        if (kmk0.f127510c) {
            m82481e(th, str, reportLevel);
        } else if (gkc0.m130573a(0, i) == 0) {
            m82481e(th, str, reportLevel);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m82483g(final Throwable th) {
        if (f56913c.m222765i()) {
            m82479c(th);
        } else {
            f56914d.m129866b(f56913c.subscribe(new y20() { // from class: l.vtb
                @Override // p153l.y20
                public final void call(Object obj) {
                    CrashHelper.m82477a(th, (uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m82484h(Throwable th, String str, ReportLevel reportLevel) {
        a30<Throwable, String, ReportLevel> a30Var = f56912b;
        if (a30Var != null) {
            a30Var.mo37058a(th, str, reportLevel);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m82485i(Throwable th, String str, ReportLevel reportLevel, int i) {
        if (kmk0.f127510c) {
            m82484h(th, str, reportLevel);
        } else if (gkc0.m130573a(0, i) == 0) {
            m82484h(th, str, reportLevel);
        }
    }
}
