package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;

/* JADX INFO: loaded from: classes10.dex */
public class zma0 {
    /* JADX INFO: renamed from: a */
    public static void m219318a(yma0 yma0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yma0Var.f198970a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yma0Var.f198971b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        yma0Var.f198972c = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m219319b(yma0 yma0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137304J0, viewGroup, false);
        m219318a(yma0Var, viewInflate);
        return viewInflate;
    }
}
