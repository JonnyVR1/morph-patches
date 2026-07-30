package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class f1e {

    /* JADX INFO: renamed from: c */
    public static final f1e f94079c;

    /* JADX INFO: renamed from: d */
    public static final f1e f94080d;

    /* JADX INFO: renamed from: e */
    public static final f1e f94081e;

    /* JADX INFO: renamed from: f */
    public static final f1e f94082f;

    /* JADX INFO: renamed from: g */
    public static final f1e f94083g;

    /* JADX INFO: renamed from: h */
    public static final f1e f94084h;

    /* JADX INFO: renamed from: i */
    public static final f1e f94085i;

    /* JADX INFO: renamed from: j */
    public static final f1e f94086j;

    /* JADX INFO: renamed from: k */
    public static final f1e f94087k;

    /* JADX INFO: renamed from: l */
    public static final f1e f94088l;

    /* JADX INFO: renamed from: m */
    public static final f1e f94089m;

    /* JADX INFO: renamed from: n */
    public static final f1e f94090n;

    /* JADX INFO: renamed from: o */
    public static final f1e[] f94091o;

    /* JADX INFO: renamed from: a */
    public final int f94092a;

    /* JADX INFO: renamed from: b */
    public final boolean f94093b;

    static {
        f1e f1eVar = new f1e(0, false);
        f94079c = f1eVar;
        f1e f1eVar2 = new f1e(1, true);
        f94080d = f1eVar2;
        f1e f1eVar3 = new f1e(2, false);
        f94081e = f1eVar3;
        f1e f1eVar4 = new f1e(3, true);
        f94082f = f1eVar4;
        f1e f1eVar5 = new f1e(4, false);
        f94083g = f1eVar5;
        f1e f1eVar6 = new f1e(5, true);
        f94084h = f1eVar6;
        f1e f1eVar7 = new f1e(6, false);
        f94085i = f1eVar7;
        f1e f1eVar8 = new f1e(7, true);
        f94086j = f1eVar8;
        f1e f1eVar9 = new f1e(8, false);
        f94087k = f1eVar9;
        f1e f1eVar10 = new f1e(9, true);
        f94088l = f1eVar10;
        f1e f1eVar11 = new f1e(10, false);
        f94089m = f1eVar11;
        f1e f1eVar12 = new f1e(10, true);
        f94090n = f1eVar12;
        f94091o = new f1e[]{f1eVar, f1eVar2, f1eVar3, f1eVar4, f1eVar5, f1eVar6, f1eVar7, f1eVar8, f1eVar9, f1eVar10, f1eVar11, f1eVar12};
    }

    public f1e(int i, boolean z) {
        this.f94092a = i;
        this.f94093b = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m119110a(f1e f1eVar) {
        int i = this.f94092a;
        int i2 = f1eVar.f94092a;
        if (i >= i2) {
            return (!this.f94093b || f94088l == this) && i == i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public f1e m119111b() {
        return !this.f94093b ? f94091o[this.f94092a + 1] : this;
    }

    /* JADX INFO: renamed from: c */
    public f1e m119112c() {
        if (!this.f94093b) {
            return this;
        }
        f1e f1eVar = f94091o[this.f94092a - 1];
        return !f1eVar.f94093b ? f1eVar : f94079c;
    }
}
