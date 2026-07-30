package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class c1r0 extends w0r0 {
    public c1r0() {
        m204328l("PING", null);
        m204327k("0");
        m204324h(0);
    }

    @Override // p153l.w0r0
    /* JADX INFO: renamed from: d */
    public ByteBuffer mo107635d(ByteBuffer byteBuffer) {
        return m204332p().length == 0 ? byteBuffer : super.mo107635d(byteBuffer);
    }

    @Override // p153l.w0r0
    /* JADX INFO: renamed from: x */
    public int mo107636x() {
        if (m204332p().length == 0) {
            return 0;
        }
        return super.mo107636x();
    }
}
