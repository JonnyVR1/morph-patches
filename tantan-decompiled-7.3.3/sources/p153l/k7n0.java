package p153l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupEnterView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/k7n0;", "Ll/r6n0;", "Ll/dum;", "Ll/rwn0;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;", "viewModel", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;)V", "", "K3", "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class k7n0 extends r6n0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7n0(@NotNull dum<? extends rwn0> dumVar, @NotNull VoiceChatGroupEnterView voiceChatGroupEnterView) {
        super(dumVar, voiceChatGroupEnterView);
        dumVar.getClass();
        voiceChatGroupEnterView.getClass();
    }

    /* JADX INFO: renamed from: L3 */
    public static void m148639L3(k7n0 k7n0Var, BLiveVoiceChatGroup bLiveVoiceChatGroup) {
        if (TextUtils.isEmpty(bLiveVoiceChatGroup.chatGroupId)) {
            k7n0Var.m213811F2().LiveVoiceChatGroupEvent.openCreateGroupDialog().mo199273j(Boolean.TRUE);
        } else {
            k7n0Var.m213811F2().LiveVoiceChatGroupEvent.openChatGroupContentDialog().mo199273j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m148640M3(Throwable th) {
        l7n0 l7n0Var = l7n0.INSTANCE;
        th.getClass();
        l7n0Var.m153146a(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.r6n0
    /* JADX INFO: renamed from: K3 */
    public void mo96481K3() {
        b6n0 b6n0Var = b6n0.INSTANCE;
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(b6n0Var.m102787o(strM202191k)).subscribe(dhw.m115826e(new y20() { // from class: l.i7n0
            @Override // p153l.y20
            public final void call(Object obj) {
                k7n0.m148639L3(this.f113277a, (BLiveVoiceChatGroup) obj);
            }
        }, new y20() { // from class: l.j7n0
            @Override // p153l.y20
            public final void call(Object obj) {
                k7n0.m148640M3((Throwable) obj);
            }
        }));
    }
}
