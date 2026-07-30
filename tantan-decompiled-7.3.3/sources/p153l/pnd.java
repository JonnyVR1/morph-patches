package p153l;

/* JADX INFO: loaded from: classes.dex */
public abstract class pnd extends ai2 {
    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        huf.m137198z("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
