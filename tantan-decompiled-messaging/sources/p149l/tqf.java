package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface tqf extends w4c {
    /* JADX INFO: renamed from: c */
    boolean mo150653c(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* JADX INFO: renamed from: d */
    int mo150654d(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: f */
    void mo150655f(byte[] bArr, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: g */
    boolean mo150656g(byte[] bArr, int i, int i2, boolean z) throws IOException;

    long getLength();

    long getPosition();

    /* JADX INFO: renamed from: h */
    void mo150657h();

    /* JADX INFO: renamed from: k */
    long mo150659k();

    /* JADX INFO: renamed from: m */
    void mo150660m(int i) throws IOException;

    /* JADX INFO: renamed from: o */
    void mo150661o(int i) throws IOException;

    /* JADX INFO: renamed from: p */
    boolean mo150662p(int i, boolean z) throws IOException;

    @Override // p149l.w4c
    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;

    int skip(int i) throws IOException;
}
