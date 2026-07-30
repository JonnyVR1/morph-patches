package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class gwa0 extends gse {
    public gwa0(kse kseVar, fse fseVar, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(fseVar.f99061a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = fseVar.f99063c + (j * ((long) fseVar.f99065e));
        this.f104168a = kseVar.m147056B(byteBufferAllocate, j2);
        this.f104169b = kseVar.m147062u(byteBufferAllocate, 8 + j2);
        this.f104170c = kseVar.m147062u(byteBufferAllocate, 16 + j2);
        this.f104171d = kseVar.m147062u(byteBufferAllocate, j2 + 40);
    }
}
