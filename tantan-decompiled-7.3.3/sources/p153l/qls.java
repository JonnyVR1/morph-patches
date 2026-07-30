package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qls {
    /* JADX INFO: renamed from: a */
    public static void m177012a(pls plsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        plsVar._shadow = viewGroup.getChildAt(0);
        plsVar._bg = viewGroup.getChildAt(1);
        plsVar._bg_img = (ImageView) viewGroup.getChildAt(2);
        plsVar._title_bg = (ConstraintLayout) viewGroup.getChildAt(3);
        plsVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        plsVar._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        plsVar._back = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        plsVar._help = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        plsVar._mini_tabs = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        plsVar._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        plsVar._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        plsVar._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        plsVar._empty = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        plsVar._empty_icon = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        plsVar._empty_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        plsVar._allRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        plsVar._lightRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        plsVar._darkRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
    }
}
