package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.LoopViewPager;
import com.p051p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p051p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardBannerView;
import com.p051p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ijn {
    /* JADX INFO: renamed from: a */
    public static void m140220a(IntlGameBoardView intlGameBoardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGameBoardView._backView = viewGroup.getChildAt(0);
        intlGameBoardView._game_banner = (IntlGameBoardBannerView) viewGroup.getChildAt(1);
        intlGameBoardView._banner_page = (LoopViewPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlGameBoardView._banner_indicator = (LoopViewPagerIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlGameBoardView._panel_bg = viewGroup.getChildAt(2);
        intlGameBoardView._guide_line = viewGroup.getChildAt(3);
        intlGameBoardView._svga = (AnimEffectPlayer) viewGroup.getChildAt(4);
        intlGameBoardView._gameList = (VRecyclerView) viewGroup.getChildAt(5);
        intlGameBoardView._tvGameList = (VText) viewGroup.getChildAt(6);
    }
}
