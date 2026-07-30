package p149l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class brq0 extends PrintWriter {

    /* JADX INFO: renamed from: a */
    private MessageDigest f76934a;

    /* JADX INFO: renamed from: b */
    private Charset f76935b;

    /* JADX INFO: renamed from: c */
    private C15948a f76936c;

    /* JADX INFO: renamed from: l.brq0$a */
    public static class C15948a {
        /* JADX INFO: renamed from: a */
        public boolean mo96920a(String str) {
            return true;
        }
    }

    public brq0(OutputStream outputStream, MessageDigest messageDigest, C15948a c15948a) {
        super(outputStream);
        this.f76935b = null;
        this.f76934a = messageDigest;
        this.f76936c = c15948a;
        if (messageDigest != null) {
            this.f76935b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f76934a != null) {
            C15948a c15948a = this.f76936c;
            if (c15948a == null || c15948a.mo96920a(str)) {
                this.f76934a.update(this.f76935b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f76934a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f76934a;
        if (messageDigest != null) {
            messageDigest.update(this.f76935b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
