package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ayv0 {

    /* JADX INFO: renamed from: a */
    public long[] f72310a;

    public ayv0(int i) {
        int i2 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        this.f72310a = new long[i2];
    }

    public ayv0() {
        this(16);
    }
}
