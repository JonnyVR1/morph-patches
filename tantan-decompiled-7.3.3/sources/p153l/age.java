package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class age extends ite {
    public age(ote oteVar, jte jteVar, long j, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(jteVar.f122576a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 16));
        this.f116825a = oteVar.m169090u(byteBufferAllocate, j2);
        this.f116826b = oteVar.m169090u(byteBufferAllocate, j2 + 8);
    }
}
