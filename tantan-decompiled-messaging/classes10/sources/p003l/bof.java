package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.explore.view.ExploreCardItemView;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bof {
    /* JADX INFO: renamed from: a */
    public static void m5772a(ExploreCardItemView exploreCardItemView, View view) {
        exploreCardItemView.d = (ExploreCardItemView) view;
        exploreCardItemView.e = (RelativeLayout) ((ViewGroup) view).getChildAt(0);
        exploreCardItemView.f = view.findViewById(u4c0.V3);
        ViewGroup viewGroup = (ViewGroup) view;
        exploreCardItemView.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        exploreCardItemView.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        exploreCardItemView.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        exploreCardItemView.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        exploreCardItemView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        exploreCardItemView.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        exploreCardItemView.m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        exploreCardItemView.n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        exploreCardItemView.o = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        exploreCardItemView.p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        exploreCardItemView.q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1);
        exploreCardItemView.r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(2);
        exploreCardItemView.s = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(3);
        exploreCardItemView.t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(4);
        exploreCardItemView.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(5);
        exploreCardItemView.v = view.findViewById(u4c0.Z3);
        exploreCardItemView.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(5)).getChildAt(1);
        exploreCardItemView.x = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(6);
    }
}
