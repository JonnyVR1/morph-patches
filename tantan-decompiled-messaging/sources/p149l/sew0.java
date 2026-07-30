package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class sew0 extends rew0 {

    /* JADX INFO: renamed from: a */
    public final char f164070a;

    public sew0(char c) {
        this.f164070a = c;
    }

    @Override // p149l.vew0
    /* JADX INFO: renamed from: a */
    public final boolean mo183725a(char c) {
        return c == this.f164070a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f164070a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
