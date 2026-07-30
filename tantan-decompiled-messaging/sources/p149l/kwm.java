package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kwm {

    /* JADX INFO: renamed from: a */
    public int f124997a = 0;

    /* JADX INFO: renamed from: b */
    public int f124998b = -1;

    /* JADX INFO: renamed from: c */
    public int f124999c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f125000d;

    /* JADX INFO: renamed from: e */
    public int f125001e;

    public kwm() {
        int[] iArr = new int[16];
        this.f125000d = iArr;
        this.f125001e = iArr.length - 1;
    }

    /* JADX INFO: renamed from: a */
    public void m147594a(int i) {
        if (this.f124999c == this.f125000d.length) {
            m147596c();
        }
        int i2 = (this.f124998b + 1) & this.f125001e;
        this.f124998b = i2;
        this.f125000d[i2] = i;
        this.f124999c++;
    }

    /* JADX INFO: renamed from: b */
    public void m147595b() {
        this.f124997a = 0;
        this.f124998b = -1;
        this.f124999c = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m147596c() {
        int[] iArr = this.f125000d;
        int length = iArr.length << 1;
        if (length < 0) {
            ohg0.m164364a();
            return;
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i = this.f124997a;
        int i2 = length2 - i;
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.f125000d, 0, iArr2, i2, i);
        this.f124997a = 0;
        this.f124998b = this.f124999c - 1;
        this.f125000d = iArr2;
        this.f125001e = iArr2.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public boolean m147597d() {
        return this.f124999c == 0;
    }

    /* JADX INFO: renamed from: e */
    public int m147598e() {
        int i = this.f124999c;
        if (i == 0) {
            lmr.m150601a();
            return 0;
        }
        int[] iArr = this.f125000d;
        int i2 = this.f124997a;
        int i3 = iArr[i2];
        this.f124997a = (i2 + 1) & this.f125001e;
        this.f124999c = i - 1;
        return i3;
    }
}
