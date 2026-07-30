package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import p137rx.subjects.C22508b;

/* JADX INFO: renamed from: l.zp */
/* JADX INFO: loaded from: classes8.dex */
public class C21846zp extends ar2<C18920nq> {

    /* JADX INFO: renamed from: c */
    public static C22508b<uxj0> f205406c = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public String f205407a;

    /* JADX INFO: renamed from: b */
    public String f205408b;

    public C21846zp(ner nerVar) {
        super(nerVar);
        this.f205407a = "";
        this.f205408b = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m220807h0(Bundle bundle) {
        this.f205407a = act().getIntent().getStringExtra("InactivateCategoryKey");
        String stringExtra = act().getIntent().getStringExtra("InactivateReasonKey");
        this.f205408b = stringExtra;
        ((C18920nq) this.viewModel).m164277v(stringExtra, act().getIntent().getStringExtra("InactivateReasonValue"), act().getIntent().getStringExtra("InactivateContent"));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.yp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201029a.m220807h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public String m220808f0() {
        return !TextUtils.isEmpty(this.f205407a) ? this.f205407a : "";
    }

    /* JADX INFO: renamed from: g0 */
    public String m220809g0() {
        return !TextUtils.isEmpty(this.f205408b) ? this.f205408b : "";
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
