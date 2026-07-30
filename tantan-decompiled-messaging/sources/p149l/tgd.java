package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class tgd extends vgd {

    /* JADX INFO: renamed from: b */
    public final String f170085b;

    /* JADX INFO: renamed from: c */
    public final int f170086c;

    /* JADX INFO: renamed from: d */
    public final boolean f170087d;

    public tgd(int i, String str) {
        super(i);
        this.f170085b = str;
        this.f170087d = false;
        this.f170086c = 0;
    }

    /* JADX INFO: renamed from: b */
    public String m188805b() {
        return this.f170085b;
    }

    /* JADX INFO: renamed from: c */
    public int m188806c() {
        return this.f170086c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m188807d() {
        return this.f170087d;
    }

    public tgd(int i, String str, int i2) {
        super(i);
        this.f170087d = true;
        this.f170086c = i2;
        this.f170085b = str;
    }
}
