package tech.sud.runtime.component.p144g;

import java.io.EOFException;
import java.io.InputStream;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22424b {

    /* JADX INFO: renamed from: a */
    private int f207754a;

    /* JADX INFO: renamed from: b */
    private int f207755b;

    /* JADX INFO: renamed from: c */
    private byte[] f207756c;

    public C22424b(InputStream inputStream) {
        m221814b(inputStream);
    }

    /* JADX INFO: renamed from: b */
    private void m221814b(InputStream inputStream) {
        byte[] bArrM221828a = C22425c.m221828a(inputStream);
        this.f207756c = bArrM221828a;
        this.f207754a = bArrM221828a.length;
        this.f207755b = 0;
    }

    /* JADX INFO: renamed from: g */
    private byte m221815g() throws EOFException {
        int i = this.f207755b;
        if (i < this.f207754a) {
            byte[] bArr = this.f207756c;
            this.f207755b = i + 1;
            return bArr[i];
        }
        throw new EOFException("Reached EOF, file size=" + this.f207754a);
    }

    /* JADX INFO: renamed from: a */
    public String m221817a(int i) throws EOFException {
        int i2 = this.f207755b;
        if (i + i2 <= this.f207754a) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f207756c, i2, bArr, 0, i);
            this.f207755b += i;
            return new String(bArr, (i <= 0 || bArr[0] != 0) ? "ISO-8859-1" : CharEncoding.UTF_16BE);
        }
        throw new EOFException("Reached EOF, file size=" + this.f207754a);
    }

    /* JADX INFO: renamed from: c */
    public int m221822c() {
        return (int) ((((((((long) m221823d()) << 8) + ((long) m221823d())) << 8) + ((long) m221823d())) << 8) + ((long) m221823d()));
    }

    /* JADX INFO: renamed from: d */
    public int m221823d() throws EOFException {
        byte bM221815g = m221815g();
        return bM221815g < 0 ? bM221815g + 256 : bM221815g;
    }

    /* JADX INFO: renamed from: e */
    public long m221824e() {
        return (((((((long) m221823d()) << 8) + ((long) m221823d())) << 8) + ((long) m221823d())) << 8) + ((long) m221823d());
    }

    /* JADX INFO: renamed from: f */
    public int m221825f() {
        return m221823d() + (m221823d() << 8);
    }

    /* JADX INFO: renamed from: b */
    public byte m221820b() {
        return m221815g();
    }

    /* JADX INFO: renamed from: b */
    public void m221821b(long j) {
        m221819a(((long) this.f207755b) + j);
    }

    /* JADX INFO: renamed from: a */
    public int m221816a() {
        return this.f207755b;
    }

    /* JADX INFO: renamed from: a */
    public static C22427e m221813a(InputStream inputStream) {
        C22427e c22427e = new C22427e();
        c22427e.m221836a(new C22424b(inputStream));
        return c22427e;
    }

    /* JADX INFO: renamed from: a */
    public String m221818a(int i, int i2) throws EOFException {
        int i3 = this.f207755b;
        if (i + i3 <= this.f207754a) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f207756c, i3, bArr, 0, i);
            this.f207755b += i;
            return new String(bArr, CharEncoding.UTF_16BE);
        }
        throw new EOFException("Reached EOF, file size=" + this.f207754a);
    }

    /* JADX INFO: renamed from: a */
    public void m221819a(long j) {
        if (j <= this.f207754a && j >= 0) {
            this.f207755b = (int) j;
            return;
        }
        throw new EOFException("Reached EOF, file size=" + this.f207754a + " offset=" + j);
    }
}
