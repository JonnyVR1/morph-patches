package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.data.ExtensionGame;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public class ehj extends jq2<ohj> {

    /* JADX INFO: renamed from: a */
    public final Act f91331a;

    public ehj(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f91331a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m116467g0(Bundle bundle) {
        pj90.m169799k(this.f91331a);
        if (!(this.f91331a instanceof ProfileInfoLoopEditAct)) {
            ura.m195053e().m195057d().mo33944xc(CoreModule.f17545c.f19639e0.m169527p9().mo223809clone());
        }
        if (ura.m195053e().m195057d().mo33757Uc().profile.extensions.game == null) {
            ura.m195053e().m195057d().mo33757Uc().profile.extensions.game = ExtensionGame.new_();
        }
        ura.m195053e().m195057d().mo33757Uc().profile.extensions.game.nullCheck();
        ((ohj) this.viewModel).m164387I();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.chj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80885a.m116467g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m116468h0() {
        if (c30.m104964f(act())) {
            act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m116469i0() {
        User userMo223809clone = CoreModule.m29932K().me_().mo223809clone();
        userMo223809clone.profile.extensions.game = ((ohj) this.viewModel).m164392q().profile.extensions.game.mo223809clone();
        pj90.m169787D(act(), userMo223809clone, new Runnable() { // from class: l.dhj
            @Override // java.lang.Runnable
            public final void run() {
                this.f86304a.m116468h0();
            }
        }, null);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
