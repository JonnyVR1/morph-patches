package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class wbl0 extends jk2<LongLinkGiftMessage.VideoChatDuration, LongLinkGiftMessage.VideoChatDuration> {
    public wbl0(wbg0<LongLinkGiftMessage.VideoChatDuration, LongLinkGiftMessage.VideoChatDuration> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.VideoChatDuration videoChatDuration, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.VideoChatDuration> mo95510b() {
        return LongLinkGiftMessage.VideoChatDuration.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.videoChatDuration";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkGiftMessage.VideoChatDuration mo95993z(String str, LongLinkGiftMessage.VideoChatDuration videoChatDuration) {
        return videoChatDuration;
    }
}
