package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class cjt extends jk2<LongLinkLiveMessage.LiveStickerChangeMsg, LongLinkLiveMessage.LiveStickerChangeMsg> {
    public cjt(wbg0<LongLinkLiveMessage.LiveStickerChangeMsg, LongLinkLiveMessage.LiveStickerChangeMsg> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveStickerChangeMsg> mo95510b() {
        return LongLinkLiveMessage.LiveStickerChangeMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.sticker.change";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.LiveStickerChangeMsg mo95993z(String str, LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        return liveStickerChangeMsg;
    }
}
