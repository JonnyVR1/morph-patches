package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t0y {
    /* JADX INFO: renamed from: a */
    public static void m9519a(MeetFeedBaseItemView meetFeedBaseItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetFeedBaseItemView.d = viewGroup.getChildAt(0);
        meetFeedBaseItemView.e = viewGroup.getChildAt(1);
        meetFeedBaseItemView.f = viewGroup.getChildAt(2);
        meetFeedBaseItemView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        meetFeedBaseItemView.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        meetFeedBaseItemView.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        meetFeedBaseItemView.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        meetFeedBaseItemView.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        meetFeedBaseItemView.l = viewGroup.getChildAt(3);
        meetFeedBaseItemView.m = (LinearLayout) viewGroup.getChildAt(4);
        meetFeedBaseItemView.n = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        meetFeedBaseItemView.o = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        meetFeedBaseItemView.p = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        meetFeedBaseItemView.q = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        meetFeedBaseItemView.r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0);
        meetFeedBaseItemView.s = (FrameLayout) viewGroup.getChildAt(5);
        meetFeedBaseItemView.t = (TextView) viewGroup.getChildAt(6);
        meetFeedBaseItemView.u = viewGroup.getChildAt(7);
        meetFeedBaseItemView.v = (LinearLayout) viewGroup.getChildAt(8);
        meetFeedBaseItemView.w = viewGroup.getChildAt(9);
    }
}
