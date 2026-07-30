package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class vs4 {

    /* JADX INFO: renamed from: a */
    private char[] f185556a;

    /* JADX INFO: renamed from: b */
    private int f185557b;

    public vs4(int i) {
        this.f185556a = new char[i];
    }

    /* JADX INFO: renamed from: a */
    public void m202570a(char c) {
        int i = this.f185557b;
        char[] cArr = this.f185556a;
        if (i < cArr.length - 1) {
            cArr[i] = c;
            this.f185557b = i + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m202571b() {
        this.f185557b = 0;
    }

    /* JADX INFO: renamed from: c */
    public int m202572c() {
        return this.f185557b;
    }

    public String toString() {
        return new String(this.f185556a, 0, this.f185557b);
    }
}
