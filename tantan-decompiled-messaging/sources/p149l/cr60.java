package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VButton_FakeShadow;
import p147v.VLinear;
import p147v.VMaterialEdit;
import p147v.VMaterialEdit_FakeSpinner;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class cr60 {
    /* JADX INFO: renamed from: a */
    public static void m108349a(br60 br60Var, View view) {
        br60Var.f76862c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        br60Var.f76863d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        br60Var.f76864e = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        br60Var.f76865f = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        br60Var.f76866g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        br60Var.f76867h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        br60Var.f76868i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        br60Var.f76869j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        br60Var.f76870k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        br60Var.f76871l = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        br60Var.f76872m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        br60Var.f76873n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        br60Var.f76874o = (VText) viewGroup.getChildAt(1);
        br60Var.f76875p = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m108350b(br60 br60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79500g0, viewGroup, false);
        m108349a(br60Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m108351c(br60 br60Var) {
        br60Var.f76862c = null;
        br60Var.f76863d = null;
        br60Var.f76864e = null;
        br60Var.f76865f = null;
        br60Var.f76866g = null;
        br60Var.f76867h = null;
        br60Var.f76868i = null;
        br60Var.f76869j = null;
        br60Var.f76870k = null;
        br60Var.f76871l = null;
        br60Var.f76872m = null;
        br60Var.f76873n = null;
        br60Var.f76874o = null;
        br60Var.f76875p = null;
    }
}
