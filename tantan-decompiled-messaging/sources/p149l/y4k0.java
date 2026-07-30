package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;

/* JADX INFO: loaded from: classes4.dex */
public class y4k0 extends bk2<LongLinkEnterRoomMessage.UserEnterRoomEffect, BLiveEnterRoom> {
    public y4k0(p3g0<BLiveEnterRoom, BLiveEnterRoom> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkEnterRoomMessage.UserEnterRoomEffect userEnterRoomEffect, String str) {
        if (userEnterRoomEffect.getHierarchys().getWealthHierarchy().getGrade() > 0) {
            return TextUtils.isEmpty(userEnterRoomEffect.getRoomId()) || m199212r(userEnterRoomEffect.getRoomId(), "no_care", "no_care");
        }
        return false;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveEnterRoom mo94461z(String str, LongLinkEnterRoomMessage.UserEnterRoomEffect userEnterRoomEffect) {
        return e5t.m114915s(userEnterRoomEffect);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkEnterRoomMessage.UserEnterRoomEffect> mo94398b() {
        return LongLinkEnterRoomMessage.UserEnterRoomEffect.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.privilege.enterroomeffect";
    }
}
