package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class n520 {
    /* JADX INFO: renamed from: a */
    public static void m161630a(m520 m520Var, View view) {
        m520Var.f134855a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        m520Var.f134856b = (VText) viewGroup.getChildAt(0);
        m520Var.f134857c = (VText) viewGroup.getChildAt(1);
        m520Var.f134858d = (ViewStub) viewGroup.getChildAt(2);
        m520Var.f134859e = (ViewStub) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m161631b(m520 m520Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193922x0, viewGroup, false);
        m161630a(m520Var, viewInflate);
        return viewInflate;
    }
}
