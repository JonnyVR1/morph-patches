package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.ui.profile.views.ProfileCustomBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aj90 {
    /* JADX INFO: renamed from: a */
    public static void m5388a(ProfileCustomBar profileCustomBar, View view) {
        profileCustomBar.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileCustomBar.b = viewGroup.getChildAt(0);
        profileCustomBar.c = viewGroup.getChildAt(1);
        profileCustomBar.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileCustomBar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileCustomBar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        profileCustomBar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        profileCustomBar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        profileCustomBar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        profileCustomBar.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        profileCustomBar.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        profileCustomBar.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        profileCustomBar.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        profileCustomBar.n = viewGroup.getChildAt(2);
    }
}
