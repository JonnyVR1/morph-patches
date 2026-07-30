package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.livingroom.view.CardAnchorLevelView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ng4 {
    /* JADX INFO: renamed from: a */
    public static void m18750a(CardAnchorLevelView cardAnchorLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardAnchorLevelView.a = (RelativeLayout) viewGroup.getChildAt(0);
        cardAnchorLevelView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardAnchorLevelView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardAnchorLevelView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cardAnchorLevelView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        cardAnchorLevelView.f = (RelativeLayout) viewGroup.getChildAt(1);
        cardAnchorLevelView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardAnchorLevelView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cardAnchorLevelView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cardAnchorLevelView.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cardAnchorLevelView.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cardAnchorLevelView.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cardAnchorLevelView.m = viewGroup.getChildAt(2);
    }
}
