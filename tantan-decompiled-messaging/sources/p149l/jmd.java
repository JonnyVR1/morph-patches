package p149l;

/* JADX INFO: loaded from: classes.dex */
public abstract class jmd extends th2 {
    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        tsf.m190560z("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
