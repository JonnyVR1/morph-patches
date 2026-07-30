package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVoiceView;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class t8v extends cts<x8v> implements le50 {
    public t8v(mcr mcrVar, mss mssVar, LiveSquareTopButtonVoiceView liveSquareTopButtonVoiceView) {
        super(mcrVar, mssVar);
        x8v x8vVar = new x8v(liveSquareTopButtonVoiceView);
        this.viewModel = x8vVar;
        mo51532C(x8vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ Boolean m187573X2(C4319c c4319c) {
        return (Boolean) m151646N2(new ias());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m187574Z2(List list) {
        ((x8v) this.viewModel).m207456p(m151643H2().m156171a(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public /* synthetic */ void m187575b3(soj0 soj0Var) {
        m187576d3();
    }

    /* JADX INFO: renamed from: d3 */
    private void m187576d3() {
        duringCreated(m187577W2()).subscribe(ffw.m121197h(new e30() { // from class: l.s8v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163117a.m187580c3((List) obj);
            }
        }));
    }

    @Override // p149l.le50
    /* JADX INFO: renamed from: S */
    public void mo138652S(boolean z, String str) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((x8v) v2).m207450e(z);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if (lor.m150808m()) {
            return;
        }
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.m8v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f132635a.m187573X2((C4319c) obj);
            }
        }).filter(new w9j() { // from class: l.n8v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).flatMap(new w9j() { // from class: l.o8v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f142676a.m187578Y2((C4319c) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.p8v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147637a.m187574Z2((List) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomeMenuEvent.refresh().m172460g()).filter(new w9j() { // from class: l.q8v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f153338a.m187579a3((soj0) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.r8v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158257a.m187575b3((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public final C22306c<List<BLiveVoiceSquareButton>> m187577W2() {
        return VirtualVoiceRoomApiProvider.getVoiceSquareButtons();
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ C22306c m187578Y2(C4319c c4319c) {
        return m187577W2();
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ Boolean m187579a3(soj0 soj0Var) {
        return (Boolean) m151646N2(new ias());
    }

    @Override // p149l.le50
    /* JADX INFO: renamed from: b2 */
    public boolean mo138654b2(String str) {
        return "fakeLiveSquare".equals(str);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m187580c3(List list) {
        ((x8v) this.viewModel).m207456p(m151643H2().m156171a(), list);
    }
}
