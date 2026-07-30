package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;

/* JADX INFO: loaded from: classes4.dex */
public class s580 extends jk2<LongLinkLiveMessage.PkMute, LivePkMessage> {
    public s580(wbg0<LivePkMessage, LivePkMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.PkMute pkMute, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LivePkMessage mo95993z(String str, LongLinkLiveMessage.PkMute pkMute) {
        return new LivePkMessage(pkMute.getPkId(), "pk_mute").setPkMuteInfo(pkMute);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkMute> mo95510b() {
        return LongLinkLiveMessage.PkMute.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.pk.mute";
    }
}
