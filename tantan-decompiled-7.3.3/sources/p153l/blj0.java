package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class blj0 {
    /* JADX INFO: renamed from: a */
    public static void m104919a(alj0 alj0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        alj0Var._layout_yes_root = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        alj0Var._iv_yes_select = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        alj0Var._tv_yes_desc = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        alj0Var._layout_no_root = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        alj0Var._iv_no_select = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        alj0Var._tv_no_desc = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        alj0Var._continue_btn = (VText) viewGroup.getChildAt(1);
        alj0Var._tv_contact = (VText) viewGroup.getChildAt(2);
        alj0Var._loading_svga = (AnimEffectPlayer) viewGroup.getChildAt(3);
        alj0Var._top = (ConstraintLayout) viewGroup.getChildAt(4);
        alj0Var._top_toolbar_back = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        alj0Var._top_toolbar_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        alj0Var._top_toolbar_right_btn = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        alj0Var._top_toolbar_title = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m104920b(alj0 alj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109126n0, viewGroup, false);
        m104919a(alj0Var, viewInflate);
        return viewInflate;
    }
}
