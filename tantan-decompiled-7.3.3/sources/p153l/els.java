package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class els {
    /* JADX INFO: renamed from: a */
    public static void m121256a(dls dlsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dlsVar._shadow = viewGroup.getChildAt(0);
        dlsVar._bg = viewGroup.getChildAt(1);
        dlsVar._bg_img = (ImageView) viewGroup.getChildAt(2);
        dlsVar._title_layout = (ConstraintLayout) viewGroup.getChildAt(3);
        dlsVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        dlsVar._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        dlsVar._back = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        dlsVar._gift_tray_bg = (VDraweeView) viewGroup.getChildAt(4);
        dlsVar._skin_img = (VDraweeView) viewGroup.getChildAt(5);
        dlsVar._skin_title = (TextView) viewGroup.getChildAt(6);
        dlsVar._skin_describe = (TextView) viewGroup.getChildAt(9);
        dlsVar._bt = (TextView) viewGroup.getChildAt(10);
    }
}
