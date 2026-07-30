package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatMicEmojiItemView;

/* JADX INFO: loaded from: classes5.dex */
public class gao0 extends dh2<VoiceChatMicEmojiItemView> {

    /* JADX INFO: renamed from: d */
    public VoiceChatMicEmojiItemView f103016d;

    public gao0(yh2 yh2Var, final LiveMessage liveMessage, yql yqlVar) {
        super(liveMessage, yqlVar);
        yh2Var.act().duringCreated(yh2Var.m213811F2().VoiceMicEmojiEvent.changeMicEmojiState().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.fao0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97996a.m129743K(liveMessage, (wao0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m129743K(LiveMessage liveMessage, wao0 wao0Var) {
        LiveUserInfo liveUserInfo;
        String str;
        if (this.f103016d == null || liveMessage == null || (liveUserInfo = liveMessage.liveUserInfo) == null || (str = liveUserInfo.mid) == null || !str.equals(wao0Var.f188150e) || !wao0Var.m205668h()) {
            return;
        }
        this.f103016d.m79239n(wao0Var.m205664d(), wao0Var.m205665e(), liveUserInfo.userId, wao0Var.f188150e);
        liveMessage.localCreateTime = 0L;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceChatMicEmojiItemView voiceChatMicEmojiItemView) {
        super.mo71749u(voiceChatMicEmojiItemView);
        this.f103016d = voiceChatMicEmojiItemView;
        voiceChatMicEmojiItemView.m79237l(this.f88412b, this.f88411a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199220q8;
    }
}
