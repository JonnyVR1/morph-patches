package p153l;

import com.p051p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;

/* JADX INFO: loaded from: classes4.dex */
public class rfu extends jk2<LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg, LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg> {
    public rfu(wbg0<LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg, LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg refreshGiftTabBalanceMsg, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg> mo95510b() {
        return LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "intl.refresh.giftTabBalance";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg mo95993z(String str, LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg refreshGiftTabBalanceMsg) {
        return refreshGiftTabBalanceMsg;
    }
}
