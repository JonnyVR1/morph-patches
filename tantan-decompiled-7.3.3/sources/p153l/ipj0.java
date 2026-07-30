package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class ipj0 {

    /* JADX INFO: renamed from: a */
    private int f116284a;

    public ipj0(int i) {
        this.f116284a = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m141482a() {
        return (this.f116284a & 16) == 16;
    }

    /* JADX INFO: renamed from: b */
    public boolean m141483b() {
        return (this.f116284a & 64) == 64;
    }

    /* JADX INFO: renamed from: c */
    public boolean m141484c() {
        int i = this.f116284a;
        return (i & 256) == 256 || (i & 512) == 512;
    }

    /* JADX INFO: renamed from: d */
    public boolean m141485d() {
        return (this.f116284a & 2) == 2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m141486e() {
        return (this.f116284a & 128) == 128;
    }
}
