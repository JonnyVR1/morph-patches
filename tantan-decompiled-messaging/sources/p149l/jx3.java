package p149l;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class jx3 {

    /* JADX INFO: renamed from: a */
    public final stc0 f120175a;

    /* JADX INFO: renamed from: b */
    public final exc0 f120176b;

    /* JADX INFO: renamed from: l.jx3$a */
    public static class C17886a {

        /* JADX INFO: renamed from: a */
        public final long f120177a;

        /* JADX INFO: renamed from: b */
        public final stc0 f120178b;

        /* JADX INFO: renamed from: c */
        public final exc0 f120179c;

        /* JADX INFO: renamed from: d */
        public Date f120180d;

        /* JADX INFO: renamed from: e */
        public String f120181e;

        /* JADX INFO: renamed from: f */
        public Date f120182f;

        /* JADX INFO: renamed from: g */
        public String f120183g;

        /* JADX INFO: renamed from: h */
        public Date f120184h;

        /* JADX INFO: renamed from: i */
        public long f120185i;

        /* JADX INFO: renamed from: j */
        public long f120186j;

        /* JADX INFO: renamed from: k */
        public String f120187k;

        /* JADX INFO: renamed from: l */
        public int f120188l;

        public C17886a(long j, stc0 stc0Var, exc0 exc0Var) {
            this.f120188l = -1;
            this.f120177a = j;
            this.f120178b = stc0Var;
            this.f120179c = exc0Var;
            if (exc0Var != null) {
                this.f120185i = exc0Var.m118605Z();
                this.f120186j = exc0Var.m118603T();
                oxk oxkVarM118595F = exc0Var.m118595F();
                int iM166559k = oxkVarM118595F.m166559k();
                for (int i = 0; i < iM166559k; i++) {
                    String strM166556f = oxkVarM118595F.m166556f(i);
                    String strM166561m = oxkVarM118595F.m166561m(i);
                    if ("Date".equalsIgnoreCase(strM166556f)) {
                        this.f120180d = bkl.m102413b(strM166561m);
                        this.f120181e = strM166561m;
                    } else if ("Expires".equalsIgnoreCase(strM166556f)) {
                        this.f120184h = bkl.m102413b(strM166561m);
                    } else if ("Last-Modified".equalsIgnoreCase(strM166556f)) {
                        this.f120182f = bkl.m102413b(strM166561m);
                        this.f120183g = strM166561m;
                    } else if ("ETag".equalsIgnoreCase(strM166556f)) {
                        this.f120187k = strM166561m;
                    } else if (HttpHeaders.AGE.equalsIgnoreCase(strM166556f)) {
                        this.f120188l = kkl.m146338f(strM166561m, -1);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public static boolean m143749e(stc0 stc0Var) {
            return (stc0Var.m185873c("If-Modified-Since") == null && stc0Var.m185873c("If-None-Match") == null) ? false : true;
        }

        /* JADX INFO: renamed from: a */
        public final long m143750a() {
            Date date = this.f120180d;
            long jMax = date != null ? Math.max(0L, this.f120186j - date.getTime()) : 0L;
            int i = this.f120188l;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f120186j;
            return jMax + (j - this.f120185i) + (this.f120177a - j);
        }

        /* JADX INFO: renamed from: b */
        public final long m143751b() {
            zw3 zw3VarM118607m = this.f120179c.m118607m();
            if (zw3VarM118607m.m220564d() != -1) {
                return TimeUnit.SECONDS.toMillis(zw3VarM118607m.m220564d());
            }
            if (this.f120184h != null) {
                Date date = this.f120180d;
                long time = this.f120184h.getTime() - (date != null ? date.getTime() : this.f120186j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f120182f != null && this.f120179c.m118604Y().m185881k().m107528z() == null) {
                Date date2 = this.f120180d;
                long time2 = (date2 != null ? date2.getTime() : this.f120185i) - this.f120182f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        /* JADX INFO: renamed from: c */
        public jx3 m143752c() {
            jx3 jx3VarM143753d = m143753d();
            return (jx3VarM143753d.f120175a == null || !this.f120178b.m185872b().m220570j()) ? jx3VarM143753d : new jx3(null, null);
        }

        /* JADX INFO: renamed from: d */
        public final jx3 m143753d() {
            String str;
            exc0 exc0Var = this.f120179c;
            stc0 stc0Var = this.f120178b;
            if (exc0Var == null) {
                return new jx3(stc0Var, null);
            }
            if (stc0Var.m185876f() && this.f120179c.m118610t() == null) {
                return new jx3(this.f120178b, null);
            }
            boolean zM143748a = jx3.m143748a(this.f120179c, this.f120178b);
            stc0 stc0Var2 = this.f120178b;
            if (!zM143748a) {
                return new jx3(stc0Var2, null);
            }
            zw3 zw3VarM185872b = stc0Var2.m185872b();
            if (zw3VarM185872b.m220568h() || m143749e(this.f120178b)) {
                return new jx3(this.f120178b, null);
            }
            zw3 zw3VarM118607m = this.f120179c.m118607m();
            long jM143750a = m143750a();
            long jM143751b = m143751b();
            int iM220564d = zw3VarM185872b.m220564d();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (iM220564d != -1) {
                jM143751b = Math.min(jM143751b, timeUnit.toMillis(zw3VarM185872b.m220564d()));
            }
            long millis = 0;
            long millis2 = zw3VarM185872b.m220566f() != -1 ? timeUnit.toMillis(zw3VarM185872b.m220566f()) : 0L;
            if (!zw3VarM118607m.m220567g() && zw3VarM185872b.m220565e() != -1) {
                millis = timeUnit.toMillis(zw3VarM185872b.m220565e());
            }
            if (!zw3VarM118607m.m220568h()) {
                long j = millis2 + jM143750a;
                if (j < millis + jM143751b) {
                    exc0.C16708a c16708aM118600N = this.f120179c.m118600N();
                    if (j >= jM143751b) {
                        c16708aM118600N.m118613a(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM143750a > 86400000 && m143754f()) {
                        c16708aM118600N.m118613a(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new jx3(null, c16708aM118600N.m118615c());
                }
            }
            String str2 = this.f120187k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f120182f != null) {
                    str2 = this.f120183g;
                } else {
                    if (this.f120180d == null) {
                        return new jx3(this.f120178b, null);
                    }
                    str2 = this.f120181e;
                }
            }
            oxk.C19066a c19066aM166558h = this.f120178b.m185875e().m166558h();
            kxm.f125142a.mo144872b(c19066aM166558h, str, str2);
            return new jx3(this.f120178b.m185878h().m185890i(c19066aM166558h.m166567e()).m185883b(), this.f120179c);
        }

        /* JADX INFO: renamed from: f */
        public final boolean m143754f() {
            return this.f120179c.m118607m().m220564d() == -1 && this.f120184h == null;
        }
    }

    public jx3(stc0 stc0Var, exc0 exc0Var) {
        this.f120175a = stc0Var;
        this.f120176b = exc0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.m118607m().m220562b() == false) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m143748a(p149l.exc0 r3, p149l.stc0 r4) {
        /*
            int r0 = r3.m118609q()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.m118611u(r0)
            if (r0 != 0) goto L5a
            l.zw3 r0 = r3.m118607m()
            int r0 = r0.m220564d()
            r1 = -1
            if (r0 != r1) goto L5a
            l.zw3 r0 = r3.m118607m()
            boolean r0 = r0.m220563c()
            if (r0 != 0) goto L5a
            l.zw3 r0 = r3.m118607m()
            boolean r0 = r0.m220562b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            l.zw3 r3 = r3.m118607m()
            boolean r3 = r3.m220569i()
            if (r3 != 0) goto L70
            l.zw3 r3 = r4.m185872b()
            boolean r3 = r3.m220569i()
            if (r3 != 0) goto L70
            r3 = 1
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.jx3.m143748a(l.exc0, l.stc0):boolean");
    }
}
