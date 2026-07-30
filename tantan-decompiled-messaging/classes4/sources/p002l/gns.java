package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gns {
    /* JADX INFO: renamed from: a */
    public static void m13976a(fns fnsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fnsVar._shadow = viewGroup.getChildAt(0);
        fnsVar._bg = viewGroup.getChildAt(1);
        fnsVar._bg_img = viewGroup.getChildAt(2);
        fnsVar._title_bg = viewGroup.getChildAt(3);
        fnsVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        fnsVar._sub_title = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        fnsVar._back = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        fnsVar._mini_tabs = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        fnsVar._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        fnsVar._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        fnsVar._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        fnsVar._empty = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        fnsVar._empty_icon = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        fnsVar._empty_text = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        fnsVar._allRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        fnsVar._lightRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        fnsVar._darkRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
    }
}
