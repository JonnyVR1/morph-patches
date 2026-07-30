package com.tencent.cloud.p075ai.network.okhttp3.internal.http;

import com.tencent.cloud.p075ai.network.okhttp3.EnumC13768q;
import java.net.ProtocolException;
import org.eclipse.jetty.http.HttpVersions;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http.e */
/* JADX INFO: loaded from: classes13.dex */
public final class C13726e {

    /* JADX INFO: renamed from: a */
    public final EnumC13768q f56582a;

    /* JADX INFO: renamed from: b */
    public final int f56583b;

    /* JADX INFO: renamed from: c */
    public final String f56584c;

    public C13726e(EnumC13768q enumC13768q, int i, String str) {
        this.f56582a = enumC13768q;
        this.f56583b = i;
        this.f56584c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C13726e m81708a(String str) throws ProtocolException {
        EnumC13768q enumC13768q;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC13768q = EnumC13768q.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC13768q = EnumC13768q.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            enumC13768q = EnumC13768q.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C13726e(enumC13768q, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56582a == EnumC13768q.HTTP_1_0 ? HttpVersions.HTTP_1_0 : HttpVersions.HTTP_1_1);
        sb.append(' ');
        sb.append(this.f56583b);
        if (this.f56584c != null) {
            sb.append(' ');
            sb.append(this.f56584c);
        }
        return sb.toString();
    }
}
