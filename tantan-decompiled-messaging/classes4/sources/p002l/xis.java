package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import l.p3g0;
import l.vpv;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xis extends bk2<LongLinkGiftMessage.LiveGiftReceivedMsg, BLiveGivenGiftBrief> {
    public xis(p3g0<BLiveGivenGiftBrief, BLiveGivenGiftBrief> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.LiveGiftReceivedMsg liveGiftReceivedMsg, String str) {
        vpv vpvVar;
        return (liveGiftReceivedMsg == null || (vpvVar = ypv.a) == null || TextUtils.equals(vpvVar.D0(), liveGiftReceivedMsg.getUserId())) ? false : true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveGivenGiftBrief mo9251z(String str, LongLinkGiftMessage.LiveGiftReceivedMsg liveGiftReceivedMsg) {
        und undVar = this.f21259c;
        return e5t.m12213r(liveGiftReceivedMsg, (undVar == null || undVar.m23565a() == null) ? "" : this.f21259c.m23565a().room.id);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveGiftReceivedMsg> mo9244b() {
        return LongLinkGiftMessage.LiveGiftReceivedMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.received";
    }
}
