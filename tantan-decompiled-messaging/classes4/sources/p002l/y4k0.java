package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y4k0 extends bk2<LongLinkEnterRoomMessage.UserEnterRoomEffect, BLiveEnterRoom> {
    public y4k0(p3g0<BLiveEnterRoom, BLiveEnterRoom> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkEnterRoomMessage.UserEnterRoomEffect userEnterRoomEffect, String str) {
        if (userEnterRoomEffect.getHierarchys().getWealthHierarchy().getGrade() > 0) {
            return TextUtils.isEmpty(userEnterRoomEffect.getRoomId()) || m24095r(userEnterRoomEffect.getRoomId(), "no_care", "no_care");
        }
        return false;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveEnterRoom mo9251z(String str, LongLinkEnterRoomMessage.UserEnterRoomEffect userEnterRoomEffect) {
        return e5t.m12214s(userEnterRoomEffect);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkEnterRoomMessage.UserEnterRoomEffect> mo9244b() {
        return LongLinkEnterRoomMessage.UserEnterRoomEffect.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.privilege.enterroomeffect";
    }
}
