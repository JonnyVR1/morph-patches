package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class t2e {

    /* JADX INFO: renamed from: c */
    public static final t2e f171737c;

    /* JADX INFO: renamed from: d */
    public static final t2e f171738d;

    /* JADX INFO: renamed from: e */
    public static final t2e f171739e;

    /* JADX INFO: renamed from: f */
    public static final t2e f171740f;

    /* JADX INFO: renamed from: g */
    public static final t2e f171741g;

    /* JADX INFO: renamed from: h */
    public static final t2e f171742h;

    /* JADX INFO: renamed from: i */
    public static final t2e f171743i;

    /* JADX INFO: renamed from: j */
    public static final t2e f171744j;

    /* JADX INFO: renamed from: k */
    public static final t2e f171745k;

    /* JADX INFO: renamed from: l */
    public static final t2e f171746l;

    /* JADX INFO: renamed from: m */
    public static final t2e f171747m;

    /* JADX INFO: renamed from: n */
    public static final t2e f171748n;

    /* JADX INFO: renamed from: o */
    public static final t2e[] f171749o;

    /* JADX INFO: renamed from: a */
    public final int f171750a;

    /* JADX INFO: renamed from: b */
    public final boolean f171751b;

    static {
        t2e t2eVar = new t2e(0, false);
        f171737c = t2eVar;
        t2e t2eVar2 = new t2e(1, true);
        f171738d = t2eVar2;
        t2e t2eVar3 = new t2e(2, false);
        f171739e = t2eVar3;
        t2e t2eVar4 = new t2e(3, true);
        f171740f = t2eVar4;
        t2e t2eVar5 = new t2e(4, false);
        f171741g = t2eVar5;
        t2e t2eVar6 = new t2e(5, true);
        f171742h = t2eVar6;
        t2e t2eVar7 = new t2e(6, false);
        f171743i = t2eVar7;
        t2e t2eVar8 = new t2e(7, true);
        f171744j = t2eVar8;
        t2e t2eVar9 = new t2e(8, false);
        f171745k = t2eVar9;
        t2e t2eVar10 = new t2e(9, true);
        f171746l = t2eVar10;
        t2e t2eVar11 = new t2e(10, false);
        f171747m = t2eVar11;
        t2e t2eVar12 = new t2e(10, true);
        f171748n = t2eVar12;
        f171749o = new t2e[]{t2eVar, t2eVar2, t2eVar3, t2eVar4, t2eVar5, t2eVar6, t2eVar7, t2eVar8, t2eVar9, t2eVar10, t2eVar11, t2eVar12};
    }

    public t2e(int i, boolean z) {
        this.f171750a = i;
        this.f171751b = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m188964a(t2e t2eVar) {
        int i = this.f171750a;
        int i2 = t2eVar.f171750a;
        if (i >= i2) {
            return (!this.f171751b || f171746l == this) && i == i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public t2e m188965b() {
        return !this.f171751b ? f171749o[this.f171750a + 1] : this;
    }

    /* JADX INFO: renamed from: c */
    public t2e m188966c() {
        if (!this.f171751b) {
            return this;
        }
        t2e t2eVar = f171749o[this.f171750a - 1];
        return !t2eVar.f171751b ? t2eVar : f171737c;
    }
}
