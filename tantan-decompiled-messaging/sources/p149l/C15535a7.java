package p149l;

import com.google.common.cache.LongAddables;

/* JADX INFO: renamed from: l.a7 */
/* JADX INFO: loaded from: classes7.dex */
public final class C15535a7 implements InterfaceC15818b7 {

    /* JADX INFO: renamed from: a */
    public final izv f67821a = LongAddables.m15557a();

    /* JADX INFO: renamed from: b */
    public final izv f67822b = LongAddables.m15557a();

    /* JADX INFO: renamed from: c */
    public final izv f67823c = LongAddables.m15557a();

    /* JADX INFO: renamed from: d */
    public final izv f67824d = LongAddables.m15557a();

    /* JADX INFO: renamed from: e */
    public final izv f67825e = LongAddables.m15557a();

    /* JADX INFO: renamed from: f */
    public final izv f67826f = LongAddables.m15557a();

    /* JADX INFO: renamed from: h */
    public static long m95169h(long j) {
        if (j >= 0) {
            return j;
        }
        return Long.MAX_VALUE;
    }

    @Override // p149l.InterfaceC15818b7
    /* JADX INFO: renamed from: a */
    public void mo15479a(int i) {
        this.f67821a.add(i);
    }

    @Override // p149l.InterfaceC15818b7
    /* JADX INFO: renamed from: b */
    public void mo15480b() {
        this.f67826f.increment();
    }

    @Override // p149l.InterfaceC15818b7
    /* JADX INFO: renamed from: c */
    public void mo15481c(long j) {
        this.f67823c.increment();
        this.f67825e.add(j);
    }

    @Override // p149l.InterfaceC15818b7
    /* JADX INFO: renamed from: d */
    public void mo15482d(int i) {
        this.f67822b.add(i);
    }

    @Override // p149l.InterfaceC15818b7
    /* JADX INFO: renamed from: e */
    public void mo15483e(long j) {
        this.f67824d.increment();
        this.f67825e.add(j);
    }

    @Override // p149l.InterfaceC15818b7
    /* JADX INFO: renamed from: f */
    public ix3 mo15484f() {
        return new ix3(m95169h(this.f67821a.sum()), m95169h(this.f67822b.sum()), m95169h(this.f67823c.sum()), m95169h(this.f67824d.sum()), m95169h(this.f67825e.sum()), m95169h(this.f67826f.sum()));
    }

    /* JADX INFO: renamed from: g */
    public void m95170g(InterfaceC15818b7 interfaceC15818b7) {
        ix3 ix3VarMo15484f = interfaceC15818b7.mo15484f();
        this.f67821a.add(ix3VarMo15484f.m138785b());
        this.f67822b.add(ix3VarMo15484f.m138788e());
        this.f67823c.add(ix3VarMo15484f.m138787d());
        this.f67824d.add(ix3VarMo15484f.m138786c());
        this.f67825e.add(ix3VarMo15484f.m138789f());
        this.f67826f.add(ix3VarMo15484f.m138784a());
    }
}
