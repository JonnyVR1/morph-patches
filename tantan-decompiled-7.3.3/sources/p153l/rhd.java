package p153l;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class rhd implements nj80<ByteBuffer> {
    public static final rhd INSTANCE = new rhd();

    /* JADX INFO: renamed from: a */
    public static int f163155a = 16384;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<ByteBuffer> f163156b = new C19847a();

    /* JADX INFO: renamed from: l.rhd$a */
    public class C19847a extends ThreadLocal<ByteBuffer> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(rhd.f163155a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m181515c() {
        return f163155a;
    }

    @Override // p153l.nj80
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer acquire() {
        return f163156b.get();
    }

    @Override // p153l.nj80
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean release(ByteBuffer byteBuffer) {
        return true;
    }
}
