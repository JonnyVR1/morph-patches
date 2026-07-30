package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i4v extends bk2<LongLinkVirtualVoice.VoiceFunFairEntrance, BLiveLuckyParadiseBottomEntrance> {
    public i4v(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceFunFairEntrance voiceFunFairEntrance, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveLuckyParadiseBottomEntrance mo9251z(String str, LongLinkVirtualVoice.VoiceFunFairEntrance voiceFunFairEntrance) {
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntranceNew_ = BLiveLuckyParadiseBottomEntrance.new_();
        bLiveLuckyParadiseBottomEntranceNew_.currentTime = voiceFunFairEntrance.getCurrentTime();
        bLiveLuckyParadiseBottomEntranceNew_.endTime = voiceFunFairEntrance.getEndTime();
        bLiveLuckyParadiseBottomEntranceNew_.defaultIcon = voiceFunFairEntrance.getDefaultIcon();
        bLiveLuckyParadiseBottomEntranceNew_.poolType = voiceFunFairEntrance.getPoolType();
        bLiveLuckyParadiseBottomEntranceNew_.buff = voiceFunFairEntrance.getBuff();
        bLiveLuckyParadiseBottomEntranceNew_.buffIcon = voiceFunFairEntrance.getBuffIcon();
        bLiveLuckyParadiseBottomEntranceNew_.buffText = voiceFunFairEntrance.getBuffText();
        bLiveLuckyParadiseBottomEntranceNew_.tip = voiceFunFairEntrance.getTip();
        return bLiveLuckyParadiseBottomEntranceNew_;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceFunFairEntrance> mo9244b() {
        return LongLinkVirtualVoice.VoiceFunFairEntrance.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.campaign.funFair.bottomEntrance";
    }
}
