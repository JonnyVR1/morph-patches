package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a;

/* JADX INFO: loaded from: classes5.dex */
public class s8n0 extends C12875a {
    public s8n0(Act act) {
        super(act);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a, com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: i */
    public String mo75256i() {
        return v5g0.f180044e;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a, com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: j */
    public String mo75257j() {
        return v5g0.f180045f;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a, com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: k */
    public void mo75258k(String str, String str2, final BaseGameHelper.InterfaceC12874e interfaceC12874e) {
        this.f50976a.duringCreated(gql0.m127599f(str)).subscribe(ffw.m121194e(new e30() { // from class: l.q8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                interfaceC12874e.onSuccess((String) obj);
            }
        }, new e30() { // from class: l.r8n0
            @Override // p149l.e30
            public final void call(Object obj) {
                interfaceC12874e.mo75274a();
            }
        }));
    }
}
