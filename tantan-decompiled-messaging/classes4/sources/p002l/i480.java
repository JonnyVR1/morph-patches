package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.wintimes.PkWinTimesResultView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i480 {
    /* JADX INFO: renamed from: a */
    public static void m14990a(PkWinTimesResultView pkWinTimesResultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkWinTimesResultView.a = (LinearLayout) viewGroup.getChildAt(0);
        pkWinTimesResultView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pkWinTimesResultView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pkWinTimesResultView.d = viewGroup.getChildAt(1);
    }
}
