package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qea0 {
    /* JADX INFO: renamed from: a */
    public static void m174187a(ProfileLoopActionLayout profileLoopActionLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopActionLayout.f34162a = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileLoopActionLayout.f34163b = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileLoopActionLayout.f34164c = (VText_Medium) viewGroup.getChildAt(2);
    }
}
