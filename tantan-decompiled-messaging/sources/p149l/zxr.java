package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;

/* JADX INFO: loaded from: classes4.dex */
public class zxr extends on2<yl40> {

    /* JADX INFO: renamed from: x */
    public hpd0 f205482x;

    /* JADX INFO: renamed from: y */
    public hpd0 f205483y;

    public zxr(bsm<yl40> bsmVar, LiveBubbleView liveBubbleView) {
        super(bsmVar);
        Boolean bool = Boolean.FALSE;
        this.f205482x = new hpd0("bottom_setting_sticker_bubble_show", bool);
        this.f205483y = new hpd0("bottom_setting_song_game_bubble_show", bool);
        mo51532C(liveBubbleView);
    }

    @Override // p149l.on2, p149l.AbstractC16991g4
    /* JADX INFO: renamed from: I4 */
    public void mo124323I4(String str) {
        super.mo124323I4(str);
        str.getClass();
        if (str.equals("songGameNoticeBubble")) {
            this.f205483y.put(Boolean.TRUE);
        } else if (str.equals("stickerBubble")) {
            this.f205482x.put(Boolean.TRUE);
        }
    }

    @Override // p149l.AbstractC16991g4
    /* JADX INFO: renamed from: k4 */
    public boolean mo124340k4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        String str = bLiveBubbleConfig.type;
        str.getClass();
        switch (str) {
            case "localFollowLiveButtonBubble":
            case "firstRechargeBubble":
                return true;
            case "fastGiftButtonBubble":
                return !((bgv) ypv.m215673l(fld0.f98151f)).m101730j() && super.mo124340k4(bLiveBubbleConfig, sf3Var);
            case "songGameNoticeBubble":
                return !this.f205483y.get().booleanValue() && ((Boolean) m129297F3(new ce3(1700))).booleanValue();
            case "stickerBubble":
                if (!this.f205482x.get().booleanValue() && ((Boolean) m129297F3(new ywf0(1700))).booleanValue()) {
                    return true;
                }
            case "userDailyTaskBubble":
            case "signInBubble":
            case "signInUpgradeBubble":
                return false;
            default:
                return super.mo124340k4(bLiveBubbleConfig, sf3Var);
        }
    }
}
