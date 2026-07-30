package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class mte extends jte {

    /* JADX INFO: renamed from: j */
    private final ote f138602j;

    public mte(boolean z, ote oteVar) throws IOException {
        this.f122576a = z;
        this.f138602j = oteVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f122577b = oteVar.m169089t(byteBufferAllocate, 16L);
        this.f122578c = oteVar.m169084B(byteBufferAllocate, 28L);
        this.f122579d = oteVar.m169084B(byteBufferAllocate, 32L);
        this.f122580e = oteVar.m169089t(byteBufferAllocate, 42L);
        this.f122581f = oteVar.m169089t(byteBufferAllocate, 44L);
        this.f122582g = oteVar.m169089t(byteBufferAllocate, 46L);
        this.f122583h = oteVar.m169089t(byteBufferAllocate, 48L);
        this.f122584i = oteVar.m169089t(byteBufferAllocate, 50L);
    }

    @Override // p153l.jte
    /* JADX INFO: renamed from: a */
    public ite mo146905a(long j, int i) throws IOException {
        return new zfe(this.f138602j, this, j, i);
    }

    @Override // p153l.jte
    /* JADX INFO: renamed from: b */
    public kte mo146906b(long j) throws IOException {
        return new j4b0(this.f138602j, this, j);
    }

    @Override // p153l.jte
    /* JADX INFO: renamed from: c */
    public lte mo146907c(int i) throws IOException {
        return new wee0(this.f138602j, this, i);
    }
}
