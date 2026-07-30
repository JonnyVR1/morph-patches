package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class f1e {

    /* JADX INFO: renamed from: c */
    public static final f1e f3434c;

    /* JADX INFO: renamed from: d */
    public static final f1e f3435d;

    /* JADX INFO: renamed from: e */
    public static final f1e f3436e;

    /* JADX INFO: renamed from: f */
    public static final f1e f3437f;

    /* JADX INFO: renamed from: g */
    public static final f1e f3438g;

    /* JADX INFO: renamed from: h */
    public static final f1e f3439h;

    /* JADX INFO: renamed from: i */
    public static final f1e f3440i;

    /* JADX INFO: renamed from: j */
    public static final f1e f3441j;

    /* JADX INFO: renamed from: k */
    public static final f1e f3442k;

    /* JADX INFO: renamed from: l */
    public static final f1e f3443l;

    /* JADX INFO: renamed from: m */
    public static final f1e f3444m;

    /* JADX INFO: renamed from: n */
    public static final f1e f3445n;

    /* JADX INFO: renamed from: o */
    public static final f1e[] f3446o;

    /* JADX INFO: renamed from: a */
    public final int f3447a;

    /* JADX INFO: renamed from: b */
    public final boolean f3448b;

    static {
        f1e f1eVar = new f1e(0, false);
        f3434c = f1eVar;
        f1e f1eVar2 = new f1e(1, true);
        f3435d = f1eVar2;
        f1e f1eVar3 = new f1e(2, false);
        f3436e = f1eVar3;
        f1e f1eVar4 = new f1e(3, true);
        f3437f = f1eVar4;
        f1e f1eVar5 = new f1e(4, false);
        f3438g = f1eVar5;
        f1e f1eVar6 = new f1e(5, true);
        f3439h = f1eVar6;
        f1e f1eVar7 = new f1e(6, false);
        f3440i = f1eVar7;
        f1e f1eVar8 = new f1e(7, true);
        f3441j = f1eVar8;
        f1e f1eVar9 = new f1e(8, false);
        f3442k = f1eVar9;
        f1e f1eVar10 = new f1e(9, true);
        f3443l = f1eVar10;
        f1e f1eVar11 = new f1e(10, false);
        f3444m = f1eVar11;
        f1e f1eVar12 = new f1e(10, true);
        f3445n = f1eVar12;
        f3446o = new f1e[]{f1eVar, f1eVar2, f1eVar3, f1eVar4, f1eVar5, f1eVar6, f1eVar7, f1eVar8, f1eVar9, f1eVar10, f1eVar11, f1eVar12};
    }

    public f1e(int i, boolean z) {
        this.f3447a = i;
        this.f3448b = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3957a(f1e f1eVar) {
        int i = this.f3447a;
        int i2 = f1eVar.f3447a;
        if (i >= i2) {
            return (!this.f3448b || f3443l == this) && i == i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public f1e m3958b() {
        return !this.f3448b ? f3446o[this.f3447a + 1] : this;
    }

    /* JADX INFO: renamed from: c */
    public f1e m3959c() {
        if (!this.f3448b) {
            return this;
        }
        f1e f1eVar = f3446o[this.f3447a - 1];
        return !f1eVar.f3448b ? f1eVar : f3434c;
    }
}
