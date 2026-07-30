package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class u1r extends mq2<LongLinkLiveMessage.BootOutRoomByAdmin> {
    public u1r(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.BootOutRoomByAdmin bootOutRoomByAdmin, String str2) {
        CrashHelper.m82479c(new IllegalStateException("live boot message send in kick user by admin msg handler"));
        return new LiveControlMessage(str, "boot").setContent(bootOutRoomByAdmin.getNotifyMessage());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.BootOutRoomByAdmin> mo95510b() {
        return LongLinkLiveMessage.BootOutRoomByAdmin.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voiceRoom.kickUserByAdmin";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.BootOutRoomByAdmin bootOutRoomByAdmin, String str) {
        return m159460r(bootOutRoomByAdmin.getRoomId(), "no_care", "no_care");
    }
}
