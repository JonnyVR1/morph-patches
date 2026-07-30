package p149l;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface da5 extends Closeable, ngm, uvk, vvk {
    /* JADX INFO: renamed from: G */
    ngm mo110564G();

    /* JADX INFO: renamed from: X */
    mnb0 mo110565X();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: f0 */
    boolean mo110566f0();

    @Override // p149l.ngm
    int getHeight();

    int getSizeInBytes();

    @Override // p149l.ngm
    int getWidth();

    boolean isClosed();
}
