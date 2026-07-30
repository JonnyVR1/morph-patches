package p149l;

/* JADX INFO: loaded from: classes.dex */
public interface by00 {
    @i5e
    default long now() {
        return nowNanos() / 1000000;
    }

    @i5e
    long nowNanos();
}
