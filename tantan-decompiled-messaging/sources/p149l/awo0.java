package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;

/* JADX INFO: loaded from: classes5.dex */
public class awo0 extends LiveGiftTraysPresenter<nnn0> {
    public awo0(bsm bsmVar, LiveGiftTrays liveGiftTrays) {
        super(bsmVar, liveGiftTrays);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public final void m99295C4(String str) {
        boolean zEquals = "game".equals(str);
        V v2 = this.viewModel;
        if (zEquals) {
            xdl0.m208360X((View) v2, -t100.m186890d(140.0f));
        } else {
            xdl0.m208360X((View) v2, -t100.m186890d(0.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: a4 */
    public boolean mo74230a4(GiftTrayData giftTrayData) {
        if (((nnn0) m206027E2()).m160271i3()) {
            return ((hdv) ypv.m215673l(fld0.f98150e)).f107303i.get().booleanValue();
        }
        fld0<hdv> fld0Var = fld0.f98150e;
        return !((hdv) ypv.m215673l(fld0Var)).f107304j.get().booleanValue() || ((hdv) ypv.m215673l(fld0Var)).f107303i.get().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m160247O2().m165466d()).map(new w9j() { // from class: l.yvo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoice) obj).template;
            }
        }).distinctUntilChanged().subscribe(ffw.m121193d(new e30() { // from class: l.zvo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205050a.m99295C4((String) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: f4 */
    public void mo74232f4(tzd tzdVar) {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: l4 */
    public void mo74236l4(KeyboardEventData keyboardEventData) {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: g4 */
    public void mo74233g4() {
    }
}
