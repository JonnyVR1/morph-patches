package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VButton_FakeShadow;
import p147v.VLinear;
import p147v.VMaterialEdit;
import p147v.VMaterialEdit_FakeSpinner;

/* JADX INFO: loaded from: classes9.dex */
public class gt60 {
    /* JADX INFO: renamed from: a */
    public static void m127876a(ft60 ft60Var, View view) {
        ft60Var.f99145a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ft60Var.f99146b = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ft60Var.f99147c = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        ft60Var.f99148d = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ft60Var.f99149e = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m127877b(ft60 ft60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79475O, viewGroup, false);
        m127876a(ft60Var, viewInflate);
        return viewInflate;
    }
}
