package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ea3 extends vp2<LongLinkLiveMessage.BootOutRoom> {
    public ea3(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.BootOutRoom bootOutRoom, String str) {
        return m199212r(bootOutRoom.getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.BootOutRoom bootOutRoom, String str2) {
        String id = bootOutRoom.getUser().getId();
        String strM201014a = w220.m201014a();
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        if (TextUtils.equals(id, ypv.f199493a.m199309D0()) || TextUtils.equals(strM201014a, id)) {
            return new LiveControlMessage(str, "boot").setContent(m115408z(bootOutRoom.getManager()));
        }
        return null;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.BootOutRoom bootOutRoom, String str2) {
        if (bootOutRoom.getTempdata().getId() <= 0) {
            return null;
        }
        return m199209n(str, bootOutRoom.getTempdata().getId(), bootOutRoom.getUser(), bootOutRoom.getManager(), bootOutRoom.getTempdata());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.BootOutRoom> mo94398b() {
        return LongLinkLiveMessage.BootOutRoom.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.boot";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo115407h() {
        return vwb.m200324f0("live.voiceRoom.kickUser");
    }

    /* JADX INFO: renamed from: z */
    public final String m115408z(LongLinkLiveMessage.UserInfo userInfo) {
        boolean zM207012b = x4s.m207012b(this.f182445c.m194414a().liveMode);
        if (this.f182445c.m194414a().anchor.f44419id.equals(userInfo.getId())) {
            return zM207012b ? ypv.f199497e.getString(R$string.f47333k0) : ypv.f199497e.getString(R$string.f47311j0);
        }
        return zM207012b ? ypv.f199497e.getString(R$string.f47355l0) : ypv.f199497e.getString(R$string.f47020Vb, userInfo.getName());
    }
}
