package p153l;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class yx3 {

    /* JADX INFO: renamed from: n */
    public static final yx3 f201902n = new C21702a().m217684c().m217682a();

    /* JADX INFO: renamed from: o */
    public static final yx3 f201903o = new C21702a().m217686e().m217683b(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).m217682a();

    /* JADX INFO: renamed from: a */
    public final boolean f201904a;

    /* JADX INFO: renamed from: b */
    public final boolean f201905b;

    /* JADX INFO: renamed from: c */
    public final int f201906c;

    /* JADX INFO: renamed from: d */
    public final int f201907d;

    /* JADX INFO: renamed from: e */
    public final boolean f201908e;

    /* JADX INFO: renamed from: f */
    public final boolean f201909f;

    /* JADX INFO: renamed from: g */
    public final boolean f201910g;

    /* JADX INFO: renamed from: h */
    public final int f201911h;

    /* JADX INFO: renamed from: i */
    public final int f201912i;

    /* JADX INFO: renamed from: j */
    public final boolean f201913j;

    /* JADX INFO: renamed from: k */
    public final boolean f201914k;

    /* JADX INFO: renamed from: l */
    public final boolean f201915l;

    /* JADX INFO: renamed from: m */
    public String f201916m;

    /* JADX INFO: renamed from: l.yx3$a */
    public static final class C21702a {

        /* JADX INFO: renamed from: a */
        public boolean f201917a;

        /* JADX INFO: renamed from: b */
        public boolean f201918b;

        /* JADX INFO: renamed from: c */
        public int f201919c = -1;

        /* JADX INFO: renamed from: d */
        public int f201920d = -1;

        /* JADX INFO: renamed from: e */
        public int f201921e = -1;

        /* JADX INFO: renamed from: f */
        public boolean f201922f;

        /* JADX INFO: renamed from: g */
        public boolean f201923g;

        /* JADX INFO: renamed from: h */
        public boolean f201924h;

        /* JADX INFO: renamed from: a */
        public yx3 m217682a() {
            return new yx3(this);
        }

        /* JADX INFO: renamed from: b */
        public C21702a m217683b(int i, TimeUnit timeUnit) {
            if (i < 0) {
                za50.m219101a("maxStale < 0: ", i);
                return null;
            }
            long seconds = timeUnit.toSeconds(i);
            this.f201920d = seconds > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) seconds;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C21702a m217684c() {
            this.f201917a = true;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C21702a m217685d() {
            this.f201918b = true;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C21702a m217686e() {
            this.f201922f = true;
            return this;
        }
    }

    public yx3(C21702a c21702a) {
        this.f201904a = c21702a.f201917a;
        this.f201905b = c21702a.f201918b;
        this.f201906c = c21702a.f201919c;
        this.f201907d = -1;
        this.f201908e = false;
        this.f201909f = false;
        this.f201910g = false;
        this.f201911h = c21702a.f201920d;
        this.f201912i = c21702a.f201921e;
        this.f201913j = c21702a.f201922f;
        this.f201914k = c21702a.f201923g;
        this.f201915l = c21702a.f201924h;
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
    public static yx3 m217671k(e0l e0lVar) {
        int i;
        int iM216705h;
        String strTrim;
        int iM216705h2;
        String strTrim2;
        e0l e0lVar2 = e0lVar;
        int iM118878k = e0lVar2.m118878k();
        int i2 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM216703f = -1;
        int iM216703f2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM216703f3 = -1;
        int iM216703f4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i2 < iM118878k) {
            String strM118875f = e0lVar2.m118875f(i2);
            String strM118880m = e0lVar2.m118880m(i2);
            if (strM118875f.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM118880m;
                }
                for (i = 0; i < strM118880m.length(); i = iM216705h2) {
                    iM216705h = yml.m216705h(strM118880m, i, "=,;");
                    strTrim = strM118880m.substring(i, iM216705h).trim();
                    if (iM216705h != strM118880m.length() || strM118880m.charAt(iM216705h) == ',' || strM118880m.charAt(iM216705h) == ';') {
                        iM216705h2 = iM216705h + 1;
                        strTrim2 = null;
                    } else {
                        int iM216706i = yml.m216706i(strM118880m, iM216705h + 1);
                        if (iM216706i >= strM118880m.length() || strM118880m.charAt(iM216706i) != '\"') {
                            iM216705h2 = yml.m216705h(strM118880m, iM216706i, ",;");
                            strTrim2 = strM118880m.substring(iM216706i, iM216705h2).trim();
                        } else {
                            int i3 = iM216706i + 1;
                            int iM216705h3 = yml.m216705h(strM118880m, i3, "\"");
                            strTrim2 = strM118880m.substring(i3, iM216705h3);
                            iM216705h2 = iM216705h3 + 1;
                        }
                    }
                    if (HttpHeaderValues.NO_CACHE.equalsIgnoreCase(strTrim)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z3 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim)) {
                            iM216703f = yml.m216703f(strTrim2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                            iM216703f2 = yml.m216703f(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(strTrim)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                            iM216703f3 = yml.m216703f(strTrim2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            iM216703f4 = yml.m216703f(strTrim2, -1);
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
                e0lVar2 = e0lVar;
            } else {
                if (strM118875f.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                }
                i2++;
                e0lVar2 = e0lVar;
            }
            z = false;
            while (i < strM118880m.length()) {
                iM216705h = yml.m216705h(strM118880m, i, "=,;");
                strTrim = strM118880m.substring(i, iM216705h).trim();
                if (iM216705h != strM118880m.length()) {
                    iM216705h2 = iM216705h + 1;
                    strTrim2 = null;
                } else {
                    iM216705h2 = iM216705h + 1;
                    strTrim2 = null;
                }
                if (HttpHeaderValues.NO_CACHE.equalsIgnoreCase(strTrim)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z3 = true;
                } else {
                    if ("max-age".equalsIgnoreCase(strTrim)) {
                        iM216703f = yml.m216703f(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iM216703f2 = yml.m216703f(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iM216703f3 = yml.m216703f(strTrim2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iM216703f4 = yml.m216703f(strTrim2, -1);
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
            e0lVar2 = e0lVar;
        }
        return new yx3(z2, z3, iM216703f, iM216703f2, z4, z5, z6, iM216703f3, iM216703f4, z7, z8, z9, !z ? null : str);
    }

    /* JADX INFO: renamed from: a */
    public final String m217672a() {
        StringBuilder sb = new StringBuilder();
        if (this.f201904a) {
            sb.append("no-cache, ");
        }
        if (this.f201905b) {
            sb.append("no-store, ");
        }
        if (this.f201906c != -1) {
            sb.append("max-age=");
            sb.append(this.f201906c);
            sb.append(", ");
        }
        if (this.f201907d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f201907d);
            sb.append(", ");
        }
        if (this.f201908e) {
            sb.append("private, ");
        }
        if (this.f201909f) {
            sb.append("public, ");
        }
        if (this.f201910g) {
            sb.append("must-revalidate, ");
        }
        if (this.f201911h != -1) {
            sb.append("max-stale=");
            sb.append(this.f201911h);
            sb.append(", ");
        }
        if (this.f201912i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f201912i);
            sb.append(", ");
        }
        if (this.f201913j) {
            sb.append("only-if-cached, ");
        }
        if (this.f201914k) {
            sb.append("no-transform, ");
        }
        if (this.f201915l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m217673b() {
        return this.f201908e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m217674c() {
        return this.f201909f;
    }

    /* JADX INFO: renamed from: d */
    public int m217675d() {
        return this.f201906c;
    }

    /* JADX INFO: renamed from: e */
    public int m217676e() {
        return this.f201911h;
    }

    /* JADX INFO: renamed from: f */
    public int m217677f() {
        return this.f201912i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m217678g() {
        return this.f201910g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m217679h() {
        return this.f201904a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m217680i() {
        return this.f201905b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m217681j() {
        return this.f201913j;
    }

    public String toString() {
        String str = this.f201916m;
        if (str != null) {
            return str;
        }
        String strM217672a = m217672a();
        this.f201916m = strM217672a;
        return strM217672a;
    }

    public yx3(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f201904a = z;
        this.f201905b = z2;
        this.f201906c = i;
        this.f201907d = i2;
        this.f201908e = z3;
        this.f201909f = z4;
        this.f201910g = z5;
        this.f201911h = i3;
        this.f201912i = i4;
        this.f201913j = z6;
        this.f201914k = z7;
        this.f201915l = z8;
        this.f201916m = str;
    }
}
