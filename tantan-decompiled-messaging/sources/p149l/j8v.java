package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;

/* JADX INFO: loaded from: classes4.dex */
public class j8v extends bk2<LongLinkVirtualVoice.LuckyParadiseEntrance, BLiveLuckyParadiseBottomEntrance> {
    public j8v(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVirtualVoice.LuckyParadiseEntrance luckyParadiseEntrance, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveLuckyParadiseBottomEntrance mo94461z(String str, LongLinkVirtualVoice.LuckyParadiseEntrance luckyParadiseEntrance) {
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntranceNew_ = BLiveLuckyParadiseBottomEntrance.new_();
        bLiveLuckyParadiseBottomEntranceNew_.isCrazyNow = luckyParadiseEntrance.getIsCrazyNow();
        bLiveLuckyParadiseBottomEntranceNew_.crazyIcon = luckyParadiseEntrance.getCrazyIcon();
        bLiveLuckyParadiseBottomEntranceNew_.currentTime = luckyParadiseEntrance.getCurrentTime();
        bLiveLuckyParadiseBottomEntranceNew_.endTime = luckyParadiseEntrance.getEndTime();
        bLiveLuckyParadiseBottomEntranceNew_.defaultIcon = luckyParadiseEntrance.getDefaultIcon();
        bLiveLuckyParadiseBottomEntranceNew_.poolType = luckyParadiseEntrance.getPoolType();
        return bLiveLuckyParadiseBottomEntranceNew_;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.LuckyParadiseEntrance> mo94398b() {
        return LongLinkVirtualVoice.LuckyParadiseEntrance.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.campaign.luckyParadise.bottomEntrance";
    }
}
