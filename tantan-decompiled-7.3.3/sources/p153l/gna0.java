package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditActionView;
import p151v.VButton;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class gna0 {
    /* JADX INFO: renamed from: a */
    public static void m130848a(ProfileLoopCreateTagAct profileLoopCreateTagAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopCreateTagAct.f34351c = (VNavigationBar) viewGroup.getChildAt(0);
        profileLoopCreateTagAct.f34352d = (ProfileLoopEditActionView) viewGroup.getChildAt(1);
        profileLoopCreateTagAct.f34353e = (VButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m130849b(ProfileLoopCreateTagAct profileLoopCreateTagAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167592t, viewGroup, false);
        m130848a(profileLoopCreateTagAct, viewInflate);
        return viewInflate;
    }
}
