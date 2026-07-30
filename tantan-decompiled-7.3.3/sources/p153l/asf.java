package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface asf extends e6c {
    /* JADX INFO: renamed from: b */
    boolean mo99898b(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* JADX INFO: renamed from: c */
    int mo99899c(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: f */
    void mo99900f(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: g */
    boolean mo99901g(byte[] bArr, int i, int i2, boolean z) throws IOException;

    long getLength();

    long getPosition();

    /* JADX INFO: renamed from: h */
    void mo99902h();

    /* JADX INFO: renamed from: k */
    long mo99903k();

    /* JADX INFO: renamed from: m */
    void mo99904m(int i) throws IOException;

    /* JADX INFO: renamed from: o */
    void mo99905o(int i) throws IOException;

    /* JADX INFO: renamed from: p */
    boolean mo99906p(int i, boolean z) throws IOException;

    @Override // p153l.e6c
    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;

    int skip(int i) throws IOException;
}
