package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bp40 extends jq2<np40> {
    public bp40(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m12828g0(Bundle bundle) {
        ((np40) ((jq2) this).viewModel).m20196r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m12829a0() {
        creates(new e30() { // from class: l.ap40
            public final void call(Object obj) {
                this.f8434a.m12828g0((Bundle) obj);
            }
        });
        m12830f0();
    }

    /* JADX INFO: renamed from: f0 */
    public void m12830f0() {
        ((np40) ((jq2) this).viewModel).m20195q();
    }

    /* JADX INFO: renamed from: h0 */
    public void m12831h0(String str, boolean z) {
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
        zvf0.u(str2, "p_push_setting", new j760[]{vwb.Y("push_switch_change", z ? "off2on" : "on2off")});
    }

    /* JADX INFO: renamed from: i0 */
    public void m12832i0(String str, boolean z) {
        m12831h0(str, z);
        m12833j0(str, z, 0, 0);
    }

    /* JADX INFO: renamed from: j0 */
    public void m12833j0(String str, boolean z, int i, int i2) {
        duringCreated(CoreModule.f1534c.f3628e0.m21372K9(str, z, i, i2)).subscribe(mkd0.L(mkd0.B()));
    }

    public void destroy() {
    }
}
