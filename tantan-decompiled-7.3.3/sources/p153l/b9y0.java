package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class b9y0 extends f3y0 {

    /* JADX INFO: renamed from: a */
    public final char f75631a;

    public b9y0(char c) {
        this.f75631a = c;
    }

    @Override // p153l.mky0
    /* JADX INFO: renamed from: a */
    public final boolean mo103146a(char c) {
        return c == this.f75631a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f75631a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
