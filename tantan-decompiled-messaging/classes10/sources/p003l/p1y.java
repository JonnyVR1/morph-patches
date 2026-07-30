package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.newmeet.feed.weekly.MeetFeedSvipWeeklyItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class p1y {
    /* JADX INFO: renamed from: a */
    public static void m8686a(MeetFeedSvipWeeklyItemView meetFeedSvipWeeklyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetFeedSvipWeeklyItemView.a = (RelativeLayout) viewGroup.getChildAt(0);
        meetFeedSvipWeeklyItemView.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetFeedSvipWeeklyItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        meetFeedSvipWeeklyItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        meetFeedSvipWeeklyItemView.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        meetFeedSvipWeeklyItemView.f = viewGroup.getChildAt(1);
        meetFeedSvipWeeklyItemView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetFeedSvipWeeklyItemView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        meetFeedSvipWeeklyItemView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
