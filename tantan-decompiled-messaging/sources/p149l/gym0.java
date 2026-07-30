package p149l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupEnterView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/gym0;", "Ll/nxm0;", "Ll/bsm;", "Ll/nnn0;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;", "viewModel", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;)V", "", "K3", "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class gym0 extends nxm0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gym0(@NotNull bsm<? extends nnn0> bsmVar, @NotNull VoiceChatGroupEnterView voiceChatGroupEnterView) {
        super(bsmVar, voiceChatGroupEnterView);
        bsmVar.getClass();
        voiceChatGroupEnterView.getClass();
    }

    /* JADX INFO: renamed from: L3 */
    public static void m128712L3(gym0 gym0Var, BLiveVoiceChatGroup bLiveVoiceChatGroup) {
        if (TextUtils.isEmpty(bLiveVoiceChatGroup.chatGroupId)) {
            gym0Var.m206028F2().LiveVoiceChatGroupEvent.openCreateGroupDialog().mo172463j(Boolean.TRUE);
        } else {
            gym0Var.m206028F2().LiveVoiceChatGroupEvent.openChatGroupContentDialog().mo172463j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m128713M3(Throwable th) {
        hym0 hym0Var = hym0.INSTANCE;
        th.getClass();
        hym0Var.m133616a(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.nxm0
    /* JADX INFO: renamed from: K3 */
    public void mo128714K3() {
        xwm0 xwm0Var = xwm0.INSTANCE;
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        duringCreated(xwm0Var.m211354o(strM149814k)).subscribe(ffw.m121194e(new e30() { // from class: l.eym0
            @Override // p149l.e30
            public final void call(Object obj) {
                gym0.m128712L3(this.f93771a, (BLiveVoiceChatGroup) obj);
            }
        }, new e30() { // from class: l.fym0
            @Override // p149l.e30
            public final void call(Object obj) {
                gym0.m128713M3((Throwable) obj);
            }
        }));
    }
}
