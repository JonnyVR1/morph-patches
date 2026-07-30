package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.StepProgressView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class taf0 {
    /* JADX INFO: renamed from: a */
    public static void m24562a(saf0 saf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        saf0Var.f21195c = viewGroup.getChildAt(0);
        saf0Var.f21196d = viewGroup.getChildAt(1);
        saf0Var.f21197e = viewGroup.getChildAt(2);
        saf0Var.f21198f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        saf0Var.f21199g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        saf0Var.f21200h = viewGroup.getChildAt(3);
        saf0Var.f21201i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        saf0Var.f21202j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        saf0Var.f21203k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        saf0Var.f21204l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        saf0Var.f21205m = (StepProgressView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        saf0Var.f21206n = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        saf0Var.f21207o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        saf0Var.f21208p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        saf0Var.f21209q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(2);
        saf0Var.f21210r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(3);
        saf0Var.f21211s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(4);
        saf0Var.f21212t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5);
        saf0Var.f21213u = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(0);
        saf0Var.f21214v = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(1);
        saf0Var.f21215w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(2);
        saf0Var.f21216x = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(3);
        saf0Var.f21217y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(6);
        saf0Var.f21218z = viewGroup.getChildAt(4);
        saf0Var.f21176A = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m24563b(saf0 saf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9411U, viewGroup, false);
        m24562a(saf0Var, viewInflate);
        return viewInflate;
    }
}
