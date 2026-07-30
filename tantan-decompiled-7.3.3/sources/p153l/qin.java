package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qin {
    /* JADX INFO: renamed from: a */
    public static void m176753a(IntlGameBoardItemView intlGameBoardItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGameBoardItemView._iconBg = viewGroup.getChildAt(0);
        intlGameBoardItemView._gameIcon = (VDraweeView) viewGroup.getChildAt(1);
        intlGameBoardItemView._gameName = (VText) viewGroup.getChildAt(2);
        intlGameBoardItemView._redDot = viewGroup.getChildAt(3);
    }
}
