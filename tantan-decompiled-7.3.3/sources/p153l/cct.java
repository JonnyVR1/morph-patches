package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLivePKBufferInfo;

/* JADX INFO: loaded from: classes4.dex */
public class cct extends jk2<LongLinkLiveMessage.PkPlayingBuffInfo, BLivePKBufferInfo> {
    public cct(wbg0<BLivePKBufferInfo, BLivePKBufferInfo> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.PkPlayingBuffInfo pkPlayingBuffInfo, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLivePKBufferInfo mo95993z(String str, LongLinkLiveMessage.PkPlayingBuffInfo pkPlayingBuffInfo) {
        BLivePKBufferInfo bLivePKBufferInfoNew_ = BLivePKBufferInfo.new_();
        bLivePKBufferInfoNew_.type = pkPlayingBuffInfo.getType();
        bLivePKBufferInfoNew_.text = pkPlayingBuffInfo.getText();
        bLivePKBufferInfoNew_.startTs = pkPlayingBuffInfo.getStartTs();
        bLivePKBufferInfoNew_.duration = pkPlayingBuffInfo.getDuration();
        bLivePKBufferInfoNew_.showCountdown = pkPlayingBuffInfo.getShowCountdown();
        return bLivePKBufferInfoNew_;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.PkPlayingBuffInfo> mo95510b() {
        return LongLinkLiveMessage.PkPlayingBuffInfo.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.pk.playingBuff";
    }
}
