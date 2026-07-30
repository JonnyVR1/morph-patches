package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ywa0 {
    /* JADX INFO: renamed from: a */
    public static void m217587a(xwa0 xwa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xwa0Var.f196476u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        xwa0Var.f196477v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        xwa0Var.f196478w = (FlowTagsView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        xwa0Var.f196479x = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m217588b(xwa0 xwa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125539Na, viewGroup, false);
        m217587a(xwa0Var, viewInflate);
        return viewInflate;
    }
}
