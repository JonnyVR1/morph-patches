package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VButton;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class iob0 {
    /* JADX INFO: renamed from: a */
    public static void m137312a(hob0 hob0Var, View view) {
        hob0Var.f108805f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hob0Var.f108806g = (VImage) viewGroup.getChildAt(0);
        hob0Var.f108807h = (VImage) viewGroup.getChildAt(1);
        hob0Var.f108808i = (VText_Bold) viewGroup.getChildAt(2);
        hob0Var.f108809j = (VButton) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m137313b(hob0 hob0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95919o, viewGroup, false);
        m137312a(hob0Var, viewInflate);
        return viewInflate;
    }
}
