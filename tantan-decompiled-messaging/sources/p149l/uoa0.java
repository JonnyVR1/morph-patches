package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uoa0 {
    /* JADX INFO: renamed from: a */
    public static void m194546a(toa0 toa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        toa0Var.f171327u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        toa0Var.f171328v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        toa0Var.f171329w = (FlowTagsView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        toa0Var.f171330x = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m194547b(toa0 toa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95373Ga, viewGroup, false);
        m194546a(toa0Var, viewInflate);
        return viewInflate;
    }
}
