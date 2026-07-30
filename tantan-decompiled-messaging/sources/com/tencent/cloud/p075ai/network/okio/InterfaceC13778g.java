package com.tencent.cloud.p075ai.network.okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.g */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC13778g extends InterfaceC13794w, ReadableByteChannel {
    /* JADX INFO: renamed from: a */
    int mo81896a(C13787p c13787p);

    /* JADX INFO: renamed from: a */
    long mo81898a(byte b);

    /* JADX INFO: renamed from: a */
    ByteString mo81902a(long j);

    /* JADX INFO: renamed from: a */
    C13776e mo81904a();

    /* JADX INFO: renamed from: a */
    String mo81912a(Charset charset);

    /* JADX INFO: renamed from: b */
    int mo81914b();

    /* JADX INFO: renamed from: b */
    void mo81920b(C13776e c13776e, long j);

    /* JADX INFO: renamed from: b */
    boolean mo81921b(long j);

    /* JADX INFO: renamed from: c */
    long mo81922c();

    /* JADX INFO: renamed from: c */
    String mo81924c(long j);

    /* JADX INFO: renamed from: d */
    InputStream mo81926d();

    /* JADX INFO: renamed from: d */
    void mo81927d(long j);

    /* JADX INFO: renamed from: e */
    String mo81930e();

    /* JADX INFO: renamed from: f */
    void mo81933f(long j);

    /* JADX INFO: renamed from: g */
    boolean mo81935g();

    /* JADX INFO: renamed from: g */
    byte[] mo81936g(long j);

    /* JADX INFO: renamed from: h */
    byte[] mo81939h();

    /* JADX INFO: renamed from: j */
    short mo81943j();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();
}
