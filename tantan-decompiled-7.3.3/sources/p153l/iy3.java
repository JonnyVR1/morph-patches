package p153l;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class iy3 {

    /* JADX INFO: renamed from: a */
    public final x1d0 f117497a;

    /* JADX INFO: renamed from: b */
    public final i5d0 f117498b;

    /* JADX INFO: renamed from: l.iy3$a */
    public static class C17820a {

        /* JADX INFO: renamed from: a */
        public final long f117499a;

        /* JADX INFO: renamed from: b */
        public final x1d0 f117500b;

        /* JADX INFO: renamed from: c */
        public final i5d0 f117501c;

        /* JADX INFO: renamed from: d */
        public Date f117502d;

        /* JADX INFO: renamed from: e */
        public String f117503e;

        /* JADX INFO: renamed from: f */
        public Date f117504f;

        /* JADX INFO: renamed from: g */
        public String f117505g;

        /* JADX INFO: renamed from: h */
        public Date f117506h;

        /* JADX INFO: renamed from: i */
        public long f117507i;

        /* JADX INFO: renamed from: j */
        public long f117508j;

        /* JADX INFO: renamed from: k */
        public String f117509k;

        /* JADX INFO: renamed from: l */
        public int f117510l;

        public C17820a(long j, x1d0 x1d0Var, i5d0 i5d0Var) {
            this.f117510l = -1;
            this.f117499a = j;
            this.f117500b = x1d0Var;
            this.f117501c = i5d0Var;
            if (i5d0Var != null) {
                this.f117507i = i5d0Var.m138669a0();
                this.f117508j = i5d0Var.m138667U();
                e0l e0lVarM138659F = i5d0Var.m138659F();
                int iM118878k = e0lVarM138659F.m118878k();
                for (int i = 0; i < iM118878k; i++) {
                    String strM118875f = e0lVarM138659F.m118875f(i);
                    String strM118880m = e0lVarM138659F.m118880m(i);
                    if ("Date".equalsIgnoreCase(strM118875f)) {
                        this.f117502d = pml.m172952b(strM118880m);
                        this.f117503e = strM118880m;
                    } else if ("Expires".equalsIgnoreCase(strM118875f)) {
                        this.f117506h = pml.m172952b(strM118880m);
                    } else if ("Last-Modified".equalsIgnoreCase(strM118875f)) {
                        this.f117504f = pml.m172952b(strM118880m);
                        this.f117505g = strM118880m;
                    } else if ("ETag".equalsIgnoreCase(strM118875f)) {
                        this.f117509k = strM118880m;
                    } else if (HttpHeaders.AGE.equalsIgnoreCase(strM118875f)) {
                        this.f117510l = yml.m216703f(strM118880m, -1);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public static boolean m142602e(x1d0 x1d0Var) {
            return (x1d0Var.m209018c("If-Modified-Since") == null && x1d0Var.m209018c("If-None-Match") == null) ? false : true;
        }

        /* JADX INFO: renamed from: a */
        public final long m142603a() {
            Date date = this.f117502d;
            long jMax = date != null ? Math.max(0L, this.f117508j - date.getTime()) : 0L;
            int i = this.f117510l;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f117508j;
            return jMax + (j - this.f117507i) + (this.f117499a - j);
        }

        /* JADX INFO: renamed from: b */
        public final long m142604b() {
            yx3 yx3VarM138671m = this.f117501c.m138671m();
            if (yx3VarM138671m.m217675d() != -1) {
                return TimeUnit.SECONDS.toMillis(yx3VarM138671m.m217675d());
            }
            if (this.f117506h != null) {
                Date date = this.f117502d;
                long time = this.f117506h.getTime() - (date != null ? date.getTime() : this.f117508j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f117504f != null && this.f117501c.m138668Z().m209026k().m182292z() == null) {
                Date date2 = this.f117502d;
                long time2 = (date2 != null ? date2.getTime() : this.f117507i) - this.f117504f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        /* JADX INFO: renamed from: c */
        public iy3 m142605c() {
            iy3 iy3VarM142606d = m142606d();
            return (iy3VarM142606d.f117497a == null || !this.f117500b.m209017b().m217681j()) ? iy3VarM142606d : new iy3(null, null);
        }

        /* JADX INFO: renamed from: d */
        public final iy3 m142606d() {
            String str;
            i5d0 i5d0Var = this.f117501c;
            x1d0 x1d0Var = this.f117500b;
            if (i5d0Var == null) {
                return new iy3(x1d0Var, null);
            }
            if (x1d0Var.m209021f() && this.f117501c.m138674t() == null) {
                return new iy3(this.f117500b, null);
            }
            boolean zM142601a = iy3.m142601a(this.f117501c, this.f117500b);
            x1d0 x1d0Var2 = this.f117500b;
            if (!zM142601a) {
                return new iy3(x1d0Var2, null);
            }
            yx3 yx3VarM209017b = x1d0Var2.m209017b();
            if (yx3VarM209017b.m217679h() || m142602e(this.f117500b)) {
                return new iy3(this.f117500b, null);
            }
            yx3 yx3VarM138671m = this.f117501c.m138671m();
            long jM142603a = m142603a();
            long jM142604b = m142604b();
            int iM217675d = yx3VarM209017b.m217675d();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (iM217675d != -1) {
                jM142604b = Math.min(jM142604b, timeUnit.toMillis(yx3VarM209017b.m217675d()));
            }
            long millis = 0;
            long millis2 = yx3VarM209017b.m217677f() != -1 ? timeUnit.toMillis(yx3VarM209017b.m217677f()) : 0L;
            if (!yx3VarM138671m.m217678g() && yx3VarM209017b.m217676e() != -1) {
                millis = timeUnit.toMillis(yx3VarM209017b.m217676e());
            }
            if (!yx3VarM138671m.m217679h()) {
                long j = millis2 + jM142603a;
                if (j < millis + jM142604b) {
                    i5d0.C17653a c17653aM138664N = this.f117501c.m138664N();
                    if (j >= jM142604b) {
                        c17653aM138664N.m138677a(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM142603a > 86400000 && m142607f()) {
                        c17653aM138664N.m138677a(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new iy3(null, c17653aM138664N.m138679c());
                }
            }
            String str2 = this.f117509k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f117504f != null) {
                    str2 = this.f117505g;
                } else {
                    if (this.f117502d == null) {
                        return new iy3(this.f117500b, null);
                    }
                    str2 = this.f117503e;
                }
            }
            e0l.C16674a c16674aM118877h = this.f117500b.m209020e().m118877h();
            kzm.f129436a.mo152193b(c16674aM118877h, str, str2);
            return new iy3(this.f117500b.m209023h().m209035i(c16674aM118877h.m118886e()).m209028b(), this.f117501c);
        }

        /* JADX INFO: renamed from: f */
        public final boolean m142607f() {
            return this.f117501c.m138671m().m217675d() == -1 && this.f117506h == null;
        }
    }

    public iy3(x1d0 x1d0Var, i5d0 i5d0Var) {
        this.f117497a = x1d0Var;
        this.f117498b = i5d0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.m138671m().m217673b() == false) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m142601a(i5d0 i5d0Var, x1d0 x1d0Var) {
        int iM138673q = i5d0Var.m138673q();
        if (iM138673q != 200 && iM138673q != 410 && iM138673q != 414 && iM138673q != 501 && iM138673q != 203 && iM138673q != 204) {
            if (iM138673q != 307) {
                if (iM138673q != 308 && iM138673q != 404 && iM138673q != 405) {
                    switch (iM138673q) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (i5d0Var.m138675u("Expires") == null) {
                if (i5d0Var.m138671m().m217675d() == -1) {
                    if (!i5d0Var.m138671m().m217674c()) {
                    }
                }
            }
        }
        return (i5d0Var.m138671m().m217680i() || x1d0Var.m209017b().m217680i()) ? false : true;
    }
}
