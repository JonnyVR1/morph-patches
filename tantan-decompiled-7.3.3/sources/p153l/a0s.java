package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;

/* JADX INFO: loaded from: classes4.dex */
public class a0s extends vn2<mu40> {

    /* JADX INFO: renamed from: x */
    public jxd0 f67745x;

    /* JADX INFO: renamed from: y */
    public jxd0 f67746y;

    public a0s(dum<mu40> dumVar, LiveBubbleView liveBubbleView) {
        super(dumVar);
        Boolean bool = Boolean.FALSE;
        this.f67745x = new jxd0("bottom_setting_sticker_bubble_show", bool);
        this.f67746y = new jxd0("bottom_setting_song_game_bubble_show", bool);
        mo52715C(liveBubbleView);
    }

    @Override // p153l.vn2, p153l.AbstractC17128g4
    /* JADX INFO: renamed from: I4 */
    public void mo95417I4(String str) {
        super.mo95417I4(str);
        str.getClass();
        if (str.equals("songGameNoticeBubble")) {
            this.f67746y.put(Boolean.TRUE);
        } else if (str.equals("stickerBubble")) {
            this.f67745x.put(Boolean.TRUE);
        }
    }

    @Override // p153l.AbstractC17128g4
    /* JADX INFO: renamed from: k4 */
    public boolean mo95418k4(BLiveBubbleConfig bLiveBubbleConfig, gg3 gg3Var) {
        String str = bLiveBubbleConfig.type;
        str.getClass();
        switch (str) {
            case "localFollowLiveButtonBubble":
            case "firstRechargeBubble":
                return true;
            case "fastGiftButtonBubble":
                return !((civ) zrv.m221194l(htd0.f111524f)).m109966j() && super.mo95418k4(bLiveBubbleConfig, gg3Var);
            case "songGameNoticeBubble":
                return !this.f67746y.get().booleanValue() && ((Boolean) m138856F3(new re3(1700))).booleanValue();
            case "stickerBubble":
                if (!this.f67745x.get().booleanValue() && ((Boolean) m138856F3(new i5g0(1700))).booleanValue()) {
                    return true;
                }
            case "userDailyTaskBubble":
            case "signInBubble":
            case "signInUpgradeBubble":
                return false;
            default:
                return super.mo95418k4(bLiveBubbleConfig, gg3Var);
        }
    }
}
