package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tes {
    /* JADX INFO: renamed from: a */
    public static void m188622a(ses sesVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sesVar._shadow = viewGroup.getChildAt(0);
        sesVar._bg = viewGroup.getChildAt(1);
        sesVar._bg_img = (VDraweeView) viewGroup.getChildAt(2);
        sesVar._title_bg = (ConstraintLayout) viewGroup.getChildAt(3);
        sesVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        sesVar._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        sesVar._back = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        sesVar._mini_tabs = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        sesVar._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        sesVar._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        sesVar._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        sesVar._empty = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        sesVar._empty_icon = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        sesVar._empty_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        sesVar._allRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        sesVar._lightRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        sesVar._darkRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
    }
}
