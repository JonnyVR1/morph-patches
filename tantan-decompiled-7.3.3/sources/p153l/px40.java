package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes12.dex */
public class px40 extends ar2<by40> {
    public px40(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m174107g0(Bundle bundle) {
        ((by40) this.viewModel).m106989r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.ox40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149622a.m174107g0((Bundle) obj);
            }
        });
        m174108f0();
    }

    /* JADX INFO: renamed from: f0 */
    public void m174108f0() {
        ((by40) this.viewModel).m106988q();
    }

    /* JADX INFO: renamed from: h0 */
    public void m174109h0(String str, boolean z) {
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
        i4g0.m138523u(str2, "p_push_setting", jyb.m147494Y("push_switch_change", z ? "off2on" : "on2off"));
    }

    /* JADX INFO: renamed from: i0 */
    public void m174110i0(String str, boolean z) {
        m174109h0(str, z);
        m174111j0(str, z, 0, 0);
    }

    /* JADX INFO: renamed from: j0 */
    public void m174111j0(String str, boolean z, int i, int i2) {
        duringCreated(CoreModule.f18264c.f20381e0.m116482K9(str, z, i, i2)).subscribe(psd0.m173601L(psd0.m173591B()));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
