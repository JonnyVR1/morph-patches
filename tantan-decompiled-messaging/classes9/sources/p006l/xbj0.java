package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xbj0 {
    /* JADX INFO: renamed from: a */
    public static void m27191a(wbj0 wbj0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wbj0Var._layout_yes_root = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        wbj0Var._iv_yes_select = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        wbj0Var._tv_yes_desc = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        wbj0Var._layout_no_root = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        wbj0Var._iv_no_select = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        wbj0Var._tv_no_desc = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        wbj0Var._continue_btn = viewGroup.getChildAt(1);
        wbj0Var._tv_contact = viewGroup.getChildAt(2);
        wbj0Var._loading_svga = viewGroup.getChildAt(3);
        wbj0Var._top = viewGroup.getChildAt(4);
        wbj0Var._top_toolbar_back = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        wbj0Var._top_toolbar_icon = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        wbj0Var._top_toolbar_right_btn = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        wbj0Var._top_toolbar_title = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m27192b(wbj0 wbj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9444n0, viewGroup, false);
        m27191a(wbj0Var, viewInflate);
        return viewInflate;
    }
}
