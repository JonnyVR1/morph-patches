package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes9.dex */
public class bp40 extends jq2<np40> {
    public bp40(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m103036g0(Bundle bundle) {
        ((np40) this.viewModel).m160470r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ap40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70978a.m103036g0((Bundle) obj);
            }
        });
        m103037f0();
    }

    /* JADX INFO: renamed from: f0 */
    public void m103037f0() {
        ((np40) this.viewModel).m160469q();
    }

    /* JADX INFO: renamed from: h0 */
    public void m103038h0(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "msgPush")) {
            str2 = "e_friend_message_switch";
        } else if (TextUtils.equals(str, "momentPush")) {
            str2 = "e_moment_push_switch";
        } else if (TextUtils.equals(str, "livePush")) {
            str2 = "e_live_push_switch";
        } else if (TextUtils.equals(str, "voiceLivePush")) {
            str2 = "e_chatroom_switch";
        } else if (TextUtils.equals(str, "recommendPush")) {
            str2 = "e_personal_reference_switch";
        } else {
            str2 = TextUtils.equals(str, "silentSwitch") ? "e_pushoff_mode_switch" : "";
        }
        zvf0.m220399u(str2, "p_push_setting", vwb.m200311Y("push_switch_change", z ? "off2on" : "on2off"));
    }

    /* JADX INFO: renamed from: i0 */
    public void m103039i0(String str, boolean z) {
        m103038h0(str, z);
        m103040j0(str, z, 0, 0);
    }

    /* JADX INFO: renamed from: j0 */
    public void m103040j0(String str, boolean z, int i, int i2) {
        duringCreated(CoreModule.f17545c.f19639e0.m169409K9(str, z, i, i2)).subscribe(mkd0.m154960L(mkd0.m154950B()));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
