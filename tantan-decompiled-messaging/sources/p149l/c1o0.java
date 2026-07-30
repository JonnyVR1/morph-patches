package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatMicEmojiItemView;

/* JADX INFO: loaded from: classes5.dex */
public class c1o0 extends wg2<VoiceChatMicEmojiItemView> {

    /* JADX INFO: renamed from: d */
    public VoiceChatMicEmojiItemView f78290d;

    public c1o0(rh2 rh2Var, final LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
        rh2Var.act().duringCreated(rh2Var.m206028F2().VoiceMicEmojiEvent.changeMicEmojiState().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.b1o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72613a.m104871K(liveMessage, (s1o0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m104871K(LiveMessage liveMessage, s1o0 s1o0Var) {
        LiveUserInfo liveUserInfo;
        String str;
        if (this.f78290d == null || liveMessage == null || (liveUserInfo = liveMessage.liveUserInfo) == null || (str = liveUserInfo.mid) == null || !str.equals(s1o0Var.f161925e) || !s1o0Var.m182018h()) {
            return;
        }
        this.f78290d.m78056n(s1o0Var.m182014d(), s1o0Var.m182015e(), liveUserInfo.userId, s1o0Var.f161925e);
        liveMessage.localCreateTime = 0L;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceChatMicEmojiItemView voiceChatMicEmojiItemView) {
        super.mo70566u(voiceChatMicEmojiItemView);
        this.f78290d = voiceChatMicEmojiItemView;
        voiceChatMicEmojiItemView.m78054l(this.f186133b, this.f186132a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168488q8;
    }
}
