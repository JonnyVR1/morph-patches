package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.hideandseek.IntlHideAndSeekRoleView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bon {
    /* JADX INFO: renamed from: a */
    public static void m5775a(IntlHideAndSeekRoleView intlHideAndSeekRoleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlHideAndSeekRoleView._role_icon = viewGroup.getChildAt(0);
        intlHideAndSeekRoleView._game_content = viewGroup.getChildAt(1);
        intlHideAndSeekRoleView._game_content_role = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlHideAndSeekRoleView._game_content_subtitle = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlHideAndSeekRoleView._count_down = viewGroup.getChildAt(2);
        intlHideAndSeekRoleView._count_down_hour_one = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlHideAndSeekRoleView._count_down_hour_two = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        intlHideAndSeekRoleView._count_down_minute_one = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        intlHideAndSeekRoleView._count_down_minute_two = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        intlHideAndSeekRoleView._count_down_second_one = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        intlHideAndSeekRoleView._count_down_second_two = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        intlHideAndSeekRoleView._caught = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m5776b(IntlHideAndSeekRoleView intlHideAndSeekRoleView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.K4, viewGroup, true);
        m5775a(intlHideAndSeekRoleView, viewInflate);
        return viewInflate;
    }
}
