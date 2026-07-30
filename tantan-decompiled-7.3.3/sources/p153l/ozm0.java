package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p151v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class ozm0 {
    /* JADX INFO: renamed from: a */
    public static void m169986a(nzm0 nzm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nzm0Var.f144453a = viewGroup.getChildAt(0);
        nzm0Var.f144454b = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nzm0Var.f144455c = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m169987b(nzm0 nzm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198903R7, viewGroup, false);
        m169986a(nzm0Var, viewInflate);
        return viewInflate;
    }
}
