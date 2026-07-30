package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import l.bgv;
import l.fld0;
import l.hpd0;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zxr extends on2<yl40> {

    /* JADX INFO: renamed from: x */
    public hpd0 f23662x;

    /* JADX INFO: renamed from: y */
    public hpd0 f23663y;

    public zxr(bsm<yl40> bsmVar, LiveBubbleView liveBubbleView) {
        super(bsmVar);
        Boolean bool = Boolean.FALSE;
        this.f23662x = new hpd0("bottom_setting_sticker_bubble_show", bool);
        this.f23663y = new hpd0("bottom_setting_song_game_bubble_show", bool);
        C(liveBubbleView);
    }

    @Override // p002l.on2, p002l.AbstractC0583g4
    /* JADX INFO: renamed from: I4 */
    public void mo13585I4(String str) {
        super.mo13585I4(str);
        str.getClass();
        if (str.equals("songGameNoticeBubble")) {
            this.f23663y.put(Boolean.TRUE);
        } else if (str.equals("stickerBubble")) {
            this.f23662x.put(Boolean.TRUE);
        }
    }

    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: k4 */
    public boolean mo13603k4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        String str = bLiveBubbleConfig.type;
        str.getClass();
        switch (str) {
            case "localFollowLiveButtonBubble":
            case "firstRechargeBubble":
                return true;
            case "fastGiftButtonBubble":
                return !((bgv) ypv.l(fld0.f)).j() && super.mo13603k4(bLiveBubbleConfig, sf3Var);
            case "songGameNoticeBubble":
                return !((Boolean) this.f23663y.get()).booleanValue() && ((Boolean) m14184F3(new ce3(1700))).booleanValue();
            case "stickerBubble":
                if (!((Boolean) this.f23662x.get()).booleanValue() && ((Boolean) m14184F3(new ywf0(1700))).booleanValue()) {
                    return true;
                }
            case "userDailyTaskBubble":
            case "signInBubble":
            case "signInUpgradeBubble":
                return false;
            default:
                return super.mo13603k4(bLiveBubbleConfig, sf3Var);
        }
    }
}
