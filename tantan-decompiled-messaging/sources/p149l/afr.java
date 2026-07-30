package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserFilterBar;
import p147v.VCheckBox;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class afr {
    /* JADX INFO: renamed from: a */
    public static void m96267a(LikedUserFilterBar likedUserFilterBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likedUserFilterBar.f29956a = (LinearLayout) viewGroup.getChildAt(0);
        likedUserFilterBar.f29957b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likedUserFilterBar.f29958c = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        likedUserFilterBar.f29959d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likedUserFilterBar.f29960e = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        likedUserFilterBar.f29961f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        likedUserFilterBar.f29962g = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        likedUserFilterBar.f29963h = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        likedUserFilterBar.f29964i = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        likedUserFilterBar.f29965j = (VRecyclerView) viewGroup.getChildAt(1);
    }
}
