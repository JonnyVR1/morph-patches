package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeaderItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeadersView;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p151v.VImage;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class nkl {
    /* JADX INFO: renamed from: a */
    public static void m163638a(HourHeadersView hourHeadersView, View view) {
        hourHeadersView.f51449d = (HourHeadersView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourHeadersView.f51450e = (HourHeaderItemView) viewGroup.getChildAt(1);
        hourHeadersView.f51451f = (HourHeaderItemView) viewGroup.getChildAt(2);
        hourHeadersView.f51452g = (HourHeaderItemView) viewGroup.getChildAt(3);
        hourHeadersView.f51453h = (ConstraintLayout) viewGroup.getChildAt(4);
        hourHeadersView.f51454i = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        hourHeadersView.f51455j = (LiveTextRollView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        hourHeadersView.f51456k = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }
}
