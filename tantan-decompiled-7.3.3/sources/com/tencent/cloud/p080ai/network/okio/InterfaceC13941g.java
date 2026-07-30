package com.tencent.cloud.p080ai.network.okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.g */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC13941g extends InterfaceC13957w, ReadableByteChannel {
    /* JADX INFO: renamed from: a */
    int mo83079a(C13950p c13950p);

    /* JADX INFO: renamed from: a */
    long mo83081a(byte b);

    /* JADX INFO: renamed from: a */
    ByteString mo83085a(long j);

    /* JADX INFO: renamed from: a */
    C13939e mo83087a();

    /* JADX INFO: renamed from: a */
    String mo83095a(Charset charset);

    /* JADX INFO: renamed from: b */
    int mo83097b();

    /* JADX INFO: renamed from: b */
    void mo83103b(C13939e c13939e, long j);

    /* JADX INFO: renamed from: b */
    boolean mo83104b(long j);

    /* JADX INFO: renamed from: c */
    long mo83105c();

    /* JADX INFO: renamed from: c */
    String mo83107c(long j);

    /* JADX INFO: renamed from: d */
    InputStream mo83109d();

    /* JADX INFO: renamed from: d */
    void mo83110d(long j);

    /* JADX INFO: renamed from: e */
    String mo83113e();

    /* JADX INFO: renamed from: f */
    void mo83116f(long j);

    /* JADX INFO: renamed from: g */
    boolean mo83118g();

    /* JADX INFO: renamed from: g */
    byte[] mo83119g(long j);

    /* JADX INFO: renamed from: h */
    byte[] mo83122h();

    /* JADX INFO: renamed from: j */
    short mo83126j();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();
}
