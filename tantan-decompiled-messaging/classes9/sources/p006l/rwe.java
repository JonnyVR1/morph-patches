package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.EmailVerifyCodeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rwe {
    /* JADX INFO: renamed from: a */
    public static void m23340a(qwe qweVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qweVar.f20104c = viewGroup.getChildAt(0);
        qweVar.f20105d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qweVar.f20106e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        qweVar.f20107f = (EmailVerifyCodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        qweVar.f20108g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        qweVar.f20109h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        qweVar.f20110i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        qweVar.f20111j = viewGroup.getChildAt(1);
        qweVar.f20112k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qweVar.f20113l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m23341b(qwe qweVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9450r, viewGroup, false);
        m23340a(qweVar, viewInflate);
        return viewInflate;
    }
}
