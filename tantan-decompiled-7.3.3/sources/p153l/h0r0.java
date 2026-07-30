package p153l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class h0r0 extends PrintWriter {

    /* JADX INFO: renamed from: a */
    private MessageDigest f107326a;

    /* JADX INFO: renamed from: b */
    private Charset f107327b;

    /* JADX INFO: renamed from: c */
    private C17364a f107328c;

    /* JADX INFO: renamed from: l.h0r0$a */
    public static class C17364a {
        /* JADX INFO: renamed from: a */
        public boolean mo126977a(String str) {
            return true;
        }
    }

    public h0r0(OutputStream outputStream, MessageDigest messageDigest, C17364a c17364a) {
        super(outputStream);
        this.f107327b = null;
        this.f107326a = messageDigest;
        this.f107328c = c17364a;
        if (messageDigest != null) {
            this.f107327b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f107326a != null) {
            C17364a c17364a = this.f107328c;
            if (c17364a == null || c17364a.mo126977a(str)) {
                this.f107326a.update(this.f107327b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f107326a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f107326a;
        if (messageDigest != null) {
            messageDigest.update(this.f107327b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
