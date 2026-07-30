package p153l;

/* JADX INFO: loaded from: classes12.dex */
public class eud0 {

    /* JADX INFO: renamed from: a */
    public boolean f95856a;

    /* JADX INFO: renamed from: b */
    public int f95857b;

    public eud0(int i) {
        this.f95856a = false;
        this.f95857b = 0;
        if (i > 0) {
            this.f95856a = true;
            this.f95857b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public eud0 m122559a(int i) {
        if (i > 0) {
            this.f95856a = true;
            this.f95857b = i;
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m122560b() {
        return this.f95857b == 3;
    }
}
