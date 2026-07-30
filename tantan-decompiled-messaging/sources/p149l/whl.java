package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeaderItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeadersView;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p147v.VImage;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class whl {
    /* JADX INFO: renamed from: a */
    public static void m203221a(HourHeadersView hourHeadersView, View view) {
        hourHeadersView.f50601d = (HourHeadersView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourHeadersView.f50602e = (HourHeaderItemView) viewGroup.getChildAt(1);
        hourHeadersView.f50603f = (HourHeaderItemView) viewGroup.getChildAt(2);
        hourHeadersView.f50604g = (HourHeaderItemView) viewGroup.getChildAt(3);
        hourHeadersView.f50605h = (ConstraintLayout) viewGroup.getChildAt(4);
        hourHeadersView.f50606i = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        hourHeadersView.f50607j = (LiveTextRollView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        hourHeadersView.f50608k = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }
}
