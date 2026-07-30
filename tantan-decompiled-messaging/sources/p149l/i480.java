package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesNumView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesResultView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class i480 {
    /* JADX INFO: renamed from: a */
    public static void m134322a(PkWinTimesResultView pkWinTimesResultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkWinTimesResultView.f51806a = (LinearLayout) viewGroup.getChildAt(0);
        pkWinTimesResultView.f51807b = (PkWinTimesNumView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pkWinTimesResultView.f51808c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pkWinTimesResultView.f51809d = (VImage) viewGroup.getChildAt(1);
    }
}
