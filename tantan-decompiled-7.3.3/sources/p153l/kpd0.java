package p153l;

/* JADX INFO: loaded from: classes.dex */
public class kpd0 {

    /* JADX INFO: renamed from: a */
    public int f127876a = 0;

    /* JADX INFO: renamed from: b */
    public int f127877b = 0;

    /* JADX INFO: renamed from: c */
    public int f127878c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f127879d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public int f127880e = 0;

    /* JADX INFO: renamed from: f */
    public int f127881f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f127882g = false;

    /* JADX INFO: renamed from: h */
    public boolean f127883h = false;

    /* JADX INFO: renamed from: a */
    public int m150713a() {
        return this.f127882g ? this.f127876a : this.f127877b;
    }

    /* JADX INFO: renamed from: b */
    public int m150714b() {
        return this.f127876a;
    }

    /* JADX INFO: renamed from: c */
    public int m150715c() {
        return this.f127877b;
    }

    /* JADX INFO: renamed from: d */
    public int m150716d() {
        return this.f127882g ? this.f127877b : this.f127876a;
    }

    /* JADX INFO: renamed from: e */
    public void m150717e(int i, int i2) {
        this.f127883h = false;
        if (i != Integer.MIN_VALUE) {
            this.f127880e = i;
            this.f127876a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f127881f = i2;
            this.f127877b = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m150718f(boolean z) {
        if (z == this.f127882g) {
            return;
        }
        this.f127882g = z;
        if (!this.f127883h) {
            this.f127876a = this.f127880e;
            this.f127877b = this.f127881f;
            return;
        }
        if (z) {
            int i = this.f127879d;
            if (i == Integer.MIN_VALUE) {
                i = this.f127880e;
            }
            this.f127876a = i;
            int i2 = this.f127878c;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f127881f;
            }
            this.f127877b = i2;
            return;
        }
        int i3 = this.f127878c;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f127880e;
        }
        this.f127876a = i3;
        int i4 = this.f127879d;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f127881f;
        }
        this.f127877b = i4;
    }

    /* JADX INFO: renamed from: g */
    public void m150719g(int i, int i2) {
        this.f127878c = i;
        this.f127879d = i2;
        this.f127883h = true;
        if (this.f127882g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f127876a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f127877b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f127876a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f127877b = i2;
        }
    }
}
