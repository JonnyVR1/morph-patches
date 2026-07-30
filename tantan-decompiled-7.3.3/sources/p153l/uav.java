package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVoiceView;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class uav extends dvs<yav> implements sm50 {
    public uav(ner nerVar, nus nusVar, LiveSquareTopButtonVoiceView liveSquareTopButtonVoiceView) {
        super(nerVar, nusVar);
        yav yavVar = new yav(liveSquareTopButtonVoiceView);
        this.viewModel = yavVar;
        mo52715C(yavVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ Boolean m195195X2(C4470c c4470c) {
        return (Boolean) m160243N2(new jcs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m195196Z2(List list) {
        ((yav) this.viewModel).m214958p(m160239H2().m164819a(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public /* synthetic */ void m195197b3(vxj0 vxj0Var) {
        m195198d3();
    }

    /* JADX INFO: renamed from: d3 */
    private void m195198d3() {
        duringCreated(m195199W2()).subscribe(dhw.m115829h(new y20() { // from class: l.tav
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172806a.m195202c3((List) obj);
            }
        }));
    }

    @Override // p153l.sm50
    /* JADX INFO: renamed from: S */
    public void mo147413S(boolean z, String str) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((yav) v2).m214952e(z);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if (mqr.m159593m()) {
            return;
        }
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.nav
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141048a.m195195X2((C4470c) obj);
            }
        }).filter(new qcj() { // from class: l.oav
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).flatMap(new qcj() { // from class: l.pav
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151335a.m195200Y2((C4470c) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.qav
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156428a.m195196Z2((List) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomeMenuEvent.refresh().m199270g()).filter(new qcj() { // from class: l.rav
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161949a.m195201a3((vxj0) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.sav
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167073a.m195197b3((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public final C22421c<List<BLiveVoiceSquareButton>> m195199W2() {
        return VirtualVoiceRoomApiProvider.getVoiceSquareButtons();
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ C22421c m195200Y2(C4470c c4470c) {
        return m195199W2();
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ Boolean m195201a3(vxj0 vxj0Var) {
        return (Boolean) m160243N2(new jcs());
    }

    @Override // p153l.sm50
    /* JADX INFO: renamed from: b2 */
    public boolean mo147415b2(String str) {
        return "fakeLiveSquare".equals(str);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m195202c3(List list) {
        ((yav) this.viewModel).m214958p(m160239H2().m164819a(), list);
    }
}
