package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.virtual.userCard.friend.VirtualUserCardMatchView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class swl0 {
    /* JADX INFO: renamed from: a */
    public static void m22721a(VirtualUserCardMatchView virtualUserCardMatchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualUserCardMatchView.a = viewGroup.getChildAt(0);
        virtualUserCardMatchView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        virtualUserCardMatchView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        virtualUserCardMatchView.d = viewGroup.getChildAt(1);
        virtualUserCardMatchView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        virtualUserCardMatchView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        virtualUserCardMatchView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        virtualUserCardMatchView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        virtualUserCardMatchView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
