package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wci0 {
    /* JADX INFO: renamed from: a */
    public static void m202664a(vci0 vci0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vci0Var._iv_top = (ImageView) viewGroup.getChildAt(0);
        vci0Var._empty_top = viewGroup.getChildAt(1);
        vci0Var._tarot_title = (TextView) viewGroup.getChildAt(2);
        vci0Var._tarot_time = (VText) viewGroup.getChildAt(3);
        vci0Var._close = (VButton) viewGroup.getChildAt(4);
        vci0Var._empty_bottom = viewGroup.getChildAt(5);
        vci0Var._space = (Space) viewGroup.getChildAt(6);
        vci0Var._tarot_content = (TextView) viewGroup.getChildAt(7);
        vci0Var._checkbox = (VCheckBox) viewGroup.getChildAt(8);
        vci0Var._bottom_button = (VButton) viewGroup.getChildAt(9);
    }
}
