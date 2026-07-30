package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class s6e0 extends hse {
    public s6e0(kse kseVar, fse fseVar, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(fseVar.f99061a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f109314a = kseVar.m147056B(byteBufferAllocate, fseVar.f99064d + ((long) (i * fseVar.f99067g)) + 44);
    }
}
