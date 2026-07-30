package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.ExtensionGame;
import com.p1.mobile.putong.data.User;
import l.c30;
import l.e30;
import l.jq2;
import l.mcr;
import l.pj90;
import l.ura;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ehj extends jq2<ohj> {

    /* JADX INFO: renamed from: a */
    public final Act f9796a;

    public ehj(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f9796a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m12542g0(Bundle bundle) {
        pj90.k(this.f9796a);
        if (!(this.f9796a instanceof ProfileInfoLoopEditAct)) {
            ura.e().d().xc(CoreModule.c.e0.p9().clone());
        }
        if (ura.e().d().Uc().profile.extensions.game == null) {
            ura.e().d().Uc().profile.extensions.game = ExtensionGame.new_();
        }
        ura.e().d().Uc().profile.extensions.game.nullCheck();
        ((ohj) ((jq2) this).viewModel).m19530I();
    }

    /* JADX INFO: renamed from: a0 */
    public void m12543a0() {
        super.a0();
        creates(new e30() { // from class: l.chj
            public final void call(Object obj) {
                this.f8679a.m12542g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m12544h0() {
        if (c30.f(act())) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m12545i0() {
        User userClone = CoreModule.K().me_().clone();
        userClone.profile.extensions.game = ((ohj) ((jq2) this).viewModel).m19536q().profile.extensions.game.clone();
        pj90.D(act(), userClone, new Runnable() { // from class: l.dhj
            @Override // java.lang.Runnable
            public final void run() {
                this.f9278a.m12544h0();
            }
        }, (Runnable) null);
    }

    public void destroy() {
    }
}
