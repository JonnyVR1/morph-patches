package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;

/* JADX INFO: loaded from: classes4.dex */
public class m6e extends bk2<LongLinkLiveDownBox.LiveAccessChannel, LongLinkLiveDownBox.LiveAccessChannel> {
    public m6e(p3g0<LongLinkLiveDownBox.LiveAccessChannel, LongLinkLiveDownBox.LiveAccessChannel> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveDownBox.LiveAccessChannel> mo94398b() {
        return LongLinkLiveDownBox.LiveAccessChannel.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.liveAccessChannel";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveDownBox.LiveAccessChannel mo94461z(String str, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        return liveAccessChannel;
    }
}
