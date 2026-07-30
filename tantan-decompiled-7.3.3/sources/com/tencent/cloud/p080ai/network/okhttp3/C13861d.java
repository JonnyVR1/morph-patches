package com.tencent.cloud.p080ai.network.okhttp3;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.C13887c;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.d */
/* JADX INFO: loaded from: classes12.dex */
public final class C13861d {

    /* JADX INFO: renamed from: a */
    public final boolean f57255a;

    /* JADX INFO: renamed from: b */
    public final boolean f57256b;

    /* JADX INFO: renamed from: c */
    public final int f57257c;

    /* JADX INFO: renamed from: d */
    public final int f57258d;

    /* JADX INFO: renamed from: e */
    public final boolean f57259e;

    /* JADX INFO: renamed from: f */
    public final boolean f57260f;

    /* JADX INFO: renamed from: g */
    public final boolean f57261g;

    /* JADX INFO: renamed from: h */
    public final int f57262h;

    /* JADX INFO: renamed from: i */
    public final int f57263i;

    /* JADX INFO: renamed from: j */
    public final boolean f57264j;

    /* JADX INFO: renamed from: k */
    public final boolean f57265k;

    /* JADX INFO: renamed from: l */
    public final boolean f57266l;

    /* JADX INFO: renamed from: m */
    public String f57267m;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f57268a;

        /* JADX INFO: renamed from: b */
        public int f57269b = -1;

        /* JADX INFO: renamed from: c */
        public int f57270c = -1;

        /* JADX INFO: renamed from: d */
        public int f57271d = -1;

