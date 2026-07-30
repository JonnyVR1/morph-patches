package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VSwitch;

/* JADX INFO: loaded from: classes10.dex */
public class nx5 {
    /* JADX INFO: renamed from: a */
    public static void m161931a(mx5 mx5Var, View view) {
        mx5Var._iv_top = (VDraweeView) view.findViewById(u4c0.f173723A6);
        ViewGroup viewGroup = (ViewGroup) view;
        mx5Var._constellation_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mx5Var._constellation_content = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mx5Var._switch_contain = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mx5Var._switch_contain_constellation_off_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        mx5Var._switch_contain_constellation_off_switch = (VSwitch) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        mx5Var._bottom_button = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        mx5Var._bottom_button_close = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
