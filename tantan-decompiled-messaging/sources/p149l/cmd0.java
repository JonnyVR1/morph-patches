package p149l;

/* JADX INFO: loaded from: classes9.dex */
public class cmd0 {

    /* JADX INFO: renamed from: a */
    public boolean f81523a;

    /* JADX INFO: renamed from: b */
    public int f81524b;

    public cmd0(int i) {
        this.f81523a = false;
        this.f81524b = 0;
        if (i > 0) {
            this.f81523a = true;
            this.f81524b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public cmd0 m107610a(int i) {
        if (i > 0) {
            this.f81523a = true;
            this.f81524b = i;
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m107611b() {
        return this.f81524b == 3;
    }
}
