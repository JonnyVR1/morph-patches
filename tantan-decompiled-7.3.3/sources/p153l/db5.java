package p153l;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface db5 extends Closeable, qim, kyk, lyk {
    /* JADX INFO: renamed from: G */
    qim mo97947G();

    /* JADX INFO: renamed from: Y */
    qvb0 mo97948Y();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: g0 */
    boolean mo97951g0();

    int getHeight();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();
}
