package p153l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class c8g0 implements Closeable {

    /* JADX INFO: renamed from: a */
    private final InputStream f80207a;

    /* JADX INFO: renamed from: b */
    private final Charset f80208b;

    /* JADX INFO: renamed from: c */
    private byte[] f80209c;

    /* JADX INFO: renamed from: d */
    private int f80210d;

    /* JADX INFO: renamed from: e */
    private int f80211e;

    /* JADX INFO: renamed from: l.c8g0$a */
    public class C16210a extends ByteArrayOutputStream {
        public C16210a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, c8g0.this.f80208b.name());
            } catch (UnsupportedEncodingException e) {
                gig0.m130323a(e);
                return null;
            }
        }
    }

    public c8g0(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            wg3.m206174a("capacity <= 0");
            throw null;
        }
        if (!charset.equals(imk0.f115784a)) {
            wg3.m206174a("Unsupported encoding");
            throw null;
        }
        this.f80207a = inputStream;
        this.f80208b = charset;
        this.f80209c = new byte[i];
    }

    /* JADX INFO: renamed from: k */
    private void m108359k() throws IOException {
        InputStream inputStream = this.f80207a;
        byte[] bArr = this.f80209c;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            vg3.m201207a();
        } else {
            this.f80210d = 0;
            this.f80211e = i;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f80207a) {
            try {
                if (this.f80209c != null) {
                    this.f80209c = null;
                    this.f80207a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m108360m() {
        return this.f80211e == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX INFO: renamed from: n */
    public String m108361n() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f80207a) {
            try {
                if (this.f80209c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f80210d >= this.f80211e) {
                    m108359k();
                }
                for (int i3 = this.f80210d; i3 != this.f80211e; i3++) {
                    byte[] bArr2 = this.f80209c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f80210d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i3;
                            }
                        } else {
                            i2 = i3;
                        }
                        String str = new String(bArr2, i4, i2 - i4, this.f80208b.name());
                        this.f80210d = i3 + 1;
                        return str;
                    }
                }
                C16210a c16210a = new C16210a((this.f80211e - this.f80210d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f80209c;
                    int i5 = this.f80210d;
                    c16210a.write(bArr3, i5, this.f80211e - i5);
                    this.f80211e = -1;
                    m108359k();
                    i = this.f80210d;
                    while (i != this.f80211e) {
                        bArr = this.f80209c;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.f80210d;
                if (i != i6) {
                    c16210a.write(bArr, i6, i - i6);
                }
                this.f80210d = i + 1;
                return c16210a.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c8g0(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }
}
