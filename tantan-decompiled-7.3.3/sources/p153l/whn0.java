package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a;

/* JADX INFO: loaded from: classes5.dex */
public class whn0 extends C13038a {
    public whn0(Act act) {
        super(act);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a, com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: i */
    public String mo76439i() {
        return deg0.f88028e;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a, com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: j */
    public String mo76440j() {
        return deg0.f88029f;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a, com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: k */
    public void mo76441k(String str, String str2, final BaseGameHelper.InterfaceC13037e interfaceC13037e) {
        this.f51824a.duringCreated(kzl0.m152184f(str)).subscribe(dhw.m115826e(new y20() { // from class: l.uhn0
            @Override // p153l.y20
            public final void call(Object obj) {
                interfaceC13037e.onSuccess((String) obj);
            }
        }, new y20() { // from class: l.vhn0
            @Override // p153l.y20
            public final void call(Object obj) {
                interfaceC13037e.mo76457a();
            }
        }));
    }
}
