package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;

/* JADX INFO: loaded from: classes4.dex */
public class fu70 extends jk2<LongLinkLiveMessage.PkPushCdnFail, LivePkMessage> {
    public fu70(wbg0<LivePkMessage, LivePkMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.PkPushCdnFail pkPushCdnFail, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LivePkMessage mo95993z(String str, LongLinkLiveMessage.PkPushCdnFail pkPushCdnFail) {
        return new LivePkMessage(pkPushCdnFail.getPkId(), "pk_cdn_fail");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkPushCdnFail> mo95510b() {
        return LongLinkLiveMessage.PkPushCdnFail.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.pk.push.cdn.fail";
    }
}
