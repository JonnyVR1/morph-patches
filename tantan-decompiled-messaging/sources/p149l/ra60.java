package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ra60 {
    /* JADX INFO: renamed from: a */
    public static void m178470a(qa60 qa60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qa60Var.f153508a = (VNavigationBar) viewGroup.getChildAt(0);
        qa60Var.f153509b = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        qa60Var.f153510c = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m178471b(qa60 qa60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137358j, viewGroup, false);
        m178470a(qa60Var, viewInflate);
        return viewInflate;
    }
}
