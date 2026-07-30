package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class n4v extends cts<p4v> {
    public n4v(mcr mcrVar, mss mssVar, VDraweeView vDraweeView) {
        super(mcrVar, mssVar);
        p4v p4vVar = new p4v(vDraweeView);
        this.viewModel = p4vVar;
        mo51532C(p4vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m157890S2(String str) {
        ((p4v) this.viewModel).m167420e(TextUtils.equals(str, "tab_voice"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m157891T2(Boolean bool) {
        ((p4v) this.viewModel).m167421f(bool);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((p4v) this.viewModel).m167423r();
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.k4v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121128a.m157890S2((String) obj);
            }
        }));
        duringCreated(pgi0.m168730l().m168752y()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.l4v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126060a.m157891T2((Boolean) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomeVoiceSelectTopic.notifySelectRoomSquare().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.m4v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131331a.m157893V2(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public void m157892U2(View view) {
        amo0.m97566c();
        ehn0.m116502e(getAct(), new AnchorStartData.C11429a().m67569t("top_right").m67560k());
        ((p4v) this.viewModel).m167419c();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m157893V2(boolean z) {
        V v2 = this.viewModel;
        if (z) {
            ((p4v) v2).m167422i();
        } else {
            ((p4v) v2).m167419c();
        }
    }
}
