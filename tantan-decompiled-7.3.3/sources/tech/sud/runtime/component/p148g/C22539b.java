package tech.sud.runtime.component.p148g;

import java.io.EOFException;
import java.io.InputStream;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22539b {

    /* JADX INFO: renamed from: a */
    private int f208676a;

    /* JADX INFO: renamed from: b */
    private int f208677b;

    /* JADX INFO: renamed from: c */
    private byte[] f208678c;

    public C22539b(InputStream inputStream) {
        m223060b(inputStream);
    }

    /* JADX INFO: renamed from: b */
    private void m223060b(InputStream inputStream) {
        byte[] bArrM223074a = C22540c.m223074a(inputStream);
        this.f208678c = bArrM223074a;
        this.f208676a = bArrM223074a.length;
        this.f208677b = 0;
    }

    /* JADX INFO: renamed from: g */
    private byte m223061g() throws EOFException {
        int i = this.f208677b;
        if (i < this.f208676a) {
            byte[] bArr = this.f208678c;
            this.f208677b = i + 1;
            return bArr[i];
        }
        throw new EOFException("Reached EOF, file size=" + this.f208676a);
    }

    /* JADX INFO: renamed from: a */
    public String m223063a(int i) throws EOFException {
        int i2 = this.f208677b;
        if (i + i2 <= this.f208676a) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f208678c, i2, bArr, 0, i);
            this.f208677b += i;
            return new String(bArr, (i <= 0 || bArr[0] != 0) ? "ISO-8859-1" : CharEncoding.UTF_16BE);
        }
        throw new EOFException("Reached EOF, file size=" + this.f208676a);
    }

    /* JADX INFO: renamed from: c */
    public int m223068c() {
        return (int) ((((((((long) m223069d()) << 8) + ((long) m223069d())) << 8) + ((long) m223069d())) << 8) + ((long) m223069d()));
    }

    /* JADX INFO: renamed from: d */
    public int m223069d() throws EOFException {
        byte bM223061g = m223061g();
        return bM223061g < 0 ? bM223061g + 256 : bM223061g;
    }

    /* JADX INFO: renamed from: e */
    public long m223070e() {
        return (((((((long) m223069d()) << 8) + ((long) m223069d())) << 8) + ((long) m223069d())) << 8) + ((long) m223069d());
    }

    /* JADX INFO: renamed from: f */
    public int m223071f() {
        return m223069d() + (m223069d() << 8);
    }

    /* JADX INFO: renamed from: b */
    public byte m223066b() {
        return m223061g();
    }

    /* JADX INFO: renamed from: b */
    public void m223067b(long j) {
        m223065a(((long) this.f208677b) + j);
    }

    /* JADX INFO: renamed from: a */
    public int m223062a() {
        return this.f208677b;
    }

    /* JADX INFO: renamed from: a */
    public static C22542e m223059a(InputStream inputStream) {
        C22542e c22542e = new C22542e();
        c22542e.m223082a(new C22539b(inputStream));
        return c22542e;
    }

    /* JADX INFO: renamed from: a */
    public String m223064a(int i, int i2) throws EOFException {
        int i3 = this.f208677b;
        if (i + i3 <= this.f208676a) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f208678c, i3, bArr, 0, i);
            this.f208677b += i;
            return new String(bArr, CharEncoding.UTF_16BE);
        }
        throw new EOFException("Reached EOF, file size=" + this.f208676a);
    }

    /* JADX INFO: renamed from: a */
    public void m223065a(long j) {
        if (j <= this.f208676a && j >= 0) {
            this.f208677b = (int) j;
            return;
        }
        throw new EOFException("Reached EOF, file size=" + this.f208676a + " offset=" + j);
    }
}
