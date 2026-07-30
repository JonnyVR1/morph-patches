package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class fwa0 extends gse {
    public fwa0(kse kseVar, fse fseVar, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(fseVar.f99061a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = fseVar.f99063c + (j * ((long) fseVar.f99065e));
        this.f104168a = kseVar.m147056B(byteBufferAllocate, j2);
        this.f104169b = kseVar.m147056B(byteBufferAllocate, 4 + j2);
        this.f104170c = kseVar.m147056B(byteBufferAllocate, 8 + j2);
        this.f104171d = kseVar.m147056B(byteBufferAllocate, j2 + 20);
    }
}
