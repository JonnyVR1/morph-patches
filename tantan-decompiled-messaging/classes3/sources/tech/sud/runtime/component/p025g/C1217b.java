package tech.sud.runtime.component.p025g;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1217b {

    /* JADX INFO: renamed from: a */
    private int f11379a;

    /* JADX INFO: renamed from: b */
    private int f11380b;

    /* JADX INFO: renamed from: c */
    private byte[] f11381c;

    public C1217b(InputStream inputStream) {
        m10285b(inputStream);
    }

    /* JADX INFO: renamed from: b */
    private void m10285b(InputStream inputStream) {
        byte[] bArrM10299a = C1218c.m10299a(inputStream);
        this.f11381c = bArrM10299a;
        this.f11379a = bArrM10299a.length;
        this.f11380b = 0;
    }

    /* JADX INFO: renamed from: g */
    private byte m10286g() throws EOFException {
        int i = this.f11380b;
        if (i < this.f11379a) {
            byte[] bArr = this.f11381c;
            this.f11380b = i + 1;
            return bArr[i];
        }
        throw new EOFException("Reached EOF, file size=" + this.f11379a);
    }

    /* JADX INFO: renamed from: a */
    public String m10288a(int i) throws EOFException {
        int i2 = this.f11380b;
        if (i + i2 <= this.f11379a) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f11381c, i2, bArr, 0, i);
            this.f11380b += i;
            return new String(bArr, (i <= 0 || bArr[0] != 0) ? "ISO-8859-1" : "UTF-16BE");
        }
        throw new EOFException("Reached EOF, file size=" + this.f11379a);
    }

    /* JADX INFO: renamed from: c */
    public int m10293c() {
        return (int) ((((((((long) m10294d()) << 8) + ((long) m10294d())) << 8) + ((long) m10294d())) << 8) + ((long) m10294d()));
    }

    /* JADX INFO: renamed from: d */
    public int m10294d() throws EOFException {
        byte bM10286g = m10286g();
        return bM10286g < 0 ? bM10286g + 256 : bM10286g;
    }

    /* JADX INFO: renamed from: e */
    public long m10295e() {
        return (((((((long) m10294d()) << 8) + ((long) m10294d())) << 8) + ((long) m10294d())) << 8) + ((long) m10294d());
    }

    /* JADX INFO: renamed from: f */
    public int m10296f() {
        return m10294d() + (m10294d() << 8);
    }

    /* JADX INFO: renamed from: b */
    public byte m10291b() {
        return m10286g();
    }

    /* JADX INFO: renamed from: b */
    public void m10292b(long j) {
        m10290a(((long) this.f11380b) + j);
    }

    /* JADX INFO: renamed from: a */
    public int m10287a() {
        return this.f11380b;
    }

    /* JADX INFO: renamed from: a */
    public static C1220e m10284a(InputStream inputStream) {
        C1220e c1220e = new C1220e();
        c1220e.m10307a(new C1217b(inputStream));
        return c1220e;
    }

    /* JADX INFO: renamed from: a */
    public String m10289a(int i, int i2) throws EOFException {
        int i3 = this.f11380b;
        if (i + i3 <= this.f11379a) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f11381c, i3, bArr, 0, i);
            this.f11380b += i;
            return new String(bArr, "UTF-16BE");
        }
        throw new EOFException("Reached EOF, file size=" + this.f11379a);
    }

    /* JADX INFO: renamed from: a */
    public void m10290a(long j) {
        if (j <= this.f11379a && j >= 0) {
            this.f11380b = (int) j;
            return;
        }
        throw new EOFException("Reached EOF, file size=" + this.f11379a + " offset=" + j);
    }
}
