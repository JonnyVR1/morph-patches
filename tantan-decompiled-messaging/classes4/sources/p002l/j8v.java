package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j8v extends bk2<LongLinkVirtualVoice.LuckyParadiseEntrance, BLiveLuckyParadiseBottomEntrance> {
    public j8v(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.LuckyParadiseEntrance luckyParadiseEntrance, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveLuckyParadiseBottomEntrance mo9251z(String str, LongLinkVirtualVoice.LuckyParadiseEntrance luckyParadiseEntrance) {
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntranceNew_ = BLiveLuckyParadiseBottomEntrance.new_();
        bLiveLuckyParadiseBottomEntranceNew_.isCrazyNow = luckyParadiseEntrance.getIsCrazyNow();
        bLiveLuckyParadiseBottomEntranceNew_.crazyIcon = luckyParadiseEntrance.getCrazyIcon();
        bLiveLuckyParadiseBottomEntranceNew_.currentTime = luckyParadiseEntrance.getCurrentTime();
        bLiveLuckyParadiseBottomEntranceNew_.endTime = luckyParadiseEntrance.getEndTime();
        bLiveLuckyParadiseBottomEntranceNew_.defaultIcon = luckyParadiseEntrance.getDefaultIcon();
        bLiveLuckyParadiseBottomEntranceNew_.poolType = luckyParadiseEntrance.getPoolType();
        return bLiveLuckyParadiseBottomEntranceNew_;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.LuckyParadiseEntrance> mo9244b() {
        return LongLinkVirtualVoice.LuckyParadiseEntrance.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.campaign.luckyParadise.bottomEntrance";
    }
}
