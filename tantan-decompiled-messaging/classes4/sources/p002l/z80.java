package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z80 extends vp2<LongLinkLiveMessage.AddManager> {
    public z80(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.AddManager addManager, String str2) {
        return new LiveControlMessage(str, "add_manager");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.AddManager addManager, String str2) {
        return m24092n(str, addManager.getTempdata().getId(), addManager.getUser(), addManager.getUser(), addManager.getTempdata());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.AddManager> mo9244b() {
        return LongLinkLiveMessage.AddManager.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.manager.add";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo12303h() {
        return vwb.f0(new String[]{"live.voiceRoom.addManager"});
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.AddManager addManager, String str) {
        return m24095r(addManager.getRoomId(), "no_care", "no_care");
    }
}
