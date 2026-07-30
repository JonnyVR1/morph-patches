package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzig;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public class ylx0 extends zkx0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public mhr0 f198943b;

    /* JADX INFO: renamed from: c */
    public final nlx0 f198944c = new nlx0();

    /* JADX INFO: renamed from: d */
    @Nullable
    public ByteBuffer f198945d;

    /* JADX INFO: renamed from: e */
    public boolean f198946e;

    /* JADX INFO: renamed from: f */
    public long f198947f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ByteBuffer f198948g;

    /* JADX INFO: renamed from: h */
    public final int f198949h;

    static {
        wjs0.m203497b("media3.decoder");
    }

    public ylx0(int i, int i2) {
        this.f198949h = i;
    }

    @Override // p149l.zkx0
    /* JADX INFO: renamed from: b */
    public void mo160161b() {
        super.mo160161b();
        ByteBuffer byteBuffer = this.f198945d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f198948g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f198946e = false;
    }

    @EnsuresNonNull({"data"})
    /* JADX INFO: renamed from: i */
    public final void m215311i(int i) {
        ByteBuffer byteBuffer = this.f198945d;
        if (byteBuffer == null) {
            this.f198945d = m215314l(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.f198945d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM215314l = m215314l(i2);
        byteBufferM215314l.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM215314l.put(byteBuffer);
        }
        this.f198945d = byteBufferM215314l;
    }

    /* JADX INFO: renamed from: j */
    public final void m215312j() {
        ByteBuffer byteBuffer = this.f198945d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f198948g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m215313k() {
        return m219211d(1073741824);
    }

    /* JADX INFO: renamed from: l */
    public final ByteBuffer m215314l(int i) {
        int i2 = this.f198949h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f198945d;
        throw new zzig(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }
}
