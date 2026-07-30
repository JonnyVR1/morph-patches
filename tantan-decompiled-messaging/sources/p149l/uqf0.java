package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class uqf0 {
    /* JADX INFO: renamed from: a */
    public static void m194991a(tqf0 tqf0Var, View view) {
        tqf0Var.f171579f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tqf0Var.f171580g = (VImage) viewGroup.getChildAt(0);
        tqf0Var.f171581h = (VDraweeView) viewGroup.getChildAt(1);
        tqf0Var.f171582i = (VText_Bold) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m194992b(tqf0 tqf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95614Vb, viewGroup, false);
        m194991a(tqf0Var, viewInflate);
        return viewInflate;
    }
}
