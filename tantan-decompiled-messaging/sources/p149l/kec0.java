package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kec0 {
    /* JADX INFO: renamed from: a */
    public static void m145759a(jec0 jec0Var, View view) {
        jec0Var.f117547f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jec0Var.f117548g = (ImageView) viewGroup.getChildAt(0);
        jec0Var.f117549h = (VText_Medium) viewGroup.getChildAt(2);
        jec0Var.f117550i = (VText) viewGroup.getChildAt(3);
        jec0Var.f117551j = (VText_Medium) viewGroup.getChildAt(4);
        jec0Var.f117552k = (VText_Medium) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m145760b(jec0 jec0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95326Db, viewGroup, false);
        m145759a(jec0Var, viewInflate);
        return viewInflate;
    }
}
