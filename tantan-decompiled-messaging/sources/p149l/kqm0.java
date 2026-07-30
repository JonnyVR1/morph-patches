package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p147v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class kqm0 {
    /* JADX INFO: renamed from: a */
    public static void m146951a(jqm0 jqm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jqm0Var.f119297a = viewGroup.getChildAt(0);
        jqm0Var.f119298b = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jqm0Var.f119299c = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m146952b(jqm0 jqm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168171R7, viewGroup, false);
        m146951a(jqm0Var, viewInflate);
        return viewInflate;
    }
}