        /* JADX INFO: renamed from: e */
        public boolean f57272e;
    }

    static {
        a aVar = new a();
        aVar.f57268a = true;
        new C13861d(aVar);
        a aVar2 = new a();
        aVar2.f57272e = true;
        aVar2.f57270c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        new C13861d(aVar2);
    }

    public C13861d(a aVar) {
        this.f57255a = aVar.f57268a;
        this.f57256b = false;
        this.f57257c = aVar.f57269b;
        this.f57258d = -1;
        this.f57259e = false;
        this.f57260f = false;
        this.f57261g = false;
        this.f57262h = aVar.f57270c;
        this.f57263i = aVar.f57271d;
        this.f57264j = aVar.f57272e;
        this.f57265k = false;
        this.f57266l = false;
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
    public static C13861d m82773a(C13929o c13929o) {
        int i;
        int iM82884a;
        String strTrim;
        int i2;
        int i3;
        String strTrim2;
        int i4;
        C13929o c13929o2 = c13929o;
        int iM83028b = c13929o2.m83028b();
        int i5 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM82883a = -1;
        int iM82883a2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM82883a3 = -1;
        int iM82883a4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i5 < iM83028b) {
            String strM83027a = c13929o2.m83027a(i5);
            String strM83029b = c13929o2.m83029b(i5);
            if (strM83027a.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM83029b;
                }
                i = 0;
                while (i < strM83029b.length()) {
                    iM82884a = C13887c.m82884a(strM83029b, i, "=,;");
                    strTrim = strM83029b.substring(i, iM82884a).trim();
                    if (iM82884a != strM83029b.length() || strM83029b.charAt(iM82884a) == ',' || strM83029b.charAt(iM82884a) == ';') {
                        i2 = iM83028b;
                        i3 = iM82884a + 1;
                        strTrim2 = null;
                    } else {
                        while (true) {
                            i4 = iM82884a + 1;
                            if (i4 >= strM83029b.length()) {
                                i2 = iM83028b;
                                break;
                            }
                            char cCharAt = strM83029b.charAt(i4);
                            i2 = iM83028b;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            }
                            iM82884a = i4;
                            iM83028b = i2;
                        }
                        if (i4 >= strM83029b.length() || strM83029b.charAt(i4) != '\"') {
                            int iM82884a2 = C13887c.m82884a(strM83029b, i4, ",;");
                            strTrim2 = strM83029b.substring(i4, iM82884a2).trim();
                            i3 = iM82884a2;
                        } else {
                            int i6 = iM82884a + 2;
                            int iM82884a3 = C13887c.m82884a(strM83029b, i6, "\"");
                            strTrim2 = strM83029b.substring(i6, iM82884a3);
                            i3 = iM82884a3 + 1;
                        }
                    }
                    if (HttpHeaderValues.NO_CACHE.equalsIgnoreCase(strTrim)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z3 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim)) {
                            iM82883a = C13887c.m82883a(strTrim2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                            iM82883a2 = C13887c.m82883a(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(strTrim)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                            iM82883a3 = C13887c.m82883a(strTrim2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            iM82883a4 = C13887c.m82883a(strTrim2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(strTrim)) {
                            z9 = true;
                        }
                        i = i3;
                        iM83028b = i2;
                    }
                    i = i3;
                    iM83028b = i2;
                }
                i5++;
                c13929o2 = c13929o;
                iM83028b = iM83028b;
            } else {
                if (strM83027a.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                }
                i5++;
                c13929o2 = c13929o;
                iM83028b = iM83028b;
            }
            z = false;
            i = 0;
            while (i < strM83029b.length()) {
                iM82884a = C13887c.m82884a(strM83029b, i, "=,;");
                strTrim = strM83029b.substring(i, iM82884a).trim();
                if (iM82884a != strM83029b.length()) {
                    i2 = iM83028b;
                    i3 = iM82884a + 1;
                    strTrim2 = null;
                } else {
                    i2 = iM83028b;
                    i3 = iM82884a + 1;
                    strTrim2 = null;
                }
                if (HttpHeaderValues.NO_CACHE.equalsIgnoreCase(strTrim)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z3 = true;
                } else {
                    if ("max-age".equalsIgnoreCase(strTrim)) {
                        iM82883a = C13887c.m82883a(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iM82883a2 = C13887c.m82883a(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iM82883a3 = C13887c.m82883a(strTrim2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iM82883a4 = C13887c.m82883a(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z9 = true;
                    }
                    i = i3;
                    iM83028b = i2;
                }
                i = i3;
                iM83028b = i2;
            }
            i5++;
            c13929o2 = c13929o;
            iM83028b = iM83028b;
        }
        return new C13861d(z2, z3, iM82883a, iM82883a2, z4, z5, z6, iM82883a3, iM82883a4, z7, z8, z9, !z ? null : str);
    }

    public String toString() {
        String string;
        String str = this.f57267m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f57255a) {
            sb.append("no-cache, ");
        }
        if (this.f57256b) {
            sb.append("no-store, ");
        }
        if (this.f57257c != -1) {
            sb.append("max-age=");
            sb.append(this.f57257c);
            sb.append(", ");
        }
        if (this.f57258d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f57258d);
            sb.append(", ");
        }
        if (this.f57259e) {
            sb.append("private, ");
        }
        if (this.f57260f) {
            sb.append("public, ");
        }
        if (this.f57261g) {
            sb.append("must-revalidate, ");
        }
        if (this.f57262h != -1) {
            sb.append("max-stale=");
            sb.append(this.f57262h);
            sb.append(", ");
        }
        if (this.f57263i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f57263i);
            sb.append(", ");
        }
        if (this.f57264j) {
            sb.append("only-if-cached, ");
        }
        if (this.f57265k) {
            sb.append("no-transform, ");
        }
        if (this.f57266l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            string = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            string = sb.toString();
        }
        this.f57267m = string;
        return string;
    }

    public C13861d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f57255a = z;
        this.f57256b = z2;
        this.f57257c = i;
        this.f57258d = i2;
        this.f57259e = z3;
        this.f57260f = z4;
        this.f57261g = z5;
        this.f57262h = i3;
        this.f57263i = i4;
        this.f57264j = z6;
        this.f57265k = z7;
        this.f57266l = z8;
        this.f57267m = str;
    }
}
