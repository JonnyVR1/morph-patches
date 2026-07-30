package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class xee0 extends lte {
    public xee0(ote oteVar, jte jteVar, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(jteVar.f122576a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f133540a = oteVar.m169084B(byteBufferAllocate, jteVar.f122579d + ((long) (i * jteVar.f122582g)) + 44);
    }
}
