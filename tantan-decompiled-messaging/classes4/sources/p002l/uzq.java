package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uzq extends vp2<LongLinkLiveMessage.BootOutRoomByAdmin> {
    public uzq(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.BootOutRoomByAdmin bootOutRoomByAdmin, String str2) {
        CrashHelper.c(new IllegalStateException("live boot message send in kick user by admin msg handler"));
        return new LiveControlMessage(str, "boot").setContent(bootOutRoomByAdmin.getNotifyMessage());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.BootOutRoomByAdmin> mo9244b() {
        return LongLinkLiveMessage.BootOutRoomByAdmin.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voiceRoom.kickUserByAdmin";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.BootOutRoomByAdmin bootOutRoomByAdmin, String str) {
        return m24095r(bootOutRoomByAdmin.getRoomId(), "no_care", "no_care");
    }
}
