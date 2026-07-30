package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class gdt extends vp2<LongLinkLiveMessage.LiveRecover> {
    public gdt(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.LiveRecover liveRecover, String str2) {
        return new LiveControlMessage(str, "recover", liveRecover.getStreamIdentifier()).setLiveId(liveRecover.getLiveId());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveRecover> mo94398b() {
        return LongLinkLiveMessage.LiveRecover.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.recover";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveRecover liveRecover, String str) {
        return m199212r(liveRecover.getRoomId(), liveRecover.getUserId(), "no_care");
    }
}
