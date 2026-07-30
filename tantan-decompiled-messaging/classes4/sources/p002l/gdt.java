package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gdt extends vp2<LongLinkLiveMessage.LiveRecover> {
    public gdt(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.LiveRecover liveRecover, String str2) {
        return new LiveControlMessage(str, "recover", liveRecover.getStreamIdentifier()).setLiveId(liveRecover.getLiveId());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveRecover> mo9244b() {
        return LongLinkLiveMessage.LiveRecover.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.room.recover";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveRecover liveRecover, String str) {
        return m24095r(liveRecover.getRoomId(), liveRecover.getUserId(), "no_care");
    }
}
