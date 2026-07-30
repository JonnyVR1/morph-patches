package p149l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class vzf0 implements Closeable {

    /* JADX INFO: renamed from: a */
    private final InputStream f183624a;

    /* JADX INFO: renamed from: b */
    private final Charset f183625b;

    /* JADX INFO: renamed from: c */
    private byte[] f183626c;

    /* JADX INFO: renamed from: d */
    private int f183627d;

    /* JADX INFO: renamed from: e */
    private int f183628e;

    /* JADX INFO: renamed from: l.vzf0$a */
    public class C20774a extends ByteArrayOutputStream {
        public C20774a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, vzf0.this.f183625b.name());
            } catch (UnsupportedEncodingException e) {
                y9g0.m213537a(e);
                return null;
            }
        }
    }

    public vzf0(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            ig3.m135964a("capacity <= 0");
            throw null;
        }
        if (!charset.equals(cdk0.f80374a)) {
            ig3.m135964a("Unsupported encoding");
            throw null;
        }
        this.f183624a = inputStream;
        this.f183625b = charset;
        this.f183626c = new byte[i];
    }

    /* JADX INFO: renamed from: k */
    private void m200756k() throws IOException {
        InputStream inputStream = this.f183624a;
        byte[] bArr = this.f183626c;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            hg3.m130807a();
        } else {
            this.f183627d = 0;
            this.f183628e = i;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f183624a) {
            try {
                if (this.f183626c != null) {
                    this.f183626c = null;
                    this.f183624a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m200757m() {
        return this.f183628e == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX INFO: renamed from: n */
    public String m200758n() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f183624a) {
            try {
                if (this.f183626c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f183627d >= this.f183628e) {
                    m200756k();
                }
                for (int i3 = this.f183627d; i3 != this.f183628e; i3++) {
                    byte[] bArr2 = this.f183626c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f183627d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i3;
                            }
                        } else {
                            i2 = i3;
                        }
                        String str = new String(bArr2, i4, i2 - i4, this.f183625b.name());
                        this.f183627d = i3 + 1;
                        return str;
                    }
                }
                C20774a c20774a = new C20774a((this.f183628e - this.f183627d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f183626c;
                    int i5 = this.f183627d;
                    c20774a.write(bArr3, i5, this.f183628e - i5);
                    this.f183628e = -1;
                    m200756k();
                    i = this.f183627d;
                    while (i != this.f183628e) {
                        bArr = this.f183626c;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.f183627d;
                if (i != i6) {
                    c20774a.write(bArr, i6, i - i6);
                }
                this.f183627d = i + 1;
                return c20774a.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public vzf0(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }
}
