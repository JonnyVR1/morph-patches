package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserFilterBar;
import p151v.VCheckBox;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class bhr {
    /* JADX INFO: renamed from: a */
    public static void m104366a(LikedUserFilterBar likedUserFilterBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likedUserFilterBar.f30804a = (LinearLayout) viewGroup.getChildAt(0);
        likedUserFilterBar.f30805b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likedUserFilterBar.f30806c = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        likedUserFilterBar.f30807d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likedUserFilterBar.f30808e = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        likedUserFilterBar.f30809f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        likedUserFilterBar.f30810g = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        likedUserFilterBar.f30811h = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        likedUserFilterBar.f30812i = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        likedUserFilterBar.f30813j = (VRecyclerView) viewGroup.getChildAt(1);
    }
}
