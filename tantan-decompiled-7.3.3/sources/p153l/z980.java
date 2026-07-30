package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;

/* JADX INFO: loaded from: classes4.dex */
public class z980 extends jk2<LongLinkLiveMessage.PkStart, LivePkMessage> {
    public z980(wbg0<LivePkMessage, LivePkMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.PkStart pkStart, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LivePkMessage mo95993z(String str, LongLinkLiveMessage.PkStart pkStart) {
        return new LivePkMessage(pkStart.getPk(), "pk_start");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkStart> mo95510b() {
        return LongLinkLiveMessage.PkStart.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.pk.start";
    }
}
