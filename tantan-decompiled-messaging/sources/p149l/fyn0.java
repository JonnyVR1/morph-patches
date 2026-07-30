package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class fyn0 {
    /* JADX INFO: renamed from: a */
    public static void m123786a(eyn0 eyn0Var, View view) {
        eyn0Var.f93773k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eyn0Var.f93774l = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        eyn0Var.f93775m = (VPagerNoPage) viewGroup.getChildAt(1);
    }
}
