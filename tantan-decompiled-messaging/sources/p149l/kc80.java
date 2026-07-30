package p149l;

import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes8.dex */
public class kc80 implements Comparable<kc80> {

    /* JADX INFO: renamed from: a */
    public String f122295a;

    /* JADX INFO: renamed from: b */
    public k0m f122296b;

    /* JADX INFO: renamed from: e */
    public j0m f122299e;

    /* JADX INFO: renamed from: f */
    public cwf0 f122300f;

    /* JADX INFO: renamed from: c */
    public int f122297c = 30000;

    /* JADX INFO: renamed from: d */
    public long f122298d = 0;

    /* JADX INFO: renamed from: g */
    public boolean f122301g = false;

    /* JADX INFO: renamed from: l.kc80$a */
    public class C17981a extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f122302a;

        public C17981a(String str) {
            this.f122302a = str;
        }

        @Override // p149l.n3m
        public String pageId() {
            return this.f122302a;
        }
    }

    public kc80(String str, k0m k0mVar, j0m j0mVar) {
        this.f122295a = str;
        this.f122296b = k0mVar;
        this.f122299e = j0mVar;
    }

    /* JADX INFO: renamed from: a */
    public void m145348a(boolean z) {
        this.f122299e.mo20872n(z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m145349b() {
        return this.f122299e.mo20860a();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(kc80 kc80Var) {
        return kc80Var.m145352h() - m145352h();
    }

    /* JADX INFO: renamed from: g */
    public long m145351g() {
        return this.f122298d;
    }

    /* JADX INFO: renamed from: h */
    public int m145352h() {
        return this.f122297c;
    }

    /* JADX INFO: renamed from: i */
    public String m145353i() {
        return this.f122296b.getPopLifeName();
    }

    /* JADX INFO: renamed from: j */
    public String m145354j() {
        return this.f122295a;
    }

    /* JADX INFO: renamed from: m */
    public C22392a<pc80> m145355m() {
        return this.f122296b.popLifeObs();
    }

    /* JADX INFO: renamed from: n */
    public j0m m145356n() {
        return this.f122299e;
    }

    /* JADX INFO: renamed from: o */
    public void m145357o(boolean z) {
        this.f122299e.mo20865f(z);
    }

    /* JADX INFO: renamed from: p */
    public void m145358p() {
        cwf0 cwf0Var = this.f122300f;
        if (cwf0Var == null || !this.f122301g) {
            return;
        }
        cwf0Var.m109035k();
        this.f122300f.m109034j();
    }

    /* JADX INFO: renamed from: q */
    public void m145359q(String str) {
        if (this.f122300f == null && this.f122301g) {
            cwf0 cwf0Var = new cwf0(new C17981a(str), kc80.class.getName());
            this.f122300f = cwf0Var;
            cwf0Var.m109040p(j760.m140076a("popup_id", this.f122295a), j760.m140076a("popup_priority", Integer.valueOf(m145352h())));
            this.f122300f.m109027c();
            this.f122300f.m109042r();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m145360r(boolean z) {
        this.f122301g = z;
    }

    /* JADX INFO: renamed from: s */
    public void m145361s(int i) {
        this.f122297c = i;
    }

    /* JADX INFO: renamed from: t */
    public void m145362t(long j) {
        this.f122298d = j;
    }
}
