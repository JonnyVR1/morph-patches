package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ptd extends vp2<LongLinkLiveMessage.DeleteManager> {
    public ptd(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.DeleteManager deleteManager, String str2) {
        return new LiveControlMessage(str, "delete_manager");
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.DeleteManager deleteManager, String str2) {
        return m199209n(str, deleteManager.getTempdata().getId(), deleteManager.getUser(), deleteManager.getUser(), deleteManager.getTempdata());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.DeleteManager> mo94398b() {
        return LongLinkLiveMessage.DeleteManager.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.manager.delete";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo115407h() {
        return vwb.m200324f0("live.voiceRoom.deleteManager");
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.DeleteManager deleteManager, String str) {
        return m199212r(deleteManager.getRoomId(), "no_care", "no_care");
    }
}
