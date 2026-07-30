package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VButton_FakeShadow;
import p151v.VButton_FakeShadowSmall;
import p151v.VMaterialEdit;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class oh60 {
    /* JADX INFO: renamed from: a */
    public static void m167690a(nh60 nh60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nh60Var.f141932a = (VNavigationBar) viewGroup.getChildAt(0);
        nh60Var.f141933b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        nh60Var.f141934c = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        nh60Var.f141935d = (VButton_FakeShadowSmall) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        nh60Var.f141936e = (VMaterialEdit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        nh60Var.f141937f = (VMaterialEdit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        nh60Var.f141938g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        nh60Var.f141939h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        nh60Var.f141940i = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m167691b(nh60 nh60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167554b, viewGroup, false);
        m167690a(nh60Var, viewInflate);
        return viewInflate;
    }
}
