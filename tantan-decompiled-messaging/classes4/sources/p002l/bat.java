package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.live.base.data.BLivePKBufferInfo;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bat extends bk2<LongLinkLiveMessage.PkPlayingBuffInfo, BLivePKBufferInfo> {
    public bat(p3g0<BLivePKBufferInfo, BLivePKBufferInfo> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.PkPlayingBuffInfo pkPlayingBuffInfo, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLivePKBufferInfo mo9251z(String str, LongLinkLiveMessage.PkPlayingBuffInfo pkPlayingBuffInfo) {
        BLivePKBufferInfo bLivePKBufferInfoNew_ = BLivePKBufferInfo.new_();
        bLivePKBufferInfoNew_.type = pkPlayingBuffInfo.getType();
        bLivePKBufferInfoNew_.text = pkPlayingBuffInfo.getText();
        bLivePKBufferInfoNew_.startTs = pkPlayingBuffInfo.getStartTs();
        bLivePKBufferInfoNew_.duration = pkPlayingBuffInfo.getDuration();
        bLivePKBufferInfoNew_.showCountdown = pkPlayingBuffInfo.getShowCountdown();
        return bLivePKBufferInfoNew_;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkPlayingBuffInfo> mo9244b() {
        return LongLinkLiveMessage.PkPlayingBuffInfo.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.pk.playingBuff";
    }
}
