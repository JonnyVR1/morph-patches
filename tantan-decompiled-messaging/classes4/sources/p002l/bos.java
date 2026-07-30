package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bos {
    /* JADX INFO: renamed from: a */
    public static void m10538a(aos aosVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aosVar._shadow = viewGroup.getChildAt(0);
        aosVar._bg = viewGroup.getChildAt(1);
        aosVar._bg_svg = viewGroup.getChildAt(2);
        aosVar._title_bg = (FrameLayout) viewGroup.getChildAt(3);
        aosVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        aosVar._sub_title = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        aosVar._back = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        aosVar._mini_tabs = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        aosVar._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        aosVar._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        aosVar._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        aosVar._empty = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        aosVar._empty_icon = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        aosVar._empty_text = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        aosVar._allRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        aosVar._lightRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        aosVar._darkRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
    }
}
