package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nx5 {
    /* JADX INFO: renamed from: a */
    public static void m8375a(mx5 mx5Var, View view) {
        mx5Var._iv_top = view.findViewById(u4c0.A6);
        ViewGroup viewGroup = (ViewGroup) view;
        mx5Var._constellation_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mx5Var._constellation_content = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mx5Var._switch_contain = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mx5Var._switch_contain_constellation_off_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        mx5Var._switch_contain_constellation_off_switch = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        mx5Var._bottom_button = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        mx5Var._bottom_button_close = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
