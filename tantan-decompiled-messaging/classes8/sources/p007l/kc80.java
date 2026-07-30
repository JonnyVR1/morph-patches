package p007l;

import l.cwf0;
import l.er2;
import l.j760;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class kc80 implements Comparable<kc80> {

    /* JADX INFO: renamed from: a */
    public String f3058a;

    /* JADX INFO: renamed from: b */
    public k0m f3059b;

    /* JADX INFO: renamed from: e */
    public j0m f3062e;

    /* JADX INFO: renamed from: f */
    public cwf0 f3063f;

    /* JADX INFO: renamed from: c */
    public int f3060c = 30000;

    /* JADX INFO: renamed from: d */
    public long f3061d = 0;

    /* JADX INFO: renamed from: g */
    public boolean f3064g = false;

    /* JADX INFO: renamed from: l.kc80$a */
    public class C0585a extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f3065a;

        public C0585a(String str) {
            this.f3065a = str;
        }

        public String pageId() {
            return this.f3065a;
        }
    }

    public kc80(String str, k0m k0mVar, j0m j0mVar) {
        this.f3058a = str;
        this.f3059b = k0mVar;
        this.f3062e = j0mVar;
    }

    /* JADX INFO: renamed from: a */
    public void m9594a(boolean z) {
        this.f3062e.mo1143n(z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m9595b() {
        return this.f3062e.mo1131a();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(kc80 kc80Var) {
        return kc80Var.m9598h() - m9598h();
    }

    /* JADX INFO: renamed from: g */
    public long m9597g() {
        return this.f3061d;
    }

    /* JADX INFO: renamed from: h */
    public int m9598h() {
        return this.f3060c;
    }

    /* JADX INFO: renamed from: i */
    public String m9599i() {
        return this.f3059b.getPopLifeName();
    }

    /* JADX INFO: renamed from: j */
    public String m9600j() {
        return this.f3058a;
    }

    /* JADX INFO: renamed from: m */
    public a<pc80> m9601m() {
        return this.f3059b.popLifeObs();
    }

    /* JADX INFO: renamed from: n */
    public j0m m9602n() {
        return this.f3062e;
    }

    /* JADX INFO: renamed from: o */
    public void m9603o(boolean z) {
        this.f3062e.mo1136f(z);
    }

    /* JADX INFO: renamed from: p */
    public void m9604p() {
        cwf0 cwf0Var = this.f3063f;
        if (cwf0Var == null || !this.f3064g) {
            return;
        }
        cwf0Var.k();
        this.f3063f.j();
    }

    /* JADX INFO: renamed from: q */
    public void m9605q(String str) {
        if (this.f3063f == null && this.f3064g) {
            cwf0 cwf0Var = new cwf0(new C0585a(str), kc80.class.getName());
            this.f3063f = cwf0Var;
            cwf0Var.p(new j760[]{j760.a("popup_id", this.f3058a), j760.a("popup_priority", Integer.valueOf(m9598h()))});
            this.f3063f.c();
            this.f3063f.r();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m9606r(boolean z) {
        this.f3064g = z;
    }

    /* JADX INFO: renamed from: s */
    public void m9607s(int i) {
        this.f3060c = i;
    }

    /* JADX INFO: renamed from: t */
    public void m9608t(long j) {
        this.f3061d = j;
    }
}
