package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import p151v.VFrame;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class dxc0 {
    /* JADX INFO: renamed from: a */
    public static void m118463a(cxc0 cxc0Var, View view) {
        cxc0Var.f84198a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cxc0Var.f84199b = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cxc0Var.f84200c = (TagContainerLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cxc0Var.f84201d = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m118464b(cxc0 cxc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125526Md, viewGroup, false);
        m118463a(cxc0Var, viewInflate);
        return viewInflate;
    }
}
