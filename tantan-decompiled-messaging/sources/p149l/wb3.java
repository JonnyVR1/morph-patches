package p149l;

/* JADX INFO: loaded from: classes11.dex */
public class wb3 {

    /* JADX INFO: renamed from: a */
    public int f185546a;

    /* JADX INFO: renamed from: b */
    public int f185547b;

    /* JADX INFO: renamed from: c */
    public int f185548c;

    /* JADX INFO: renamed from: d */
    public int f185549d;

    public wb3(int i, int i2, int i3, int i4) {
        this.f185546a = i;
        this.f185547b = i2;
        this.f185548c = i3;
        this.f185549d = i4;
    }

    /* JADX INFO: renamed from: b */
    public static wb3 m202502b() {
        return new wb3(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public int m202503a() {
        return this.f185546a + this.f185547b + this.f185548c + this.f185549d;
    }

    /* JADX INFO: renamed from: c */
    public void m202504c(int i, int i2, int i3, int i4) {
        if (i >= 0) {
            this.f185546a = i;
        }
        if (i2 >= 0) {
            this.f185547b = i2;
        }
        if (i3 >= 0) {
            this.f185548c = i3;
        }
        if (i4 >= 0) {
            this.f185549d = i4;
        }
    }
}
