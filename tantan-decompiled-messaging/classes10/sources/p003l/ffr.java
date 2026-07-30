package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.likedusers.LikedUserItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ffr {
    /* JADX INFO: renamed from: a */
    public static void m6471a(LikedUserItemView likedUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likedUserItemView.a = viewGroup.getChildAt(0);
        likedUserItemView.b = viewGroup.getChildAt(1);
        likedUserItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        likedUserItemView.d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        likedUserItemView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        likedUserItemView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        likedUserItemView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        likedUserItemView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        likedUserItemView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        likedUserItemView.j = viewGroup.getChildAt(2);
        likedUserItemView.k = viewGroup.getChildAt(3);
        likedUserItemView.l = viewGroup.getChildAt(4);
        likedUserItemView.m = viewGroup.getChildAt(5);
        likedUserItemView.n = viewGroup.getChildAt(6);
    }
}
