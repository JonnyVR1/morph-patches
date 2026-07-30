package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes10.dex */
public class sy5 {
    /* JADX INFO: renamed from: a */
    public static void m188533a(ry5 ry5Var, View view) {
        ry5Var._iv_top = (VDraweeView) view.findViewById(adc0.f69845C6);
        ViewGroup viewGroup = (ViewGroup) view;
        ry5Var._constellation_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ry5Var._constellation_content = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ry5Var._switch_contain = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ry5Var._switch_contain_constellation_off_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        ry5Var._switch_contain_constellation_off_switch = (VSwitch) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        ry5Var._bottom_button = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        ry5Var._bottom_button_close = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
