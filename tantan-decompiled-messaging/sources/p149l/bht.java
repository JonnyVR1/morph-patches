package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class bht extends bk2<LongLinkLiveMessage.LiveStickerChangeMsg, LongLinkLiveMessage.LiveStickerChangeMsg> {
    public bht(p3g0<LongLinkLiveMessage.LiveStickerChangeMsg, LongLinkLiveMessage.LiveStickerChangeMsg> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveStickerChangeMsg> mo94398b() {
        return LongLinkLiveMessage.LiveStickerChangeMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.sticker.change";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.LiveStickerChangeMsg mo94461z(String str, LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        return liveStickerChangeMsg;
    }
}
