package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes12.dex */
public class h4l0 extends ar2<k4l0> {

    /* JADX INFO: renamed from: a */
    public Act f107815a;

    /* JADX INFO: renamed from: b */
    public String f107816b;

    public h4l0(ner nerVar, Act act) {
        super(nerVar);
        this.f107815a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m133584f0(Bundle bundle) {
        ((k4l0) this.viewModel).m148258r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Bundle extras = this.f107815a.getIntent().getExtras();
        if (extras == null) {
            this.f107815a.lambda$debugItems$19();
        } else {
            this.f107816b = extras.getString("from");
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.g4l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102184a.m133584f0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
