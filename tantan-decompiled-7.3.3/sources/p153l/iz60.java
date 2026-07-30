package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VButton_FakeShadow;
import p151v.VLinear;
import p151v.VMaterialEdit;
import p151v.VMaterialEdit_FakeSpinner;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class iz60 {
    /* JADX INFO: renamed from: a */
    public static void m142794a(hz60 hz60Var, View view) {
        hz60Var.f112198c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hz60Var.f112199d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        hz60Var.f112200e = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        hz60Var.f112201f = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hz60Var.f112202g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        hz60Var.f112203h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        hz60Var.f112204i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        hz60Var.f112205j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        hz60Var.f112206k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        hz60Var.f112207l = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        hz60Var.f112208m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        hz60Var.f112209n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        hz60Var.f112210o = (VText) viewGroup.getChildAt(1);
        hz60Var.f112211p = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m142795b(hz60 hz60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109112g0, viewGroup, false);
        m142794a(hz60Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m142796c(hz60 hz60Var) {
        hz60Var.f112198c = null;
        hz60Var.f112199d = null;
        hz60Var.f112200e = null;
        hz60Var.f112201f = null;
        hz60Var.f112202g = null;
        hz60Var.f112203h = null;
        hz60Var.f112204i = null;
        hz60Var.f112205j = null;
        hz60Var.f112206k = null;
        hz60Var.f112207l = null;
        hz60Var.f112208m = null;
        hz60Var.f112209n = null;
        hz60Var.f112210o = null;
        hz60Var.f112211p = null;
    }
}
