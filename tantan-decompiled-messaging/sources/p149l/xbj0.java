package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class xbj0 {
    /* JADX INFO: renamed from: a */
    public static void m207730a(wbj0 wbj0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wbj0Var._layout_yes_root = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        wbj0Var._iv_yes_select = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        wbj0Var._tv_yes_desc = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        wbj0Var._layout_no_root = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        wbj0Var._iv_no_select = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        wbj0Var._tv_no_desc = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        wbj0Var._continue_btn = (VText) viewGroup.getChildAt(1);
        wbj0Var._tv_contact = (VText) viewGroup.getChildAt(2);
        wbj0Var._loading_svga = (AnimEffectPlayer) viewGroup.getChildAt(3);
        wbj0Var._top = (ConstraintLayout) viewGroup.getChildAt(4);
        wbj0Var._top_toolbar_back = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        wbj0Var._top_toolbar_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        wbj0Var._top_toolbar_right_btn = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        wbj0Var._top_toolbar_title = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m207731b(wbj0 wbj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79514n0, viewGroup, false);
        m207730a(wbj0Var, viewInflate);
        return viewInflate;
    }
}
