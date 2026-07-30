package p149l;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class lgd implements hb80<ByteBuffer> {
    public static final lgd INSTANCE = new lgd();

    /* JADX INFO: renamed from: a */
    public static int f127974a = 16384;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<ByteBuffer> f127975b = new C18219a();

    /* JADX INFO: renamed from: l.lgd$a */
    public class C18219a extends ThreadLocal<ByteBuffer> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(lgd.f127974a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m149774c() {
        return f127974a;
    }

    @Override // p149l.hb80
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer acquire() {
        return f127975b.get();
    }

    @Override // p149l.hb80
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean release(ByteBuffer byteBuffer) {
        return true;
    }
}
