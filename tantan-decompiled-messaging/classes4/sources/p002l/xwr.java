package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import l.bwr;
import l.e30;
import l.ffw;
import l.s7m;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xwr extends h4t<ho2, LiveBgView> {
    public xwr(bsm bsmVar, LiveBgView liveBgView, View view) {
        super(bsmVar);
        liveBgView.setPlayerMaskView(view);
        C(liveBgView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ Boolean m26158L3(uwr uwrVar) {
        return Boolean.valueOf(m25547E2().m17237m().m15307j());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m26159M3(uwr uwrVar) {
        int i = uwrVar.f20860c;
        s7m s7mVar = ((bwr) this).viewModel;
        if (i == -1) {
            ((LiveBgView) s7mVar).m5373c(false, i);
        } else {
            ((LiveBgView) s7mVar).m5373c(true, i);
        }
        ((LiveBgView) ((bwr) this).viewModel).m5374d(uwrVar.f20858a, uwrVar.f20859b);
    }

    /* JADX INFO: renamed from: T */
    public void m26160T() {
        super.T();
        if (m25547E2() instanceof x350) {
            ((LiveBgView) ((bwr) this).viewModel).setOfficialShowMode(true);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m26161t() {
        super.t();
        duringCreated((c) m25548F2().LiveBgEvent.showBg().g()).filter(new w9j() { // from class: l.vwr
            public final Object call(Object obj) {
                return this.f21361a.m26158L3((uwr) obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.wwr
            public final void call(Object obj) {
                this.f22028a.m26159M3((uwr) obj);
            }
        }));
    }
}
