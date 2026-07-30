package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wli0 {
    /* JADX INFO: renamed from: a */
    public static void m207037a(vli0 vli0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vli0Var._iv_top = (ImageView) viewGroup.getChildAt(0);
        vli0Var._empty_top = viewGroup.getChildAt(1);
        vli0Var._tarot_title = (TextView) viewGroup.getChildAt(2);
        vli0Var._tarot_time = (VText) viewGroup.getChildAt(3);
        vli0Var._close = (VButton) viewGroup.getChildAt(4);
        vli0Var._empty_bottom = viewGroup.getChildAt(5);
        vli0Var._space = (Space) viewGroup.getChildAt(6);
        vli0Var._tarot_content = (TextView) viewGroup.getChildAt(7);
        vli0Var._checkbox = (VCheckBox) viewGroup.getChildAt(8);
        vli0Var._bottom_button = (VButton) viewGroup.getChildAt(9);
    }
}
