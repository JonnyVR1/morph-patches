package p149l;

/* JADX INFO: loaded from: classes.dex */
public class hhd0 {

    /* JADX INFO: renamed from: a */
    public int f107704a = 0;

    /* JADX INFO: renamed from: b */
    public int f107705b = 0;

    /* JADX INFO: renamed from: c */
    public int f107706c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f107707d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public int f107708e = 0;

    /* JADX INFO: renamed from: f */
    public int f107709f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f107710g = false;

    /* JADX INFO: renamed from: h */
    public boolean f107711h = false;

    /* JADX INFO: renamed from: a */
    public int m130946a() {
        return this.f107710g ? this.f107704a : this.f107705b;
    }

    /* JADX INFO: renamed from: b */
    public int m130947b() {
        return this.f107704a;
    }

    /* JADX INFO: renamed from: c */
    public int m130948c() {
        return this.f107705b;
    }

    /* JADX INFO: renamed from: d */
    public int m130949d() {
        return this.f107710g ? this.f107705b : this.f107704a;
    }

    /* JADX INFO: renamed from: e */
    public void m130950e(int i, int i2) {
        this.f107711h = false;
        if (i != Integer.MIN_VALUE) {
            this.f107708e = i;
            this.f107704a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f107709f = i2;
            this.f107705b = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m130951f(boolean z) {
        if (z == this.f107710g) {
            return;
        }
        this.f107710g = z;
        if (!this.f107711h) {
            this.f107704a = this.f107708e;
            this.f107705b = this.f107709f;
            return;
        }
        if (z) {
            int i = this.f107707d;
            if (i == Integer.MIN_VALUE) {
                i = this.f107708e;
            }
            this.f107704a = i;
            int i2 = this.f107706c;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f107709f;
            }
            this.f107705b = i2;
            return;
        }
        int i3 = this.f107706c;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f107708e;
        }
        this.f107704a = i3;
        int i4 = this.f107707d;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f107709f;
        }
        this.f107705b = i4;
    }

    /* JADX INFO: renamed from: g */
    public void m130952g(int i, int i2) {
        this.f107706c = i;
        this.f107707d = i2;
        this.f107711h = true;
        if (this.f107710g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f107704a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f107705b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f107704a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f107705b = i2;
        }
    }
}
