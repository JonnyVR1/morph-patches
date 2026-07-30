package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.VerifyCodeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rzk0 {
    /* JADX INFO: renamed from: a */
    public static void m23459a(qzk0 qzk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qzk0Var.f20190c = viewGroup.getChildAt(0);
        qzk0Var.f20191d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qzk0Var.f20192e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        qzk0Var.f20193f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        qzk0Var.f20194g = (VerifyCodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        qzk0Var.f20195h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        qzk0Var.f20196i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        qzk0Var.f20197j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        qzk0Var.f20198k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        qzk0Var.f20199l = viewGroup.getChildAt(1);
        qzk0Var.f20200m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qzk0Var.f20201n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qzk0Var.f20202o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qzk0Var.f20203p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m23460b(qzk0 qzk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9407Q, viewGroup, false);
        m23459a(qzk0Var, viewInflate);
        return viewInflate;
    }
}
