package p153l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class eo5 {

    /* JADX INFO: renamed from: a */
    private int f94866a;

    /* JADX INFO: renamed from: b */
    private String f94867b;

    /* JADX INFO: renamed from: c */
    private String f94868c;

    /* JADX INFO: renamed from: d */
    private int f94869d;

    /* JADX INFO: renamed from: e */
    private int f94870e;

    public eo5(int i, String str, String str2) {
        this.f94866a = i;
        this.f94867b = str;
        this.f94868c = str2;
    }

    /* JADX INFO: renamed from: a */
    private boolean m121719a() {
        return this.f94867b.equals(this.f94868c);
    }

    /* JADX INFO: renamed from: c */
    private String m121720c(String str) {
        String str2 = "[" + str.substring(this.f94869d, (str.length() - this.f94870e) + 1) + Constants.AES_SUFFIX;
        if (this.f94869d > 0) {
            str2 = m121721d() + str2;
        }
        if (this.f94870e <= 0) {
            return str2;
        }
        return str2 + m121722e();
    }

    /* JADX INFO: renamed from: d */
    private String m121721d() {
        int i = this.f94869d;
        int i2 = this.f94866a;
        return (i > i2 ? "..." : "").concat(this.f94867b.substring(Math.max(0, i - i2), this.f94869d));
    }

    /* JADX INFO: renamed from: e */
    private String m121722e() {
        int iMin = Math.min((this.f94867b.length() - this.f94870e) + 1 + this.f94866a, this.f94867b.length());
        String str = this.f94867b;
        return str.substring((str.length() - this.f94870e) + 1, iMin).concat((this.f94867b.length() - this.f94870e) + 1 < this.f94867b.length() - this.f94866a ? "..." : "");
    }

    /* JADX INFO: renamed from: f */
    private void m121723f() {
        this.f94869d = 0;
        int iMin = Math.min(this.f94867b.length(), this.f94868c.length());
        while (true) {
            int i = this.f94869d;
            if (i >= iMin || this.f94867b.charAt(i) != this.f94868c.charAt(this.f94869d)) {
                return;
            } else {
                this.f94869d++;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m121724g() {
        int length = this.f94867b.length() - 1;
        int length2 = this.f94868c.length() - 1;
        while (true) {
            int i = this.f94869d;
            if (length2 < i || length < i || this.f94867b.charAt(length) != this.f94868c.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.f94870e = this.f94867b.length() - length;
    }

    /* JADX INFO: renamed from: b */
    public String m121725b(String str) {
        if (this.f94867b == null || this.f94868c == null || m121719a()) {
            return t11.m188832f(str, this.f94867b, this.f94868c);
        }
        m121723f();
        m121724g();
        return t11.m188832f(str, m121720c(this.f94867b), m121720c(this.f94868c));
    }
}
