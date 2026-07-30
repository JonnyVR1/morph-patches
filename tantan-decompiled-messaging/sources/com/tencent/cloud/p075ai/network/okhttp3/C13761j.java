package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.j */
/* JADX INFO: loaded from: classes13.dex */
public final class C13761j {

    /* JADX INFO: renamed from: e */
    public static final C13701g[] f56875e;

    /* JADX INFO: renamed from: f */
    public static final C13701g[] f56876f;

    /* JADX INFO: renamed from: g */
    public static final C13761j f56877g;

    /* JADX INFO: renamed from: h */
    public static final C13761j f56878h;

    /* JADX INFO: renamed from: a */
    public final boolean f56879a;

    /* JADX INFO: renamed from: b */
    public final boolean f56880b;

    /* JADX INFO: renamed from: c */
    public final String[] f56881c;

    /* JADX INFO: renamed from: d */
    public final String[] f56882d;

    static {
        C13701g c13701g = C13701g.f56448q;
        C13701g c13701g2 = C13701g.f56449r;
        C13701g c13701g3 = C13701g.f56450s;
        C13701g c13701g4 = C13701g.f56442k;
        C13701g c13701g5 = C13701g.f56444m;
        C13701g c13701g6 = C13701g.f56443l;
        C13701g c13701g7 = C13701g.f56445n;
        C13701g c13701g8 = C13701g.f56447p;
        C13701g c13701g9 = C13701g.f56446o;
        C13701g[] c13701gArr = {c13701g, c13701g2, c13701g3, c13701g4, c13701g5, c13701g6, c13701g7, c13701g8, c13701g9};
        f56875e = c13701gArr;
        C13701g[] c13701gArr2 = {c13701g, c13701g2, c13701g3, c13701g4, c13701g5, c13701g6, c13701g7, c13701g8, c13701g9, C13701g.f56440i, C13701g.f56441j, C13701g.f56438g, C13701g.f56439h, C13701g.f56436e, C13701g.f56437f, C13701g.f56435d};
        f56876f = c13701gArr2;
        a aVarM81827a = new a(true).m81827a(c13701gArr);
        EnumC13771t enumC13771t = EnumC13771t.TLS_1_3;
        EnumC13771t enumC13771t2 = EnumC13771t.TLS_1_2;
        aVarM81827a.m81828a(enumC13771t, enumC13771t2).m81826a(true).m81830a();
        f56877g = new a(true).m81827a(c13701gArr2).m81828a(enumC13771t, enumC13771t2).m81826a(true).m81830a();
        new a(true).m81827a(c13701gArr2).m81828a(enumC13771t, enumC13771t2, EnumC13771t.TLS_1_1, EnumC13771t.TLS_1_0).m81826a(true).m81830a();
        f56878h = new a(false).m81830a();
    }

    public C13761j(a aVar) {
        this.f56879a = aVar.f56883a;
        this.f56881c = aVar.f56884b;
        this.f56882d = aVar.f56885c;
        this.f56880b = aVar.f56886d;
    }

    /* JADX INFO: renamed from: a */
    public boolean m81825a(SSLSocket sSLSocket) {
        if (!this.f56879a) {
            return false;
        }
        String[] strArr = this.f56882d;
        if (strArr != null && !C13706c.m81625b(C13706c.f56463i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f56881c;
        return strArr2 == null || C13706c.m81625b(C13701g.f56433b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13761j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13761j c13761j = (C13761j) obj;
        boolean z = this.f56879a;
        if (z != c13761j.f56879a) {
            return false;
        }
        return !z || (Arrays.equals(this.f56881c, c13761j.f56881c) && Arrays.equals(this.f56882d, c13761j.f56882d) && this.f56880b == c13761j.f56880b);
    }

    public int hashCode() {
        if (this.f56879a) {
            return ((((Arrays.hashCode(this.f56881c) + 527) * 31) + Arrays.hashCode(this.f56882d)) * 31) + (!this.f56880b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        List listUnmodifiableList;
        if (!this.f56879a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f56881c;
        List listUnmodifiableList2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C13701g.m81595a(str));
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        } else {
            listUnmodifiableList = null;
        }
        sb.append(Objects.toString(listUnmodifiableList, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.f56882d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(EnumC13771t.m81882a(str2));
            }
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        }
        sb.append(Objects.toString(listUnmodifiableList2, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f56880b);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f56883a;

        /* JADX INFO: renamed from: b */
        public String[] f56884b;

        /* JADX INFO: renamed from: c */
        public String[] f56885c;

        /* JADX INFO: renamed from: d */
        public boolean f56886d;

        public a(C13761j c13761j) {
            this.f56883a = c13761j.f56879a;
            this.f56884b = c13761j.f56881c;
            this.f56885c = c13761j.f56882d;
            this.f56886d = c13761j.f56880b;
        }

        /* JADX INFO: renamed from: a */
        public a m81827a(C13701g... c13701gArr) {
            if (!this.f56883a) {
                qkq0.m175383a("no cipher suites for cleartext connections");
                return null;
            }
            String[] strArr = new String[c13701gArr.length];
            for (int i = 0; i < c13701gArr.length; i++) {
                strArr[i] = c13701gArr[i].f56451a;
            }
            return m81829a(strArr);
        }

        /* JADX INFO: renamed from: b */
        public a m81831b(String... strArr) {
            if (!this.f56883a) {
                qkq0.m175383a("no TLS versions for cleartext connections");
                return null;
            }
            if (strArr.length != 0) {
                this.f56885c = (String[]) strArr.clone();
                return this;
            }
            ig3.m135964a("At least one TLS version is required");
            return null;
        }

        public a(boolean z) {
            this.f56883a = z;
        }

        /* JADX INFO: renamed from: a */
        public a m81829a(String... strArr) {
            if (this.f56883a) {
                if (strArr.length != 0) {
                    this.f56884b = (String[]) strArr.clone();
                    return this;
                }
                ig3.m135964a("At least one cipher suite is required");
                return null;
            }
            qkq0.m175383a("no cipher suites for cleartext connections");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public a m81828a(EnumC13771t... enumC13771tArr) {
            if (this.f56883a) {
                String[] strArr = new String[enumC13771tArr.length];
                for (int i = 0; i < enumC13771tArr.length; i++) {
                    strArr[i] = enumC13771tArr[i].f56951a;
                }
                return m81831b(strArr);
            }
            qkq0.m175383a("no TLS versions for cleartext connections");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public a m81826a(boolean z) {
            if (this.f56883a) {
                this.f56886d = z;
                return this;
            }
            qkq0.m175383a("no TLS extensions for cleartext connections");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public C13761j m81830a() {
            return new C13761j(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m81824a() {
        return this.f56879a;
    }
}
