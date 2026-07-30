package p153l;

/* JADX INFO: loaded from: classes10.dex */
public class lc3 {

    /* JADX INFO: renamed from: a */
    public int f131267a;

    /* JADX INFO: renamed from: b */
    public int f131268b;

    /* JADX INFO: renamed from: c */
    public int f131269c;

    /* JADX INFO: renamed from: d */
    public int f131270d;

    public lc3(int i, int i2, int i3, int i4) {
        this.f131267a = i;
        this.f131268b = i2;
        this.f131269c = i3;
        this.f131270d = i4;
    }

    /* JADX INFO: renamed from: b */
    public static lc3 m153618b() {
        return new lc3(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public int m153619a() {
        return this.f131267a + this.f131268b + this.f131269c + this.f131270d;
    }

    /* JADX INFO: renamed from: c */
    public void m153620c(int i, int i2, int i3, int i4) {
        if (i >= 0) {
            this.f131267a = i;
        }
        if (i2 >= 0) {
            this.f131268b = i2;
        }
        if (i3 >= 0) {
            this.f131269c = i3;
        }
        if (i4 >= 0) {
            this.f131270d = i4;
        }
    }
}
