package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class j4b0 extends kte {
    public j4b0(ote oteVar, jte jteVar, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(jteVar.f122576a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = jteVar.f122578c + (j * ((long) jteVar.f122580e));
        this.f128677a = oteVar.m169084B(byteBufferAllocate, j2);
        this.f128678b = oteVar.m169084B(byteBufferAllocate, 4 + j2);
        this.f128679c = oteVar.m169084B(byteBufferAllocate, 8 + j2);
        this.f128680d = oteVar.m169084B(byteBufferAllocate, j2 + 20);
    }
}
