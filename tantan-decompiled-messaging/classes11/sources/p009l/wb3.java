package p009l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wb3 {

    /* JADX INFO: renamed from: a */
    public int f21983a;

    /* JADX INFO: renamed from: b */
    public int f21984b;

    /* JADX INFO: renamed from: c */
    public int f21985c;

    /* JADX INFO: renamed from: d */
    public int f21986d;

    public wb3(int i, int i2, int i3, int i4) {
        this.f21983a = i;
        this.f21984b = i2;
        this.f21985c = i3;
        this.f21986d = i4;
    }

    /* JADX INFO: renamed from: b */
    public static wb3 m24042b() {
        return new wb3(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public int m24043a() {
        return this.f21983a + this.f21984b + this.f21985c + this.f21986d;
    }

    /* JADX INFO: renamed from: c */
    public void m24044c(int i, int i2, int i3, int i4) {
        if (i >= 0) {
            this.f21983a = i;
        }
        if (i2 >= 0) {
            this.f21984b = i2;
        }
        if (i3 >= 0) {
            this.f21985c = i3;
        }
        if (i4 >= 0) {
            this.f21986d = i4;
        }
    }
}
