package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.data.ExtensionGame;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public class yjj extends ar2<ikj> {

    /* JADX INFO: renamed from: a */
    public final Act f200305a;

    public yjj(Act act, ner nerVar) {
        super(nerVar);
        this.f200305a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m216410g0(Bundle bundle) {
        tr90.m192424k(this.f200305a);
        if (!(this.f200305a instanceof ProfileInfoLoopEditAct)) {
            gta.m132210e().m132214d().mo34947xc(CoreModule.f18264c.f20381e0.m116600p9().mo225055clone());
        }
        if (gta.m132210e().m132214d().mo34760Uc().profile.extensions.game == null) {
            gta.m132210e().m132214d().mo34760Uc().profile.extensions.game = ExtensionGame.new_();
        }
        gta.m132210e().m132214d().mo34760Uc().profile.extensions.game.nullCheck();
        ((ikj) this.viewModel).m140345I();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.wjj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189463a.m216410g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m216411h0() {
        if (w20.m204491f(act())) {
            act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m216412i0() {
        User userMo225055clone = CoreModule.m30930K().me_().mo225055clone();
        userMo225055clone.profile.extensions.game = ((ikj) this.viewModel).m140350q().profile.extensions.game.mo225055clone();
        tr90.m192412D(act(), userMo225055clone, new Runnable() { // from class: l.xjj
            @Override // java.lang.Runnable
            public final void run() {
                this.f194581a.m216411h0();
            }
        }, null);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
