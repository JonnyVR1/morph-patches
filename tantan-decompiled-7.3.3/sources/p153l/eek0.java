package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;

/* JADX INFO: loaded from: classes4.dex */
public class eek0 extends jk2<LongLinkEnterRoomMessage.UserEnterRoomEffect, BLiveEnterRoom> {
    public eek0(wbg0<BLiveEnterRoom, BLiveEnterRoom> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkEnterRoomMessage.UserEnterRoomEffect userEnterRoomEffect, String str) {
        if (userEnterRoomEffect.getHierarchys().getWealthHierarchy().getGrade() > 0) {
            return TextUtils.isEmpty(userEnterRoomEffect.getRoomId()) || m159460r(userEnterRoomEffect.getRoomId(), "no_care", "no_care");
        }
        return false;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveEnterRoom mo95993z(String str, LongLinkEnterRoomMessage.UserEnterRoomEffect userEnterRoomEffect) {
        return f7t.m124499s(userEnterRoomEffect);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkEnterRoomMessage.UserEnterRoomEffect> mo95510b() {
        return LongLinkEnterRoomMessage.UserEnterRoomEffect.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.privilege.enterroomeffect";
    }
}
