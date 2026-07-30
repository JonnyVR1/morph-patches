package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m6e extends bk2<LongLinkLiveDownBox.LiveAccessChannel, LongLinkLiveDownBox.LiveAccessChannel> {
    public m6e(p3g0<LongLinkLiveDownBox.LiveAccessChannel, LongLinkLiveDownBox.LiveAccessChannel> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveDownBox.LiveAccessChannel> mo9244b() {
        return LongLinkLiveDownBox.LiveAccessChannel.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.room.liveAccessChannel";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveDownBox.LiveAccessChannel mo9251z(String str, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        return liveAccessChannel;
    }
}
