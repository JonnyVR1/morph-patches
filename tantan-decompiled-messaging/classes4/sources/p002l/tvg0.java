package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tvg0 {
    /* JADX INFO: renamed from: a */
    public static void m23179a(pvg0 pvg0Var, View view) {
        pvg0Var._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pvg0Var._empty = viewGroup.getChildAt(0);
        pvg0Var._content = viewGroup.getChildAt(1);
        pvg0Var._content_bg = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pvg0Var._svga_bg = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pvg0Var._title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        pvg0Var._more_icon = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        pvg0Var._user_icon = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        pvg0Var._sub_title = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        pvg0Var._icon_mask = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        pvg0Var._tab_bg = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        pvg0Var._tabLayout = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        pvg0Var._tab_click_area = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        pvg0Var._viewpager = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        pvg0Var._desc = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        pvg0Var._power_title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
    }
}
