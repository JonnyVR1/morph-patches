package p153l;

import com.heytap.mcssdk.mode.Message;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeCheckFailDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/l4p0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeCheckFailDialog;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Message.RULE, "", "K3", "(Ljava/lang/String;)V", "J3", "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class l4p0 extends i6t<rwn0, VoiceTopNoticeCheckFailDialog> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4p0(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        Act act = act();
        act.getClass();
        mo52715C(new VoiceTopNoticeCheckFailDialog(act, null, 0, 6, null));
    }

    /* JADX INFO: renamed from: J3 */
    public final void m152813J3() {
        m213811F2().TopNoticeEvent.openEditNoticeDialog().m199277p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final void m152814K3(@NotNull String rule) {
        rule.getClass();
        ((VoiceTopNoticeCheckFailDialog) this.viewModel).m78921l(rule);
        keo0 keo0Var = keo0.INSTANCE;
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        keo0Var.m149339a(strM202191k);
    }
}
