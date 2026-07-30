package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class ise extends fse {

    /* JADX INFO: renamed from: j */
    private final kse f114752j;

    public ise(boolean z, kse kseVar) throws IOException {
        this.f99061a = z;
        this.f114752j = kseVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f99062b = kseVar.m147061t(byteBufferAllocate, 16L);
        this.f99063c = kseVar.m147056B(byteBufferAllocate, 28L);
        this.f99064d = kseVar.m147056B(byteBufferAllocate, 32L);
        this.f99065e = kseVar.m147061t(byteBufferAllocate, 42L);
        this.f99066f = kseVar.m147061t(byteBufferAllocate, 44L);
        this.f99067g = kseVar.m147061t(byteBufferAllocate, 46L);
        this.f99068h = kseVar.m147061t(byteBufferAllocate, 48L);
        this.f99069i = kseVar.m147061t(byteBufferAllocate, 50L);
    }

    @Override // p149l.fse
    /* JADX INFO: renamed from: a */
    public ese mo122927a(long j, int i) throws IOException {
        return new vee(this.f114752j, this, j, i);
    }

    @Override // p149l.fse
    /* JADX INFO: renamed from: b */
    public gse mo122928b(long j) throws IOException {
        return new fwa0(this.f114752j, this, j);
    }

    @Override // p149l.fse
    /* JADX INFO: renamed from: c */
    public hse mo122929c(int i) throws IOException {
        return new r6e0(this.f114752j, this, i);
    }
}
