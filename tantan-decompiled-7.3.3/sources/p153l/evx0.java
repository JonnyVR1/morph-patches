package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzig;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public class evx0 extends fux0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public sqr0 f96055b;

    /* JADX INFO: renamed from: c */
    public final tux0 f96056c = new tux0();

    /* JADX INFO: renamed from: d */
    @Nullable
    public ByteBuffer f96057d;

    /* JADX INFO: renamed from: e */
    public boolean f96058e;

    /* JADX INFO: renamed from: f */
    public long f96059f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ByteBuffer f96060g;

    /* JADX INFO: renamed from: h */
    public final int f96061h;

    static {
        cts0.m112551b("media3.decoder");
    }

    public evx0(int i, int i2) {
        this.f96061h = i;
    }

    @Override // p153l.fux0
    /* JADX INFO: renamed from: b */
    public void mo122858b() {
        super.mo122858b();
        ByteBuffer byteBuffer = this.f96057d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f96060g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f96058e = false;
    }

    @EnsuresNonNull({"data"})
    /* JADX INFO: renamed from: i */
    public final void m122859i(int i) {
        ByteBuffer byteBuffer = this.f96057d;
        if (byteBuffer == null) {
            this.f96057d = m122862l(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.f96057d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM122862l = m122862l(i2);
        byteBufferM122862l.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM122862l.put(byteBuffer);
        }
        this.f96057d = byteBufferM122862l;
    }

    /* JADX INFO: renamed from: j */
    public final void m122860j() {
        ByteBuffer byteBuffer = this.f96057d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f96060g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m122861k() {
        return m127552d(1073741824);
    }

    /* JADX INFO: renamed from: l */
    public final ByteBuffer m122862l(int i) {
        int i2 = this.f96061h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f96057d;
        throw new zzig(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }
}
