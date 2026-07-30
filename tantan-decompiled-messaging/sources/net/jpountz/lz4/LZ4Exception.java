package net.jpountz.lz4;

/* JADX INFO: loaded from: classes2.dex */
public class LZ4Exception extends RuntimeException {
    private static final long serialVersionUID = 1;

    public LZ4Exception(String str, Throwable th) {
        super(str, th);
    }

    public LZ4Exception(String str) {
        super(str);
    }

    public LZ4Exception() {
    }
}
