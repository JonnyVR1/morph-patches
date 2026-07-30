package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class uor0 extends ThreadLocal {
    public uor0(vor0 vor0Var) {
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
