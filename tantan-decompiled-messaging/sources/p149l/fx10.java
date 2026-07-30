package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class fx10 {
    /* JADX INFO: renamed from: a */
    public static void m123616a(ex10 ex10Var, View view) {
        ex10Var.f93565a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ex10Var.f93566b = (VText) viewGroup.getChildAt(0);
        ex10Var.f93567c = (VText) viewGroup.getChildAt(1);
        ex10Var.f93568d = (ViewStub) viewGroup.getChildAt(2);
        ex10Var.f93569e = (ViewStub) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m123617b(ex10 ex10Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162808x0, viewGroup, false);
        m123616a(ex10Var, viewInflate);
        return viewInflate;
    }
}
