package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class wrq0 extends qrq0 {
    public wrq0() {
        m176092l("PING", null);
        m176091k("0");
        m176088h(0);
    }

    @Override // p149l.qrq0
    /* JADX INFO: renamed from: d */
    public ByteBuffer mo176086d(ByteBuffer byteBuffer) {
        return m176096p().length == 0 ? byteBuffer : super.mo176086d(byteBuffer);
    }

    @Override // p149l.qrq0
    /* JADX INFO: renamed from: x */
    public int mo176104x() {
        if (m176096p().length == 0) {
            return 0;
        }
        return super.mo176104x();
    }
}
