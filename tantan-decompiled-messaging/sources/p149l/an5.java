package p149l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class an5 {

    /* JADX INFO: renamed from: a */
    private int f70706a;

    /* JADX INFO: renamed from: b */
    private String f70707b;

    /* JADX INFO: renamed from: c */
    private String f70708c;

    /* JADX INFO: renamed from: d */
    private int f70709d;

    /* JADX INFO: renamed from: e */
    private int f70710e;

    public an5(int i, String str, String str2) {
        this.f70706a = i;
        this.f70707b = str;
        this.f70708c = str2;
    }

    /* JADX INFO: renamed from: a */
    private boolean m97709a() {
        return this.f70707b.equals(this.f70708c);
    }

    /* JADX INFO: renamed from: c */
    private String m97710c(String str) {
        String str2 = "[" + str.substring(this.f70709d, (str.length() - this.f70710e) + 1) + Constants.AES_SUFFIX;
        if (this.f70709d > 0) {
            str2 = m97711d() + str2;
        }
        if (this.f70710e <= 0) {
            return str2;
        }
        return str2 + m97712e();
    }

    /* JADX INFO: renamed from: d */
    private String m97711d() {
        int i = this.f70709d;
        int i2 = this.f70706a;
        return (i > i2 ? "..." : "").concat(this.f70707b.substring(Math.max(0, i - i2), this.f70709d));
    }

    /* JADX INFO: renamed from: e */
    private String m97712e() {
        int iMin = Math.min((this.f70707b.length() - this.f70710e) + 1 + this.f70706a, this.f70707b.length());
        String str = this.f70707b;
        return str.substring((str.length() - this.f70710e) + 1, iMin).concat((this.f70707b.length() - this.f70710e) + 1 < this.f70707b.length() - this.f70706a ? "..." : "");
    }

    /* JADX INFO: renamed from: f */
    private void m97713f() {
        this.f70709d = 0;
        int iMin = Math.min(this.f70707b.length(), this.f70708c.length());
        while (true) {
            int i = this.f70709d;
            if (i >= iMin || this.f70707b.charAt(i) != this.f70708c.charAt(this.f70709d)) {
                return;
            } else {
                this.f70709d++;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m97714g() {
        int length = this.f70707b.length() - 1;
        int length2 = this.f70708c.length() - 1;
        while (true) {
            int i = this.f70709d;
            if (length2 < i || length < i || this.f70707b.charAt(length) != this.f70708c.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.f70710e = this.f70707b.length() - length;
    }

    /* JADX INFO: renamed from: b */
    public String m97715b(String str) {
        if (this.f70707b == null || this.f70708c == null || m97709a()) {
            return m11.m152559f(str, this.f70707b, this.f70708c);
        }
        m97713f();
        m97714g();
        return m11.m152559f(str, m97710c(this.f70707b), m97710c(this.f70708c));
    }
}
