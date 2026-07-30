package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uma0 {
    /* JADX INFO: renamed from: a */
    public static void m196641a(ProfileLoopActionLayout profileLoopActionLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopActionLayout.f35010a = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileLoopActionLayout.f35011b = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileLoopActionLayout.f35012c = (VText_Medium) viewGroup.getChildAt(2);
    }
}
