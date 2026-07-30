package com.tencent.cloud.p075ai.network.okhttp3;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p149l.ig3;
import p149l.jfd0;
import p149l.mxk;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.o */
/* JADX INFO: loaded from: classes13.dex */
public final class C13766o {

    /* JADX INFO: renamed from: a */
    public final String[] f56906a;

    public C13766o(a aVar) {
        List<String> list = aVar.f56907a;
        this.f56906a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: a */
    public static void m81841a(String str) {
        if (str == null) {
            jfd0.m141176a("name == null");
            return;
        }
        if (str.isEmpty()) {
            ig3.m135964a("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                ig3.m135964a(C13706c.m81605a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m81847b(String str) {
        String[] strArr = this.f56906a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m81848c(String str) {
        int iM81845b = m81845b();
        ArrayList arrayList = null;
        for (int i = 0; i < iM81845b; i++) {
            if (str.equalsIgnoreCase(m81844a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m81846b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13766o) && Arrays.equals(((C13766o) obj).f56906a, this.f56906a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f56906a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iM81845b = m81845b();
        for (int i = 0; i < iM81845b; i++) {
            sb.append(m81844a(i));
            sb.append(": ");
            sb.append(m81846b(i));
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }

    public C13766o(String[] strArr) {
        this.f56906a = strArr;
    }

    /* JADX INFO: renamed from: b */
    public int m81845b() {
        return this.f56906a.length / 2;
    }

    /* JADX INFO: renamed from: b */
    public String m81846b(int i) {
        return this.f56906a[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.o$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<String> f56907a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public a m81849a(String str) {
            int i = 0;
            while (i < this.f56907a.size()) {
                if (str.equalsIgnoreCase(this.f56907a.get(i))) {
                    this.f56907a.remove(i);
                    this.f56907a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m81850a(String str, String str2) {
            this.f56907a.add(str);
            this.f56907a.add(str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13766o m81851a() {
            return new C13766o(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public a m81843a() {
        a aVar = new a();
        Collections.addAll(aVar.f56907a, this.f56906a);
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public String m81844a(int i) {
        return this.f56906a[i * 2];
    }

    /* JADX INFO: renamed from: a */
    public static void m81842a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    ig3.m135964a(C13706c.m81605a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
                    return;
                }
            }
            return;
        }
        mxk.m156912a("value for name ", str2, " == null");
    }
}
