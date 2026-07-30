package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class pga0 {
    /* JADX INFO: renamed from: a */
    public static void m168663a(oga0 oga0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oga0Var.f143836a = (TextView) viewGroup.getChildAt(0);
        oga0Var.f143837b = (TextView) viewGroup.getChildAt(1);
        oga0Var.f143838c = (VLinear) viewGroup.getChildAt(2);
        oga0Var.f143839d = (ProfileLoopActionLayout) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m168664b(oga0 oga0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137288B0, viewGroup, false);
        m168663a(oga0Var, viewInflate);
        return viewInflate;
    }
}
