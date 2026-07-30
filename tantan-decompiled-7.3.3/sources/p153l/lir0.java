package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class lir0 implements per0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f132246a = new bgw0(4);

    /* JADX INFO: renamed from: b */
    public final dgr0 f132247b = new dgr0(-1, -1, "image/heif");

    /* JADX INFO: renamed from: a */
    public final boolean m154380a(qer0 qer0Var, int i) throws IOException {
        this.f132246a.m104266h(4);
        ((fer0) qer0Var).mo125313c(this.f132246a.m104271m(), 0, 4, false);
        return this.f132246a.m104253J() == ((long) i);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f132247b.mo97906c(j, j2);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        ((fer0) qer0Var).m125318j(4, false);
        return m154380a(qer0Var, 1718909296) && m154380a(qer0Var, 1751476579);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f132247b.mo97908e(ser0Var);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        return this.f132247b.mo97909f(qer0Var, yfr0Var);
    }
}
