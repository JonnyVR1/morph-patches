package p153l;

/* JADX INFO: loaded from: classes.dex */
public interface l610 {
    @w6e
    default long now() {
        return nowNanos() / 1000000;
    }

    @w6e
    long nowNanos();
}
