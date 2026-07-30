package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ta3 extends mq2<LongLinkLiveMessage.BootOutRoom> {
    public ta3(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.BootOutRoom bootOutRoom, String str) {
        return m159460r(bootOutRoom.getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.BootOutRoom bootOutRoom, String str2) {
        String id = bootOutRoom.getUser().getId();
        String strM120148a = eb20.m120148a();
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        if (TextUtils.equals(id, zrv.f205799a.m207631D0()) || TextUtils.equals(strM120148a, id)) {
            return new LiveControlMessage(str, "boot").setContent(m189773z(bootOutRoom.getManager()));
        }
        return null;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.BootOutRoom bootOutRoom, String str2) {
        if (bootOutRoom.getTempdata().getId() <= 0) {
            return null;
        }
        return m159457n(str, bootOutRoom.getTempdata().getId(), bootOutRoom.getUser(), bootOutRoom.getManager(), bootOutRoom.getTempdata());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.BootOutRoom> mo95510b() {
        return LongLinkLiveMessage.BootOutRoom.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.room.boot";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: h */
    public List<String> mo116845h() {
        return jyb.m147507f0("live.voiceRoom.kickUser");
    }

    /* JADX INFO: renamed from: z */
    public final String m189773z(LongLinkLiveMessage.UserInfo userInfo) {
        boolean zM214494b = y6s.m214494b(this.f137993c.m220733a().liveMode);
        if (this.f137993c.m220733a().anchor.f45267id.equals(userInfo.getId())) {
            return zM214494b ? zrv.f205803e.getString(R$string.f48181k0) : zrv.f205803e.getString(R$string.f48159j0);
        }
        return zM214494b ? zrv.f205803e.getString(R$string.f48203l0) : zrv.f205803e.getString(R$string.f47868Vb, userInfo.getName());
    }
}
