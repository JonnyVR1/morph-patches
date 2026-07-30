package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.profile.views.UserTagsView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cak0 {
    /* JADX INFO: renamed from: a */
    public static void m5875a(UserTagsView userTagsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userTagsView.a = viewGroup.getChildAt(0);
        userTagsView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        userTagsView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        userTagsView.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        userTagsView.e = viewGroup.getChildAt(1);
        userTagsView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userTagsView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        userTagsView.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        userTagsView.i = viewGroup.getChildAt(2);
        userTagsView.j = viewGroup.getChildAt(3);
    }
}
