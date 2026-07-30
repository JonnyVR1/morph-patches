package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class vee extends ese {
    public vee(kse kseVar, fse fseVar, long j, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(fseVar.f99061a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 8));
        this.f93005a = kseVar.m147056B(byteBufferAllocate, j2);
        this.f93006b = kseVar.m147056B(byteBufferAllocate, j2 + 4);
    }
}
