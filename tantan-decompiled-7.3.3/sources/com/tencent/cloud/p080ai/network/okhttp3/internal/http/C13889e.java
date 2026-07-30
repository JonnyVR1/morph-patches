package com.tencent.cloud.p080ai.network.okhttp3.internal.http;

import com.tencent.cloud.p080ai.network.okhttp3.EnumC13931q;
import java.net.ProtocolException;
import org.eclipse.jetty.http.HttpVersions;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http.e */
/* JADX INFO: loaded from: classes12.dex */
public final class C13889e {

    /* JADX INFO: renamed from: a */
    public final EnumC13931q f57430a;

    /* JADX INFO: renamed from: b */
    public final int f57431b;

    /* JADX INFO: renamed from: c */
    public final String f57432c;

    public C13889e(EnumC13931q enumC13931q, int i, String str) {
        this.f57430a = enumC13931q;
        this.f57431b = i;
        this.f57432c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C13889e m82891a(String str) throws ProtocolException {
        EnumC13931q enumC13931q;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC13931q = EnumC13931q.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC13931q = EnumC13931q.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            enumC13931q = EnumC13931q.HTTP_1_0;
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
            return new C13889e(enumC13931q, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57430a == EnumC13931q.HTTP_1_0 ? HttpVersions.HTTP_1_0 : HttpVersions.HTTP_1_1);
        sb.append(' ');
        sb.append(this.f57431b);
        if (this.f57432c != null) {
            sb.append(' ');
            sb.append(this.f57432c);
        }
        return sb.toString();
    }
}
