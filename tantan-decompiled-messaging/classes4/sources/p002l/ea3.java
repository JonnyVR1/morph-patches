package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import java.util.List;
import l.vwb;
import l.x4s;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ea3 extends vp2<LongLinkLiveMessage.BootOutRoom> {
    public ea3(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.BootOutRoom bootOutRoom, String str) {
        return m24095r(bootOutRoom.getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.BootOutRoom bootOutRoom, String str2) {
        String id = bootOutRoom.getUser().getId();
        String strM24290a = w220.m24290a();
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        if (TextUtils.equals(id, ypv.a.D0()) || TextUtils.equals(strM24290a, id)) {
            return new LiveControlMessage(str, "boot").setContent(m12304z(bootOutRoom.getManager()));
        }
        return null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.BootOutRoom bootOutRoom, String str2) {
        if (bootOutRoom.getTempdata().getId() <= 0) {
            return null;
        }
        return m24092n(str, bootOutRoom.getTempdata().getId(), bootOutRoom.getUser(), bootOutRoom.getManager(), bootOutRoom.getTempdata());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.BootOutRoom> mo9244b() {
        return LongLinkLiveMessage.BootOutRoom.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.room.boot";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: h */
    public List<String> mo12303h() {
        return vwb.f0(new String[]{"live.voiceRoom.kickUser"});
    }

    /* JADX INFO: renamed from: z */
    public final String m12304z(LongLinkLiveMessage.UserInfo userInfo) {
        boolean zB = x4s.b(this.f21259c.m23565a().liveMode);
        if (this.f21259c.m23565a().anchor.id.equals(userInfo.getId())) {
            return zB ? ypv.e.getString(R$string.f3375k0) : ypv.e.getString(R$string.f3353j0);
        }
        return zB ? ypv.e.getString(R$string.f3397l0) : ypv.e.getString(R$string.f3062Vb, userInfo.getName());
    }
}
