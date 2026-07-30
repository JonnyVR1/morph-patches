package p153l;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes.dex */
public class kzh0 {

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal<CharsetDecoder> f129418c = new C18315a();

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<Charset> f129419d = new C18316b();

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<CharBuffer> f129420e = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public int f129421a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f129422b;

    /* JADX INFO: renamed from: l.kzh0$a */
    public static class C18315a extends ThreadLocal<CharsetDecoder> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CharsetDecoder initialValue() {
            return Charset.forName("UTF-8").newDecoder();
        }
    }

    /* JADX INFO: renamed from: l.kzh0$b */
    public static class C18316b extends ThreadLocal<Charset> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Charset initialValue() {
            return Charset.forName("UTF-8");
        }
    }

    /* JADX INFO: renamed from: a */
    public int m152173a(int i) {
        return i + this.f129422b.getInt(i);
    }

    /* JADX INFO: renamed from: b */
    public int m152174b(int i) {
        int i2 = this.f129421a;
        int i3 = i2 - this.f129422b.getInt(i2);
        if (i < this.f129422b.getShort(i3)) {
            return this.f129422b.getShort(i3 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m152175c(int i) {
        int i2 = i + this.f129421a;
        return i2 + this.f129422b.getInt(i2) + 4;
    }

    /* JADX INFO: renamed from: d */
    public int m152176d(int i) {
        int i2 = i + this.f129421a;
        return this.f129422b.getInt(i2 + this.f129422b.getInt(i2));
    }
}
