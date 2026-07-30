package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pjs {
    /* JADX INFO: renamed from: a */
    public static void m20379a(ojs ojsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ojsVar._shadow = viewGroup.getChildAt(0);
        ojsVar._bg = viewGroup.getChildAt(1);
        ojsVar._bg_img = (ImageView) viewGroup.getChildAt(2);
        ojsVar._title_bg = viewGroup.getChildAt(3);
        ojsVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        ojsVar._sub_title = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        ojsVar._back = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        ojsVar._help = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        ojsVar._mini_tabs = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        ojsVar._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        ojsVar._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        ojsVar._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        ojsVar._empty = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        ojsVar._empty_icon = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        ojsVar._empty_text = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        ojsVar._allRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        ojsVar._lightRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        ojsVar._darkRecyclerView = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
    }
}
