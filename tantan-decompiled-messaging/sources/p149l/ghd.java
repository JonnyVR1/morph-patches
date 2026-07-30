package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ghd {

    /* JADX INFO: renamed from: a */
    public final byte[] f102644a;

    /* JADX INFO: renamed from: b */
    public int f102645b;

    /* JADX INFO: renamed from: c */
    public final String f102646c;

    /* JADX INFO: renamed from: d */
    public final List<byte[]> f102647d;

    /* JADX INFO: renamed from: e */
    public final String f102648e;

    /* JADX INFO: renamed from: f */
    public Integer f102649f;

    /* JADX INFO: renamed from: g */
    public Integer f102650g;

    /* JADX INFO: renamed from: h */
    public Object f102651h;

    /* JADX INFO: renamed from: i */
    public final int f102652i;

    /* JADX INFO: renamed from: j */
    public final int f102653j;

    public ghd(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f102644a = bArr;
        this.f102645b = bArr == null ? 0 : bArr.length * 8;
        this.f102646c = str;
        this.f102647d = list;
        this.f102648e = str2;
        this.f102652i = i2;
        this.f102653j = i;
    }

    /* JADX INFO: renamed from: a */
    public List<byte[]> m126164a() {
        return this.f102647d;
    }

    /* JADX INFO: renamed from: b */
    public String m126165b() {
        return this.f102648e;
    }

    /* JADX INFO: renamed from: c */
    public int m126166c() {
        return this.f102645b;
    }

    /* JADX INFO: renamed from: d */
    public Object m126167d() {
        return this.f102651h;
    }

    /* JADX INFO: renamed from: e */
    public byte[] m126168e() {
        return this.f102644a;
    }

    /* JADX INFO: renamed from: f */
    public int m126169f() {
        return this.f102652i;
    }

    /* JADX INFO: renamed from: g */
    public int m126170g() {
        return this.f102653j;
    }

    /* JADX INFO: renamed from: h */
    public String m126171h() {
        return this.f102646c;
    }

    /* JADX INFO: renamed from: i */
    public boolean m126172i() {
        return this.f102652i >= 0 && this.f102653j >= 0;
    }

    /* JADX INFO: renamed from: j */
    public void m126173j(Integer num) {
        this.f102650g = num;
    }

    /* JADX INFO: renamed from: k */
    public void m126174k(Integer num) {
        this.f102649f = num;
    }

    /* JADX INFO: renamed from: l */
    public void m126175l(int i) {
        this.f102645b = i;
    }

    /* JADX INFO: renamed from: m */
    public void m126176m(Object obj) {
        this.f102651h = obj;
    }

    public ghd(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }
}
