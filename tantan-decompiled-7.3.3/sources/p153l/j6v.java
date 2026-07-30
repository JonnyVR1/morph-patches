package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;

/* JADX INFO: loaded from: classes4.dex */
public class j6v extends jk2<LongLinkVirtualVoice.VoiceFunFairEntrance, BLiveLuckyParadiseBottomEntrance> {
    public j6v(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.VoiceFunFairEntrance voiceFunFairEntrance, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveLuckyParadiseBottomEntrance mo95993z(String str, LongLinkVirtualVoice.VoiceFunFairEntrance voiceFunFairEntrance) {
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

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceFunFairEntrance> mo95510b() {
        return LongLinkVirtualVoice.VoiceFunFairEntrance.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.campaign.funFair.bottomEntrance";
    }
}
