package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class nte extends jte {

    /* JADX INFO: renamed from: j */
    private final ote f143598j;

    public nte(boolean z, ote oteVar) throws IOException {
        this.f122576a = z;
        this.f143598j = oteVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f122577b = oteVar.m169089t(byteBufferAllocate, 16L);
        this.f122578c = oteVar.m169090u(byteBufferAllocate, 32L);
        this.f122579d = oteVar.m169090u(byteBufferAllocate, 40L);
        this.f122580e = oteVar.m169089t(byteBufferAllocate, 54L);
        this.f122581f = oteVar.m169089t(byteBufferAllocate, 56L);
        this.f122582g = oteVar.m169089t(byteBufferAllocate, 58L);
        this.f122583h = oteVar.m169089t(byteBufferAllocate, 60L);
        this.f122584i = oteVar.m169089t(byteBufferAllocate, 62L);
    }

    @Override // p153l.jte
    /* JADX INFO: renamed from: a */
    public ite mo146905a(long j, int i) throws IOException {
        return new age(this.f143598j, this, j, i);
    }

    @Override // p153l.jte
    /* JADX INFO: renamed from: b */
    public kte mo146906b(long j) throws IOException {
        return new k4b0(this.f143598j, this, j);
    }

    @Override // p153l.jte
    /* JADX INFO: renamed from: c */
    public lte mo146907c(int i) throws IOException {
        return new xee0(this.f143598j, this, i);
    }
}
