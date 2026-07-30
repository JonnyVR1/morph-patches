package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class djs {
    /* JADX INFO: renamed from: a */
    public static void m112110a(cjs cjsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cjsVar._shadow = viewGroup.getChildAt(0);
        cjsVar._bg = viewGroup.getChildAt(1);
        cjsVar._bg_img = (ImageView) viewGroup.getChildAt(2);
        cjsVar._title_layout = (ConstraintLayout) viewGroup.getChildAt(3);
        cjsVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        cjsVar._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        cjsVar._back = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        cjsVar._gift_tray_bg = (VDraweeView) viewGroup.getChildAt(4);
        cjsVar._skin_img = (VDraweeView) viewGroup.getChildAt(5);
        cjsVar._skin_title = (TextView) viewGroup.getChildAt(6);
        cjsVar._skin_describe = (TextView) viewGroup.getChildAt(9);
        cjsVar._bt = (TextView) viewGroup.getChildAt(10);
    }
}
