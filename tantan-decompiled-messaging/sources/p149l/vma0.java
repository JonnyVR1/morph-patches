package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditActionView;

/* JADX INFO: loaded from: classes10.dex */
public class vma0 {
    /* JADX INFO: renamed from: a */
    public static void m198905a(uma0 uma0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uma0Var.f177211a = (ProfileLoopEditActionView) viewGroup.getChildAt(0);
        uma0Var.f177212b = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m198906b(uma0 uma0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137302I0, viewGroup, false);
        m198905a(uma0Var, viewInflate);
        return viewInflate;
    }
}
