package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditActionView;
import p147v.VButton;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class cfa0 {
    /* JADX INFO: renamed from: a */
    public static void m106487a(ProfileLoopCreateTagAct profileLoopCreateTagAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopCreateTagAct.f33503c = (VNavigationBar) viewGroup.getChildAt(0);
        profileLoopCreateTagAct.f33504d = (ProfileLoopEditActionView) viewGroup.getChildAt(1);
        profileLoopCreateTagAct.f33505e = (VButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m106488b(ProfileLoopCreateTagAct profileLoopCreateTagAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137378t, viewGroup, false);
        m106487a(profileLoopCreateTagAct, viewInflate);
        return viewInflate;
    }
}
