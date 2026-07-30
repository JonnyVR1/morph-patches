package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes9.dex */
public class bvk0 extends jq2<evk0> {

    /* JADX INFO: renamed from: a */
    public Act f77469a;

    /* JADX INFO: renamed from: b */
    public String f77470b;

    public bvk0(mcr mcrVar, Act act) {
        super(mcrVar);
        this.f77469a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m104053f0(Bundle bundle) {
        ((evk0) this.viewModel).m118297r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Bundle extras = this.f77469a.getIntent().getExtras();
        if (extras == null) {
            this.f77469a.lambda$debugItems$19();
        } else {
            this.f77470b = extras.getString("from");
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.avk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71949a.m104053f0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
