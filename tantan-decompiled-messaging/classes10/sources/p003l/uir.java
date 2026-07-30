package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.vip.likers.LikersItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uir {
    /* JADX INFO: renamed from: a */
    public static void m9737a(LikersItemView likersItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersItemView.a = viewGroup.getChildAt(0);
        likersItemView.b = viewGroup.getChildAt(1);
        likersItemView.c = (LinearLayout) viewGroup.getChildAt(2);
        likersItemView.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        likersItemView.e = viewGroup.getChildAt(3);
        likersItemView.f = viewGroup.getChildAt(4);
        likersItemView.g = viewGroup.getChildAt(5);
        likersItemView.h = viewGroup.getChildAt(6);
        likersItemView.i = (FrameLayout) viewGroup.getChildAt(7);
        likersItemView.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(0);
        likersItemView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(1);
        likersItemView.l = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(2);
        likersItemView.m = (FrameLayout) viewGroup.getChildAt(8);
        likersItemView.n = (FrameLayout) viewGroup.getChildAt(9);
        likersItemView.o = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        likersItemView.p = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
        likersItemView.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1)).getChildAt(0);
        likersItemView.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1)).getChildAt(1);
        likersItemView.s = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1)).getChildAt(2);
        likersItemView.t = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(2);
        likersItemView.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(2)).getChildAt(0);
        likersItemView.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(2)).getChildAt(1);
    }
}
