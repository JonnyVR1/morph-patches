package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xq70 extends bk2<LongLinkLiveMessage.PkInviteNotify, LivePkMessage> {
    public xq70(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.PkInviteNotify pkInviteNotify, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LivePkMessage mo9251z(String str, LongLinkLiveMessage.PkInviteNotify pkInviteNotify) {
        return new LivePkMessage(pkInviteNotify.getPkInviteId(), "pk_invite_notify").setInviteMsg(pkInviteNotify).setOnceMore(pkInviteNotify.getIsOnceMore());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class mo9244b() {
        return LongLinkLiveMessage.PkInviteNotify.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.pk.invite.notify";
    }
}
