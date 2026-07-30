package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mid {

    /* JADX INFO: renamed from: a */
    public final byte[] f136947a;

    /* JADX INFO: renamed from: b */
    public int f136948b;

    /* JADX INFO: renamed from: c */
    public final String f136949c;

    /* JADX INFO: renamed from: d */
    public final List<byte[]> f136950d;

    /* JADX INFO: renamed from: e */
    public final String f136951e;

    /* JADX INFO: renamed from: f */
    public Integer f136952f;

    /* JADX INFO: renamed from: g */
    public Integer f136953g;

    /* JADX INFO: renamed from: h */
    public Object f136954h;

    /* JADX INFO: renamed from: i */
    public final int f136955i;

    /* JADX INFO: renamed from: j */
    public final int f136956j;

    public mid(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f136947a = bArr;
        this.f136948b = bArr == null ? 0 : bArr.length * 8;
        this.f136949c = str;
        this.f136950d = list;
        this.f136951e = str2;
        this.f136955i = i2;
        this.f136956j = i;
    }

    /* JADX INFO: renamed from: a */
    public List<byte[]> m158487a() {
        return this.f136950d;
    }

    /* JADX INFO: renamed from: b */
    public String m158488b() {
        return this.f136951e;
    }

    /* JADX INFO: renamed from: c */
    public int m158489c() {
        return this.f136948b;
    }

    /* JADX INFO: renamed from: d */
    public Object m158490d() {
        return this.f136954h;
    }

    /* JADX INFO: renamed from: e */
    public byte[] m158491e() {
        return this.f136947a;
    }

    /* JADX INFO: renamed from: f */
    public int m158492f() {
        return this.f136955i;
    }

    /* JADX INFO: renamed from: g */
    public int m158493g() {
        return this.f136956j;
    }

    /* JADX INFO: renamed from: h */
    public String m158494h() {
        return this.f136949c;
    }

    /* JADX INFO: renamed from: i */
    public boolean m158495i() {
        return this.f136955i >= 0 && this.f136956j >= 0;
    }

    /* JADX INFO: renamed from: j */
    public void m158496j(Integer num) {
        this.f136953g = num;
    }

    /* JADX INFO: renamed from: k */
    public void m158497k(Integer num) {
        this.f136952f = num;
    }

    /* JADX INFO: renamed from: l */
    public void m158498l(int i) {
        this.f136948b = i;
    }

    /* JADX INFO: renamed from: m */
    public void m158499m(Object obj) {
        this.f136954h = obj;
    }

    public mid(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }
}
