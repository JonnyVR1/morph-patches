package p006l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cmd0 {

    /* JADX INFO: renamed from: a */
    public boolean f9731a;

    /* JADX INFO: renamed from: b */
    public int f9732b;

    public cmd0(int i) {
        this.f9731a = false;
        this.f9732b = 0;
        if (i > 0) {
            this.f9731a = true;
            this.f9732b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public cmd0 m13529a(int i) {
        if (i > 0) {
            this.f9731a = true;
            this.f9732b = i;
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m13530b() {
        return this.f9732b == 3;
    }
}
