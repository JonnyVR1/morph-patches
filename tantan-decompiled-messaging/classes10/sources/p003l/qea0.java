package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.views.ProfileLoopActionLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qea0 {
    /* JADX INFO: renamed from: a */
    public static void m8981a(ProfileLoopActionLayout profileLoopActionLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopActionLayout.a = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileLoopActionLayout.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileLoopActionLayout.c = viewGroup.getChildAt(2);
    }
}
