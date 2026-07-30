package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lym {

    /* JADX INFO: renamed from: a */
    public int f134115a = 0;

    /* JADX INFO: renamed from: b */
    public int f134116b = -1;

    /* JADX INFO: renamed from: c */
    public int f134117c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f134118d;

    /* JADX INFO: renamed from: e */
    public int f134119e;

    public lym() {
        int[] iArr = new int[16];
        this.f134118d = iArr;
        this.f134119e = iArr.length - 1;
    }

    /* JADX INFO: renamed from: a */
    public void m156368a(int i) {
        if (this.f134117c == this.f134118d.length) {
            m156370c();
        }
        int i2 = (this.f134116b + 1) & this.f134119e;
        this.f134116b = i2;
        this.f134118d[i2] = i;
        this.f134117c++;
    }

    /* JADX INFO: renamed from: b */
    public void m156369b() {
        this.f134115a = 0;
        this.f134116b = -1;
        this.f134117c = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m156370c() {
        int[] iArr = this.f134118d;
        int length = iArr.length << 1;
        if (length < 0) {
            wpg0.m207458a();
            return;
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i = this.f134115a;
        int i2 = length2 - i;
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.f134118d, 0, iArr2, i2, i);
        this.f134115a = 0;
        this.f134116b = this.f134117c - 1;
        this.f134118d = iArr2;
        this.f134119e = iArr2.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public boolean m156371d() {
        return this.f134117c == 0;
    }

    /* JADX INFO: renamed from: e */
    public int m156372e() {
        int i = this.f134117c;
        if (i == 0) {
            mor.m159308a();
            return 0;
        }
        int[] iArr = this.f134118d;
        int i2 = this.f134115a;
        int i3 = iArr[i2];
        this.f134115a = (i2 + 1) & this.f134119e;
        this.f134117c = i - 1;
        return i3;
    }
}
