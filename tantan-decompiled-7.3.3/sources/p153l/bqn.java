package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.hideandseek.IntlHideAndSeekRoleView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bqn {
    /* JADX INFO: renamed from: a */
    public static void m105950a(IntlHideAndSeekRoleView intlHideAndSeekRoleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlHideAndSeekRoleView._role_icon = (VDraweeView) viewGroup.getChildAt(0);
        intlHideAndSeekRoleView._game_content = (VLinear) viewGroup.getChildAt(1);
        intlHideAndSeekRoleView._game_content_role = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlHideAndSeekRoleView._game_content_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlHideAndSeekRoleView._count_down = (VLinear) viewGroup.getChildAt(2);
        intlHideAndSeekRoleView._count_down_hour_one = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlHideAndSeekRoleView._count_down_hour_two = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        intlHideAndSeekRoleView._count_down_minute_one = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        intlHideAndSeekRoleView._count_down_minute_two = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        intlHideAndSeekRoleView._count_down_second_one = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        intlHideAndSeekRoleView._count_down_second_two = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        intlHideAndSeekRoleView._caught = (VButton) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m105951b(IntlHideAndSeekRoleView intlHideAndSeekRoleView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125485K4, viewGroup, true);
        m105950a(intlHideAndSeekRoleView, viewInflate);
        return viewInflate;
    }
}
