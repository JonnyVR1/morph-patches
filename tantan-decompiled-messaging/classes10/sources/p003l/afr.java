package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.likedusers.LikedUserFilterBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class afr {
    /* JADX INFO: renamed from: a */
    public static void m5380a(LikedUserFilterBar likedUserFilterBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likedUserFilterBar.a = (LinearLayout) viewGroup.getChildAt(0);
        likedUserFilterBar.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likedUserFilterBar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        likedUserFilterBar.d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likedUserFilterBar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        likedUserFilterBar.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        likedUserFilterBar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        likedUserFilterBar.h = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        likedUserFilterBar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        likedUserFilterBar.j = viewGroup.getChildAt(1);
    }
}
