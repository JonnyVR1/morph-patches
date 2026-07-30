package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class tur0 implements per0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f176206a = new bgw0(4);

    /* JADX INFO: renamed from: b */
    public final dgr0 f176207b = new dgr0(-1, -1, "image/webp");

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f176207b.mo97906c(j, j2);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        this.f176206a.m104266h(4);
        fer0 fer0Var = (fer0) qer0Var;
        fer0Var.mo125313c(this.f176206a.m104271m(), 0, 4, false);
        if (this.f176206a.m104253J() == 1380533830) {
            fer0Var.m125318j(4, false);
            this.f176206a.m104266h(4);
            fer0Var.mo125313c(this.f176206a.m104271m(), 0, 4, false);
            if (this.f176206a.m104253J() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f176207b.mo97908e(ser0Var);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        return this.f176207b.mo97909f(qer0Var, yfr0Var);
    }
}
