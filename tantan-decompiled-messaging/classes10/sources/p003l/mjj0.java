package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.likedusers.tablayout.undolike.UnDoLikedUserItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mjj0 {
    /* JADX INFO: renamed from: a */
    public static void m8159a(UnDoLikedUserItemView unDoLikedUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        unDoLikedUserItemView.a = viewGroup.getChildAt(0);
        unDoLikedUserItemView.b = viewGroup.getChildAt(1);
        unDoLikedUserItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        unDoLikedUserItemView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        unDoLikedUserItemView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        unDoLikedUserItemView.f = viewGroup.getChildAt(2);
        unDoLikedUserItemView.g = viewGroup.getChildAt(3);
    }
}
