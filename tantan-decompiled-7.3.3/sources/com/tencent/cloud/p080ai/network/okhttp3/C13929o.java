package com.tencent.cloud.p080ai.network.okhttp3;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p153l.c0l;
import p153l.mnd0;
import p153l.wg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.o */
/* JADX INFO: loaded from: classes12.dex */
public final class C13929o {

    /* JADX INFO: renamed from: a */
    public final String[] f57754a;

    public C13929o(a aVar) {
        List<String> list = aVar.f57755a;
        this.f57754a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: a */
    public static void m83024a(String str) {
        if (str == null) {
            mnd0.m159157a("name == null");
            return;
        }
        if (str.isEmpty()) {
            wg3.m206174a("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                wg3.m206174a(C13869c.m82788a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m83030b(String str) {
        String[] strArr = this.f57754a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m83031c(String str) {
        int iM83028b = m83028b();
        ArrayList arrayList = null;
        for (int i = 0; i < iM83028b; i++) {
            if (str.equalsIgnoreCase(m83027a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m83029b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13929o) && Arrays.equals(((C13929o) obj).f57754a, this.f57754a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f57754a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iM83028b = m83028b();
        for (int i = 0; i < iM83028b; i++) {
            sb.append(m83027a(i));
            sb.append(": ");
            sb.append(m83029b(i));
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }

    public C13929o(String[] strArr) {
        this.f57754a = strArr;
    }

    /* JADX INFO: renamed from: b */
    public int m83028b() {
        return this.f57754a.length / 2;
    }

    /* JADX INFO: renamed from: b */
    public String m83029b(int i) {
        return this.f57754a[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.o$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<String> f57755a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public a m83032a(String str) {
            int i = 0;
            while (i < this.f57755a.size()) {
                if (str.equalsIgnoreCase(this.f57755a.get(i))) {
                    this.f57755a.remove(i);
                    this.f57755a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m83033a(String str, String str2) {
            this.f57755a.add(str);
            this.f57755a.add(str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13929o m83034a() {
            return new C13929o(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public a m83026a() {
        a aVar = new a();
        Collections.addAll(aVar.f57755a, this.f57754a);
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public String m83027a(int i) {
        return this.f57754a[i * 2];
    }

    /* JADX INFO: renamed from: a */
    public static void m83025a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    wg3.m206174a(C13869c.m82788a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
                    return;
                }
            }
            return;
        }
        c0l.m107429a("value for name ", str2, " == null");
    }
}
