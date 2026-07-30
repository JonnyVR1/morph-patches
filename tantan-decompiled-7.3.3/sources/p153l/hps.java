package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hps {
    /* JADX INFO: renamed from: a */
    public static void m136582a(gps gpsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gpsVar._shadow = viewGroup.getChildAt(0);
        gpsVar._bg = viewGroup.getChildAt(1);
        gpsVar._bg_img = (VDraweeView) viewGroup.getChildAt(2);
        gpsVar._title_bg = (ConstraintLayout) viewGroup.getChildAt(3);
        gpsVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        gpsVar._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        gpsVar._back = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        gpsVar._mini_tabs = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        gpsVar._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        gpsVar._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        gpsVar._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        gpsVar._empty = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        gpsVar._empty_icon = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        gpsVar._empty_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        gpsVar._allRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        gpsVar._lightRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        gpsVar._darkRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
    }
}
