package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bht extends bk2<LongLinkLiveMessage.LiveStickerChangeMsg, LongLinkLiveMessage.LiveStickerChangeMsg> {
    public bht(p3g0<LongLinkLiveMessage.LiveStickerChangeMsg, LongLinkLiveMessage.LiveStickerChangeMsg> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveStickerChangeMsg> mo9244b() {
        return LongLinkLiveMessage.LiveStickerChangeMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.sticker.change";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.LiveStickerChangeMsg mo9251z(String str, LongLinkLiveMessage.LiveStickerChangeMsg liveStickerChangeMsg) {
        return liveStickerChangeMsg;
    }
}
