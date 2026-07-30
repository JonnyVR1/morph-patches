package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;

/* JADX INFO: loaded from: classes4.dex */
public class kav extends jk2<LongLinkVirtualVoice.LuckyParadiseEntrance, BLiveLuckyParadiseBottomEntrance> {
    public kav(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.LuckyParadiseEntrance luckyParadiseEntrance, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveLuckyParadiseBottomEntrance mo95993z(String str, LongLinkVirtualVoice.LuckyParadiseEntrance luckyParadiseEntrance) {
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntranceNew_ = BLiveLuckyParadiseBottomEntrance.new_();
        bLiveLuckyParadiseBottomEntranceNew_.isCrazyNow = luckyParadiseEntrance.getIsCrazyNow();
        bLiveLuckyParadiseBottomEntranceNew_.crazyIcon = luckyParadiseEntrance.getCrazyIcon();
        bLiveLuckyParadiseBottomEntranceNew_.currentTime = luckyParadiseEntrance.getCurrentTime();
        bLiveLuckyParadiseBottomEntranceNew_.endTime = luckyParadiseEntrance.getEndTime();
        bLiveLuckyParadiseBottomEntranceNew_.defaultIcon = luckyParadiseEntrance.getDefaultIcon();
        bLiveLuckyParadiseBottomEntranceNew_.poolType = luckyParadiseEntrance.getPoolType();
        return bLiveLuckyParadiseBottomEntranceNew_;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.LuckyParadiseEntrance> mo95510b() {
        return LongLinkVirtualVoice.LuckyParadiseEntrance.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.campaign.luckyParadise.bottomEntrance";
    }
}
