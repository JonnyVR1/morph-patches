package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.j */
/* JADX INFO: loaded from: classes12.dex */
public final class C13924j {

    /* JADX INFO: renamed from: e */
    public static final C13864g[] f57723e;

    /* JADX INFO: renamed from: f */
    public static final C13864g[] f57724f;

    /* JADX INFO: renamed from: g */
    public static final C13924j f57725g;

    /* JADX INFO: renamed from: h */
    public static final C13924j f57726h;

    /* JADX INFO: renamed from: a */
    public final boolean f57727a;

    /* JADX INFO: renamed from: b */
    public final boolean f57728b;

    /* JADX INFO: renamed from: c */
    public final String[] f57729c;

    /* JADX INFO: renamed from: d */
    public final String[] f57730d;

    static {
        C13864g c13864g = C13864g.f57296q;
        C13864g c13864g2 = C13864g.f57297r;
        C13864g c13864g3 = C13864g.f57298s;
        C13864g c13864g4 = C13864g.f57290k;
        C13864g c13864g5 = C13864g.f57292m;
        C13864g c13864g6 = C13864g.f57291l;
        C13864g c13864g7 = C13864g.f57293n;
        C13864g c13864g8 = C13864g.f57295p;
        C13864g c13864g9 = C13864g.f57294o;
        C13864g[] c13864gArr = {c13864g, c13864g2, c13864g3, c13864g4, c13864g5, c13864g6, c13864g7, c13864g8, c13864g9};
        f57723e = c13864gArr;
        C13864g[] c13864gArr2 = {c13864g, c13864g2, c13864g3, c13864g4, c13864g5, c13864g6, c13864g7, c13864g8, c13864g9, C13864g.f57288i, C13864g.f57289j, C13864g.f57286g, C13864g.f57287h, C13864g.f57284e, C13864g.f57285f, C13864g.f57283d};
        f57724f = c13864gArr2;
        a aVarM83010a = new a(true).m83010a(c13864gArr);
        EnumC13934t enumC13934t = EnumC13934t.TLS_1_3;
        EnumC13934t enumC13934t2 = EnumC13934t.TLS_1_2;
        aVarM83010a.m83011a(enumC13934t, enumC13934t2).m83009a(true).m83013a();
        f57725g = new a(true).m83010a(c13864gArr2).m83011a(enumC13934t, enumC13934t2).m83009a(true).m83013a();
        new a(true).m83010a(c13864gArr2).m83011a(enumC13934t, enumC13934t2, EnumC13934t.TLS_1_1, EnumC13934t.TLS_1_0).m83009a(true).m83013a();
        f57726h = new a(false).m83013a();
    }

    public C13924j(a aVar) {
        this.f57727a = aVar.f57731a;
        this.f57729c = aVar.f57732b;
        this.f57730d = aVar.f57733c;
        this.f57728b = aVar.f57734d;
    }

    /* JADX INFO: renamed from: a */
    public boolean m83008a(SSLSocket sSLSocket) {
        if (!this.f57727a) {
            return false;
        }
        String[] strArr = this.f57730d;
        if (strArr != null && !C13869c.m82808b(C13869c.f57311i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f57729c;
        return strArr2 == null || C13869c.m82808b(C13864g.f57281b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13924j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13924j c13924j = (C13924j) obj;
        boolean z = this.f57727a;
        if (z != c13924j.f57727a) {
            return false;
        }
        return !z || (Arrays.equals(this.f57729c, c13924j.f57729c) && Arrays.equals(this.f57730d, c13924j.f57730d) && this.f57728b == c13924j.f57728b);
    }

    public int hashCode() {
        if (this.f57727a) {
            return ((((Arrays.hashCode(this.f57729c) + 527) * 31) + Arrays.hashCode(this.f57730d)) * 31) + (!this.f57728b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        List listUnmodifiableList;
        if (!this.f57727a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f57729c;
        List listUnmodifiableList2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C13864g.m82778a(str));
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        } else {
            listUnmodifiableList = null;
        }
        sb.append(Objects.toString(listUnmodifiableList, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.f57730d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(EnumC13934t.m83065a(str2));
            }
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        }
        sb.append(Objects.toString(listUnmodifiableList2, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f57728b);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f57731a;

        /* JADX INFO: renamed from: b */
        public String[] f57732b;

        /* JADX INFO: renamed from: c */
        public String[] f57733c;

        /* JADX INFO: renamed from: d */
        public boolean f57734d;

        public a(C13924j c13924j) {
            this.f57731a = c13924j.f57727a;
            this.f57732b = c13924j.f57729c;
            this.f57733c = c13924j.f57730d;
            this.f57734d = c13924j.f57728b;
        }

        /* JADX INFO: renamed from: a */
        public a m83010a(C13864g... c13864gArr) {
            if (!this.f57731a) {
                wtq0.m207906a("no cipher suites for cleartext connections");
                return null;
            }
            String[] strArr = new String[c13864gArr.length];
            for (int i = 0; i < c13864gArr.length; i++) {
                strArr[i] = c13864gArr[i].f57299a;
            }
            return m83012a(strArr);
        }

        /* JADX INFO: renamed from: b */
        public a m83014b(String... strArr) {
            if (!this.f57731a) {
                wtq0.m207906a("no TLS versions for cleartext connections");
                return null;
            }
            if (strArr.length != 0) {
                this.f57733c = (String[]) strArr.clone();
                return this;
            }
            wg3.m206174a("At least one TLS version is required");
            return null;
        }

        public a(boolean z) {
            this.f57731a = z;
        }

        /* JADX INFO: renamed from: a */
        public a m83012a(String... strArr) {
            if (this.f57731a) {
                if (strArr.length != 0) {
                    this.f57732b = (String[]) strArr.clone();
                    return this;
                }
                wg3.m206174a("At least one cipher suite is required");
                return null;
            }
            wtq0.m207906a("no cipher suites for cleartext connections");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public a m83011a(EnumC13934t... enumC13934tArr) {
            if (this.f57731a) {
                String[] strArr = new String[enumC13934tArr.length];
                for (int i = 0; i < enumC13934tArr.length; i++) {
                    strArr[i] = enumC13934tArr[i].f57799a;
                }
                return m83014b(strArr);
            }
            wtq0.m207906a("no TLS versions for cleartext connections");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public a m83009a(boolean z) {
            if (this.f57731a) {
                this.f57734d = z;
                return this;
            }
            wtq0.m207906a("no TLS extensions for cleartext connections");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public C13924j m83013a() {
            return new C13924j(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m83007a() {
        return this.f57727a;
    }
}
