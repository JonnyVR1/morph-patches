package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class ayr0 extends ThreadLocal {
    public ayr0(byr0 byr0Var) {
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
