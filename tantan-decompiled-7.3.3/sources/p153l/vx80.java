package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class vx80 extends ar2<ey80> {

    /* JADX INFO: renamed from: a */
    public kv80 f186245a;

    /* JADX INFO: renamed from: l.vx80$a */
    public class C20952a implements kv80 {
        public C20952a() {
        }

        @Override // p153l.kv80
        /* JADX INFO: renamed from: a */
        public void mo151654a(yw80 yw80Var) {
            yw80Var.mo113838K(vx80.this);
        }

        @Override // p153l.kv80
        /* JADX INFO: renamed from: b */
        public void mo151655b(yw80 yw80Var, View view) {
            yw80Var.mo179626J(vx80.this, view);
        }

        @Override // p153l.kv80
        /* JADX INFO: renamed from: c */
        public void mo151656c(yw80 yw80Var, View view) {
            yw80Var.mo179627L(vx80.this, view);
        }
    }

    public vx80(ner nerVar) {
        super(nerVar);
        this.f186245a = new C20952a();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        ((ey80) this.viewModel).m123189e(zw80.m221856a(this.f186245a));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
