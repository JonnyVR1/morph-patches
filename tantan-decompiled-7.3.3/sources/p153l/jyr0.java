package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class jyr0 extends xox0 {

    /* JADX INFO: renamed from: k */
    public ByteBuffer f123195k;

    public jyr0(String str) {
        super(str);
    }

    @Override // p153l.xox0
    /* JADX INFO: renamed from: c */
    public final void mo99380c(ByteBuffer byteBuffer) {
        this.f123195k = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
