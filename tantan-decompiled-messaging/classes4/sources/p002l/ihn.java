package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardBannerView;
import com.p000p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ihn {
    /* JADX INFO: renamed from: a */
    public static void m15151a(IntlGameBoardView intlGameBoardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGameBoardView._backView = viewGroup.getChildAt(0);
        intlGameBoardView._game_banner = (IntlGameBoardBannerView) viewGroup.getChildAt(1);
        intlGameBoardView._banner_page = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlGameBoardView._banner_indicator = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlGameBoardView._panel_bg = viewGroup.getChildAt(2);
        intlGameBoardView._guide_line = viewGroup.getChildAt(3);
        intlGameBoardView._svga = viewGroup.getChildAt(4);
        intlGameBoardView._gameList = viewGroup.getChildAt(5);
        intlGameBoardView._tvGameList = viewGroup.getChildAt(6);
    }
}
