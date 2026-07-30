package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeaderItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeadersView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class whl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m24663a(HourHeadersView hourHeadersView, View view) {
        hourHeadersView.f6643d = (HourHeadersView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourHeadersView.f6644e = (HourHeaderItemView) viewGroup.getChildAt(1);
        hourHeadersView.f6645f = (HourHeaderItemView) viewGroup.getChildAt(2);
        hourHeadersView.f6646g = (HourHeaderItemView) viewGroup.getChildAt(3);
        hourHeadersView.f6647h = viewGroup.getChildAt(4);
        hourHeadersView.f6648i = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        hourHeadersView.f6649j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        hourHeadersView.f6650k = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }
}
