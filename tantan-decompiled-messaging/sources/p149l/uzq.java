package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class uzq extends vp2<LongLinkLiveMessage.BootOutRoomByAdmin> {
    public uzq(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.BootOutRoomByAdmin bootOutRoomByAdmin, String str2) {
        CrashHelper.m81296c(new IllegalStateException("live boot message send in kick user by admin msg handler"));
        return new LiveControlMessage(str, "boot").setContent(bootOutRoomByAdmin.getNotifyMessage());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.BootOutRoomByAdmin> mo94398b() {
        return LongLinkLiveMessage.BootOutRoomByAdmin.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voiceRoom.kickUserByAdmin";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.BootOutRoomByAdmin bootOutRoomByAdmin, String str) {
        return m199212r(bootOutRoomByAdmin.getRoomId(), "no_care", "no_care");
    }
}
