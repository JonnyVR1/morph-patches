package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.profile.views.ProfileRecentlyNewItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bra0 {
    /* JADX INFO: renamed from: a */
    public static void m5783a(ProfileRecentlyNewItem profileRecentlyNewItem, View view) {
        profileRecentlyNewItem.a = (ProfileRecentlyNewItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileRecentlyNewItem.b = (RelativeLayout) viewGroup.getChildAt(0);
        profileRecentlyNewItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileRecentlyNewItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        profileRecentlyNewItem.e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        profileRecentlyNewItem.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        profileRecentlyNewItem.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        profileRecentlyNewItem.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        profileRecentlyNewItem.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        profileRecentlyNewItem.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        profileRecentlyNewItem.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        profileRecentlyNewItem.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        profileRecentlyNewItem.m = viewGroup.getChildAt(1);
        profileRecentlyNewItem.n = (FrameLayout) viewGroup.getChildAt(2);
    }
}
