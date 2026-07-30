package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class jse extends fse {

    /* JADX INFO: renamed from: j */
    private final kse f119495j;

    public jse(boolean z, kse kseVar) throws IOException {
        this.f99061a = z;
        this.f119495j = kseVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f99062b = kseVar.m147061t(byteBufferAllocate, 16L);
        this.f99063c = kseVar.m147062u(byteBufferAllocate, 32L);
        this.f99064d = kseVar.m147062u(byteBufferAllocate, 40L);
        this.f99065e = kseVar.m147061t(byteBufferAllocate, 54L);
        this.f99066f = kseVar.m147061t(byteBufferAllocate, 56L);
        this.f99067g = kseVar.m147061t(byteBufferAllocate, 58L);
        this.f99068h = kseVar.m147061t(byteBufferAllocate, 60L);
        this.f99069i = kseVar.m147061t(byteBufferAllocate, 62L);
    }

    @Override // p149l.fse
    /* JADX INFO: renamed from: a */
    public ese mo122927a(long j, int i) throws IOException {
        return new wee(this.f119495j, this, j, i);
    }

    @Override // p149l.fse
    /* JADX INFO: renamed from: b */
    public gse mo122928b(long j) throws IOException {
        return new gwa0(this.f119495j, this, j);
    }

    @Override // p149l.fse
    /* JADX INFO: renamed from: c */
    public hse mo122929c(int i) throws IOException {
        return new s6e0(this.f119495j, this, i);
    }
}
