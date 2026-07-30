package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tes {
    /* JADX INFO: renamed from: a */
    public static void m22905a(ses sesVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sesVar._shadow = viewGroup.getChildAt(0);
        sesVar._bg = viewGroup.getChildAt(1);
        sesVar._bg_img = viewGroup.getChildAt(2);
        sesVar._title_bg = viewGroup.getChildAt(3);
        sesVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        sesVar._sub_title = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        sesVar._back = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        sesVar._mini_tabs = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        sesVar._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        sesVar._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        sesVar._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        sesVar._empty = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        sesVar._empty_icon = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        sesVar._empty_text = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        sesVar._allRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        sesVar._lightRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        sesVar._darkRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
    }
}
