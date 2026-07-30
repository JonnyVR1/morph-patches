package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class dpr0 extends rfx0 {

    /* JADX INFO: renamed from: k */
    public ByteBuffer f87316k;

    public dpr0(String str) {
        super(str);
    }

    @Override // p149l.rfx0
    /* JADX INFO: renamed from: c */
    public final void mo108173c(ByteBuffer byteBuffer) {
        this.f87316k = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
