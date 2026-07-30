package p149l;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes2.dex */
public final class zw3 {

    /* JADX INFO: renamed from: n */
    public static final zw3 f205114n = new C21791a().m220573c().m220571a();

    /* JADX INFO: renamed from: o */
    public static final zw3 f205115o = new C21791a().m220575e().m220572b(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).m220571a();

    /* JADX INFO: renamed from: a */
    public final boolean f205116a;

    /* JADX INFO: renamed from: b */
    public final boolean f205117b;

    /* JADX INFO: renamed from: c */
    public final int f205118c;

    /* JADX INFO: renamed from: d */
    public final int f205119d;

    /* JADX INFO: renamed from: e */
    public final boolean f205120e;

    /* JADX INFO: renamed from: f */
    public final boolean f205121f;

    /* JADX INFO: renamed from: g */
    public final boolean f205122g;

    /* JADX INFO: renamed from: h */
    public final int f205123h;

    /* JADX INFO: renamed from: i */
    public final int f205124i;

    /* JADX INFO: renamed from: j */
    public final boolean f205125j;

    /* JADX INFO: renamed from: k */
    public final boolean f205126k;

    /* JADX INFO: renamed from: l */
    public final boolean f205127l;

    /* JADX INFO: renamed from: m */
    public String f205128m;

    /* JADX INFO: renamed from: l.zw3$a */
    public static final class C21791a {

        /* JADX INFO: renamed from: a */
        public boolean f205129a;

        /* JADX INFO: renamed from: b */
        public boolean f205130b;

        /* JADX INFO: renamed from: c */
        public int f205131c = -1;

        /* JADX INFO: renamed from: d */
        public int f205132d = -1;

        /* JADX INFO: renamed from: e */
        public int f205133e = -1;

        /* JADX INFO: renamed from: f */
        public boolean f205134f;

        /* JADX INFO: renamed from: g */
        public boolean f205135g;

        /* JADX INFO: renamed from: h */
        public boolean f205136h;

        /* JADX INFO: renamed from: a */
        public zw3 m220571a() {
            return new zw3(this);
        }

