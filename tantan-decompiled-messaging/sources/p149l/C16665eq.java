package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import p133rx.subjects.C22393b;

/* JADX INFO: renamed from: l.eq */
/* JADX INFO: loaded from: classes8.dex */
public class C16665eq extends jq2<C20009sq> {

    /* JADX INFO: renamed from: c */
    public static C22393b<roj0> f92732c = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public String f92733a;

    /* JADX INFO: renamed from: b */
    public String f92734b;

    public C16665eq(mcr mcrVar) {
        super(mcrVar);
        this.f92733a = "";
        this.f92734b = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m117691h0(Bundle bundle) {
        this.f92733a = act().getIntent().getStringExtra("InactivateCategoryKey");
        String stringExtra = act().getIntent().getStringExtra("InactivateReasonKey");
        this.f92734b = stringExtra;
        ((C20009sq) this.viewModel).m185421v(stringExtra, act().getIntent().getStringExtra("InactivateReasonValue"), act().getIntent().getStringExtra("InactivateContent"));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.dq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87369a.m117691h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public String m117692f0() {
        return !TextUtils.isEmpty(this.f92733a) ? this.f92733a : "";
    }

    /* JADX INFO: renamed from: g0 */
    public String m117693g0() {
        return !TextUtils.isEmpty(this.f92734b) ? this.f92734b : "";
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
