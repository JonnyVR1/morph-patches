package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import l.e30;
import l.roj0;
import rx.subjects.b;

/* JADX INFO: renamed from: l.eq */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0532eq extends jq2<C0697sq> {

    /* JADX INFO: renamed from: c */
    public static b<roj0> f2628c = b.b();

    /* JADX INFO: renamed from: a */
    public String f2629a;

    /* JADX INFO: renamed from: b */
    public String f2630b;

    public C0532eq(mcr mcrVar) {
        super(mcrVar);
        this.f2629a = "";
        this.f2630b = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m9071h0(Bundle bundle) {
        this.f2629a = act().getIntent().getStringExtra("InactivateCategoryKey");
        String stringExtra = act().getIntent().getStringExtra("InactivateReasonKey");
        this.f2630b = stringExtra;
        ((C0697sq) this.viewModel).m10713v(stringExtra, act().getIntent().getStringExtra("InactivateReasonValue"), act().getIntent().getStringExtra("InactivateContent"));
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.dq
            public final void call(Object obj) {
                this.f2585a.m9071h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public String m9072f0() {
        return !TextUtils.isEmpty(this.f2629a) ? this.f2629a : "";
    }

    /* JADX INFO: renamed from: g0 */
    public String m9073g0() {
        return !TextUtils.isEmpty(this.f2630b) ? this.f2630b : "";
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
