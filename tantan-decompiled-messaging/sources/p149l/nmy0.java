package p149l;

import androidx.annotation.IntRange;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class nmy0 extends ylx0 {

    /* JADX INFO: renamed from: i */
    public long f139685i;

    /* JADX INFO: renamed from: j */
    public int f139686j;

    /* JADX INFO: renamed from: k */
    public int f139687k;

    public nmy0() {
        super(2, 0);
        this.f139687k = 32;
    }

    @Override // p149l.ylx0, p149l.zkx0
    /* JADX INFO: renamed from: b */
    public final void mo160161b() {
        super.mo160161b();
        this.f139686j = 0;
    }

    /* JADX INFO: renamed from: m */
    public final int m160162m() {
        return this.f139686j;
    }

    /* JADX INFO: renamed from: n */
    public final long m160163n() {
        return this.f139685i;
    }

    /* JADX INFO: renamed from: o */
    public final void m160164o(@IntRange(from = 1) int i) {
        this.f139687k = i;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m160165p(ylx0 ylx0Var) {
        ByteBuffer byteBuffer;
        f5v0.m119533d(!ylx0Var.m219211d(1073741824));
        f5v0.m119533d(!ylx0Var.m219211d(268435456));
        f5v0.m119533d(!ylx0Var.m219211d(4));
        if (m160166q()) {
            if (this.f139686j >= this.f139687k) {
                return false;
            }
            ByteBuffer byteBuffer2 = ylx0Var.f198945d;
            if (byteBuffer2 != null && (byteBuffer = this.f198945d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.f139686j;
        this.f139686j = i + 1;
        if (i == 0) {
            this.f198947f = ylx0Var.f198947f;
            if (ylx0Var.m219211d(1)) {
                m219210c(1);
            }
        }
        ByteBuffer byteBuffer3 = ylx0Var.f198945d;
        if (byteBuffer3 != null) {
            m215311i(byteBuffer3.remaining());
            this.f198945d.put(byteBuffer3);
        }
        this.f139685i = ylx0Var.f198947f;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m160166q() {
        return this.f139686j > 0;
    }
}
