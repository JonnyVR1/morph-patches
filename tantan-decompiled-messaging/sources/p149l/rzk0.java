package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.VerifyCodeView;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VImage;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rzk0 {
    /* JADX INFO: renamed from: a */
    public static void m181757a(qzk0 qzk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qzk0Var.f157063c = (VScroll) viewGroup.getChildAt(0);
        qzk0Var.f157064d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qzk0Var.f157065e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        qzk0Var.f157066f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        qzk0Var.f157067g = (VerifyCodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        qzk0Var.f157068h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        qzk0Var.f157069i = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        qzk0Var.f157070j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        qzk0Var.f157071k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        qzk0Var.f157072l = (ConstraintLayout) viewGroup.getChildAt(1);
        qzk0Var.f157073m = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qzk0Var.f157074n = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qzk0Var.f157075o = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qzk0Var.f157076p = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m181758b(qzk0 qzk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79477Q, viewGroup, false);
        m181757a(qzk0Var, viewInflate);
        return viewInflate;
    }
}
