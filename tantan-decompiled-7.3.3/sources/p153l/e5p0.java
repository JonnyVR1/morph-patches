package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;

/* JADX INFO: loaded from: classes5.dex */
public class e5p0 extends LiveGiftTraysPresenter<rwn0> {
    public e5p0(dum dumVar, LiveGiftTrays liveGiftTrays) {
        super(dumVar, liveGiftTrays);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public final void m119550C4(String str) {
        boolean zEquals = "game".equals(str);
        V v2 = this.viewModel;
        if (zEquals) {
            bnl0.m105540X((View) v2, -qa00.m175859d(140.0f));
        } else {
            bnl0.m105540X((View) v2, -qa00.m175859d(0.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: a4 */
    public boolean mo75413a4(GiftTrayData giftTrayData) {
        if (((rwn0) m213810E2()).m183434i3()) {
            return ((ifv) zrv.m221194l(htd0.f111523e)).f114700i.get().booleanValue();
        }
        htd0<ifv> htd0Var = htd0.f111523e;
        return !((ifv) zrv.m221194l(htd0Var)).f114701j.get().booleanValue() || ((ifv) zrv.m221194l(htd0Var)).f114700i.get().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m183409O2().m188658d()).map(new qcj() { // from class: l.c5p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoice) obj).template;
            }
        }).distinctUntilChanged().subscribe(dhw.m115825d(new y20() { // from class: l.d5p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85181a.m119550C4((String) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: f4 */
    public void mo75415f4(h1e h1eVar) {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: l4 */
    public void mo75419l4(KeyboardEventData keyboardEventData) {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: g4 */
    public void mo75416g4() {
    }
}
