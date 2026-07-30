package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class wr4 {

    /* JADX INFO: renamed from: a */
    private char[] f187759a;

    /* JADX INFO: renamed from: b */
    private int f187760b;

    public wr4(int i) {
        this.f187759a = new char[i];
    }

    /* JADX INFO: renamed from: a */
    public void m205089a(char c) {
        int i = this.f187760b;
        char[] cArr = this.f187759a;
        if (i < cArr.length - 1) {
            cArr[i] = c;
            this.f187760b = i + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m205090b() {
        this.f187760b = 0;
    }

    /* JADX INFO: renamed from: c */
    public int m205091c() {
        return this.f187760b;
    }

    public String toString() {
        return new String(this.f187759a, 0, this.f187760b);
    }
}