        /* JADX INFO: renamed from: b */
        public C21791a m220572b(int i, TimeUnit timeUnit) {
            if (i < 0) {
                k250.m144273a("maxStale < 0: ", i);
                return null;
            }
            long seconds = timeUnit.toSeconds(i);
            this.f205132d = seconds > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) seconds;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C21791a m220573c() {
            this.f205129a = true;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C21791a m220574d() {
            this.f205130b = true;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C21791a m220575e() {
            this.f205134f = true;
            return this;
        }
    }

    public zw3(C21791a c21791a) {
        this.f205116a = c21791a.f205129a;
        this.f205117b = c21791a.f205130b;
        this.f205118c = c21791a.f205131c;
        this.f205119d = -1;
        this.f205120e = false;
        this.f205121f = false;
        this.f205122g = false;
        this.f205123h = c21791a.f205132d;
        this.f205124i = c21791a.f205133e;
        this.f205125j = c21791a.f205134f;
        this.f205126k = c21791a.f205135g;
        this.f205127l = c21791a.f205136h;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:83:0x013b A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static zw3 m220560k(oxk oxkVar) {
        int i;
        int iM146340h;
        String strTrim;
        int iM146340h2;
        String strTrim2;
        oxk oxkVar2 = oxkVar;
        int iM166559k = oxkVar2.m166559k();
        int i2 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM146338f = -1;
        int iM146338f2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM146338f3 = -1;
        int iM146338f4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i2 < iM166559k) {
            String strM166556f = oxkVar2.m166556f(i2);
            String strM166561m = oxkVar2.m166561m(i2);
            if (strM166556f.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM166561m;
                }
                for (i = 0; i < strM166561m.length(); i = iM146340h2) {
                    iM146340h = kkl.m146340h(strM166561m, i, "=,;");
                    strTrim = strM166561m.substring(i, iM146340h).trim();
                    if (iM146340h != strM166561m.length() || strM166561m.charAt(iM146340h) == ',' || strM166561m.charAt(iM146340h) == ';') {
                        iM146340h2 = iM146340h + 1;
                        strTrim2 = null;
                    } else {
                        int iM146341i = kkl.m146341i(strM166561m, iM146340h + 1);
                        if (iM146341i >= strM166561m.length() || strM166561m.charAt(iM146341i) != '\"') {
                            iM146340h2 = kkl.m146340h(strM166561m, iM146341i, ",;");
                            strTrim2 = strM166561m.substring(iM146341i, iM146340h2).trim();
                        } else {
                            int i3 = iM146341i + 1;
                            int iM146340h3 = kkl.m146340h(strM166561m, i3, "\"");
                            strTrim2 = strM166561m.substring(i3, iM146340h3);
                            iM146340h2 = iM146340h3 + 1;
                        }
                    }
                    if (HttpHeaderValues.NO_CACHE.equalsIgnoreCase(strTrim)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z3 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim)) {
                            iM146338f = kkl.m146338f(strTrim2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                            iM146338f2 = kkl.m146338f(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(strTrim)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                            iM146338f3 = kkl.m146338f(strTrim2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            iM146338f4 = kkl.m146338f(strTrim2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(strTrim)) {
                            z9 = true;
                        }
                    }
                }
                i2++;
                oxkVar2 = oxkVar;
            } else {
                if (strM166556f.equalsIgnoreCase("Pragma")) {
                }
                i2++;
                oxkVar2 = oxkVar;
            }
            z = false;
            while (i < strM166561m.length()) {
                iM146340h = kkl.m146340h(strM166561m, i, "=,;");
                strTrim = strM166561m.substring(i, iM146340h).trim();
                if (iM146340h != strM166561m.length()) {
                    iM146340h2 = iM146340h + 1;
                    strTrim2 = null;
                } else {
                    iM146340h2 = iM146340h + 1;
                    strTrim2 = null;
                }
                if (HttpHeaderValues.NO_CACHE.equalsIgnoreCase(strTrim)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z3 = true;
                } else {
                    if ("max-age".equalsIgnoreCase(strTrim)) {
                        iM146338f = kkl.m146338f(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iM146338f2 = kkl.m146338f(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iM146338f3 = kkl.m146338f(strTrim2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iM146338f4 = kkl.m146338f(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z9 = true;
                    }
                }
            }
            i2++;
            oxkVar2 = oxkVar;
        }
        return new zw3(z2, z3, iM146338f, iM146338f2, z4, z5, z6, iM146338f3, iM146338f4, z7, z8, z9, !z ? null : str);
    }

    /* JADX INFO: renamed from: a */
    public final String m220561a() {
        StringBuilder sb = new StringBuilder();
        if (this.f205116a) {
            sb.append("no-cache, ");
        }
        if (this.f205117b) {
            sb.append("no-store, ");
        }
        if (this.f205118c != -1) {
            sb.append("max-age=");
            sb.append(this.f205118c);
            sb.append(", ");
        }
        if (this.f205119d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f205119d);
            sb.append(", ");
        }
        if (this.f205120e) {
            sb.append("private, ");
        }
        if (this.f205121f) {
            sb.append("public, ");
        }
        if (this.f205122g) {
            sb.append("must-revalidate, ");
        }
        if (this.f205123h != -1) {
            sb.append("max-stale=");
            sb.append(this.f205123h);
            sb.append(", ");
        }
        if (this.f205124i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f205124i);
            sb.append(", ");
        }
        if (this.f205125j) {
            sb.append("only-if-cached, ");
        }
        if (this.f205126k) {
            sb.append("no-transform, ");
        }
        if (this.f205127l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m220562b() {
        return this.f205120e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m220563c() {
        return this.f205121f;
    }

    /* JADX INFO: renamed from: d */
    public int m220564d() {
        return this.f205118c;
    }

    /* JADX INFO: renamed from: e */
    public int m220565e() {
        return this.f205123h;
    }

    /* JADX INFO: renamed from: f */
    public int m220566f() {
        return this.f205124i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m220567g() {
        return this.f205122g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m220568h() {
        return this.f205116a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m220569i() {
        return this.f205117b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m220570j() {
        return this.f205125j;
    }

    public String toString() {
        String str = this.f205128m;
        if (str != null) {
            return str;
        }
        String strM220561a = m220561a();
        this.f205128m = strM220561a;
        return strM220561a;
    }

    public zw3(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f205116a = z;
        this.f205117b = z2;
        this.f205118c = i;
        this.f205119d = i2;
        this.f205120e = z3;
        this.f205121f = z4;
        this.f205122g = z5;
        this.f205123h = i3;
        this.f205124i = i4;
        this.f205125j = z6;
        this.f205126k = z7;
        this.f205127l = z8;
        this.f205128m = str;
    }
}
