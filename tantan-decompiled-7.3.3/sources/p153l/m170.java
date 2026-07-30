package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VButton_FakeShadow;
import p151v.VLinear;
import p151v.VMaterialEdit;
import p151v.VMaterialEdit_FakeSpinner;

/* JADX INFO: loaded from: classes9.dex */
public class m170 {
    /* JADX INFO: renamed from: a */
    public static void m156599a(l170 l170Var, View view) {
        l170Var.f129654a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        l170Var.f129655b = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        l170Var.f129656c = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        l170Var.f129657d = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        l170Var.f129658e = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m156600b(l170 l170Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109087O, viewGroup, false);
        m156599a(l170Var, viewInflate);
        return viewInflate;
    }
}
