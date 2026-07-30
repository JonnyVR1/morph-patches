package com.tencent.cloud.p075ai.network.okhttp3;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.C13724c;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.d */
/* JADX INFO: loaded from: classes13.dex */
public final class C13698d {

    /* JADX INFO: renamed from: a */
    public final boolean f56407a;

    /* JADX INFO: renamed from: b */
    public final boolean f56408b;

    /* JADX INFO: renamed from: c */
    public final int f56409c;

    /* JADX INFO: renamed from: d */
    public final int f56410d;

    /* JADX INFO: renamed from: e */
    public final boolean f56411e;

    /* JADX INFO: renamed from: f */
    public final boolean f56412f;

    /* JADX INFO: renamed from: g */
    public final boolean f56413g;

    /* JADX INFO: renamed from: h */
    public final int f56414h;

    /* JADX INFO: renamed from: i */
    public final int f56415i;

    /* JADX INFO: renamed from: j */
    public final boolean f56416j;

    /* JADX INFO: renamed from: k */
    public final boolean f56417k;

    /* JADX INFO: renamed from: l */
    public final boolean f56418l;

    /* JADX INFO: renamed from: m */
    public String f56419m;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f56420a;

        /* JADX INFO: renamed from: b */
        public int f56421b = -1;

        /* JADX INFO: renamed from: c */
        public int f56422c = -1;

        /* JADX INFO: renamed from: d */
        public int f56423d = -1;

