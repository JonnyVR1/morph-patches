package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class v80 extends mq2<LongLinkLiveMessage.AddManager> {
    public v80(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.AddManager addManager, String str2) {
        return new LiveControlMessage(str, "add_manager");
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.AddManager addManager, String str2) {
        return m159457n(str, addManager.getTempdata().getId(), addManager.getUser(), addManager.getUser(), addManager.getTempdata());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.AddManager> mo95510b() {
        return LongLinkLiveMessage.AddManager.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.manager.add";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: h */
    public List<String> mo116845h() {
        return jyb.m147507f0("live.voiceRoom.addManager");
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.AddManager addManager, String str) {
        return m159460r(addManager.getRoomId(), "no_care", "no_care");
    }
}
