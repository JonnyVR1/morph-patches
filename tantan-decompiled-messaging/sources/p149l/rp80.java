package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class rp80 extends jq2<aq80> {

    /* JADX INFO: renamed from: a */
    public gn80 f160485a;

    /* JADX INFO: renamed from: l.rp80$a */
    public class C19747a implements gn80 {
        public C19747a() {
        }

        @Override // p149l.gn80
        /* JADX INFO: renamed from: a */
        public void mo127116a(uo80 uo80Var) {
            uo80Var.mo114505K(rp80.this);
        }

        @Override // p149l.gn80
        /* JADX INFO: renamed from: b */
        public void mo127117b(uo80 uo80Var, View view) {
            uo80Var.mo99846J(rp80.this, view);
        }

        @Override // p149l.gn80
        /* JADX INFO: renamed from: c */
        public void mo127118c(uo80 uo80Var, View view) {
            uo80Var.mo99847L(rp80.this, view);
        }
    }

    public rp80(mcr mcrVar) {
        super(mcrVar);
        this.f160485a = new C19747a();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        ((aq80) this.viewModel).m98234e(vo80.m199158a(this.f160485a));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
