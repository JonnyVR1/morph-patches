package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class vzx0 extends ztx0 {

    /* JADX INFO: renamed from: a */
    public final char f183692a;

    public vzx0(char c) {
        this.f183692a = c;
    }

    @Override // p149l.gby0
    /* JADX INFO: renamed from: a */
    public final boolean mo125350a(char c) {
        return c == this.f183692a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f183692a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
