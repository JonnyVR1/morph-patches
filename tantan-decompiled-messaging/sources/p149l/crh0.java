package p149l;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes.dex */
public class crh0 {

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal<CharsetDecoder> f82216c = new C16226a();

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<Charset> f82217d = new C16227b();

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<CharBuffer> f82218e = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public int f82219a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f82220b;

    /* JADX INFO: renamed from: l.crh0$a */
    public static class C16226a extends ThreadLocal<CharsetDecoder> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CharsetDecoder initialValue() {
            return Charset.forName("UTF-8").newDecoder();
        }
    }

    /* JADX INFO: renamed from: l.crh0$b */
    public static class C16227b extends ThreadLocal<Charset> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Charset initialValue() {
            return Charset.forName("UTF-8");
        }
    }

    /* JADX INFO: renamed from: a */
    public int m108362a(int i) {
        return i + this.f82220b.getInt(i);
    }

    /* JADX INFO: renamed from: b */
    public int m108363b(int i) {
        int i2 = this.f82219a;
        int i3 = i2 - this.f82220b.getInt(i2);
        if (i < this.f82220b.getShort(i3)) {
            return this.f82220b.getShort(i3 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m108364c(int i) {
        int i2 = i + this.f82219a;
        return i2 + this.f82220b.getInt(i2) + 4;
    }

    /* JADX INFO: renamed from: d */
    public int m108365d(int i) {
        int i2 = i + this.f82219a;
        return this.f82220b.getInt(i2 + this.f82220b.getInt(i2));
    }
}
