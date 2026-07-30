package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLivePKBufferInfo;

/* JADX INFO: loaded from: classes4.dex */
public class bat extends bk2<LongLinkLiveMessage.PkPlayingBuffInfo, BLivePKBufferInfo> {
    public bat(p3g0<BLivePKBufferInfo, BLivePKBufferInfo> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.PkPlayingBuffInfo pkPlayingBuffInfo, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLivePKBufferInfo mo94461z(String str, LongLinkLiveMessage.PkPlayingBuffInfo pkPlayingBuffInfo) {
        BLivePKBufferInfo bLivePKBufferInfoNew_ = BLivePKBufferInfo.new_();
        bLivePKBufferInfoNew_.type = pkPlayingBuffInfo.getType();
        bLivePKBufferInfoNew_.text = pkPlayingBuffInfo.getText();
        bLivePKBufferInfoNew_.startTs = pkPlayingBuffInfo.getStartTs();
        bLivePKBufferInfoNew_.duration = pkPlayingBuffInfo.getDuration();
        bLivePKBufferInfoNew_.showCountdown = pkPlayingBuffInfo.getShowCountdown();
        return bLivePKBufferInfoNew_;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkPlayingBuffInfo> mo94398b() {
        return LongLinkLiveMessage.PkPlayingBuffInfo.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.pk.playingBuff";
    }
}
