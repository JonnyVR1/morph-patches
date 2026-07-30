package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class g7w0 {

    /* JADX INFO: renamed from: a */
    public long[] f102626a;

    public g7w0(int i) {
        int i2 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        this.f102626a = new long[i2];
    }

    public g7w0() {
        this(16);
    }
}
