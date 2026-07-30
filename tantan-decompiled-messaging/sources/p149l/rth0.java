package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class rth0 {
    /* JADX INFO: renamed from: a */
    public static void m180783a(qth0 qth0Var, View view) {
        qth0Var.f156358f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qth0Var.f156359g = (VImage) viewGroup.getChildAt(0);
        qth0Var.f156360h = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m180784b(qth0 qth0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96068wc, viewGroup, false);
        m180783a(qth0Var, viewInflate);
        return viewInflate;
    }
}
