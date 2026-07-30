package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.base.room.LiveBgView;

/* JADX INFO: loaded from: classes4.dex */
public class xwr extends h4t<ho2, LiveBgView> {
    public xwr(bsm bsmVar, LiveBgView liveBgView, View view) {
        super(bsmVar);
        liveBgView.setPlayerMaskView(view);
        mo51532C(liveBgView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ Boolean m211385L3(uwr uwrVar) {
        return Boolean.valueOf(m206027E2().m149816m().m137803j());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m211386M3(uwr uwrVar) {
        int i = uwrVar.f178674c;
        V v2 = this.viewModel;
        if (i == -1) {
            ((LiveBgView) v2).m71983c(false, i);
        } else {
            ((LiveBgView) v2).m71983c(true, i);
        }
        ((LiveBgView) this.viewModel).m71984d(uwrVar.f178672a, uwrVar.f178673b);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if (m206027E2() instanceof x350) {
            ((LiveBgView) this.viewModel).setOfficialShowMode(true);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LiveBgEvent.showBg().m172460g()).filter(new w9j() { // from class: l.vwr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183364a.m211385L3((uwr) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.wwr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188401a.m211386M3((uwr) obj);
            }
        }));
    }
}
