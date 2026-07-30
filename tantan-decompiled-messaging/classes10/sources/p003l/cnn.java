package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.hideandseek.IntlHideAndSeekInfoView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cnn {
    /* JADX INFO: renamed from: a */
    public static void m5971a(IntlHideAndSeekInfoView intlHideAndSeekInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlHideAndSeekInfoView._info_icon = viewGroup.getChildAt(0);
        intlHideAndSeekInfoView._game_content = viewGroup.getChildAt(1);
        intlHideAndSeekInfoView._game_content_title = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlHideAndSeekInfoView._game_content_subtitle = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlHideAndSeekInfoView._game_time = viewGroup.getChildAt(2);
        intlHideAndSeekInfoView._game_location = viewGroup.getChildAt(3);
        intlHideAndSeekInfoView._game_member = viewGroup.getChildAt(4);
        intlHideAndSeekInfoView._positive = viewGroup.getChildAt(5);
        intlHideAndSeekInfoView._negative = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m5972b(IntlHideAndSeekInfoView intlHideAndSeekInfoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.J4, viewGroup, true);
        m5971a(intlHideAndSeekInfoView, viewInflate);
        return viewInflate;
    }
}
