package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qgn {
    /* JADX INFO: renamed from: a */
    public static void m21266a(IntlGameBoardItemView intlGameBoardItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGameBoardItemView._iconBg = viewGroup.getChildAt(0);
        intlGameBoardItemView._gameIcon = viewGroup.getChildAt(1);
        intlGameBoardItemView._gameName = viewGroup.getChildAt(2);
        intlGameBoardItemView._redDot = viewGroup.getChildAt(3);
    }
}
