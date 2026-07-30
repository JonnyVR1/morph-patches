package org.junit.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class Throwables {
    private Throwables() {
    }

    public static Exception rethrowAsException(Throwable th) throws Exception {
        rethrow(th);
        return null;
    }

    private static <T extends Throwable> void rethrow(Throwable th) throws Throwable {
        throw th;
    }
}
