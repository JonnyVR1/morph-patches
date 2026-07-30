package p149l;

import com.heytap.mcssdk.mode.Message;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeCheckFailDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/hvo0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeCheckFailDialog;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Message.RULE, "", "K3", "(Ljava/lang/String;)V", "J3", "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hvo0 extends h4t<nnn0, VoiceTopNoticeCheckFailDialog> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvo0(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        Act act = act();
        act.getClass();
        mo51532C(new VoiceTopNoticeCheckFailDialog(act, null, 0, 6, null));
    }

    /* JADX INFO: renamed from: J3 */
    public final void m133195J3() {
        m206028F2().TopNoticeEvent.openEditNoticeDialog().m172467p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final void m133196K3(@NotNull String rule) {
        rule.getClass();
        ((VoiceTopNoticeCheckFailDialog) this.viewModel).m77738l(rule);
        g5o0 g5o0Var = g5o0.INSTANCE;
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        g5o0Var.m124531a(strM149814k);
    }
}
