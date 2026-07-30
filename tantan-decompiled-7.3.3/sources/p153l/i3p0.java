package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;

/* JADX INFO: loaded from: classes5.dex */
public class i3p0 extends dh2<VoiceChatItem> {
    public i3p0(LiveMessage liveMessage, yql yqlVar) {
        super(liveMessage, yqlVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceChatItem voiceChatItem) {
        super.mo71749u(voiceChatItem);
        if (jyb.m147479J(this.f88411a.spanList)) {
            return;
        }
        yql yqlVar = this.f88412b;
        LiveMessage liveMessage = this.f88411a;
        voiceChatItem.m73699e(yqlVar, liveMessage, liveMessage.spanList.get(0), 0);
        bnl0.m105537U(voiceChatItem, m115780H() ? 0 : qa00.m175859d(6.0f));
        bnl0.m105540X(voiceChatItem, qa00.m175859d(6.0f));
        bnl0.m105538V(voiceChatItem, qa00.m175859d(4.0f));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199103h8;
    }
}