        /* JADX INFO: renamed from: e */
        public boolean f56424e;
    }

    static {
        a aVar = new a();
        aVar.f56420a = true;
        new C13698d(aVar);
        a aVar2 = new a();
        aVar2.f56424e = true;
        aVar2.f56422c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        new C13698d(aVar2);
    }

    public C13698d(a aVar) {
        this.f56407a = aVar.f56420a;
        this.f56408b = false;
        this.f56409c = aVar.f56421b;
        this.f56410d = -1;
        this.f56411e = false;
        this.f56412f = false;
        this.f56413g = false;
        this.f56414h = aVar.f56422c;
        this.f56415i = aVar.f56423d;
        this.f56416j = aVar.f56424e;
        this.f56417k = false;
        this.f56418l = false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127  */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x0158 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static C13698d m81590a(C13766o c13766o) {
        int i;
        int iM81701a;
        String strTrim;
        int i2;
        int i3;
        String strTrim2;
        int i4;
        C13766o c13766o2 = c13766o;
        int iM81845b = c13766o2.m81845b();
        int i5 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM81700a = -1;
        int iM81700a2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM81700a3 = -1;
        int iM81700a4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i5 < iM81845b) {
            String strM81844a = c13766o2.m81844a(i5);
            String strM81846b = c13766o2.m81846b(i5);
            if (strM81844a.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM81846b;
                }
                i = 0;
                while (i < strM81846b.length()) {
                    iM81701a = C13724c.m81701a(strM81846b, i, "=,;");
                    strTrim = strM81846b.substring(i, iM81701a).trim();
                    if (iM81701a != strM81846b.length() || strM81846b.charAt(iM81701a) == ',' || strM81846b.charAt(iM81701a) == ';') {
                        i2 = iM81845b;
                        i3 = iM81701a + 1;
                        strTrim2 = null;
                    } else {
                        while (true) {
                            i4 = iM81701a + 1;
                            if (i4 >= strM81846b.length()) {
                                i2 = iM81845b;
                                break;
                            }
                            char cCharAt = strM81846b.charAt(i4);
                            i2 = iM81845b;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            }
                            iM81701a = i4;
                            iM81845b = i2;
                        }
                        if (i4 >= strM81846b.length() || strM81846b.charAt(i4) != '\"') {
                            int iM81701a2 = C13724c.m81701a(strM81846b, i4, ",;");
                            strTrim2 = strM81846b.substring(i4, iM81701a2).trim();
                            i3 = iM81701a2;
                        } else {
                            int i6 = iM81701a + 2;
                            int iM81701a3 = C13724c.m81701a(strM81846b, i6, "\"");
                            strTrim2 = strM81846b.substring(i6, iM81701a3);
                            i3 = iM81701a3 + 1;
                        }
                    }
                    if (HttpHeaderValues.NO_CACHE.equalsIgnoreCase(strTrim)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z3 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim)) {
                            iM81700a = C13724c.m81700a(strTrim2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                            iM81700a2 = C13724c.m81700a(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(strTrim)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                            iM81700a3 = C13724c.m81700a(strTrim2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            iM81700a4 = C13724c.m81700a(strTrim2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(strTrim)) {
                            z9 = true;
                        }
                        i = i3;
                        iM81845b = i2;
                    }
                    i = i3;
                    iM81845b = i2;
                }
                i5++;
                c13766o2 = c13766o;
                iM81845b = iM81845b;
            } else {
                if (strM81844a.equalsIgnoreCase("Pragma")) {
                }
                i5++;
                c13766o2 = c13766o;
                iM81845b = iM81845b;
            }
            z = false;
            i = 0;
            while (i < strM81846b.length()) {
                iM81701a = C13724c.m81701a(strM81846b, i, "=,;");
                strTrim = strM81846b.substring(i, iM81701a).trim();
                if (iM81701a != strM81846b.length()) {
                    i2 = iM81845b;
                    i3 = iM81701a + 1;
                    strTrim2 = null;
                } else {
                    i2 = iM81845b;
                    i3 = iM81701a + 1;
                    strTrim2 = null;
                }
                if (HttpHeaderValues.NO_CACHE.equalsIgnoreCase(strTrim)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z3 = true;
                } else {
                    if ("max-age".equalsIgnoreCase(strTrim)) {
                        iM81700a = C13724c.m81700a(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iM81700a2 = C13724c.m81700a(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iM81700a3 = C13724c.m81700a(strTrim2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iM81700a4 = C13724c.m81700a(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z9 = true;
                    }
                    i = i3;
                    iM81845b = i2;
                }
                i = i3;
                iM81845b = i2;
            }
            i5++;
            c13766o2 = c13766o;
            iM81845b = iM81845b;
        }
        return new C13698d(z2, z3, iM81700a, iM81700a2, z4, z5, z6, iM81700a3, iM81700a4, z7, z8, z9, !z ? null : str);
    }

    public String toString() {
        String string;
        String str = this.f56419m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f56407a) {
            sb.append("no-cache, ");
        }
        if (this.f56408b) {
            sb.append("no-store, ");
        }
        if (this.f56409c != -1) {
            sb.append("max-age=");
            sb.append(this.f56409c);
            sb.append(", ");
        }
        if (this.f56410d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f56410d);
            sb.append(", ");
        }
        if (this.f56411e) {
            sb.append("private, ");
        }
        if (this.f56412f) {
            sb.append("public, ");
        }
        if (this.f56413g) {
            sb.append("must-revalidate, ");
        }
        if (this.f56414h != -1) {
            sb.append("max-stale=");
            sb.append(this.f56414h);
            sb.append(", ");
        }
        if (this.f56415i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f56415i);
            sb.append(", ");
        }
        if (this.f56416j) {
            sb.append("only-if-cached, ");
        }
        if (this.f56417k) {
            sb.append("no-transform, ");
        }
        if (this.f56418l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            string = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            string = sb.toString();
        }
        this.f56419m = string;
        return string;
    }

    public C13698d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f56407a = z;
        this.f56408b = z2;
        this.f56409c = i;
        this.f56410d = i2;
        this.f56411e = z3;
        this.f56412f = z4;
        this.f56413g = z5;
        this.f56414h = i3;
        this.f56415i = i4;
        this.f56416j = z6;
        this.f56417k = z7;
        this.f56418l = z8;
        this.f56419m = str;
    }
}
