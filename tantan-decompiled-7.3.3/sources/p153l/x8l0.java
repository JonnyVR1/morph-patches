package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.VerifyCodeView;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VImage;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class x8l0 {
    /* JADX INFO: renamed from: a */
    public static void m209738a(w8l0 w8l0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        w8l0Var.f187866c = (VScroll) viewGroup.getChildAt(0);
        w8l0Var.f187867d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        w8l0Var.f187868e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        w8l0Var.f187869f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        w8l0Var.f187870g = (VerifyCodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        w8l0Var.f187871h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        w8l0Var.f187872i = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        w8l0Var.f187873j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        w8l0Var.f187874k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        w8l0Var.f187875l = (ConstraintLayout) viewGroup.getChildAt(1);
        w8l0Var.f187876m = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        w8l0Var.f187877n = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        w8l0Var.f187878o = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        w8l0Var.f187879p = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m209739b(w8l0 w8l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109089Q, viewGroup, false);
        m209738a(w8l0Var, viewInflate);
        return viewInflate;
    }
}
